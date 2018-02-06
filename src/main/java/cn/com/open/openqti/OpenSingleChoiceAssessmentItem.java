package cn.com.open.openqti;

import cn.com.open.openqti.Exception.OpenChoiceAssessmentItemNeedCorrectResponseValueException;
import cn.com.open.openqti.Exception.OpenSingleChoiceBaseAssessmentItemHasMultipleCorrectResponseException;
import cn.com.open.qti.ChoiceInteractionType;
import cn.com.open.qti.OutcomeDeclarationType;
import cn.com.open.qti.ResponseConditionType;
import cn.com.open.qti.ResponseDeclarationType;

import java.util.Collection;

/**
 * Created by lucky on 2017/6/14.
 */

/**
 * 单选题
 */
public class OpenSingleChoiceAssessmentItem extends OpenSingleChoiceBaseAssessmentItem {
    /**
     * 题型
     */
    @Override
    public ItemType getAssessmentItemType() {
        return ItemType.SINGLECHOICE;
    }

    /**
     * 单选题构造函数
     */
    public OpenSingleChoiceAssessmentItem() {
    }

    /**
     * 单选题构造函数
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
    public OpenSingleChoiceAssessmentItem(String identifier, String title, OpenPrompt prompt, boolean shuffle, Collection<OpenSimpleChoiceAtomicItem> choices,
                                          String questionAnalysis) throws OpenSingleChoiceBaseAssessmentItemHasMultipleCorrectResponseException,
            OpenChoiceAssessmentItemNeedCorrectResponseValueException {
        super(identifier, title, prompt, shuffle, choices, questionAnalysis);
    }

    /**
     * 单选题构造函数
     *
     * @param identifier          试题ID
     * @param title               标题
     * @param promptOriginalValue 题干
     * @param shuffle             选项是否乱序
     * @param choices             选项列表
     * @param questionAnalysis    试题解析
     * @throws Exception the exception
     */
    protected OpenSingleChoiceAssessmentItem(String identifier, String title, String promptOriginalValue, boolean shuffle, Collection<OpenSimpleChoiceAtomicItem> choices,
                                             String questionAnalysis) throws Exception {
        super(identifier, title, promptOriginalValue, shuffle, choices, questionAnalysis);
    }

    /**
     * 单选题构造函数（简化版）
     *
     * @param identifier       试题ID
     * @param prompt           题干
     * @param choices          选项列表
     * @param questionAnalysis 试题解析
     * @throws OpenSingleChoiceBaseAssessmentItemHasMultipleCorrectResponseException the open single choice base assessment item has multiple correct response exception
     * @throws OpenChoiceAssessmentItemNeedCorrectResponseValueException             the open choice assessment item need correct response value exception
     */
    public OpenSingleChoiceAssessmentItem(String identifier, OpenPrompt prompt, Collection<OpenSimpleChoiceAtomicItem> choices, String questionAnalysis) throws OpenSingleChoiceBaseAssessmentItemHasMultipleCorrectResponseException, OpenChoiceAssessmentItemNeedCorrectResponseValueException {
        this(identifier, "", prompt, true, choices, questionAnalysis);
    }


    /**
     * 单选题构造函数（简化版）
     *
     * @param identifier          试题ID
     * @param promptOriginalValue 题干
     * @param choices             选项列表
     * @param questionAnalysis    试题解析
     * @throws Exception the exception
     */
    protected OpenSingleChoiceAssessmentItem(String identifier, String promptOriginalValue, Collection<OpenSimpleChoiceAtomicItem> choices, String questionAnalysis) throws Exception {
        this(identifier, "", promptOriginalValue, true, choices, questionAnalysis);
    }

    /**
     * 单选题构造函数
     *
     * @param identifier          试题ID
     * @param respDeclarations    响应变量集合
     * @param outDeclarations     分数结果变量集合
     * @param interaction         选择交互
     * @param processingCondition 判分规则条件
     * @param questionAnalysis    试题解析
     * @throws Exception the exception
     */
    public OpenSingleChoiceAssessmentItem(String identifier, Collection<ResponseDeclarationType> respDeclarations, Collection<OutcomeDeclarationType> outDeclarations,
                                          ChoiceInteractionType interaction, ResponseConditionType processingCondition, String questionAnalysis) throws Exception {
        super(identifier, respDeclarations, outDeclarations, interaction, processingCondition, questionAnalysis);
    }
}
