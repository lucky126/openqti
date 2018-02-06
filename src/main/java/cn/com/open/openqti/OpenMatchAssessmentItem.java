package cn.com.open.openqti;

import cn.com.open.openqti.Exception.OpenSingleMatchAssessmentItemCanNotHasMultipleCorrectResponseValueException;
import cn.com.open.openqti.Exception.OpenSingleMatchAssessmentItemMustHasSameChildItemCountException;
import cn.com.open.qti.*;
import cn.com.open.utils.GuidUtil;

import java.util.*;

/**
 * Created by lucky on 2017/6/14.
 */
public class OpenMatchAssessmentItem extends OpenAssessmentItem {
    /**
     * 题型
     */
    @Override
    public ItemType getAssessmentItemType() {
        return ItemType.MATCH;
    }

    /**
     * 是否单项匹配（单项匹配暂不实现）
     */
    private boolean isSingleMatch;

    /**
     * 题干
     */
    private OpenPrompt prompt;
    /**
     * 是否乱序
     */
    private boolean shuffle;
    /**
     * 左匹配项列表
     */
    private List<OpenLeftSimpleAssociableChoiceAtomicItem> leftAssociableChoices;
    /**
     * 右匹配项列表
     */
    private List<OpenRightSimpleAssociableChoiceAtomicItem> rightAssociableChoices;

    /**
     * Is is single match boolean.
     *
     * @return the boolean
     */
    public boolean isSingleMatch() {
        return false;
    }

    /**
     * Sets is single match.
     *
     * @param singleMatch the is single match
     */
    public void setSingleMatch(boolean singleMatch) {
        this.isSingleMatch = singleMatch;
    }

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
     * Gets left associable choices.
     *
     * @return the left associable choices
     */
    public List<OpenLeftSimpleAssociableChoiceAtomicItem> getLeftAssociableChoices() {
        return leftAssociableChoices;
    }

    /**
     * Sets left associable choices.
     *
     * @param leftAssociableChoices the left associable choices
     */
    public void setLeftAssociableChoices(List<OpenLeftSimpleAssociableChoiceAtomicItem> leftAssociableChoices) {
        this.leftAssociableChoices = leftAssociableChoices;
    }

    /**
     * Gets right associable choices.
     *
     * @return the right associable choices
     */
    public List<OpenRightSimpleAssociableChoiceAtomicItem> getRightAssociableChoices() {
        return rightAssociableChoices;
    }

    /**
     * Sets right associable choices.
     *
     * @param rightAssociableChoices the right associable choices
     */
    public void setRightAssociableChoices(List<OpenRightSimpleAssociableChoiceAtomicItem> rightAssociableChoices) {
        this.rightAssociableChoices = rightAssociableChoices;
    }


    /**
     * 从AssessmentItem反向得到List
     *
     * @return the list
     */
    public List<OpenLeftSimpleAssociableChoiceAtomicItem> ReverseOpenLeftSimpleAssociableChoiceAtomicItems() {
        List<OpenLeftSimpleAssociableChoiceAtomicItem> leftAssociableChoices = new ArrayList<OpenLeftSimpleAssociableChoiceAtomicItem>();

        //第1个simpleMatchSet为左匹配项
        if (getItemBody() != null && getItemBody().getBlockElementGroup() != null && getItemBody().getBlockElementGroup().size() > 0) {
            Object obj = getItemBody().getBlockElementGroup().get(0);
            if (obj != null) {
                MatchInteractionType matchInteraction = (MatchInteractionType) obj;

                if (matchInteraction.getSimpleMatchSet() != null && matchInteraction.getSimpleMatchSet().size() > 0 &&
                        matchInteraction.getSimpleMatchSet().get(0).getSimpleAssociableChoice() != null) {

                    for (SimpleAssociableChoiceType associableChoice : matchInteraction.getSimpleMatchSet().get(0).getSimpleAssociableChoice()) {
                        OpenLeftSimpleAssociableChoiceAtomicItem leftAssociableChoice = new OpenLeftSimpleAssociableChoiceAtomicItem(
                                associableChoice.getIdentifier(),
                                associableChoice.getContent().get(0).toString(),
                                FindCorrectResponseValues(associableChoice.getIdentifier())
                        );

                        leftAssociableChoices.add(leftAssociableChoice);
                    }
                }
            }
        }

        return leftAssociableChoices;
    }

    /**
     * 查找正确答案列表
     *
     * @param identifier 左匹配项ID
     * @return the list
     */
    private List<String> FindCorrectResponseValues(String identifier) {
        String covertIdentifier = GuidUtil.formatGuid(identifier);
        List<String> correctResponseValues = new ArrayList<String>();
        if (getResponseDeclarations() != null && getResponseDeclarations().size() > 0) {
            List<ResponseDeclarationType> responseDeclarationCollection = (List) getResponseDeclarations();
            if (responseDeclarationCollection.get(0).getMapping() != null && responseDeclarationCollection.get(0).getMapping().getMapEntry() != null) {
                for (MapEntryType entry : responseDeclarationCollection.get(0).getMapping().getMapEntry()) {
                    String[] keys = entry.getMapKey().split(" ");
                    if (keys[0].equals(covertIdentifier)) {
                        String[] values = keys[1].split(",");
                        if (values != null) {
                            for (String value : values) {
                                correctResponseValues.add(value);
                            }
                        }

                        break;//找到答案，跳出循环
                    }
                }
            }
        }
        return correctResponseValues;
    }

    /**
     * 从AssessmentItem反向得到List
     *
     * @return the list
     */
    private List<OpenRightSimpleAssociableChoiceAtomicItem> ReverseOpenRightSimpleAssociableChoiceAtomicItems() {
        List<OpenRightSimpleAssociableChoiceAtomicItem> rightAssociableChoices = new ArrayList<OpenRightSimpleAssociableChoiceAtomicItem>();

        //第2个simpleMatchSet为右匹配项
        if (getItemBody() != null && getItemBody().getBlockElementGroup() != null && getItemBody().getBlockElementGroup().size() > 0) {
            Object obj = getItemBody().getBlockElementGroup().get(0);
            if (obj != null) {
                MatchInteractionType matchInteraction = (MatchInteractionType) obj;

                if (matchInteraction.getSimpleMatchSet() != null && matchInteraction.getSimpleMatchSet().size() > 0 &&
                        matchInteraction.getSimpleMatchSet().get(1).getSimpleAssociableChoice() != null) {

                    for (SimpleAssociableChoiceType associableChoice : matchInteraction.getSimpleMatchSet().get(1).getSimpleAssociableChoice()) {
                        OpenRightSimpleAssociableChoiceAtomicItem rightAssociableChoice = new OpenRightSimpleAssociableChoiceAtomicItem(
                                associableChoice.getIdentifier(),
                                associableChoice.getContent().get(0).toString());

                        rightAssociableChoices.add(rightAssociableChoice);
                    }
                }
            }
        }

        return rightAssociableChoices;
    }

    /**
     * 匹配题构造函数
     */
    public OpenMatchAssessmentItem() {
    }

    /**
     * 匹配题构造函数（单项匹配暂不实现）
     *
     * @param identifier             试题ID
     * @param title                  标题
     * @param prompt                 题干
     * @param shuffle                题项是否允许乱序
     * @param isSingleMatch          是否单项匹配（单项匹配暂不实现）
     * @param leftAssociableChoices  左匹配题项列表
     * @param rightAssociableChoices 右匹配题项列表
     * @param questionAnalysis       试题解析
     */
    private OpenMatchAssessmentItem(String identifier, String title, OpenPrompt prompt, boolean shuffle, boolean isSingleMatch,
                                    List<OpenLeftSimpleAssociableChoiceAtomicItem> leftAssociableChoices,
                                    List<OpenRightSimpleAssociableChoiceAtomicItem> rightAssociableChoices, String questionAnalysis) throws Exception {
        super(identifier, title, questionAnalysis);
        if (isSingleMatch)//单项匹配，不能有多个正确答案
        {
            if (leftAssociableChoices.size() != rightAssociableChoices.size()) {
                throw new OpenSingleMatchAssessmentItemMustHasSameChildItemCountException(identifier, title);
            }

            for (int i = 0; i < leftAssociableChoices.size(); i++) {
                OpenLeftSimpleAssociableChoiceAtomicItem leftAssociableChoice = leftAssociableChoices.get(i);
                if (leftAssociableChoice.getCorrectResponseValues().size() > 1) {
                    throw new OpenSingleMatchAssessmentItemCanNotHasMultipleCorrectResponseValueException(identifier, title, i);
                }
            }
        }

        setPrompt(prompt);
        setShuffle(shuffle);
        setSingleMatch(isSingleMatch());

        setLeftAssociableChoices(leftAssociableChoices);
        setRightAssociableChoices(rightAssociableChoices);
    }


    /**
     * 匹配题构造函数（单项匹配暂不实现）
     *
     * @param identifier             试题ID
     * @param title                  标题
     * @param promptOriginalValue    题干
     * @param shuffle                题项是否允许乱序
     * @param isSingleMatch          是否单项匹配（单项匹配暂不实现）
     * @param leftAssociableChoices  左匹配题项列表
     * @param rightAssociableChoices 右匹配题项列表
     * @param questionAnalysis       试题解析
     */
    private OpenMatchAssessmentItem(String identifier, String title, String promptOriginalValue, boolean shuffle, boolean isSingleMatch,
                                    List<OpenLeftSimpleAssociableChoiceAtomicItem> leftAssociableChoices,
                                    List<OpenRightSimpleAssociableChoiceAtomicItem> rightAssociableChoices, String questionAnalysis) throws Exception {
        this(identifier, title, new OpenPrompt(promptOriginalValue), shuffle, isSingleMatch, leftAssociableChoices, rightAssociableChoices, questionAnalysis);
    }

    /**
     * 匹配题构造函数（多项匹配）
     *
     * @param identifier             试题ID
     * @param title                  标题
     * @param prompt                 题干
     * @param shuffle                题项是否允许乱序
     * @param leftAssociableChoices  左匹配题项列表
     * @param rightAssociableChoices 右匹配题项列表
     * @param questionAnalysis       试题解析
     * @throws Exception the exception
     */
    public OpenMatchAssessmentItem(String identifier, String title, OpenPrompt prompt, boolean shuffle,
                                   List<OpenLeftSimpleAssociableChoiceAtomicItem> leftAssociableChoices,
                                   List<OpenRightSimpleAssociableChoiceAtomicItem> rightAssociableChoices, String questionAnalysis) throws Exception {
        this(identifier, title, prompt, shuffle, false, leftAssociableChoices, rightAssociableChoices, questionAnalysis);
    }

    /**
     * 匹配题构造函数（多项匹配）
     *
     * @param identifier             试题ID
     * @param title                  标题
     * @param promptOriginalValue    题干
     * @param shuffle                题项是否允许乱序
     * @param leftAssociableChoices  左匹配题项列表
     * @param rightAssociableChoices 右匹配题项列表
     * @param questionAnalysis       试题解析
     */
    private OpenMatchAssessmentItem(String identifier, String title, String promptOriginalValue, boolean shuffle,
                                    List<OpenLeftSimpleAssociableChoiceAtomicItem> leftAssociableChoices,
                                    List<OpenRightSimpleAssociableChoiceAtomicItem> rightAssociableChoices, String questionAnalysis) throws Exception {
        this(identifier, title, promptOriginalValue, shuffle, false, leftAssociableChoices, rightAssociableChoices, questionAnalysis);
    }

    /**
     * 匹配题构造函数
     *
     * @param respDeclarations    响应变量集合
     * @param outDeclarations     分数结果变量集合
     * @param interaction         选择交互
     * @param processingCondition 判分规则条件
     * @throws Exception the exception
     */
    public OpenMatchAssessmentItem(Collection<ResponseDeclarationType> respDeclarations, Collection<OutcomeDeclarationType> outDeclarations,
                                   MatchInteractionType interaction, ResponseConditionType processingCondition) throws Exception {
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


    /**
     * 匹配题构造函数
     *
     * @param respDeclarations 响应变量集合
     * @param outDeclarations  分数结果变量集合
     * @param interaction      选择交互
     * @param setOutcomeValues 判分规则条件
     * @throws Exception the exception
     */
    public OpenMatchAssessmentItem(Collection<ResponseDeclarationType> respDeclarations, Collection<OutcomeDeclarationType> outDeclarations,
                                   MatchInteractionType interaction, Collection<SetOutcomeValueType> setOutcomeValues) throws Exception {
        ItemBodyType body = new ItemBodyType();
        body.getBlockElementGroup().add(interaction);

        ResponseProcessingType processing = new ResponseProcessingType();
        processing.getResponseRuleElementGroup().add(setOutcomeValues);

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

        Map<String, List<String>> correctResponses = null;
        correctResponses = new HashMap<String, List<String>>();
        List<String> interactionCorrectResponses = new ArrayList<String>();
        String correctResponseValue = null;

        if (getLeftAssociableChoices() != null) {
            for (OpenLeftSimpleAssociableChoiceAtomicItem leftAssociableChoice : getLeftAssociableChoices()) {
                StringBuilder correctResponseValueBuilder = new StringBuilder();//构建以逗号分隔的正确答案字符串
                correctResponseValueBuilder.append(leftAssociableChoice.getIdentifier() + " ");
                for (int i = 0; i < leftAssociableChoice.getCorrectResponseValues().size(); i++) {
                    if (i > 0) {
                        correctResponseValueBuilder.append(",");
                    }
                    correctResponseValueBuilder.append(leftAssociableChoice.getCorrectResponseValues().get(i));
                    correctResponseValue = correctResponseValueBuilder.toString();
                }

                interactionCorrectResponses.add(correctResponseValue);
            }
        }
        correctResponses.put("RESPONSE", interactionCorrectResponses);

        setResponseDeclarations(BuildResponseDeclarationCollection(CardinalityType.MULTIPLE, BaseTypeType.DIRECTED_PAIR, correctResponses, true));
        setOutcomeDeclarations(BuildScoreOutcomeDeclarationCollection());
        setItemBody(BuildMatchInteractionItemBody(getPrompt(), isShuffle(), isSingleMatch(), getLeftAssociableChoices(), getRightAssociableChoices()));
        setResponseProcessing(BuildMapResponseResponseProcessing());

        super.handleBeforeTranslateToImsItem();
    }

    /**
     * 从IMS试题转换后处理
     * 从ResponseDeclarations、OutcomeDeclarations、ItemBody、ResponseProcessing反向得到本题项内容
     */
    @Override
    protected void handleAfterTranslateFromImsItem() throws Exception {
        super.handleAfterTranslateFromImsItem();

        if (getItemBody().getBlockElementGroup() != null &&
                getItemBody().getBlockElementGroup().size() > 0) {
            MatchInteractionType matchInteraction = (MatchInteractionType) getItemBody().getBlockElementGroup().get(0);
            setShuffle(matchInteraction.isShuffle());

            if (matchInteraction.getPrompt().getContent().size() > 0) {
                setPrompt(new OpenPrompt(matchInteraction.getPrompt().getContent().get(0).toString()));
            }
        }

        setLeftAssociableChoices(ReverseOpenLeftSimpleAssociableChoiceAtomicItems());
        setRightAssociableChoices(ReverseOpenRightSimpleAssociableChoiceAtomicItems());
    }
    //endregion

    /**
     * 创建匹配题试题体
     *
     * @param prompt                 题干
     * @param shuffle                题项是否允许乱序
     * @param isSingleMatch          是否单项匹配
     * @param leftAssociableChoices  左匹配题项列表
     * @param rightAssociableChoices 右匹配题项列表
     * @return 试题体
     */
    private ItemBodyType BuildMatchInteractionItemBody(OpenPrompt prompt, boolean shuffle, boolean isSingleMatch,
                                                       List<OpenLeftSimpleAssociableChoiceAtomicItem> leftAssociableChoices,
                                                       List<OpenRightSimpleAssociableChoiceAtomicItem> rightAssociableChoices) {
        int matchMax = 1;
        ItemBodyType body = new ItemBodyType();
        MatchInteractionType mchInteraction = new MatchInteractionType();

        PromptType matchPrompt = prompt.ConvertToImsPrompt();

        mchInteraction.setResponseIdentifier("RESPONSE");
        mchInteraction.setShuffle(shuffle);
        if (isSingleMatch) {
            mchInteraction.setMaxAssociations(Math.max(leftAssociableChoices.size(), rightAssociableChoices.size()));//试题的maxAssociations是左右匹配项的最大值
        } else {
            mchInteraction.setMaxAssociations(0);//多项匹配，不限定最大连线数
        }
        mchInteraction.setPrompt(matchPrompt);

        //region 左匹配项
        if (!isSingleMatch) {
            matchMax = rightAssociableChoices.size();
        }
        SimpleMatchSetType leftSimpleMatchSet = new SimpleMatchSetType();
        if (leftAssociableChoices != null) {
            for (OpenLeftSimpleAssociableChoiceAtomicItem leftAssociableChoice : leftAssociableChoices) {
                SimpleAssociableChoiceType associableChoice = new SimpleAssociableChoiceType();
                associableChoice.setIdentifier(leftAssociableChoice.getIdentifier());
                associableChoice.setMatchMax(matchMax);
                associableChoice.getContent().add(leftAssociableChoice.getContent());

                leftSimpleMatchSet.getSimpleAssociableChoice().add(associableChoice);
            }
        }
        mchInteraction.getSimpleMatchSet().add(leftSimpleMatchSet);
        //endregion

        //region 右匹配项
        if (!isSingleMatch) {
            matchMax = leftAssociableChoices.size();
        }
        SimpleMatchSetType rightSimpleMatchSet = new SimpleMatchSetType();
        if (rightAssociableChoices != null) {
            for (OpenRightSimpleAssociableChoiceAtomicItem rightAssociableChoice : rightAssociableChoices) {
                SimpleAssociableChoiceType associableChoice = new SimpleAssociableChoiceType();
                associableChoice.setIdentifier(rightAssociableChoice.getIdentifier());
                associableChoice.setMatchMax(matchMax);
                associableChoice.getContent().add(rightAssociableChoice.getContent());

                rightSimpleMatchSet.getSimpleAssociableChoice().add(associableChoice);
            }
        }
        mchInteraction.getSimpleMatchSet().add(rightSimpleMatchSet);
        //endregion

        body.getBlockElementGroup().add(mchInteraction);

        return body;
    }

    /**
     * 创建匹配题试题体
     *
     * @param promptOriginalValue    题干
     * @param shuffle                题项是否允许乱序
     * @param isSingleMatch          是否单项匹配
     * @param leftAssociableChoices  左匹配题项列表
     * @param rightAssociableChoices 右匹配题项列表
     * @return 试题体
     * @throws Exception the exception
     */
    private ItemBodyType BuildMatchInteractionItemBody(String promptOriginalValue, boolean shuffle, boolean isSingleMatch,
                                                       List<OpenLeftSimpleAssociableChoiceAtomicItem> leftAssociableChoices,
                                                       List<OpenRightSimpleAssociableChoiceAtomicItem> rightAssociableChoices) throws Exception {
        return BuildMatchInteractionItemBody(new OpenPrompt(promptOriginalValue), shuffle, isSingleMatch, leftAssociableChoices, rightAssociableChoices);
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
