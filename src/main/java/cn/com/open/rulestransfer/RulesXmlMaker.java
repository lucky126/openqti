package cn.com.open.rulestransfer;

import cn.com.open.openqti.rules.OpenAssessmentRule;
import cn.com.open.qti.Media;
import cn.com.open.qti.TimeLimitsType;
import cn.com.open.qti.rules.*;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucky on 2017/12/7.
 */
public class RulesXmlMaker {

    private RulesXmlMaker() {
    }

    /**
     * 根据策略模型得到xml.
     *
     * @param rules the rules
     * @return the string
     * @throws Exception the exception
     */
    public static String getFullQtiXml(Rules rules) throws Exception {
        //设置策略id
        String identifier = rules.getRuleID();
        //设置策略总分
        float score = rules.getTotalScore().floatValue();
        int partIndex = 1;
        //得到类别信息
        String categories = StringUtils.join(rules.getQuestionCategories().toArray(), ",");

        List<PartType> parts = new ArrayList<>();
        //设置试题模块信息
        for (RulePartModel partModel : rules.getParts()) {
            PartType part = new PartType();
            //是否是听力
            boolean isListening = partModel.isListening();

            //模块标识
            part.setIdentifier(String.format("P%02d", partIndex));
            //模块总分
            part.setScore(score);

            double partMinTime = 0;
            double partMaxTime = 0;

            //设置大题信息
            int sectionIndex = 1;
            for (RuleSectionModel ruleSection : partModel.getSections()) {
                SectionType section = new SectionType();
                section.setSequenceIndex(sectionIndex);
                section.setTitle(ruleSection.getSectionTitle());
                section.setShuffle(ruleSection.isShuffle());
                //大题内选作题数量--暂不实现
                section.setOptionalItemCount(0);

                //make item group from each difficultymodel
                float sectionScore = 0;
                int sectionItemCount = 0;
                //题组序号
                int groupIndex = 1;
                for (RuleDifficultyModel difficultyModel : ruleSection.getDifficultyList()) {
                    int difficultyCount = difficultyModel.getCount();
                    //计算难度总分
                    float totalScore = difficultyCount * difficultyModel.getScore().floatValue();

                    //一个题组只能记录一个类别，多类别需要多题组支持
                    ItemGroupType itemGroup = new ItemGroupType();
                    itemGroup.setItemApplicationTypeIDList(difficultyModel.getQuestionCategory());

                    itemGroup.setSequenceIndex(groupIndex);
                    itemGroup.setItemTypeID(ruleSection.getQuestionTypeId());
                    itemGroup.setMinDuration(0);
                    itemGroup.setMaxDuration(0);
                    itemGroup.setRepeatTimes(0);
                    itemGroup.setRepeatInterval(0);
                    itemGroup.setResponseDuration(0);

                    itemGroup.setSubjective(difficultyModel.isSubjective());
                    itemGroup.setSubjectiveSearchScope(difficultyModel.isSubjective() ? SubjectiveSearchScopeType.SUBJECTIVE : SubjectiveSearchScopeType.OBJECTIVE);

                    double sectionDuration = 0;

                    //region 设置听力部分
                    if (isListening) {
                        itemGroup.setMinDuration(difficultyModel.getDurationStart());
                        itemGroup.setMaxDuration(difficultyModel.getDurationEnd());
                        itemGroup.setRepeatTimes(difficultyModel.getRepeatTimes());
                        itemGroup.setRepeatInterval(difficultyModel.getRepeatInterval());
                        itemGroup.setResponseDuration(difficultyModel.getResponseDuration());

                        double itemMinDuration = getGroupDuration(difficultyModel, false);
                        double itemMaxDuration = getGroupDuration(difficultyModel, true);

                        partMinTime += itemMinDuration;
                        partMaxTime += itemMaxDuration;

                        sectionDuration += itemMaxDuration;
                    }
                    //endregion

                    //设置难度
                    setItemGroupDifficulty(difficultyModel, itemGroup);
                    //题组子试题个数，用于阅读理解，匹配，填空，组合题
                    itemGroup.setSubItemCount(difficultyModel.getSubItemCount());

                    //设置章节
                    SubjectScopeType subjectScope = new SubjectScopeType();
                    SubjectType subject = new SubjectType();
                    ChapterScopeType chapterScope = new ChapterScopeType();

                    for (String chapterId : difficultyModel.getChapterList()) {
                        chapterScope.getChapterID().add(chapterId);
                    }

                    subject.setChapterScope(chapterScope);
                    subjectScope.getSubject().add(subject);
                    itemGroup.setSubjectScope(subjectScope);
                    section.getItemGroup().add(itemGroup);

                    if (isListening) {
                        section.setDuration(sectionDuration);
                    }

                    //题组试题数量
                    itemGroup.setRealItemCount(difficultyModel.getRealCount());
                    //题组抽题数量
                    itemGroup.setItemCount(difficultyCount);
                    //设置题组总分
                    itemGroup.setItemScore(totalScore);

                    groupIndex++;

                    //累加难度分值计算大题总分
                    sectionScore += totalScore;
                    //累加计算大题试题总数
                    sectionItemCount += difficultyCount;
                }

                //region 例题
                ExampleItemGroupType exampleItemGroup = new ExampleItemGroupType();
                for (String question : ruleSection.getExampleQuestion()) {
                    ItemType item = new ItemType();
                    item.setIdentifier(question);
                    exampleItemGroup.getItemGroup().add(item);
                }
                section.setExampleItemGroup(exampleItemGroup);
                //endregion

                //region 必选题
                MandatoryItemGroupType mandatoryItemGroup = new MandatoryItemGroupType();
                for (String question : ruleSection.getMustQuestion()) {
                    ItemType item = new ItemType();
                    item.setIdentifier(question);
                    mandatoryItemGroup.getItemGroup().add(item);
                }
                section.setMandatoryItemGroup(mandatoryItemGroup);
                //endregion

                //大题题目数量和分数
                section.setItemCount(sectionItemCount);
                section.setSectionScore(sectionScore);

                if (!ruleSection.getInstruction().isEmpty()) {
                    section.getInstruction().add(getInstruction(ruleSection.getInstruction().get(0), ""));
                }

                part.getSection().add(section);
                sectionIndex++;
            }

            //region 设置时间限制
            TimeLimitsType timeLimits = new TimeLimitsType();

            if (isListening) {
                //听力
                timeLimits.setMinTime(partMinTime);
                timeLimits.setMaxTime(partMaxTime);
                timeLimits.setExpectedTime((double) partModel.getExpectedTime());
                timeLimits.setCheckTime((double) partModel.getCheckTime());
                //set timelimits
                part.setTimeLimits(timeLimits);
                //set media type
                part.setMediaType(1);
                //set naviagtion mode
                part.setNavigationMode(NavigationModeType.LINEAR);

                if (!partModel.getInstruction().isEmpty()) {
                    part.getInstruction().add(getInstruction(partModel.getInstruction().get(0), "top"));
                }

                if (partModel.getInstruction().size() > 1) {
                    part.getInstruction().add(getInstruction(partModel.getInstruction().get(1), "foot"));
                }
            } else {
                //非听力
                timeLimits.setMaxTime(0d);
                timeLimits.setMinTime(0d);
                timeLimits.setCheckTime(0d);
                timeLimits.setExpectedTime(0d);

                //set timelimits
                part.setTimeLimits(timeLimits);
                //set media type
                part.setMediaType(0);
                //set naviagtion mode
                part.setNavigationMode(NavigationModeType.NONLINEAR);
            }
            //endregion

            parts.add(part);
            partIndex++;
        }

        OpenAssessmentRule rule = new OpenAssessmentRule(identifier, score, parts);
        rule.setItemApplicationTypeIDList(categories);

        String result = rule.getXmlString();

        return result;
    }

    /**
     * Gets instruction.
     *
     * @param instructionModel the instruction model
     * @param type             the type
     * @return the instruction
     */
    private static InstructionType getInstruction(InstructionModel instructionModel, String type) {
        InstructionType instruction = new InstructionType();

        instruction.setText(instructionModel.getText());
        Media media = new Media();
        media.setMimetype("audio/mpeg");
        media.setSrc(instructionModel.getMediaUrl());
        media.setDuration((double) instructionModel.getDuration());

        instruction.setMedia(media);

        if (type.toLowerCase().equalsIgnoreCase("top")) {
            instruction.setLocation(LocationType.TOP);
        }

        if (type.toLowerCase().equalsIgnoreCase("foot")) {
            instruction.setLocation(LocationType.FOOT);
        }

        return instruction;
    }

    /**
     * Gets group duration.
     *
     * @param model the model
     * @param isMax the is max
     * @return the group duration
     */
    private static double getGroupDuration(RuleDifficultyModel model, boolean isMax) {
        double duration = isMax ? model.getDurationEnd() : model.getDurationStart();

        return (model.getResponseDuration() + (duration * (1 + model.getRepeatTimes()) + (model.getRepeatTimes() * model.getRepeatInterval()))) * model.getCount();
    }

    /**
     * Sets item group difficulty.
     *
     * @param difficultyModel the difficulty model
     * @param itemGroup       the item group
     */
    private static void setItemGroupDifficulty(RuleDifficultyModel difficultyModel, ItemGroupType itemGroup) {
        float minDifficulty;
        float maxDifficulty;
        switch (difficultyModel.getType()) {
            case EASY:
                minDifficulty = 0.7f;
                maxDifficulty = 1f;
                break;
            case NORMAL:
                minDifficulty = 0.4f;
                maxDifficulty = 0.6f;
                break;
            case HARD:
                minDifficulty = 0f;
                maxDifficulty = 0.3f;
                break;
            default:
                minDifficulty = 0f;
                maxDifficulty = 1f;
                break;
        }

        itemGroup.setMinDifficulty(minDifficulty);
        itemGroup.setMaxDifficulty(maxDifficulty);
    }
}
