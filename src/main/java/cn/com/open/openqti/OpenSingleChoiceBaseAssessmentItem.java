package cn.com.open.openqti;

import cn.com.open.openqti.Exception.OpenChoiceAssessmentItemNeedCorrectResponseValueException;
import cn.com.open.openqti.Exception.OpenSingleChoiceBaseAssessmentItemHasMultipleCorrectResponseException;
import cn.com.open.qti.*;

import java.util.Collection;

/**
 * Created by lucky on 2017/6/14.
 */
public class OpenSingleChoiceBaseAssessmentItem extends OpenChoiceBaseAssessmentItem {

    /**
     * 获取响应基数
     *
     * @return the response cardinality
     */
    @Override
    public CardinalityType getResponseCardinality() {
        return CardinalityType.SINGLE;
    }

    /**
     * 获取允许最大可选项数
     *
     * @return the max choice
     */
    @Override
    public int getMaxChoice() {
        return 1;
    }

    /**
     * 获取是否映射匹配
     *
     * @return the boolean
     */
    @Override
    public boolean isMappingResponseInner() {
        return false;
    }

    /**
     * 单选类基础题构造函数
     */
    public OpenSingleChoiceBaseAssessmentItem() {
    }

    /**
     * 单选类基础题构造函数
     *
     * @param identifier       试题ID
     * @param title            标题
     * @param prompt           题干
     * @param shuffle          选项是否乱序
     * @param choices          选项列表
     * @param questionAnalysis 试题解析
     * @throws OpenSingleChoiceBaseAssessmentItemHasMultipleCorrectResponseException the open single choice base assessment item has multiple correct response exception
     * @throws OpenChoiceAssessmentItemNeedCorrectResponseValueException             the open choice assessment item need correct response value exception
     */
    public OpenSingleChoiceBaseAssessmentItem(String identifier, String title, OpenPrompt prompt, boolean shuffle,
                                              Collection<OpenSimpleChoiceAtomicItem> choices, String questionAnalysis) throws OpenSingleChoiceBaseAssessmentItemHasMultipleCorrectResponseException, OpenChoiceAssessmentItemNeedCorrectResponseValueException {
        super(identifier, title, prompt, shuffle, choices, questionAnalysis);
        if (choices != null) {
            boolean hasCorrectResponse = false;
            for (OpenSimpleChoiceAtomicItem choice : choices) {
                if (choice.isCorrectResponse()) {
                    if (hasCorrectResponse)//有2个正确答案
                    {
                        throw new OpenSingleChoiceBaseAssessmentItemHasMultipleCorrectResponseException(identifier, title);
                    }

                    hasCorrectResponse = true;
                }
            }
            if (!hasCorrectResponse) {
                throw new OpenChoiceAssessmentItemNeedCorrectResponseValueException(identifier, title);
            }
        }
    }

    /**
     * 单选类基础题构造函数
     *
     * @param identifier          试题ID
     * @param title               标题
     * @param promptOriginalValue 题干
     * @param shuffle             选项是否乱序
     * @param choices             选项列表
     * @param questionAnalysis    试题解析
     * @throws Exception the exception
     */
    protected OpenSingleChoiceBaseAssessmentItem(String identifier, String title, String promptOriginalValue, boolean shuffle,
                                                 Collection<OpenSimpleChoiceAtomicItem> choices, String questionAnalysis) throws Exception {
        this(identifier, title, new OpenPrompt(promptOriginalValue), shuffle, choices, questionAnalysis);
    }

    /**
     * Instantiates a new Open single choice base assessment item.
     *
     * @param identifier          试题ID
     * @param respDeclarations    响应变量集合
     * @param outDeclarations     分数结果变量集合
     * @param interaction         选择交互
     * @param processingCondition 判分规则
     * @param questionAnalysis    试题解析
     * @throws Exception the exception
     */
    protected OpenSingleChoiceBaseAssessmentItem(String identifier, Collection<ResponseDeclarationType> respDeclarations,
                                                 Collection<OutcomeDeclarationType> outDeclarations, ChoiceInteractionType interaction,
                                                 ResponseConditionType processingCondition, String questionAnalysis) throws Exception {
        super(identifier, respDeclarations, outDeclarations, interaction, processingCondition, questionAnalysis);
    }
}
