package cn.com.open.openqti;

import cn.com.open.qti.*;

import java.util.*;

/**
 * Created by lucky on 2017/6/14.
 */
public class OpenOrderAssessmentItem extends OpenAssessmentItem {
    /**
     * 题型
     */
    @Override
    public ItemType getAssessmentItemType() {
        return ItemType.ORDER;
    }

    /**
     * 题干
     */
    private OpenPrompt prompt;
    /**
     * 是否乱序
     */
    private boolean shuffle;
    /**
     * 排列方式
     */
    private OrientationType orientationType;
    /**
     * 排序项列表
     */
    private List<OpenOrderSimpleChoiceAtomicItem> choices;

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
     * Gets orientation.
     *
     * @return the orientation
     */
    public OrientationType getOrientationType() {
        return orientationType;
    }

    /**
     * Sets orientation.
     *
     * @param orientationType the orientation
     */
    public void setOrientationType(OrientationType orientationType) {
        this.orientationType = orientationType;
    }

    /**
     * Gets choices.
     *
     * @return the choices
     */
    public List<OpenOrderSimpleChoiceAtomicItem> getChoices() {
        return choices;
    }

    /**
     * Sets choices.
     *
     * @param choices the choices
     */
    public void setChoices(List<OpenOrderSimpleChoiceAtomicItem> choices) {
        this.choices = choices;
    }

    /**
     * 排序题构造函数
     */
    public OpenOrderAssessmentItem() {
    }

    /**
     * 排序题构造函数
     *
     * @param identifier       试题GUID
     * @param title            标题
     * @param prompt           题干
     * @param shuffle          是否乱序
     * @param oritentation     排序项排列方式
     * @param choices          排序项
     * @param questionAnalysis 试题解析
     */
    public OpenOrderAssessmentItem(String identifier, String title, OpenPrompt prompt, boolean shuffle, OrientationType oritentation,
                                   List<OpenOrderSimpleChoiceAtomicItem> choices, String questionAnalysis) {
        super(identifier, title, questionAnalysis);
        setPrompt(prompt);
        setShuffle(shuffle);
        setOrientationType(oritentation);
        setChoices(choices);
        setQuestionAnalysis(questionAnalysis);
    }

    /**
     * 排序题构造函数(默认水平排列)
     *
     * @param identifier       试题GUID
     * @param title            标题
     * @param prompt           题干
     * @param shuffle          是否乱序
     * @param choices          排序项
     * @param questionAnalysis 试题解析
     */
    public OpenOrderAssessmentItem(String identifier, String title, OpenPrompt prompt, boolean shuffle, List<OpenOrderSimpleChoiceAtomicItem> choices, String questionAnalysis) {
        this(identifier, title, prompt, shuffle, OrientationType.HORIZONTAL, choices, questionAnalysis);
    }

    /**
     * 排序题构造函数
     *
     * @param respDeclarations    响应声明
     * @param outDeclarations     结果声明
     * @param interaction         交互项
     * @param processingCondition 判分处理
     * @return the internal
     * @throws Exception the exception
     */
    public OpenOrderAssessmentItem(Collection<ResponseDeclarationType> respDeclarations, Collection<OutcomeDeclarationType> outDeclarations,
                                   OrderInteractionType interaction, ResponseConditionType processingCondition) throws Exception {
        ItemBodyType body = new ItemBodyType();
        body.getBlockElementGroup().add(interaction);

        ResponseProcessingType processing = new ResponseProcessingType();
        processing.getResponseRuleElementGroup().add(processingCondition);

        setResponseDeclarations(respDeclarations);
        setOutcomeDeclarations(outDeclarations);
        setItemBody(body);
        setResponseProcessing(processing);

        handleAfterTranslateFromImsItem();
    }


    //region Translate Between IMS & OPEN

    /**
     * 转换为IMS试题前处理
     * 构建ResponseDeclarations、OutcomeDeclarations、ItemBody、ResponseProcessing
     */
    @Override
    protected void handleBeforeTranslateToImsItem() throws Exception {

        Map<String, List<String>> correctResponses = new HashMap<String, List<String>>();

        correctResponses.put("RESPONSE", FindCorrectSequences());

        setResponseDeclarations(BuildResponseDeclarationCollection(CardinalityType.ORDERED, BaseTypeType.IDENTIFIER, correctResponses, false));
        setOutcomeDeclarations(BuildScoreOutcomeDeclarationCollection());
        setItemBody(BuildOrderInteractionItemBody());
        setResponseProcessing(BuildResponseProcessing(correctResponses.size(), false));

        super.handleBeforeTranslateToImsItem();
    }

    /**
     * 从IMS试题转换后处理
     * 从ResponseDeclarations、OutcomeDeclarations、ItemBody、ResponseProcessing反向得到本题项内容
     */
    @Override
    protected void handleAfterTranslateFromImsItem() throws Exception {
        super.handleAfterTranslateFromImsItem();

        if (getItemBody().getBlockElementGroup() != null && getItemBody().getBlockElementGroup().size() > 0) {
            OrderInteractionType order = (OrderInteractionType) getItemBody().getBlockElementGroup().get(0);
            setShuffle(order.isShuffle());
            if (order.getOrientation() == OrientationType.HORIZONTAL) {
                setOrientationType(OrientationType.HORIZONTAL);
            } else {
                setOrientationType(OrientationType.VERTICAL);
            }

            if (order.getPrompt() != null) {
                setPrompt(new OpenPrompt(order.getPrompt().getContent().get(0).toString()));
            }

            setChoices(ReverseOpenOrderSimpleChoiceAtomicItems());
        }
    }
    //endregion

    /**
     * 构造排序题itembody
     *
     * @return the item body type
     */
    private ItemBodyType BuildOrderInteractionItemBody() {
        ItemBodyType body = new ItemBodyType();

        OrderInteractionType interaction = new OrderInteractionType();

        interaction.setResponseIdentifier("RESPONSE");
        interaction.setShuffle(isShuffle());
        if (getOrientationType() == OrientationType.HORIZONTAL) {
            interaction.setOrientation(cn.com.open.qti.OrientationType.HORIZONTAL);
        } else {
            interaction.setOrientation(cn.com.open.qti.OrientationType.VERTICAL);
        }

        if (getPrompt() != null) {
            PromptType interactionPrompt = getPrompt().ConvertToImsPrompt();

            interaction.setPrompt(interactionPrompt);
        }

        Collection<SimpleChoiceType> simpleChoices = new ArrayList<SimpleChoiceType>();
        if (getChoices() != null) {
            for (OpenOrderSimpleChoiceAtomicItem choice : getChoices()) {
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
        body.getBlockElementGroup().add(interaction);
        return body;
    }

    /**
     * 得到正确顺序的identifier列表
     *
     * @return the list
     */
    public List<String> FindCorrectSequences() {
        List<String> correctSequences = new ArrayList<String>();

        if (getChoices() != null) {
            List<OpenOrderSimpleChoiceAtomicItem> tmpChoices = new ArrayList<OpenOrderSimpleChoiceAtomicItem>();

            for (OpenOrderSimpleChoiceAtomicItem choice : getChoices()) {
                tmpChoices.add(new OpenOrderSimpleChoiceAtomicItem(choice.getIdentifier(), choice.getContent(), choice.getCorrectSequence(), choice.isFixed()));
            }
            Collections.sort(tmpChoices, new Comparator<OpenOrderSimpleChoiceAtomicItem>() {
                @Override
                public int compare(OpenOrderSimpleChoiceAtomicItem x, OpenOrderSimpleChoiceAtomicItem y) {
                    Integer sequence1 = x.getCorrectSequence();
                    Integer sequence2 = y.getCorrectSequence();
                    return sequence1.compareTo(sequence2);
                }
            });
            for (OpenOrderSimpleChoiceAtomicItem choice : tmpChoices) {
                correctSequences.add(choice.getIdentifier());
            }
        }
        return correctSequences;
    }

    /**
     * 从AssessmentItem反向得到List
     *
     * @return the list
     */
    private List<OpenOrderSimpleChoiceAtomicItem> ReverseOpenOrderSimpleChoiceAtomicItems() {
        List<OpenOrderSimpleChoiceAtomicItem> openOrderSimpleChoices = new ArrayList<OpenOrderSimpleChoiceAtomicItem>();
        ResponseDeclarationType responseDeclaration = (ResponseDeclarationType) ((List) getResponseDeclarations()).get(0);
        if (getItemBody() != null && getItemBody().getBlockElementGroup() != null && getItemBody().getBlockElementGroup().size() > 0) {
            OrderInteractionType order = (OrderInteractionType) getItemBody().getBlockElementGroup().get(0);

            if (order.getSimpleChoice() != null && order.getSimpleChoice().size() > 0) {
                for (SimpleChoiceType orderSimpleChoice : order.getSimpleChoice()) {
                    int correctSequence = 0;
                    for (int i = 0; i < responseDeclaration.getCorrectResponse().getValue().size(); i++) {
                        if (responseDeclaration.getCorrectResponse().getValue().get(i).getValue().equals(orderSimpleChoice.getIdentifier())) {
                            correctSequence = i + 1;
                            break;
                        }
                    }

                    OpenOrderSimpleChoiceAtomicItem openOrderSimpleChoice = new OpenOrderSimpleChoiceAtomicItem(
                            orderSimpleChoice.getIdentifier(),
                            orderSimpleChoice.getContent().get(0).toString(),
                            correctSequence,
                            orderSimpleChoice.isFixed() == null ? false : orderSimpleChoice.isFixed()
                    );

                    openOrderSimpleChoices.add(openOrderSimpleChoice);
                }
            }
        }

        return openOrderSimpleChoices;
    }

    /**
     * 获取媒体资源列表
     *
     * @return media对象
     */
    @Override
    public List<Media> GetMediaList() {
        List<Media> mediaList = new ArrayList<Media>();
        if (getPrompt().getMedia() != null) {
            mediaList.add(getPrompt().getMedia());
        }
        return mediaList;
    }
}

