package cn.com.open.openqti;

import cn.com.open.openqti.Exception.OpenChoiceBaseAssessmentItemHasNoChoiceInteractionException;
import cn.com.open.openqti.Exception.OpenSimpleChoiceInteractionNeedCorrectResponseValueException;
import cn.com.open.qti.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by lucky on 2017/6/14.
 */
public class OpenChoiceBaseAssessmentItem extends OpenChoiceAssessmentItem {
    /**
     * 题干
     */
    private OpenPrompt prompt;
    /**
     * 是否乱序
     */
    private boolean shuffle;
    /**
     * 选项列表
     */
    private Collection<OpenSimpleChoiceAtomicItem> choices;

    /**
     * Gets prompt.
     *
     * @return the prompt
     */
    public OpenPrompt getPrompt() {
        return prompt;
    }

    /**
     * Sets prompt.
     *
     * @param prompt the prompt
     */
    public void setPrompt(OpenPrompt prompt) {
        this.prompt = prompt;
    }


    /**
     * Is shuffle boolean.
     *
     * @return the boolean
     */
    public boolean isShuffle() {
        return shuffle;
    }

    /**
     * Sets shuffle.
     *
     * @param shuffle the shuffle
     */
    public void setShuffle(boolean shuffle) {
        this.shuffle = shuffle;
    }

    /**
     * Gets choices.
     *
     * @return the choices
     */
    public Collection<OpenSimpleChoiceAtomicItem> getChoices() {
        return choices;
    }

    /**
     * Sets choices.
     *
     * @param choices the choices
     */
    public void setChoices(List<OpenSimpleChoiceAtomicItem> choices) {
        this.choices = choices;
    }

    /**
     * 简单选择类基础题构造函数
     */
    public OpenChoiceBaseAssessmentItem() {
    }

    /**
     * 简单选择类基础题构造函数
     *
     * @param identifier       试题ID
     * @param title            标题
     * @param prompt           题干
     * @param shuffle          选项是否乱序
     * @param choices          选项列表
     * @param questionAnalysis 试题解析
     */
    public OpenChoiceBaseAssessmentItem(String identifier, String title, OpenPrompt prompt, boolean shuffle,
                                        Collection<OpenSimpleChoiceAtomicItem> choices, String questionAnalysis) {
        super(identifier, title, questionAnalysis);
        this.prompt = prompt;
        this.shuffle = shuffle;
        this.choices = choices;
    }

    /**
     * 简单选择类基础题构造函数
     *
     * @param identifier          试题ID
     * @param title               标题
     * @param promptOriginalValue 题干
     * @param shuffle             选项是否乱序
     * @param choices             选项列表
     * @param questionAnalysis    试题解析
     * @throws Exception the exception
     */
    protected OpenChoiceBaseAssessmentItem(String identifier, String title, String promptOriginalValue, boolean shuffle,
                                           Collection<OpenSimpleChoiceAtomicItem> choices, String questionAnalysis) throws Exception {
        this(identifier, title, new OpenPrompt(promptOriginalValue), shuffle, choices, questionAnalysis);
    }

    /**
     * 简单选择类基础题构造函数
     *
     * @param identifier          试题ID
     * @param respDeclarations    响应变量集合
     * @param outDeclarations     分数结果变量集合
     * @param interaction         选择交互
     * @param processingCondition 判分规则条件
     * @param questionAnalysis    试题解析
     * @throws Exception the exception
     */
    protected OpenChoiceBaseAssessmentItem(String identifier, Collection<ResponseDeclarationType> respDeclarations, Collection<OutcomeDeclarationType> outDeclarations,
                                           ChoiceInteractionType interaction, ResponseConditionType processingCondition, String questionAnalysis) throws Exception {
        super(identifier, respDeclarations, outDeclarations, TransToItemBody(interaction), TransToResponseProcessing(processingCondition), questionAnalysis);
    }

    /**
     * 简单选择类带Map映射构造函数
     *
     * @param identifier       试题ID
     * @param respDeclarations 响应变量集合
     * @param outDeclarations  分数结果变量集合
     * @param interaction      选择交互
     * @param setOutcomeValues 判分规则条件
     * @param questionAnalysis 试题解析
     * @throws Exception the exception
     */
    protected OpenChoiceBaseAssessmentItem(String identifier, Collection<ResponseDeclarationType> respDeclarations, Collection<OutcomeDeclarationType> outDeclarations,
                                           ChoiceInteractionType interaction, Collection<SetOutcomeValueType> setOutcomeValues, String questionAnalysis) throws Exception {
        super(identifier, respDeclarations, outDeclarations, TransToItemBody(interaction), TransToResponseProcessing(setOutcomeValues), questionAnalysis);
    }

    /**
     * 将选择交互项转换成试题体
     *
     * @param interaction 选择交互项
     * @return 试题体
     */
    private static ItemBodyType TransToItemBody(ChoiceInteractionType interaction) {
        ItemBodyType body = new ItemBodyType();
        body.getBlockElementGroup().add(interaction);
        return body;
    }

    /**
     * 将判分条件转换成判分处理部分
     *
     * @param processingCondition 判分条件
     * @return 判分处理部分
     */
    private static ResponseProcessingType TransToResponseProcessing(ResponseConditionType processingCondition) {
        ResponseProcessingType processing = new ResponseProcessingType();
        processing.getResponseRuleElementGroup().add(processingCondition);
        return processing;
    }

    /**
     * 将判分条件转换成判分处理部分.
     *
     * @param setOutcomeValues 赋分部分
     * @return 判分处理部分
     */
    private static ResponseProcessingType TransToResponseProcessing(Collection<SetOutcomeValueType> setOutcomeValues) {
        ResponseProcessingType processing = new ResponseProcessingType();
        processing.getResponseRuleElementGroup().add(setOutcomeValues);
        return processing;
    }

    /**
     * 转换为IMS试题前处理
     * 构建ResponseDeclarations、OutcomeDeclarations、ItemBody、ResponseProcessing
     */
    @Override
    protected void handleBeforeTranslateToImsItem() throws Exception {
        //region 构造OpenChoiceInteractions
        OpenChoiceInteraction openChoiceInteraction = new OpenChoiceInteraction("RESPONSE", getPrompt(), isShuffle(), getChoices());

        List<OpenChoiceInteraction> openChoiceInteractions = new ArrayList<OpenChoiceInteraction>();
        openChoiceInteractions.add(openChoiceInteraction);
        setOpenChoiceInteractions(openChoiceInteractions);

        //endregion

        super.handleBeforeTranslateToImsItem();
    }

    /**
     * 从IMS试题转换后处理
     * 从ResponseDeclarations、OutcomeDeclarations、ItemBody、ResponseProcessing反向得到本题项内容
     */
    @Override
    protected void handleAfterTranslateFromImsItem() throws Exception {
        super.handleAfterTranslateFromImsItem();

        if (super.getOpenChoiceInteractions() == null || super.getOpenChoiceInteractions().size() == 0) {
            throw new OpenChoiceBaseAssessmentItemHasNoChoiceInteractionException(this.getIdentifier(), this.getTitle());
        }
        OpenChoiceInteraction openChoiceInteraction = (OpenChoiceInteraction) ((List) getOpenChoiceInteractions()).get(0);
        prompt = openChoiceInteraction.getPrompt();
        shuffle = openChoiceInteraction.isShuffle();
        choices = openChoiceInteraction.getAtomicItems();
    }
}
