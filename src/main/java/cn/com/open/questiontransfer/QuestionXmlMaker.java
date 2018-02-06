package cn.com.open.questiontransfer;

import cn.com.open.openqti.*;
import cn.com.open.utils.PatternUtil;

import java.util.*;

/**
 * Created by lucky on 2017/9/18.
 */
public class QuestionXmlMaker {

    private QuestionXmlMaker() {
    }

    //region 根据实体得到完整试题xml(不支持音频)

    /**
     * 获取题干内少于25个且不包含html字符的标题.
     * 截断自第一个html字符之前或者25个字符
     *
     * @param content the content
     * @return the string
     */
    private static String getTitle(String content) {
        // 过滤掉##号
        String title = content.replace(GlobalConst.PLACEHOLDER_TEXT, "").trim();

        //匹配html标签
        List<String> titleMatcher = PatternUtil.getPatternSplitList(title, "<[^>]*>");

        if (titleMatcher.size() > 1) {
            //含有html，get(0)肯定不包含html，所有奇数索引都包含html
            if (titleMatcher.get(0).length() > GlobalConst.TITLE_MAX_LEN) {
                //如果的一段落超长
                title = titleMatcher.get(0).substring(0, GlobalConst.TITLE_MAX_LEN);
            } else {
                title = titleMatcher.get(0);
            }
        } else {
            if (title.length() > GlobalConst.TITLE_MAX_LEN) {
                title = title.substring(0, GlobalConst.TITLE_MAX_LEN);
            }
        }
        return title;
    }

    /**
     * 是否乱序.
     *
     * @return the boolean
     */
    private static boolean isShuffle(Question question) {
        return question.getI11() == 1;
    }

    /**
     * 得到guid.
     *
     * @return the guid
     */
    private static String getGuid() {
        return UUID.randomUUID().toString();
    }

    /**
     * 得到试题用标题（非题干）.
     *
     * @param question the question
     * @return the question title
     */
    public static String getQuestionTitle(Question question) {
        return getTitle(question.getI33() == null || question.getI33().length() == 0 ? question.getI2() : question.getI33());
    }

    /**
     * 根据试题模型得到xml.
     *
     * @param question the question
     * @return the string
     * @throws Exception the exception
     */
    public static String getFullQtiXml(Question question) throws Exception {
        AssessmentItemCreater creater = new AssessmentItemCreater();
        String openItemXml = "";

        // 匹配题允许主题的I2不传或者传null...
        if (question.getI2() == null) {
            question.setI2("");
        }
        String title = getQuestionTitle(question);

        switch (ItemType.fromValue(question.getI3())) {
            case SINGLECHOICE:
                openItemXml = creater.createSigleChoiceAssessmentItem(question.getI1(), question.getI2(), title, isShuffle(question),
                        formatChoices(question), question.getI10()).getXmlString();
                break;
            case MULTIPLECHOICE:
                // 暂不支持部分给分
                openItemXml = creater.createMultipleChoiceAssessmentItem(question.getI1(), question.getI2(), title, isShuffle(question),
                        formatChoices(question), false, question.getI10()).getXmlString();
                break;
            case JUDGEMENT:
                openItemXml = creater.createJudgementAssessmentItem(question.getI1(), question.getI2(), title,
                        formatChoices(question), question.getI10()).getXmlString();
                break;
            case TEXTENTRY:
                // 制作填空题答案
                List<OpenTextEntryInteraction> correctResponsesItem = new ArrayList<>();
                for (int index = 0; index < question.getI6().size(); index++) {
                    OpenTextEntryInteraction itemChoice;
                    Map<String, Double> correctResponseValues = new HashMap<>();
                    List<String> response = PatternUtil.getPatternSplit(question.getI6().get(index), GlobalConst.PLACEHOLDER_TEXT);
                    List<String> score = PatternUtil.getPatternSplit(question.getI7().get(index), GlobalConst.PLACEHOLDER_TEXT);
                    for (int i = 0; i < response.size(); i++) {
                        correctResponseValues.put(response.get(i), Double.valueOf(score.get(i)));
                    }
                    itemChoice = new OpenTextEntryInteraction(correctResponseValues.size() + 10, correctResponseValues);
                    correctResponsesItem.add(itemChoice);
                }

                // 填空题题干格式化
                String content = (question.getI33() == null || question.getI33().length() == 0)
                        ? question.getI2().replace(GlobalConst.PLACEHOLDER_TEXT, "<textEntryInteraction/>")
                        : question.getI33().replace(GlobalConst.PLACEHOLDER_TEXT, "<textEntryInteraction/>");
                // 根据题干重新获取标题
                title = getTitle(content);
                openItemXml = creater.createTextEntryAssessmentItem(question.getI1(), title, content, correctResponsesItem, question.getI10()).getXmlString();
                break;
            case EXTENDEDTEXT:
                openItemXml = creater.createExtendedTextAssessmentItem(question.getI1(), question.getI2(), title,
                        Integer.valueOf(question.getI7().get(0)), question.getI6().get(0), question.getI10()).getXmlString();
                break;
            case READINGCOMPREHENSION:
                List<OpenSingleChoiceAssessmentItem> subs = new ArrayList<OpenSingleChoiceAssessmentItem>();
                for (Question sub : question.getSub()) {
                    OpenPrompt op = new OpenPrompt(sub.getI2());
                    // 每道单选题
                    OpenSingleChoiceAssessmentItem entity = new OpenSingleChoiceAssessmentItem(getGuid(), op, formatChoices(sub), sub.getI10());
                    subs.add(entity);
                }
                openItemXml = creater.createReadingComprehensionAssessmentItemListening(question.getI1(), title, isShuffle(question),
                        question.getI2(), subs, question.getI10()).getXmlString();
                break;
            case CLOZE:
                List<OpenSingleChoiceAssessmentItem> subsCloze = new ArrayList<>();
                for (Question sub : question.getSub()) {
                    OpenPrompt op = new OpenPrompt(sub.getI2());
                    // 每道单选题
                    OpenSingleChoiceAssessmentItem entity = new OpenSingleChoiceAssessmentItem(getGuid(), op, formatChoices(sub), sub.getI10());
                    subsCloze.add(entity);
                }
                openItemXml = creater.createClozeAssessmentItem(question.getI1(), title,
                        question.getI2().replace(GlobalConst.PLACEHOLDER_TEXT, "<clozeGap/>"), subsCloze, question.getI10()).getXmlString();
                break;
            // 匹配题
            case MATCH:
                List<OpenLeftSimpleAssociableChoiceAtomicItem> leftMatchChoices = new ArrayList<>();
                List<OpenRightSimpleAssociableChoiceAtomicItem> rightMatchChoices = new ArrayList<>();

                // 获取右匹配题项
                List<OpenSimpleChoiceAtomicItem> matchChoices = formatChoices(question.getI6());
                for (OpenSimpleChoiceAtomicItem choice : matchChoices) {
                    OpenRightSimpleAssociableChoiceAtomicItem rightChoiceItem = new OpenRightSimpleAssociableChoiceAtomicItem(choice.getIdentifier(), choice.getContent());
                    rightMatchChoices.add(rightChoiceItem);
                }

                for (Question sub : question.getSub()) {
                    List<String> correctList = new ArrayList<>();
                    for (String index : sub.getI7()) {
                        correctList.add(rightMatchChoices.get(Integer.valueOf(index)).getIdentifier());
                    }
                    // 获取左匹配题项
                    OpenLeftSimpleAssociableChoiceAtomicItem leftItem = new OpenLeftSimpleAssociableChoiceAtomicItem(getGuid(), sub.getI2(), correctList);
                    leftMatchChoices.add(leftItem);
                }
                openItemXml = creater.createMatchAssessmentItem(question.getI1(), title, isShuffle(question), question.getI2(), leftMatchChoices, rightMatchChoices, question.getI10()).getXmlString();
                break;
            // 仅支持组合匹配题
            case COMPOSITE:
                List<OpenCompositeSubItem> subsComposite = new ArrayList<>();

                for (Question item : question.getSub()) {
                    for (Question sub : item.getSub()) {
                        List<OpenLeftSimpleAssociableChoiceAtomicItem> leftChoices = new ArrayList<>();
                        List<OpenRightSimpleAssociableChoiceAtomicItem> rightChoices = new ArrayList<>();
                        OpenPrompt op = new OpenPrompt(sub.getI2());

                        // 获取右匹配题项
                        List<OpenSimpleChoiceAtomicItem> choices = formatChoices(item.getI6());
                        for (OpenSimpleChoiceAtomicItem choice : choices) {
                            OpenRightSimpleAssociableChoiceAtomicItem rightChoiceItem = new OpenRightSimpleAssociableChoiceAtomicItem(choice.getIdentifier(), choice.getContent());
                            rightChoices.add(rightChoiceItem);
                        }

                        List<String> correctList = new ArrayList<>();
                        for (String index : sub.getI7()) {
                            correctList.add(rightChoices.get(Integer.valueOf(index)).getIdentifier());
                        }
                        // 获取左匹配题项
                        OpenLeftSimpleAssociableChoiceAtomicItem leftItem = new OpenLeftSimpleAssociableChoiceAtomicItem(getGuid(), sub.getI2(), correctList);
                        leftChoices.add(leftItem);

                        // 匹配题试题
                        OpenMatchAssessmentItem entity = new OpenMatchAssessmentItem(getGuid(), sub.getI2(), op, isShuffle(question), leftChoices, rightChoices, sub.getI10());
                        OpenCompositeSubItem compositeItem = new OpenCompositeSubItem(entity, sub.getI9(), 0, getGuid(), sub.getI10());
                        subsComposite.add(compositeItem);
                    }
                }
                openItemXml = creater.createCompositeAssessmentItem(question.getI1(), title, isShuffle(question), question.getI2(), subsComposite, question.getI10()).getXmlString();
                break;
            case ORDER:
                List<OpenOrderSimpleChoiceAtomicItem> list = new ArrayList<>();
                for (int i = 0; i < question.getI6().size(); i++) {
                    char ch = (char) (65 + i);

                    OpenOrderSimpleChoiceAtomicItem item = new OpenOrderSimpleChoiceAtomicItem(String.valueOf(ch), question.getI6().get(i), Integer.valueOf(question.getI7().get(i)));
                    list.add(item);
                }

                openItemXml = creater.createOrderAssessmentItem(question.getI1(), title, question.getI2(), isShuffle(question), list, question.getI10()).getXmlString();
                break;
            case UPLOAD:
                String correctRequest = question.getI6().get(0);
                openItemXml = creater.createUploadAssessmentItem(question.getI1(), title, question.getI2(), correctRequest, question.getI10()).getXmlString();
                break;
            default:
                break;
        }
        return openItemXml;
    }

    /**
     * 格式化选项(根据i6,i7格式化).
     *
     * @param model the model
     * @return the list
     */
    private static List<OpenSimpleChoiceAtomicItem> formatChoices(Question model) {
        List<OpenSimpleChoiceAtomicItem> choices = new ArrayList<>();
        for (int i = 0; i < model.getI6().size(); i++) {
            boolean isCorrect = false;
            for (String cor : model.getI7()) {
                int corIndex;
                corIndex = Integer.valueOf(cor);
                if (corIndex == i) {
                    isCorrect = true;
                }
            }

            char ch = (char) (65 + i);

            choices.add(new OpenSimpleChoiceAtomicItem(String.valueOf(ch), model.getI6().get(i), isCorrect));
        }

        return choices;
    }

    /**
     * 格式化选项.
     *
     * @param orginalChoice 原始选项列表，子试题的I6
     * @return 转换后含有ABCD的选项列表
     */
    private static List<OpenSimpleChoiceAtomicItem> formatChoices(List<String> orginalChoice) {
        List<OpenSimpleChoiceAtomicItem> choices = new ArrayList<>();
        for (int i = 0; i < orginalChoice.size(); i++) {
            char ch = (char) (65 + i);

            choices.add(new OpenSimpleChoiceAtomicItem(String.valueOf(ch), orginalChoice.get(i)));
        }
        return choices;
    }
    //endregion
}
