package cn.com.open.openqti;

/**
 * Created by lucky on 2017/6/14.
 */

import cn.com.open.qti.*;

import java.util.Collection;
import java.util.List;

/**
 * 多选题
 */
public class OpenMultipleChoiceAssessmentItem extends OpenChoiceBaseAssessmentItem {
    private boolean _MappingResponseInner;

    /**
     * 题型
     */
    @Override
    public ItemType getAssessmentItemType() {
        return ItemType.MULTIPLECHOICE;
    }

    /**
     * 获取响应基数
     *
     * @return the response cardinality
     */
    @Override
    public CardinalityType getResponseCardinality() {
        return CardinalityType.MULTIPLE;
    }

    /**
     * 获取允许最大可选项数
     *
     * @return the max choice
     */
    @Override
    public int getMaxChoice() {
        return 0;
    }

    /**
     * 获取是否映射匹配
     *
     * @return the boolean
     */
    @Override
    protected boolean isMappingResponseInner() {
        return _MappingResponseInner;
    }

    /**
     * 设置是否映射匹配
     *
     * @param mappingResponseInner the mapping response inner
     */
    @Override
    protected void setMappingResponseInner(boolean mappingResponseInner) {
        this._MappingResponseInner = mappingResponseInner;
    }

    /**
     * 获取是否映射匹配
     *
     * @return the boolean
     */
    public boolean isMappingResponse() {
        return isMappingResponseInner();
    }

    /**
     * 设置是否映射匹配
     *
     * @param mappingResponse the mapping response inner
     */
    public void setMappingResponse(boolean mappingResponse) {
        this.setMappingResponseInner(mappingResponse);
    }

    /**
     * 多选题构造函数
     */
    public OpenMultipleChoiceAssessmentItem() {
    }

    /**
     * 多选题构造函数
     *
     * @param identifier       试题ID
     * @param title            标题
     * @param prompt           题干
     * @param shuffle          选项是否乱序
     * @param choices          选项列表
     * @param mappingResponse  是否映射匹配给分模式
     * @param questionAnalysis 试题解析
     */
    public OpenMultipleChoiceAssessmentItem(String identifier, String title, OpenPrompt prompt, boolean shuffle, List<OpenSimpleChoiceAtomicItem> choices,
                                            boolean mappingResponse, String questionAnalysis) {
        super(identifier, title, prompt, shuffle, choices, questionAnalysis);
        setMappingResponse(mappingResponse);
    }

    /**
     * 多选题构造函数
     *
     * @param identifier          试题ID
     * @param title               标题
     * @param promptOriginalValue 题干
     * @param shuffle             选项是否乱序
     * @param choices             选项列表
     * @param mappingResponse     是否映射匹配给分模式
     * @param questionAnalysis    试题解析
     */
    private OpenMultipleChoiceAssessmentItem(String identifier, String title, String promptOriginalValue, boolean shuffle, List<OpenSimpleChoiceAtomicItem> choices,
                                             boolean mappingResponse, String questionAnalysis) throws Exception {
        super(identifier, title, promptOriginalValue, shuffle, choices, questionAnalysis);
        setMappingResponse(mappingResponse);
    }

    /**
     * 多选题构造函数（完全匹配给分模式）
     *
     * @param identifier       试题ID
     * @param title            标题
     * @param prompt           题干
     * @param shuffle          选项是否乱序
     * @param choices          选项列表
     * @param questionAnalysis 试题解析
     */
    public OpenMultipleChoiceAssessmentItem(String identifier, String title, OpenPrompt prompt, boolean shuffle, List<OpenSimpleChoiceAtomicItem> choices,
                                            String questionAnalysis) {
        this(identifier, title, prompt, shuffle, choices, false, questionAnalysis);
    }

    /**
     * 多选题构造函数（完全匹配给分模式）
     *
     * @param identifier          试题ID
     * @param title               标题
     * @param promptOriginalValue 题干
     * @param shuffle             选项是否乱序
     * @param choices             选项列表
     * @param questionAnalysis    试题解析
     * @throws Exception the exception
     */
    private OpenMultipleChoiceAssessmentItem(String identifier, String title, String promptOriginalValue, boolean shuffle, List<OpenSimpleChoiceAtomicItem> choices,
                                             String questionAnalysis) throws Exception {
        this(identifier, title, promptOriginalValue, shuffle, choices, false, questionAnalysis);
    }

    /**
     * 多选题构造函数
     *
     * @param identifier          试题ID
     * @param respDeclarations    响应变量集合
     * @param outDeclarations     分数结果变量集合
     * @param interaction         选择交互
     * @param processingCondition 判分规则条件
     * @param questionAnalysis    试题解析
     * @throws Exception the exception
     */
    public OpenMultipleChoiceAssessmentItem(String identifier, Collection<ResponseDeclarationType> respDeclarations, Collection<OutcomeDeclarationType> outDeclarations,
                                            ChoiceInteractionType interaction, ResponseConditionType processingCondition, String questionAnalysis) throws Exception {
        super(identifier, respDeclarations, outDeclarations, interaction, processingCondition, questionAnalysis);
    }

    /**
     * 多选题构造函数
     *
     * @param identifier       试题ID
     * @param respDeclarations 响应变量集合
     * @param outDeclarations  分数结果变量集合
     * @param interaction      选择交互
     * @param setOutcomeValues 判分规则条件
     * @param questionAnalysis 试题解析
     * @throws Exception the exception
     */
    public OpenMultipleChoiceAssessmentItem(String identifier, Collection<ResponseDeclarationType> respDeclarations, Collection<OutcomeDeclarationType> outDeclarations,
                                            ChoiceInteractionType interaction, Collection<SetOutcomeValueType> setOutcomeValues, String questionAnalysis) throws Exception {
        super(identifier, respDeclarations, outDeclarations, interaction, setOutcomeValues, questionAnalysis);
    }

    //region Translate Between IMS & OPEN

    /**
     * 从IMS试题转换后处理
     * 从ResponseDeclarations、OutcomeDeclarations、ItemBody、ResponseProcessing反向得到本题项内容
     */
    @Override
    protected void handleAfterTranslateFromImsItem() throws Exception {
        super.handleAfterTranslateFromImsItem();

        if (getResponseDeclarations().size() > 0) {
            ResponseDeclarationType response = (ResponseDeclarationType) ((List) getResponseDeclarations()).get(0);
            setMappingResponse(response.getMapping() != null);
        }
    }
    //endregion
}
