package cn.com.open.rulestransfer;

import cn.com.open.openqti.rules.OpenAssessmentRule;
import cn.com.open.qti.rules.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;

/**
 * Created by lucky on 2017/12/7.
 */
public class Rules implements Serializable {

    //region 属性定义
    /**
     * 策略ID
     */
    private String ruleID;

    /**
     * 机构ID
     */
    private String orgId;

    /**
     * 课程ID
     */
    private String itemBankID;

    /**
     * 策略名称
     */
    private String ruleName;

    /**
     * 总分
     */
    private BigDecimal totalScore;

    /**
     * 限制答题时间
     */
    private boolean isTimeLimited;

    /**
     * 创建人
     */
    private String creatorId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改人
     */
    private String modifierId;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 策略模块列表
     */
    private List<RulePartModel> parts;

    /**
     * 试题应用类别
     */
    private List<String> questionCategories;

    /**
     * Gets rule id.
     *
     * @return the rule id
     */
    public String getRuleID() {
        return ruleID;
    }

    /**
     * Sets rule id.
     *
     * @param ruleID the rule id
     */
    public void setRuleID(String ruleID) {
        this.ruleID = ruleID;
    }

    /**
     * Gets orgId.
     *
     * @return the orgId
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * Sets orgId.
     *
     * @param orgId the orgId
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    /**
     * Gets item bank id.
     *
     * @return the item bank id
     */
    public String getItemBankID() {
        return itemBankID;
    }

    /**
     * Sets item bank id.
     *
     * @param itemBankID the item bank id
     */
    public void setItemBankID(String itemBankID) {
        this.itemBankID = itemBankID;
    }

    /**
     * Gets rule name.
     *
     * @return the rule name
     */
    public String getRuleName() {
        return ruleName;
    }

    /**
     * Sets rule name.
     *
     * @param ruleName the rule name
     */
    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * Gets total score.
     *
     * @return the total score
     */
    public BigDecimal getTotalScore() {
        return totalScore;
    }

    /**
     * Sets total score.
     *
     * @param totalScore the total score
     */
    public void setTotalScore(BigDecimal totalScore) {
        this.totalScore = totalScore;
    }

    /**
     * Is time limited boolean.
     *
     * @return the boolean
     */
    public boolean isTimeLimited() {
        return isTimeLimited;
    }

    /**
     * Sets time limited.
     *
     * @param timeLimited the time limited
     */
    public void setTimeLimited(boolean timeLimited) {
        isTimeLimited = timeLimited;
    }

    /**
     * Gets creator id.
     *
     * @return the creator id
     */
    public String getCreatorId() {
        return creatorId;
    }

    /**
     * Sets creator id.
     *
     * @param creatorId the creator id
     */
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * Gets create time.
     *
     * @return the create time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * Sets create time.
     *
     * @param createTime the create time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * Gets modifier id.
     *
     * @return the modifier id
     */
    public String getModifierId() {
        return modifierId;
    }

    /**
     * Sets modifier id.
     *
     * @param modifierId the modifier id
     */
    public void setModifierId(String modifierId) {
        this.modifierId = modifierId;
    }

    /**
     * Gets modify time.
     *
     * @return the modify time
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * Sets modify time.
     *
     * @param modifyTime the modify time
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * Gets part list.
     *
     * @return the section list
     */
    public List<RulePartModel> getParts() {
        if (parts == null) {
            parts = new ArrayList<>();
        }
        return parts;
    }

    /**
     * Gets question category.
     *
     * @return the question category
     */
    public List<String> getQuestionCategories() {
        if (questionCategories == null) {
            questionCategories = new ArrayList<>(16);
        }

        return questionCategories;
    }
    //endregion

    /**
     * Instantiates a new Rules.
     */
    public Rules() {

    }

    /**
     * 构造函数
     * 用于根据试题xml和试卷xml构建试卷实体
     *
     * @param ruleXml the rule xml
     * @throws Exception the exception
     */
    public Rules(String ruleXml) throws Exception {
        this();
        OpenAssessmentRule rule = new OpenAssessmentRule();
        rule.LoadFromString(ruleXml);
        fillcontent(rule);
    }

    /**
     * 填充QTI策略内容部分
     *
     * @param rule OpenAssessmentRule
     */
    private void fillcontent(OpenAssessmentRule rule) throws Exception {

        this.setRuleID(rule.getIdentifier());
        this.setTotalScore(BigDecimal.valueOf(rule.getTotalScore()));
        this.getQuestionCategories().addAll(Arrays.asList(rule.getItemApplicationTypeIDList().split(",")));

        for (PartType part : rule.getPart()) {
            RulePartModel partModel = new RulePartModel();

            //设置听力模块
            partModel.setListening(false);
            if (part.getMediaType() == 1) {
                partModel.setListening(true);
                partModel.setCheckTime(part.getTimeLimits().getCheckTime().intValue());
                partModel.setExpectedTime(part.getTimeLimits().getExpectedTime().intValue());

                if (!part.getInstruction().isEmpty()) {
                    partModel.getInstruction().add(getInstruction(part.getInstruction().get(0)));
                }

                if (part.getInstruction().size() > 1) {
                    partModel.getInstruction().add(getInstruction(part.getInstruction().get(1)));
                }
            }

            for (SectionType section : part.getSection()) {

                RuleSectionModel sectionModel = new RuleSectionModel();
                sectionModel.setSectionTitle(section.getTitle());
                sectionModel.setShuffle(section.isShuffle());

                if (section.getExampleItemGroup() != null) {
                    for (ItemType item : section.getExampleItemGroup().getItemGroup()) {
                        sectionModel.getExampleQuestion().add(item.getIdentifier());
                    }
                }

                if (section.getMandatoryItemGroup() != null) {
                    for (ItemType item : section.getMandatoryItemGroup().getItemGroup()) {
                        sectionModel.getMustQuestion().add(item.getIdentifier());
                    }
                }

                for (ItemGroupType itemGroup : section.getItemGroup()) {
                    RuleDifficultyModel difficultyModel = new RuleDifficultyModel();
                    difficultyModel.setCount(itemGroup.getItemCount());
                    difficultyModel.setRealCount(itemGroup.getRealItemCount());
                    difficultyModel.setScore(BigDecimal.valueOf(itemGroup.getItemScore() / itemGroup.getItemCount()));
                    difficultyModel.setType(getDifficultyType(itemGroup.getMinDifficulty(), itemGroup.getMaxDifficulty()));
                    difficultyModel.setSubItemCount(itemGroup.getSubItemCount());
                    difficultyModel.setSubjective(itemGroup.isSubjective());

                    for (SubjectType subject : itemGroup.getSubjectScope().getSubject()) {
                        for (String chapterId : subject.getChapterScope().getChapterID()) {
                            difficultyModel.getChapterList().add(chapterId);
                        }
                    }

                    if (part.getMediaType() == 1) {
                        difficultyModel.setDurationStart((int) itemGroup.getMinDuration());
                        difficultyModel.setDurationEnd((int) itemGroup.getMaxDuration());
                        difficultyModel.setRepeatInterval((int) itemGroup.getRepeatInterval());
                        difficultyModel.setRepeatTimes(itemGroup.getRepeatTimes());
                        difficultyModel.setResponseDuration((int) itemGroup.getResponseDuration());

                        if (!section.getInstruction().isEmpty()) {
                            sectionModel.getInstruction().add(getInstruction(section.getInstruction().get(0)));
                        }
                    }

                    sectionModel.getDifficultyList().add(difficultyModel);
                    sectionModel.setQuestionTypeId(itemGroup.getItemTypeID());
                }

                partModel.getSections().add(sectionModel);
            }

            this.getParts().add(partModel);
        }

    }

    /**
     * Gets instruction.
     *
     * @param instruction the instruction
     * @return the instruction
     */
    private static InstructionModel getInstruction(InstructionType instruction) {
        InstructionModel instructionModel = new InstructionModel();

        instructionModel.setDuration(instruction.getMedia().getDuration().intValue());
        instructionModel.setMediaUrl(instruction.getMedia().getSrc());
        instructionModel.setText(instruction.getText());

        return instructionModel;
    }

    /**
     * Gets difficulty type.
     *
     * @param minDifficulty the min difficulty
     * @param maxDifficulty the max difficulty
     * @return the difficulty type
     */
    private DifficultyType getDifficultyType(float minDifficulty, float maxDifficulty) {

        if (maxDifficulty == 1 && minDifficulty == 0.7) {
            return DifficultyType.EASY;
        }
        if (maxDifficulty == 0.6 && minDifficulty == 0.4) {
            return DifficultyType.NORMAL;
        }
        if (maxDifficulty == 0.3 && minDifficulty == 0) {
            return DifficultyType.HARD;
        }

        return DifficultyType.ALL;
    }
}
