package cn.com.open.questiontransfer;

import cn.com.open.openqti.*;
import cn.com.open.openqti.Exception.OpenTextEntryInteractionScoreInvalidException;
import cn.com.open.qti.ClozeGap;
import cn.com.open.qti.Media;
import cn.com.open.utils.PatternUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucky on 2017/7/6.
 */
public class AssessmentItemCreater {

    /**
     * Gets 修订题干.
     *
     * @param prompt 原始题干
     * @return 修订video后的题干
     */
    private OpenPrompt getPrompt(String prompt) throws Exception {
        OpenPrompt translatedPrompt;
        //Is Having Media?
        if (prompt.indexOf("videourl") < 0) {
            translatedPrompt = new OpenPrompt(prompt);
        } else {
            MediaMaker mediaMaker = new MediaMaker(prompt);
            String s = mediaMaker.getWithoutMediaString();
            Media tmpMedia = mediaMaker.getMedia();

            translatedPrompt = new OpenPrompt(s, tmpMedia);
        }
        return translatedPrompt;
    }

    /**
     * 单选题构造函数.
     *
     * @param identifier       试题ID
     * @param prompt           题干
     * @param title            标题
     * @param shuffle          是否乱序
     * @param choices          选项列表
     * @param questionAnalysis 试题解析
     * @return the open single choice assessment item
     * @throws Exception the exception
     */
    public OpenSingleChoiceAssessmentItem createSigleChoiceAssessmentItem(String identifier, String prompt, String title, boolean shuffle,
                                                                          List<OpenSimpleChoiceAtomicItem> choices, String questionAnalysis) throws Exception {
        OpenPrompt translatedPrompt = getPrompt(prompt);

        OpenSingleChoiceAssessmentItem target = new OpenSingleChoiceAssessmentItem(identifier, title, translatedPrompt, shuffle, choices, questionAnalysis);
        return target;
    }

    /**
     * 多选题构造函数.
     *
     * @param questionId       试题ID
     * @param prompt           题干
     * @param title            标题
     * @param shuffle          是否乱序
     * @param choices          选项列表
     * @param mappingResponse  是否映射匹配给分模式
     * @param questionAnalysis 试题解析
     * @return the open multiple choice assessment item
     * @throws Exception the exception
     */
    public OpenMultipleChoiceAssessmentItem createMultipleChoiceAssessmentItem(String questionId, String prompt, String title, boolean shuffle,
                                                                               List<OpenSimpleChoiceAtomicItem> choices, boolean mappingResponse, String questionAnalysis) throws Exception {
        OpenPrompt translatedPrompt = getPrompt(prompt);

        OpenMultipleChoiceAssessmentItem target = new OpenMultipleChoiceAssessmentItem(questionId, title, translatedPrompt, shuffle, choices, mappingResponse, questionAnalysis);
        return target;
    }

    /**
     * 判断题构造函数.
     *
     * @param identifier       试题ID
     * @param prompt           题干
     * @param title            标题
     * @param choices          选项列表
     * @param questionAnalysis 试题解析
     * @return the open judgement assessment item
     * @throws Exception the exception
     */
    public OpenJudgementAssessmentItem createJudgementAssessmentItem(String identifier, String prompt, String title, List<OpenSimpleChoiceAtomicItem> choices,
                                                                     String questionAnalysis) throws Exception {
        OpenPrompt translatedPrompt = getPrompt(prompt);

        OpenJudgementAssessmentItem target = new OpenJudgementAssessmentItem(identifier, title, translatedPrompt, choices, questionAnalysis);
        return target;
    }

    /**
     * 填空题构造函数.
     *
     * @param identifier       试题ID
     * @param title            标题
     * @param itemBodyContent  题干
     * @param correctResponses 正确答案列表
     * @param questionAnalysis 试题解析
     * @return the open text entry assessment item
     * @throws Exception the exception
     */
    public OpenTextEntryAssessmentItem createTextEntryAssessmentItem(String identifier, String title, String itemBodyContent,
                                                                     List<OpenTextEntryInteraction> correctResponses, String questionAnalysis) throws Exception {
        OpenTextEntryAssessmentItem target = new OpenTextEntryAssessmentItem(identifier, title, itemBodyContent, correctResponses, questionAnalysis);
        return target;
    }

    /**
     * 阅读理解构造函数.
     *
     * @param identifier                  试题ID
     * @param title                       标题
     * @param shuffle                     是否乱序
     * @param prompt                      题干
     * @param singleChoiceAssessmentItems 子试题列表
     * @param questionAnalysis            试题解析
     * @return the open reading comprehension assessment item
     * @throws Exception the exception
     */
    public OpenReadingComprehensionAssessmentItem createReadingComprehensionAssessmentItemListening(String identifier, String title, boolean shuffle, String prompt,
                                                                                                    List<OpenSingleChoiceAssessmentItem> singleChoiceAssessmentItems,
                                                                                                    String questionAnalysis) throws Exception {
        OpenPrompt translatedPrompt = getPrompt(prompt);

        OpenReadingComprehensionAssessmentItem target = new OpenReadingComprehensionAssessmentItem(identifier, title, shuffle, translatedPrompt,
                singleChoiceAssessmentItems, questionAnalysis);
        return target;
    }

    /**
     * 完型填空构造函数.
     *
     * @param identifier                  试题ID
     * @param title                       标题
     * @param itemBodyContent             题干
     * @param singleChoiceAssessmentItems 子试题列表
     * @param questionAnalysis            试题解析
     * @return the open cloze assessment item
     * @throws Exception the exception
     */
    public OpenClozeAssessmentItem createClozeAssessmentItem(String identifier, String title, String itemBodyContent,
                                                             List<OpenSingleChoiceAssessmentItem> singleChoiceAssessmentItems, String questionAnalysis) throws Exception {
        OpenPrompt prompt;
        if (itemBodyContent.indexOf("videourl") >= 0) {
            List<ClozeGap> tmpGaps = new ArrayList<ClozeGap>();
            for (int i = 0; i < singleChoiceAssessmentItems.size(); i++) {
                singleChoiceAssessmentItems.get(i).setPrompt(null);
                ClozeGap tmpGap = new ClozeGap();
                tmpGap.setResponseIdentifier(String.format("RESPONSE_%d", (i + 1)));
                tmpGaps.add(tmpGap);
            }
            MediaMaker mediaMaker = new MediaMaker(itemBodyContent);
            String s = mediaMaker.getWithoutMediaString();
            Media tmpMedia = mediaMaker.getMedia();
            prompt = new OpenPrompt(s, tmpMedia, tmpGaps);
        } else {
            List<String> strList = PatternUtil.getPatternSplit(itemBodyContent, "(<clozeGap/>)");
            String itemBody = "";
            for (int i = 0; i < strList.size(); i++) {
                if (i != strList.size() - 1) {
                    itemBody += strList.get(i) + "<clozeGap responseIdentifier=\"\"/>";// responseIdentifier=\"\"RESPONSE_"+i+1+"\"\"
                } else {
                    itemBody += strList.get(i);
                }
            }
            itemBodyContent = itemBody;
            prompt = new OpenPrompt(itemBodyContent);
        }

        OpenClozeAssessmentItem target = new OpenClozeAssessmentItem(identifier, title, prompt, singleChoiceAssessmentItems, questionAnalysis);
        return target;
    }

    /**
     * 主观题构造函数.
     *
     * @param identifier       试题ID
     * @param prompt           题干
     * @param title            标题
     * @param expectedLength   最大字符长度
     * @param correctRequest   正确答案
     * @param questionAnalysis 试题解析
     * @return the open extended text assessment item
     * @throws Exception the exception
     */
    public OpenExtendedTextAssessmentItem createExtendedTextAssessmentItem(String identifier, String prompt, String title, int expectedLength, String correctRequest,
                                                                           String questionAnalysis) throws Exception {
        OpenPrompt translatedPrompt = getPrompt(prompt);

        OpenExtendedTextAssessmentItem target = new OpenExtendedTextAssessmentItem(identifier, title, translatedPrompt, expectedLength, correctRequest, questionAnalysis);
        return target;
    }

    /**
     * 组合题构造函数.
     *
     * @param identifier       试题ID
     * @param title            标题
     * @param shuffle          是否乱序
     * @param prompt           题干
     * @param subItems         子试题列表
     * @param questionAnalysis 试题解析
     * @return the open composite assessment item
     * @throws Exception the exception
     */
    public OpenCompositeAssessmentItem createCompositeAssessmentItem(String identifier, String title, boolean shuffle, String prompt, List<OpenCompositeSubItem> subItems, String questionAnalysis) throws Exception {

        OpenPrompt translatedPrompt = getPrompt(prompt);

        return new OpenCompositeAssessmentItem(identifier, title, shuffle, translatedPrompt, subItems, questionAnalysis);

    }

    /**
     * 匹配题构造函数.
     *
     * @param identifier                            试题ID
     * @param title                                 标题
     * @param shuffle                               是否乱序
     * @param prompt                                题干
     * @param leftSimpleAssociableChoiceAtomicItems 左匹配项列表
     * @param rightSimpleAssociableChoiceAtomicItems 右匹配项列表
     * @param questionAnalysis                      试题解析
     * @return the open match assessment item
     * @throws Exception the exception
     */
    public OpenMatchAssessmentItem createMatchAssessmentItem(String identifier, String title, boolean shuffle, String prompt,
                                                             List<OpenLeftSimpleAssociableChoiceAtomicItem> leftSimpleAssociableChoiceAtomicItems,
                                                             List<OpenRightSimpleAssociableChoiceAtomicItem> rightSimpleAssociableChoiceAtomicItems,
                                                             String questionAnalysis) throws Exception {
        OpenPrompt translatedPrompt = getPrompt(prompt);
        return new OpenMatchAssessmentItem(identifier, title, translatedPrompt, shuffle, leftSimpleAssociableChoiceAtomicItems, rightSimpleAssociableChoiceAtomicItems,
                questionAnalysis);
    }

    /**
     * 排序题构造函数.
     *
     * @param identifier       试题ID
     * @param title            标题
     * @param prompt           题干
     * @param shuffle          是否乱序
     * @param lst              子试题列表
     * @param questionAnalysis 试题解析
     * @return the open order assessment item
     * @throws Exception the exception
     */
    public OpenOrderAssessmentItem createOrderAssessmentItem(String identifier, String title, String prompt, boolean shuffle,
                                                             List<OpenOrderSimpleChoiceAtomicItem> lst, String questionAnalysis) throws Exception {
        OpenPrompt translatedPrompt = getPrompt(prompt);
        return new OpenOrderAssessmentItem(identifier, title, translatedPrompt, shuffle, lst, questionAnalysis);
    }

    /**
     * 上传题构造函数.
     *
     * @param identifier       试题ID
     * @param title            标题
     * @param prompt           题干
     * @param correctRequest   正确答案
     * @param questionAnalysis 试题解析
     * @return the open upload assessment item
     */
    public OpenUploadAssessmentItem createUploadAssessmentItem(String identifier, String title, String prompt, String correctRequest,
                                                               String questionAnalysis) throws Exception {
        OpenPrompt translatedPrompt = getPrompt(prompt);
        return new OpenUploadAssessmentItem(identifier, title, translatedPrompt, correctRequest, questionAnalysis);
    }

}
