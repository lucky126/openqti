package cn.com.open.openqti;

import cn.com.open.openqti.Exception.*;
import cn.com.open.qti.*;
import cn.com.open.utils.DoubleUtil;
import cn.com.open.utils.GuidUtil;

import java.util.*;

import static java.lang.System.out;

/**
 * Created by lucky on 2017/6/14.
 */
public class OpenCompositeAssessmentItem extends OpenAssessmentItem {
    /**
     * 题型
     */
    @Override
    public ItemType getAssessmentItemType() {
        return ItemType.COMPOSITE;
    }

    /**
     * 共用题干内容(可缺省)
     */
    private OpenPrompt prompt;
    /**
     * 子题是否乱序
     */
    private boolean shuffle;

    /**
     * 子题列表
     */
    private List<OpenCompositeSubItem> subItems;

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
     * Gets sub items.
     *
     * @return the sub items
     */
    public List<OpenCompositeSubItem> getBaseSubItems() {
        return subItems;
    }

    /**
     * Sets sub items.
     *
     * @param subItems the sub items
     */
    public void setBaseSubItems(List<OpenCompositeSubItem> subItems) throws Exception {
        this.subItems = ResetSubItems(subItems);
    }

    /**
     * 复合题构造函数
     */
    public OpenCompositeAssessmentItem() {
    }

    /**
     * 复合题构造函数
     *
     * @param identifier       试题ID
     * @param title            标题
     * @param shuffle          子题乱序
     * @param prompt           共用题干
     * @param subItems         子题
     * @param questionAnalysis 试题解析
     * @throws OpenCompositeAssessmentItemHaveNoSubItemException the open composite assessment item have no sub item exception
     */
    public OpenCompositeAssessmentItem(String identifier, String title, boolean shuffle, OpenPrompt prompt, List<OpenCompositeSubItem> subItems,
                                       String questionAnalysis) throws Exception {
        super(identifier, title, questionAnalysis);
        if ((subItems == null) || (subItems.size() == 0)) {
            throw new OpenCompositeAssessmentItemHaveNoSubItemException(identifier, title);
        }
        this.setPrompt(prompt);
        this.setShuffle(shuffle);
        this.setBaseSubItems(subItems);
    }

    /**
     * 重置子题
     *
     * @param subItems 子题
     * @return the list
     * @throws Exception the exception
     */
    protected List<OpenCompositeSubItem> ResetSubItems(List<OpenCompositeSubItem> subItems) throws Exception {
        //分数合法性检验在BuildOutcomeDeclarationCollection中
        for (int i = 0; i < subItems.size(); i++)//先重置所有子题响应变量/结果变量的ID
        {
            subItems.get(i).getSubOpenAssessmentItem().handleBeforeTranslateToImsItem();//为子题重置ID准备环境
            switch (subItems.get(i).getItemType()) {
                case UNKNOW:
                    throw new OpenCompositeSubItemTypeCanNotBeUnknownException(getIdentifier(), getTitle(), subItems.get(i).getSequenceIndex());
                case COMPOSITE:
                    throw new OpenCompositeSubItemTypeCanNotBeCompositeItemException(getIdentifier(), getTitle(), subItems.get(i).getSequenceIndex());
                default:
                    subItems.get(i).getSubOpenAssessmentItem().ResetIdentifier( GuidUtil.formatGuid(getIdentifier()), getTitle(), subItems.get(i).getSequenceIndex());
                    break;
            }
        }

        return subItems;
    }

    /**
     * 复合题构造函数(无共用题干)
     *
     * @param identifier       试题ID
     * @param title            标题
     * @param shuffle          子题乱序
     * @param subItems         子题
     * @param QuestionAnalysis 试题解析
     * @throws OpenCompositeAssessmentItemHaveNoSubItemException the open composite assessment item have no sub item exception
     */
    public OpenCompositeAssessmentItem(String identifier, String title, boolean shuffle, List<OpenCompositeSubItem> subItems, String QuestionAnalysis) throws Exception {
        this(identifier, title, shuffle, (OpenPrompt) null, subItems, QuestionAnalysis);
    }


    /**
     * 复合题构造函数(有共用题干)
     *
     * @param identifier          试题ID
     * @param title               标题
     * @param shuffle             子题乱序
     * @param promptOriginalValue 题干
     * @param subItems            子题
     * @param questionAnalysis    试题解析
     */
    private OpenCompositeAssessmentItem(String identifier, String title, boolean shuffle, String promptOriginalValue, List<OpenCompositeSubItem> subItems, String questionAnalysis) throws Exception {
        this(identifier, title, shuffle, new OpenPrompt(promptOriginalValue), subItems, questionAnalysis);
    }

    /**
     * 判断ID是否是子题ID
     *
     * @param identifier    子题标识
     * @param sequenceIndex 子题序号
     * @return 是否是子题ID
     */
    private static boolean MatchIdentifier(String identifier, int sequenceIndex) {
        int startPos, endPos;
        String seqStr;

        startPos = identifier.indexOf('_');
        endPos = identifier.indexOf('.');

        if (startPos <= 0) {
            return false;
        }

        if (endPos < 0) {
            seqStr = identifier.substring(startPos + 1);
        } else {
            if (endPos <= startPos) {
                return false;
            }

            seqStr = identifier.substring(startPos + 1, endPos);
        }

        return (seqStr.equals(String.valueOf(sequenceIndex)));
    }


    /**
     * 查找子题的响应变量集合
     *
     * @param sequence 子题序号
     * @return 作答变量声明集合
     */
    private Collection<ResponseDeclarationType> FindResponseDeclarationCollection(int sequence) {
        Collection<ResponseDeclarationType> respDeclarations = new ArrayList<ResponseDeclarationType>();
        for (int i = 0; i < getResponseDeclarations().size(); i++) {
            ResponseDeclarationType responseDeclarationType = (ResponseDeclarationType) ((List) getResponseDeclarations()).get(i);
            if (MatchIdentifier(responseDeclarationType.getIdentifier(), sequence)) {
                respDeclarations.add(responseDeclarationType);
            }
        }

        return respDeclarations;
    }

    /**
     * Find outcome declaration collection collection.
     *
     * @param sequence the sequence
     * @return the collection
     */
    private OpenOutcomeDeclarationFind FindOutcomeDeclarationCollection(int sequence) {
        OpenOutcomeDeclarationFind find = new OpenOutcomeDeclarationFind();
        double subItemScore = 0;

        Collection<OutcomeDeclarationType> outDeclarations = new ArrayList<OutcomeDeclarationType>();

        for (int i = 0; i < getOutcomeDeclarations().size(); i++) {
            OutcomeDeclarationType outcomeDeclarationType = (OutcomeDeclarationType) ((List) getOutcomeDeclarations()).get(i);

            if (MatchIdentifier(outcomeDeclarationType.getIdentifier(), sequence)) {
                if (outcomeDeclarationType.getIdentifier().indexOf('.') < 0)//直接子题分数信息
                {
                    subItemScore = outcomeDeclarationType.getNormalMaximum();

                    outcomeDeclarationType.setNormalMaximum(1.0);//子题分数比例还原为1
                }
                outDeclarations.add(outcomeDeclarationType);
            }
        }

        find.setSubItemScore(subItemScore);
        find.setOutDeclarations(outDeclarations);

        return find;
    }

    /**
     * 查找子题的完全匹配判分规则集合
     *
     * @param sequence 顺序号
     * @return responseCondition集合
     */
    private Collection<ResponseConditionType> FindMatchProcessingConditionCollection(int sequence) {
        Collection<ResponseConditionType> respConditions = new ArrayList<ResponseConditionType>();
        for (Object obj : getResponseProcessing().getResponseRuleElementGroup()) {
            if (obj instanceof ResponseConditionType) {
                ResponseConditionType responseConditionType = (ResponseConditionType) obj;

                ResponseIfType responseIf = responseConditionType.getResponseIf();

                for (Object ifObj : responseIf.getResponseRuleElementGroup()) {
                    if (ifObj instanceof SetOutcomeValueType) {
                        SetOutcomeValueType setOutcomeValue = (SetOutcomeValueType) ifObj;

                        if (MatchIdentifier(setOutcomeValue.getIdentifier(), sequence)) {
                            respConditions.add(responseConditionType);
                        }
                    }
                }
            }
        }

        return respConditions;
    }

    /**
     * 查找子题的完全匹配判分规则
     *
     * @param sequence 顺序号
     * @return 判分集合
     */
    private ResponseConditionType FindMatchProcessingCondition(int sequence) {
        for (Object obj : getResponseProcessing().getResponseRuleElementGroup()) {
            if (obj instanceof ResponseConditionType) {
                ResponseConditionType responseConditionType = (ResponseConditionType) obj;

                ResponseIfType responseIf = responseConditionType.getResponseIf();

                for (Object ifObj : responseIf.getResponseRuleElementGroup()) {
                    if (ifObj instanceof SetOutcomeValueType) {
                        SetOutcomeValueType setOutcomeValue = (SetOutcomeValueType) ifObj;

                        if (MatchIdentifier(setOutcomeValue.getIdentifier(), sequence)) {
                            return responseConditionType;
                        }
                    }
                }
            }
        }

        return null;
    }

    /**
     * 查找子题的判分规则内容集合
     *
     * @param sequence 顺序号
     * @return 计分规则
     */
    private Collection<SetOutcomeValueType> FindSetOutcomeValueCollection(int sequence) {
        Collection<SetOutcomeValueType> setOutcomeValues = new ArrayList<SetOutcomeValueType>();

        for (Object obj : getResponseProcessing().getResponseRuleElementGroup()) {
            if (obj instanceof SetOutcomeValueType) {
                SetOutcomeValueType setOutcomeValueType = (SetOutcomeValueType) obj;

                if (MatchIdentifier(setOutcomeValueType.getIdentifier(), sequence)) {
                    setOutcomeValues.add(setOutcomeValueType);
                }
            }
        }

        return setOutcomeValues;
    }

    /**
     * 从AssessmentItem反向得到List
     *
     * @return 子题集合
     */
    private List<OpenCompositeSubItem> ReverseOpenCompositeSubItems() throws Exception {
        List<OpenCompositeSubItem> subItems = new ArrayList<OpenCompositeSubItem>();
        double subItemScore = 0;
        Collection<ResponseDeclarationType> respDeclarations = null;
        Collection<OutcomeDeclarationType> outDeclarations = null;
        OpenOutcomeDeclarationFind openOutcomeDeclarationFind = null;

        ChoiceInteractionType interaction = null;
        MatchInteractionType mtchInteraction = null;
        ExtendedTextInteractionType extendedTextInteraction = null;
        UploadInteractionType uploadInteraction = null;
        OrderInteractionType orderInteraction = null;

        String itemBodyContent;

        ResponseConditionType respCondition = null;
        Collection<SetOutcomeValueType> setOutcomeValues = null;
        if (getItemBody() != null && getItemBody().getBlockElementGroup() != null && getItemBody().getBlockElementGroup().size() > 0) {
            for (Object obj : getItemBody().getBlockElementGroup()) {
                if (obj instanceof CompositeInteractionType) {
                    CompositeInteractionType composite = (CompositeInteractionType) obj;

                    this.setPrompt(new OpenPrompt(composite.getPrompt().getContent().get(0).toString()));
                    this.setShuffle(composite.isShuffle());

                    for (int i = 0; i < composite.getSubItem().size(); i++)//取子题
                    {
                        SubItemType cursubItem = composite.getSubItem().get(i);

                        OpenAssessmentItem item = null;

                        int subItemIndex = cursubItem.getSequenceIndex();
                        ItemType subItemType;
                        String subItemTypeStr = cursubItem.getItemType().toUpperCase();
                        if (subItemTypeStr == null) {
                            throw new OpenCompositeSubItemTypeInvalidException(getIdentifier(), getTitle(), cursubItem.getSequenceIndex(), "");
                        }

                        try {
                            subItemType = ItemType.valueOf(subItemTypeStr);
                        } catch (Exception e) {
                            throw new OpenCompositeSubItemTypeInvalidException(getIdentifier(), getTitle(), cursubItem.getSequenceIndex(), subItemTypeStr);
                        }

                        respDeclarations = FindResponseDeclarationCollection(subItemIndex);//响应变量集合
                        openOutcomeDeclarationFind = FindOutcomeDeclarationCollection(subItemIndex);//分数结果变量集合
                        outDeclarations = openOutcomeDeclarationFind.getOutDeclarations();
                        subItemScore = openOutcomeDeclarationFind.getSubItemScore();

                        /**
                         * TODO: 以下部分存在偷懒行为，均在假定subitem存在对应的blockEnlementGroup子集的情况下处理的
                         */
                        switch (subItemType) {
                            case JUDGEMENT://子题为判断题
                                interaction = (ChoiceInteractionType) cursubItem.getBlockElementGroup().get(0);//选择交互
                                respCondition = FindMatchProcessingCondition(subItemIndex);//判分规则条件

                                item = new OpenJudgementAssessmentItem(cursubItem.getIdentifier() != null ? cursubItem.getIdentifier() : UUID.randomUUID().toString(),
                                        respDeclarations, outDeclarations, interaction, respCondition, cursubItem.getQuestionAnalysis());
                                break;
                            case SINGLECHOICE://子题为单选题
                                interaction = (ChoiceInteractionType) cursubItem.getBlockElementGroup().get(0);//选择交互
                                respCondition = FindMatchProcessingCondition(subItemIndex);//判分规则条件

                                item = new OpenSingleChoiceAssessmentItem(cursubItem.getIdentifier() != null ? cursubItem.getIdentifier() : UUID.randomUUID().toString(),
                                        respDeclarations, outDeclarations, interaction, respCondition, cursubItem.getQuestionAnalysis());
                                break;
                            case MULTIPLECHOICE://子题为多选题
                                interaction = (ChoiceInteractionType) cursubItem.getBlockElementGroup().get(0);//选择交互

                                respCondition = FindMatchProcessingCondition(subItemIndex);//判分规则条件
                                setOutcomeValues = FindSetOutcomeValueCollection(subItemIndex);//判分规则内容集合
                                if (respCondition != null) {
                                    item = new OpenMultipleChoiceAssessmentItem(cursubItem.getIdentifier() != null ? cursubItem.getIdentifier() : UUID.randomUUID().toString(),
                                            respDeclarations, outDeclarations, interaction, respCondition, cursubItem.getQuestionAnalysis());
                                } else if (setOutcomeValues.size() > 0) {
                                    item = new OpenMultipleChoiceAssessmentItem(cursubItem.getIdentifier() != null ? cursubItem.getIdentifier() : UUID.randomUUID().toString(),
                                            respDeclarations, outDeclarations, interaction, setOutcomeValues, cursubItem.getQuestionAnalysis());
                                }
                                break;
                            case MATCH://子题为匹配题
                                mtchInteraction = (MatchInteractionType) cursubItem.getBlockElementGroup().get(0);//匹配交互
                                setOutcomeValues = FindSetOutcomeValueCollection(subItemIndex);//判分规则内容集合

                                item = new OpenMatchAssessmentItem(respDeclarations, outDeclarations, mtchInteraction, setOutcomeValues);
                                break;
                            case TEXTENTRY://子题为填空题
                                itemBodyContent = String.valueOf((DivType) cursubItem.getBlockElementGroup().get(0));//试题体题干内容
                                setOutcomeValues = FindSetOutcomeValueCollection(subItemIndex);//判分规则内容集合

                                item = new OpenTextEntryAssessmentItem(respDeclarations, outDeclarations, itemBodyContent, setOutcomeValues);
                                break;
                            case EXTENDEDTEXT://子题为问答题
                                if (cursubItem.getBlockElementGroup().size() == 0) {
                                    throw new OpenCompositeExtendedTextSubItemNeedInteractionException(getIdentifier(), getTitle(), subItemIndex);
                                }
                                extendedTextInteraction = (ExtendedTextInteractionType) cursubItem.getBlockElementGroup().get(0);//问答交互

                                item = new OpenExtendedTextAssessmentItem(respDeclarations, outDeclarations, extendedTextInteraction, cursubItem.getQuestionAnalysis());
                                break;
                            case UPLOAD://附件上传题
                                uploadInteraction = (UploadInteractionType) cursubItem.getBlockElementGroup().get(0);//附件上传交互

                                item = new OpenUploadAssessmentItem(respDeclarations, outDeclarations, uploadInteraction);
                                break;
                            case ORDER://排序题
                                orderInteraction = (OrderInteractionType) cursubItem.getBlockElementGroup().get(0);//排序交互项
                                respCondition = FindMatchProcessingCondition(subItemIndex);//判分规则条件

                                item = new OpenOrderAssessmentItem(respDeclarations, outDeclarations, orderInteraction, respCondition);
                                break;
                            default:
                                throw new OpenCompositeSubItemTypeCanNotReverseException(getIdentifier(), getTitle(), cursubItem.getSequenceIndex(), subItemTypeStr);
                        }

                        OpenCompositeSubItem subItem = new OpenCompositeSubItem(item, subItemScore, cursubItem.getSequenceIndex(), cursubItem.isSubjective(),
                                cursubItem.getIdentifier() != null ? cursubItem.getIdentifier() : UUID.randomUUID().toString(), cursubItem.getQuestionAnalysis());
                        subItems.add(subItem);
                    }
                }
            }
        }
        return subItems;
    }

    //region Translate Between IMS & OPEN

    /**
     * 从IMS试题转换后处理
     * 从ResponseDeclarations、OutcomeDeclarations、ItemBody、ResponseProcessing反向得到本题项内容
     */
    @Override
    protected void handleAfterTranslateFromImsItem() throws Exception {
        this.setBaseSubItems(ReverseOpenCompositeSubItems());
    }

    /**
     * 转换为IMS试题前处理
     * 构建ResponseDeclarations、OutcomeDeclarations、ItemBody、ResponseProcessing
     */
    @Override
    protected void handleBeforeTranslateToImsItem() throws Exception {
        setResponseDeclarations(BuildResponseDeclarationCollection(getBaseSubItems()));
        setOutcomeDeclarations(BuildOutcomeDeclarationCollection(getBaseSubItems()));
        setItemBody(BuildItemBody(isShuffle(), getPrompt(), getBaseSubItems()));
        setResponseProcessing(BuildResponseProcessing(getBaseSubItems()));
    }
    //endregion

    /**
     * 创建响应变量集合
     *
     * @param subItems 子题
     * @return 响应变量集合 collection
     */
    public Collection<ResponseDeclarationType> BuildResponseDeclarationCollection(List<OpenCompositeSubItem> subItems) {
        Collection<ResponseDeclarationType> responseCollection = new ArrayList<ResponseDeclarationType>();
        if (subItems != null) {
            for (OpenCompositeSubItem subItem : subItems)//循环子题，取出所有响应变量集合
            {
                if (subItem.getSubOpenAssessmentItem().getResponseDeclarations() != null) {
                    for (ResponseDeclarationType childResponse : subItem.getSubOpenAssessmentItem().getResponseDeclarations())//循环响应变量集合，取出所有响应变量
                    {
                        responseCollection.add(childResponse);
                    }
                }
            }
        }
        return responseCollection;
    }

    /**
     * 创建结果变量集合
     *
     * @param subItems the sub items
     * @return 结果变量集合 collection
     * @throws Exception the exception
     */
    public Collection<OutcomeDeclarationType> BuildOutcomeDeclarationCollection(List<OpenCompositeSubItem> subItems) throws Exception {
        double totalScore = 0;
        Collection<OutcomeDeclarationType> outcomeCollection = new ArrayList<OutcomeDeclarationType>();
        if (subItems != null) {
            for (OpenCompositeSubItem subItem : subItems)//循环子题，取出所有结果变量集合
            {
                if (subItem.getSubOpenAssessmentItem().getOutcomeDeclarations() != null) {
                    for (OutcomeDeclarationType childOutcome : subItem.getSubOpenAssessmentItem().getOutcomeDeclarations())//循环结果变量集合，取出所有结果变量
                    {
                        if (childOutcome.getIdentifier().indexOf('.') < 0)//如果是直接子题，设置分数比例
                        {
                            childOutcome.setNormalMaximum(subItem.getSubItemScore());
                            totalScore += subItem.getSubItemScore();
                        }

                        outcomeCollection.add(childOutcome);
                    }
                }
            }
        }
        //各子题分数比例之和应该为1，但因不能存储分数，故当均分为小数时，总和与1的误差在0.001认为是合理的
        if (DoubleUtil.round(totalScore, 4) < 0.999) {
            throw new OpenCompositeSubItemTotalScoreInvalidException(getIdentifier(), getTitle());
        }

        //总分
        OutcomeDeclarationType totalOutcome = BuildOutcomeDeclaration("SCORE", 1);
        outcomeCollection.add(totalOutcome);

        return outcomeCollection;
    }


    /**
     * 创建试题体
     * <p>
     * 各题型itemBody下目前只支持div和各类Interaction，p/img等置于div内。(如需支持其它，请修改本方法中对子题的试题体处理部分)
     *
     * @param shuffle  the shuffle
     * @param prompt   共用题干
     * @param subItems 子题
     * @return 试题体 item body type
     */
    public ItemBodyType BuildItemBody(boolean shuffle, OpenPrompt prompt, List<OpenCompositeSubItem> subItems) {
        ItemBodyType body = new ItemBodyType();

        CompositeInteractionType compositeInteraction = new CompositeInteractionType();
        compositeInteraction.setShuffle(shuffle);
        compositeInteraction.setPrompt(prompt.ConvertToImsPrompt());

        for (int i = 0; i < subItems.size(); i++)//循环子题，取出所有试题体
        {
            OpenCompositeSubItem subItem = subItems.get(i);

            if (subItem.getSubOpenAssessmentItem().getItemBody() != null) {
                SubItemType curSubItem = new SubItemType();//所有子题内容存放在新DIV里面
                curSubItem.setSequenceIndex(subItem.getSequenceIndex());//标记子题序号
                curSubItem.setItemType(subItem.getItemType().toString());//标记子题题型
                curSubItem.setSubjective(subItem.isSubjective());
                curSubItem.setIdentifier(subItem.getIdentifier());
                curSubItem.setQuestionAnalysis(subItem.getQuestionAnalysis());
                //itemBody下目前只支持div和各类Interaction，p/img等置于div内

                if (subItem.getSubOpenAssessmentItem().getItemBody().getBlockElementGroup() != null) {
                    for (Object obj : subItem.getSubOpenAssessmentItem().getItemBody().getBlockElementGroup()) {
                        if (obj instanceof DivType) {
                            DivType div = (DivType) obj;
                            curSubItem.getBlockElementGroup().add(div);
                        } else if (obj instanceof ChoiceInteractionType) {
                            //choiceInteraction选择题
                            ChoiceInteractionType choice = (ChoiceInteractionType) obj;
                            curSubItem.getBlockElementGroup().add(choice);
                        } else if (obj instanceof ExtendedTextInteractionType) {
                            //extendedTextInteraction问答题
                            ExtendedTextInteractionType extendedText = (ExtendedTextInteractionType) obj;
                            curSubItem.getBlockElementGroup().add(extendedText);
                        } else if (obj instanceof MatchInteractionType) {
                            //matchInteraction匹配题
                            MatchInteractionType match = (MatchInteractionType) obj;
                            curSubItem.getBlockElementGroup().add(match);
                        } else if (obj instanceof OrderInteractionType) {
                            //matchInteraction匹配题
                            OrderInteractionType order = (OrderInteractionType) obj;
                            curSubItem.getBlockElementGroup().add(order);
                        } else if (obj instanceof UploadInteractionType) {
                            //matchInteraction匹配题
                            UploadInteractionType upload = (UploadInteractionType) obj;
                            curSubItem.getBlockElementGroup().add(upload);
                        }
                    }
                }

                compositeInteraction.getSubItem().add(curSubItem);
            }
        }

        body.getBlockElementGroup().add(compositeInteraction);
        return body;
    }


    /**
     * 创建判分规则
     *
     * @param subItems 子题
     * @return 判分规则 response processing type
     */
    public ResponseProcessingType BuildResponseProcessing(List<OpenCompositeSubItem> subItems) {
        ResponseProcessingType processing = new ResponseProcessingType();

        Collection<SetOutcomeValueType> processingSetOutcomeValues = new ArrayList<SetOutcomeValueType>();
        Collection<ResponseConditionType> processingResponseConditions = new ArrayList<ResponseConditionType>();

        Collection<VariableType> totalScoreSumVariables = new ArrayList<VariableType>();
        for (int i = 0; i < subItems.size(); i++)//循环子题，取出所有判分规则
        {
            OpenCompositeSubItem subItem = subItems.get(i);
            if (subItem.getSubOpenAssessmentItem().getResponseProcessing() != null) {
                if (subItem.getSubOpenAssessmentItem().getResponseProcessing().getResponseRuleElementGroup() != null) {
                    for (Object obj : subItem.getSubOpenAssessmentItem().getResponseProcessing().getResponseRuleElementGroup()) {
                        if (obj instanceof SetOutcomeValueType) {//取出所有setOutcomeValue判分规则
                            SetOutcomeValueType setOutcomeValue = (SetOutcomeValueType) obj;
                            processingSetOutcomeValues.add(setOutcomeValue);
                        }

                        if (obj instanceof ResponseConditionType) {//取出所有setOutcomeValue判分规则
                            ResponseConditionType responseCondition = (ResponseConditionType) obj;
                            for (Object responseObj : responseCondition.getResponseIf().getResponseRuleElementGroup()) {
                                if (responseObj instanceof SetOutcomeValueType) {
                                    SetOutcomeValueType childSetOutcomeValue = (SetOutcomeValueType) responseObj;
                                    if (childSetOutcomeValue.getIdentifier().indexOf('.') < 0)//如果是直接子题，设置分数比例
                                    {
                                        BaseValueType value = new BaseValueType();
                                        value.setValue(String.valueOf(subItem.getSubItemScore()));
                                        childSetOutcomeValue.setBaseValue(value);
                                    }
                                }
                            }
                            processingResponseConditions.add(responseCondition);
                        }
                    }
                }
            }

            VariableType varChildTotal = new VariableType();
            varChildTotal.setIdentifier(String.format("SCORE_%d", i + 1));
            totalScoreSumVariables.add(varChildTotal);
        }

        if (processingSetOutcomeValues.size() > 0)//子题有setOutcomeValue，将processingSetOutcomeValues赋予processing
        {
            processing.getResponseRuleElementGroup().addAll(processingSetOutcomeValues);
        }

        if (processingResponseConditions.size() > 0)//子题有responseCondition，将processingResponseConditions赋予processing
        {
            processing.getResponseRuleElementGroup().addAll(processingResponseConditions);
        }

        //region 总分信息
        SumType totalScoreSum = new SumType();
        totalScoreSum.getExpressionElementGroup().addAll(totalScoreSumVariables);
        SetOutcomeValueType totalSetOutcomeValue = new SetOutcomeValueType();
        totalSetOutcomeValue.setIdentifier("SCORE");
        totalSetOutcomeValue.setSum(totalScoreSum);

        processing.getResponseRuleElementGroup().add(totalSetOutcomeValue);
        //endregion

        return processing;
    }

    /**
     * 把单选题列表转换为组合题子题列表
     *
     * @param singleChoiceItems 单选题列表
     * @return 组合题子题列表 list
     */
    protected static List<OpenCompositeSubItem> ConvertSingleChioceItemsToCompositeSubItems(List<OpenSingleChoiceAssessmentItem> singleChoiceItems) {
        List<OpenCompositeSubItem> subItems = new ArrayList<OpenCompositeSubItem>();

        for (int i = 0; i < singleChoiceItems.size(); i++) {
            OpenCompositeSubItem subItem = new OpenCompositeSubItem(singleChoiceItems.get(i), DoubleUtil.round(1.0 / singleChoiceItems.size(), 4), i + 1,
                    singleChoiceItems.get(i).getIdentifier(), singleChoiceItems.get(i).getQuestionAnalysis());
            subItems.add(subItem);
        }

        return subItems;
    }

    /**
     * 把组合题子题列表转换为单选题列表
     *
     * @param subItems 组合题子题列表
     * @return 单选题列表
     */
    protected static List<OpenSingleChoiceAssessmentItem> ConvertCompositeSubItemsToSingleChioceItems(List<OpenCompositeSubItem> subItems) {
        List<OpenSingleChoiceAssessmentItem> singleChoiceItems = new ArrayList<OpenSingleChoiceAssessmentItem>();

        for (int i = 0; i < subItems.size(); i++)//先重置所有子题响应变量/结果变量的ID
        {
            OpenSingleChoiceAssessmentItem singleChoiceItem = (OpenSingleChoiceAssessmentItem) subItems.get(i).getSubOpenAssessmentItem();
            singleChoiceItems.add(singleChoiceItem);
        }
        return singleChoiceItems;
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
        for (OpenCompositeSubItem subItem : getBaseSubItems()) {
            List<Media> subItemMediaList = subItem.getSubOpenAssessmentItem().GetMediaList();
            if (subItemMediaList != null) {
                for (Media tmpMedia : subItemMediaList) {
                    mediaList.add(tmpMedia);
                }
            }
        }

        return mediaList;
    }
}
