package cn.com.open.openqti;

import cn.com.open.openqti.Exception.OpenJudgementAssessmentItemInvalidAtomicItemCountException;
import cn.com.open.qti.ChoiceInteractionType;
import cn.com.open.qti.OutcomeDeclarationType;
import cn.com.open.qti.ResponseConditionType;
import cn.com.open.qti.ResponseDeclarationType;

import java.util.Collection;
import java.util.List;

/**
 * Created by lucky on 2017/6/14.
 */
public class OpenJudgementAssessmentItem extends OpenSingleChoiceBaseAssessmentItem {
    /**
     * 题型
     */
    @Override
    public ItemType getAssessmentItemType() {
        return ItemType.JUDGEMENT;
    }

    /**
     * 判断题构造函数
     */
    public OpenJudgementAssessmentItem() {
    }

    /**
     * 判断题构造函数
     *
     * @param identifier       试题ID
     * @param title            标题
     * @param prompt           题干
     * @param choices          选项列表（仅限2个选项）
     * @param questionAnalysis 试题解析
     * @throws Exception the exception
     */
    public OpenJudgementAssessmentItem(String identifier, String title, OpenPrompt prompt, List<OpenSimpleChoiceAtomicItem> choices, String questionAnalysis) throws Exception {
        super(identifier, title, prompt, false, choices, questionAnalysis);
        if (choices.size() != 2) {
            throw new OpenJudgementAssessmentItemInvalidAtomicItemCountException(identifier, title);
        }
    }

    /**
     * 判断题构造函数
     *
     * @param identifier          试题ID
     * @param title               标题
     * @param promptOriginalValue 题干
     * @param choices             选项列表（仅限2个选项）
     * @param questionAnalysis    试题解析
     * @throws Exception the exception
     */
    private OpenJudgementAssessmentItem(String identifier, String title, String promptOriginalValue, List<OpenSimpleChoiceAtomicItem> choices, String questionAnalysis) throws Exception {
        super(identifier, title, promptOriginalValue, false, choices, questionAnalysis);
        if (choices.size() != 2) {
            throw new OpenJudgementAssessmentItemInvalidAtomicItemCountException(identifier, title);
        }
    }

    /**
     * 判断题构造函数（简化版）
     *
     * @param identifier       试题ID
     * @param prompt           题干
     * @param choices          选项列表（仅限2个选项）
     * @param questionAnalysis 试题解析
     * @throws Exception the exception
     */
    public OpenJudgementAssessmentItem(String identifier, OpenPrompt prompt, List<OpenSimpleChoiceAtomicItem> choices, String questionAnalysis) throws Exception {
        this(identifier, "", prompt, choices, questionAnalysis);
    }

    /**
     * 判断题构造函数（简化版）
     *
     * @param identifier          试题ID
     * @param promptOriginalValue 题干
     * @param choices             选项列表（仅限2个选项）
     * @param questionAnalysis    试题解析
     * @throws Exception the exception
     */
    private OpenJudgementAssessmentItem(String identifier, String promptOriginalValue, List<OpenSimpleChoiceAtomicItem> choices, String questionAnalysis) throws Exception {
        this(identifier, "", promptOriginalValue, choices, questionAnalysis);
    }

    /**
     * 判断题构造函数
     *
     * @param identifier          试题ID
     * @param respDeclarations    响应变量集合
     * @param outDeclarations     分数结果变量集合
     * @param interaction         选择交互
     * @param processingCondition 判分规则条件
     * @param questionAnalysis    试题解析
     * @throws Exception the exception
     */
    public OpenJudgementAssessmentItem(String identifier, Collection<ResponseDeclarationType> respDeclarations, Collection<OutcomeDeclarationType> outDeclarations,
                                       ChoiceInteractionType interaction, ResponseConditionType processingCondition, String questionAnalysis) throws Exception {
        super(identifier, respDeclarations, outDeclarations, interaction, processingCondition, questionAnalysis);
    }
}
