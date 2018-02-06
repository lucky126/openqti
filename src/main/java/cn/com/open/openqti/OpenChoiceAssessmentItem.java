package cn.com.open.openqti;

import cn.com.open.openqti.Exception.OpenChoiceBaseAssessmentItemHasNoChoiceInteractionException;
import cn.com.open.openqti.Exception.OpenSimpleChoiceInteractionNeedCorrectResponseValueException;
import cn.com.open.qti.*;

import java.util.*;

/**
 * 选择类试题基类
 *
 * @author lucky
 */
public abstract class OpenChoiceAssessmentItem extends OpenAssessmentItem {

    private String identifier;

    /**
     * 是否映射匹配
     */
    private boolean mappingResponseInner;

    /**
     * 响应基数
     */
    private CardinalityType ResponseCardinality;

    /**
     * 允许最大可选项数
     */
    private int MaxChoice;

    /**
     * 选择交互项列表
     */
    private Collection<OpenChoiceInteraction> openChoiceInteractions;

    /**
     * 获取是否映射匹配
     *
     * @return the boolean
     */
    protected boolean isMappingResponseInner() {
        return mappingResponseInner;
    }

    /**
     * 设置是否映射匹配
     *
     * @param mappingResponseInner the mapping response inner
     */
    protected void setMappingResponseInner(boolean mappingResponseInner) {
        this.mappingResponseInner = mappingResponseInner;
    }

    /**
     * 获取响应基数
     *
     * @return the response cardinality
     */
    public CardinalityType getResponseCardinality() {
        return ResponseCardinality;
    }

    /**
     * 获取允许最大可选项数
     *
     * @return the max choice
     */
    public int getMaxChoice() {
        return MaxChoice;
    }

    /**
     * 获取选择交互项列表.
     *
     * @return 选择交互项列表 open choice interactions
     */
    public Collection<OpenChoiceInteraction> getOpenChoiceInteractions() {
        return openChoiceInteractions;
    }

    /**
     * 设置选择交互项列表.
     *
     * @param openChoiceInteractions 选择交互项列表
     */
    public void setOpenChoiceInteractions(Collection<OpenChoiceInteraction> openChoiceInteractions) {
        this.openChoiceInteractions = openChoiceInteractions;
    }

    /**
     * 选择类试题构造函数
     */
    public OpenChoiceAssessmentItem() {
    }

    /**
     * 选择类试题构造函数
     *
     * @param identifier       试题ID
     * @param title            标题
     * @param questionAnalysis 试题解析
     */
    public OpenChoiceAssessmentItem(String identifier, String title, String questionAnalysis) {
        super(identifier, title, questionAnalysis);
    }

    /**
     * 选择类试题构造函数
     *
     * @param identifier             试题ID
     * @param title                  标题
     * @param openChoiceInteractions 选项列表
     * @param questionAnalysis       试题解析
     */
    public OpenChoiceAssessmentItem(String identifier, String title, Collection<OpenChoiceInteraction> openChoiceInteractions, String questionAnalysis) {
        super(identifier, title, questionAnalysis);
        this.setOpenChoiceInteractions(openChoiceInteractions);
    }

    /**
     * 选择类试题构造函数
     *
     * @param identifier            试题ID
     * @param title                 标题
     * @param openChoiceInteraction 选项列表
     * @param questionAnalysis      试题解析
     */
    public OpenChoiceAssessmentItem(String identifier, String title, OpenChoiceInteraction openChoiceInteraction, String questionAnalysis) {
        super(identifier, title, questionAnalysis);

        List<OpenChoiceInteraction> _openChoiceInteractions = null;
        if (openChoiceInteraction != null) {
            _openChoiceInteractions = new ArrayList<OpenChoiceInteraction>();
            _openChoiceInteractions.add(openChoiceInteraction);
            this.setOpenChoiceInteractions(_openChoiceInteractions);
        }
    }

    /**
     * 选择类试题构造函数
     *
     * @param identifier       试题ID
     * @param respDeclarations 响应变量集合
     * @param outDeclarations  分数结果变量集合
     * @param body             试题体
     * @param processing       判分规则
     * @param questionAnalysis 试题解析
     * @throws Exception the exception
     */
    protected OpenChoiceAssessmentItem(String identifier, Collection<ResponseDeclarationType> respDeclarations,
                                       Collection<OutcomeDeclarationType> outDeclarations, ItemBodyType body, ResponseProcessingType processing, String questionAnalysis) throws Exception {
        super(identifier, respDeclarations, outDeclarations, body, processing, questionAnalysis);
    }


    /**
     * 创建选择类试题的试题体
     * （复杂模式，完形、阅读理解等含段落内容的）
     *
     * @return 试题体 item body type
     */
    protected ItemBodyType BuildChoiceInteractionItemBody() {
        ItemBodyType body = new ItemBodyType();
        body.getBlockElementGroup().addAll(BuildChoiceInteractions());
        return body;
    }

    /**
     * 将Open类型选择交互项列表转换为Ims类型选择交互项列表
     *
     * @return Ims类型选择交互项列表
     */
    private Collection<ChoiceInteractionType> BuildChoiceInteractions() {
        Collection<ChoiceInteractionType> choiceInteractions = new ArrayList<ChoiceInteractionType>();
        ChoiceInteractionType choiceInteraction;
        if (this.getOpenChoiceInteractions() != null) {
            for (OpenChoiceInteraction openChoiceInteraction : this.getOpenChoiceInteractions()) {
                choiceInteraction = BuildChoiceInteraction(openChoiceInteraction);
                choiceInteractions.add(choiceInteraction);
            }
        }
        return choiceInteractions;
    }

    /**
     * 将Open类型选择交互项转换为Ims类型选择交互项
     *
     * @param openChoiceInteraction Open类型选择交互项
     * @return Ims类型选择交互项
     */
    private ChoiceInteractionType BuildChoiceInteraction(OpenChoiceInteraction openChoiceInteraction) {
        //region 定义choiceInteraction
        ChoiceInteractionType interaction = new ChoiceInteractionType();

        interaction.setResponseIdentifier(openChoiceInteraction.getResponseIdentifier());
        interaction.setShuffle(openChoiceInteraction.isShuffle());
        interaction.setMaxChoices(this.getMaxChoice());//根据题型确定此值

        if (openChoiceInteraction.getPrompt() != null) {
            PromptType interactionPrompt;
            interactionPrompt = openChoiceInteraction.getPrompt().ConvertToImsPrompt();

            interaction.setPrompt(interactionPrompt);
        }

        Collection<SimpleChoiceType> simpleChoices = new ArrayList<SimpleChoiceType>();
        if (openChoiceInteraction.getAtomicItems() != null) {
            for (OpenSimpleChoiceAtomicItem choice : openChoiceInteraction.getAtomicItems()) {
                SimpleChoiceType simpChoice = new SimpleChoiceType();
                simpChoice.setIdentifier(choice.getIdentifier());
                simpChoice.getContent().add(choice.getContent());
                if (choice.isFixed() == true) {
                    simpChoice.setFixed(choice.isFixed());
                }

                simpleChoices.add(simpChoice);
            }
        }
        interaction.getSimpleChoice().addAll(simpleChoices);
        //endregion

        return interaction;
    }

    /**
     * 从IMS试题转换后处理
     * 从ResponseDeclarations、OutcomeDeclarations、ItemBody、ResponseProcessing反向得到本题项内容
     */
    @Override
    protected void handleAfterTranslateFromImsItem() throws Exception {
        super.handleAfterTranslateFromImsItem();

        //region 从itemBody.choiceInteractionCollection反向得到OpenChoiceInteractions
        //region 前置处理，取正确答案
        Map<String, List<String>> correctResponses;
        correctResponses = new HashMap<>();
        if (getResponseDeclarations() != null) {
            //对ResponseDeclarations循环
            for (ResponseDeclarationType respDeclaration : getResponseDeclarations()) {
                List<String> interactionCorrectResponses = new ArrayList<String>();
                //取完全匹配给分方式的正确答案
                if (respDeclaration.getCorrectResponse() != null &&
                        respDeclaration.getCorrectResponse().getValue() != null) {
                    for (ValueType val : respDeclaration.getCorrectResponse().getValue()) {
                        interactionCorrectResponses.add(val.getValue());
                    }
                }
                //取映射匹配给分方式的正确答案
                if (respDeclaration.getMapping() != null &&
                        respDeclaration.getMapping().getMapEntry() != null) {
                    for (MapEntryType map : respDeclaration.getMapping().getMapEntry()) {
                        interactionCorrectResponses.add(map.getMapKey());
                    }
                }

                correctResponses.put(respDeclaration.getIdentifier(), interactionCorrectResponses);
            }
        }
        //endregion

        openChoiceInteractions = new ArrayList<OpenChoiceInteraction>();
        if (getItemBody().getBlockElementGroup() != null) {
            for (Object obj : getItemBody().getBlockElementGroup()) {
                if (obj instanceof ChoiceInteractionType) {
                    //取交互项
                    ChoiceInteractionType choiceInteraction = (ChoiceInteractionType) obj;
                    String responseIdentifier = choiceInteraction.getResponseIdentifier();
                    boolean shuffle = choiceInteraction.isShuffle();
                    String prompt = choiceInteraction.getPrompt().getContent().size() == 0 ? null : choiceInteraction.getPrompt().getContent().get(0).toString();//题干

                    List<OpenSimpleChoiceAtomicItem> choices = new ArrayList<OpenSimpleChoiceAtomicItem>();
                    if (choiceInteraction.getSimpleChoice() != null) {
                        //对交互的选项循环，构造OpenSimpleChoiceAtomicItem
                        for (SimpleChoiceType simpChoice : choiceInteraction.getSimpleChoice()) {
                            boolean isCorrectResponse = false;
                            //从交互答案列表中查找此项是否正确答案
                            for (String interactionCorrectResponse : correctResponses.get(choiceInteraction.getResponseIdentifier())) {
                                if (simpChoice.getIdentifier().equals(interactionCorrectResponse)) {
                                    isCorrectResponse = true;
                                    break;
                                }
                            }

                            OpenSimpleChoiceAtomicItem choice = new OpenSimpleChoiceAtomicItem(simpChoice.getIdentifier(), simpChoice.getContent().get(0).toString(),
                                    isCorrectResponse, simpChoice.isFixed() == null ? false : simpChoice.isFixed());
                            choices.add(choice);
                        }
                    }

                    OpenChoiceInteraction interaction = new OpenChoiceInteraction(responseIdentifier, new OpenPrompt(prompt), shuffle, choices);
                    openChoiceInteractions.add(interaction);
                }
            }
        }
        //endregion
    }

    /**
     * 转换为IMS试题前处理
     * 构建ResponseDeclarations、OutcomeDeclarations、ItemBody、ResponseProcessing
     */
    @Override
    protected void handleBeforeTranslateToImsItem() throws Exception {
        //region Build CorrectResponseValuesList
        Map<String, List<String>> correctResponseValuesList = new HashMap<>();
        int childItemIndex = 0;
        boolean singleInteraction = getOpenChoiceInteractions().size() == 1;
        for (OpenChoiceInteraction openChoiceInteraction : getOpenChoiceInteractions()) {
            childItemIndex++;
            openChoiceInteraction.setResponseIdentifier(singleInteraction ? "RESPONSE" : "RESPONSE_" + childItemIndex);

            List<String> correctResponseValues = new ArrayList<String>();
            for (OpenSimpleChoiceAtomicItem choice : openChoiceInteraction.getAtomicItems()) {
                if (choice.isCorrectResponse()) {
                    correctResponseValues.add(choice.getIdentifier());
                }
            }
            if (correctResponseValues.size() == 0) {
                throw new OpenSimpleChoiceInteractionNeedCorrectResponseValueException(this.getIdentifier(), this.getTitle(), childItemIndex);
            }

            correctResponseValuesList.put(openChoiceInteraction.getResponseIdentifier(), correctResponseValues);
        }
        //endregion

        setResponseDeclarations(BuildResponseDeclarationCollection(this.getResponseCardinality(), BaseTypeType.IDENTIFIER, correctResponseValuesList, isMappingResponseInner()));
        setOutcomeDeclarations(BuildScoreOutcomeDeclarationCollection(getOpenChoiceInteractions().size()));
        setItemBody(BuildChoiceInteractionItemBody());
        setResponseProcessing(BuildResponseProcessing(correctResponseValuesList.size(), isMappingResponseInner()));//各个子题分数平均分配

        super.handleBeforeTranslateToImsItem();
    }

    /**
     * 获取媒体资源列表
     *
     * @return 媒体资料列表
     */
    @Override
    public List<Media> GetMediaList() {
        List<Media> mediaList = new ArrayList<Media>();
        for (OpenChoiceInteraction openChoiceInteraction : getOpenChoiceInteractions()) {
            if (openChoiceInteraction.getPrompt().getMedia() != null) {
                mediaList.add(openChoiceInteraction.getPrompt().getMedia());
            }
        }
        return mediaList;
    }
}
