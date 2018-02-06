package cn.com.open.openqti;

import cn.com.open.openqti.Exception.OpenCompositeSubItemContentNeedIdException;
import cn.com.open.openqti.Exception.OpenSimpleChoiceInteractionNeedCorrectResponseValueException;
import cn.com.open.openqti.Exception.OpenTextEntryInteractionCountInvalidException;
import cn.com.open.qti.*;
import cn.com.open.utils.DoubleUtil;
import cn.com.open.utils.GuidUtil;
import cn.com.open.utils.JaxbUtil;
import cn.com.open.utils.PatternUtil;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.*;

/**
 * 试题
 *
 * @author lucky
 */
public class OpenAssessmentItem {
    /**
     * ID
     */
    private String identifier;
    /**
     * 标题
     */
    private String title;
    /**
     * 试题解析
     */
    private String questionAnalysis;
    /**
     * 题型
     */
    private ItemType assessmentItemType;

    /**
     * Gets value of AssessmentItemType attribute.
     *
     * @return value of AssessmentItemType attribute
     */
    public ItemType getAssessmentItemType() {
        return assessmentItemType;
    }

    /**
     * Gets value of identifier attribute.
     *
     * @return value of identifier attribute
     * @see #setIdentifier #setIdentifier#setIdentifier#setIdentifier#setIdentifier
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets new value of identifier attribute.
     *
     * @param identifier new value of identifier attribute
     * @see #getIdentifier #getIdentifier#getIdentifier#getIdentifier#getIdentifier
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * Gets value of title attribute.
     *
     * @return value of title attribute
     * @see #setTitle #setTitle#setTitle#setTitle#setTitle
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets new value of title attribute.
     *
     * @param title new value of title attribute
     * @see #getTitle #getTitle#getTitle#getTitle#getTitle
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets value of question analysis attribute.
     *
     * @return value of Question analysis attribute
     * @see #setQuestionAnalysis #setQuestionAnalysis#setQuestionAnalysis#setQuestionAnalysis#setQuestionAnalysis
     */
    public String getQuestionAnalysis() {
        return questionAnalysis;
    }

    /**
     * Sets new value of question analysis attribute.
     *
     * @param questionAnalysis new value of question analysis attribute
     * @see #getQuestionAnalysis #getQuestionAnalysis#getQuestionAnalysis#getQuestionAnalysis#getQuestionAnalysis
     */
    public void setQuestionAnalysis(String questionAnalysis) {
        this.questionAnalysis = questionAnalysis;
    }

    /**
     * 试题构造函数
     */
    public OpenAssessmentItem() {
    }

    /**
     * 试题构造函数
     *
     * @param _identifier       Value of the identifier attribute.
     * @param _title            Value of the title attribute.
     * @param _questionAnalysis Value of the question analysis attribute.
     */
    public OpenAssessmentItem(String _identifier, String _title, String _questionAnalysis) {
        this.identifier = _identifier;
        this.title = _title;
        this.questionAnalysis = _questionAnalysis;
    }

    /**
     * 响应变量列表
     */
    private Collection<ResponseDeclarationType> responseDeclarations;
    /**
     * 结果变量列表
     */
    private Collection<OutcomeDeclarationType> outcomeDeclarations;
    /**
     * 试题体
     */
    private ItemBodyType itemBody;
    /**
     * 判分规则
     */
    private ResponseProcessingType responseProcessing;

    /**
     * Gets response declarations.
     *
     * @return the response declarations
     */
    public Collection<ResponseDeclarationType> getResponseDeclarations() {
        return responseDeclarations;
    }

    /**
     * Sets response declarations.
     *
     * @param responseDeclarations the response declarations
     */
    public void setResponseDeclarations(Collection<ResponseDeclarationType> responseDeclarations) {
        this.responseDeclarations = responseDeclarations;
    }

    /**
     * Sets assessment item type.
     *
     * @param assessmentItemType the assessment item type
     */
    public void setAssessmentItemType(ItemType assessmentItemType) {
        this.assessmentItemType = assessmentItemType;
    }

    /**
     * Gets outcome declaration group.
     *
     * @return the outcome declaration group
     */
    public Collection<OutcomeDeclarationType> getOutcomeDeclarations() {
        return outcomeDeclarations;
    }

    /**
     * Sets outcome declaration group.
     *
     * @param outcomeDeclarations the outcome declaration group
     */
    public void setOutcomeDeclarations(Collection<OutcomeDeclarationType> outcomeDeclarations) {
        this.outcomeDeclarations = outcomeDeclarations;
    }

    /**
     * Gets item body.
     *
     * @return the item body
     */
    public ItemBodyType getItemBody() {
        return itemBody;
    }

    /**
     * Sets item body.
     *
     * @param itemBody the item body
     */
    public void setItemBody(ItemBodyType itemBody) {
        this.itemBody = itemBody;
    }

    /**
     * Gets response processing.
     *
     * @return the response processing
     */
    public ResponseProcessingType getResponseProcessing() {
        return responseProcessing;
    }

    /**
     * Sets response processing.
     *
     * @param responseProcessing the response processing
     */
    public void setResponseProcessing(ResponseProcessingType responseProcessing) {
        this.responseProcessing = responseProcessing;
    }

    /**
     * 试题构造函数
     *
     * @param identifier       the identifier
     * @param respDeclarations 响应变量集合
     * @param outDeclarations  分数结果变量集合
     * @param body             试题体
     * @param processing       判分规则
     * @param questionAnalysis 试题解析
     * @throws Exception the exception
     */
    protected OpenAssessmentItem(String identifier,
                                 Collection<ResponseDeclarationType> respDeclarations,
                                 Collection<OutcomeDeclarationType> outDeclarations,
                                 ItemBodyType body, ResponseProcessingType processing, String questionAnalysis) throws Exception {
        this.setResponseDeclarations(respDeclarations);
        this.setOutcomeDeclarations(outDeclarations);
        this.setItemBody(body);
        this.setResponseProcessing(processing);
        this.setIdentifier(identifier);
        this.setQuestionAnalysis(questionAnalysis);
        this.handleAfterTranslateFromImsItem();
    }

    /**
     * 从XML文本加载试题.
     *
     * @param xmlString the xml string
     * @throws Exception the exception
     */
    public void LoadFromString(String xmlString) throws Exception {
        AssessmentItem imsAssessmentItem;

        JAXBContext jc = JaxbUtil.jaxbContextMap.get(AssessmentItem.class.getName());
        if(jc == null){
            // 如果每次都调用JAXBContext.newInstance方法，会导致性能急剧下降
            jc = JAXBContext.newInstance(AssessmentItem.class);
            JaxbUtil.jaxbContextMap.put(AssessmentItem.class.getName(), jc);
        }

        Unmarshaller u = jc.createUnmarshaller();
        JAXBElement<AssessmentItem> o = (JAXBElement<AssessmentItem>) u.unmarshal(new StringReader(xmlString));
        imsAssessmentItem = o.getValue();

        TranslateFromImsItem(imsAssessmentItem);
    }

    /**
     * 获取试题XML内容
     *
     * @return xml string
     * @throws Exception the exception
     */
    public String getXmlString() throws Exception {
        AssessmentItem imsAssessmentItem = translateToImsItem();

        String xml = convertToXml(imsAssessmentItem, "UTF-8");

        return xml.replace("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>", "");
    }

    /**
     * JavaBean转换成xml
     * @param obj
     * @param encoding
     * @return
     */
    public static String convertToXml(AssessmentItem obj, String encoding) {
        String result = null;
        try {
            JAXBContext jc = JaxbUtil.jaxbContextMap.get(AssessmentItem.class.getName());
            if(jc == null){
                // 如果每次都调用JAXBContext.newInstance方法，会导致性能急剧下降
                jc = JAXBContext.newInstance(AssessmentItem.class);
                JaxbUtil.jaxbContextMap.put(AssessmentItem.class.getName(), jc);
            }

            Marshaller marshaller = jc.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.setProperty(Marshaller.JAXB_ENCODING, encoding);

            StringWriter writer = new StringWriter();
            marshaller.marshal(obj, writer);
            result = writer.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    /**
     * 根据内部题型返回具体题型
     *
     * @param type the type
     * @return open assessment item
     * @throws Exception the exception
     */
    public static OpenAssessmentItem createInstance(ItemType type) throws Exception {
        OpenAssessmentItem assessmentitem;
        switch (type) {
            case SINGLECHOICE://单选
                assessmentitem = new OpenSingleChoiceAssessmentItem();
                break;
            case MULTIPLECHOICE://多选
                assessmentitem = new OpenMultipleChoiceAssessmentItem();
                break;
            case JUDGEMENT://判断
                assessmentitem = new OpenJudgementAssessmentItem();
                break;
            case TEXTENTRY://填空
                assessmentitem = new OpenTextEntryAssessmentItem();
                break;
            case EXTENDEDTEXT://问答
                assessmentitem = new OpenExtendedTextAssessmentItem();
                break;
            case MATCH://匹配
                assessmentitem = new OpenMatchAssessmentItem();
                break;
            case READINGCOMPREHENSION://阅读理解
                assessmentitem = new OpenReadingComprehensionAssessmentItem();
                break;
            case CLOZE://完型填空
                assessmentitem = new OpenClozeAssessmentItem();
                break;
            case UPLOAD://上传
                assessmentitem = new OpenUploadAssessmentItem();
                break;
            case COMPOSITE://复合
                assessmentitem = new OpenCompositeAssessmentItem();
                break;
            case ORDER://排序
                assessmentitem = new OpenOrderAssessmentItem();
                break;
            default:
                throw new Exception("题型" + type + " Qti暂不支持！");
        }
        return assessmentitem;
    }

    //region ResponseDeclaration V2

    /**
     * 创建响应变量
     *
     * @param identifier            响应变量ID
     * @param cardinality           基数
     * @param baseType              基本类型
     * @param correctResponseValues 正确答案列表
     * @param totalScore            总分
     * @param isMappingResponse     是否映射匹配给分
     * @return 响应变量
     */
    private ResponseDeclarationType BuildResponseDeclaration(String identifier, CardinalityType cardinality, BaseTypeType baseType,
                                                             List<String> correctResponseValues, double totalScore, boolean isMappingResponse) {
        double atomicItemScore = DoubleUtil.round(totalScore / correctResponseValues.size(), 4);
        ResponseDeclarationType respDeclaration = new ResponseDeclarationType();

        respDeclaration.setIdentifier(identifier);//ID
        respDeclaration.setCardinality(cardinality);//基数
        respDeclaration.setBaseType(baseType);//基本类型

        if (isMappingResponse)//映射匹配答案
        {
            MappingType map = null;

            for (String correctResponseValue : correctResponseValues) {
                if (correctResponseValue != null) {
                    if (map == null) {
                        map = new MappingType();
                        map.setLowerBound(0d);
                        map.setUpperBound(1d);
                        map.setDefaultValue(0);
                    }

                    MapEntryType mapEntry = new MapEntryType();
                    mapEntry.setMapKey(correctResponseValue);
                    mapEntry.setMappedValue(atomicItemScore);
                    map.getMapEntry().add(mapEntry);
                }
            }

            if (map != null) {
                respDeclaration.setMapping(map);
            }
        } else//完全匹配
        {
            CorrectResponseType cortResponse = null;

            for (String correctResponseValue : correctResponseValues) {
                if (correctResponseValue != null) {
                    if (cortResponse == null) {
                        cortResponse = new CorrectResponseType();
                    }

                    ValueType corrValue = new ValueType();
                    corrValue.setValue(correctResponseValue);
                    cortResponse.getValue().add(corrValue);
                }
            }

            if (cortResponse != null) {
                respDeclaration.setCorrectResponse(cortResponse);
            }
        }

        return respDeclaration;
    }

    /**
     * 创建响应变量集合(基数类型相同，基本类型相同，所有子题平分总分)
     *
     * @param cardinality               基数
     * @param baseType                  基本类型
     * @param correctResponseValuesList 所有子题的正确答案列表
     * @param isMappingResponse         是否映射匹配给分
     * @return 响应变量集合 list
     */
    protected List<ResponseDeclarationType> BuildResponseDeclarationCollection(CardinalityType cardinality, BaseTypeType baseType,
                                                                               Map<String, List<String>> correctResponseValuesList, boolean isMappingResponse) {
        double childItemTotalScore = DoubleUtil.round(1.0 / correctResponseValuesList.size(), 4);
        List<ResponseDeclarationType> respDeclarations = new ArrayList<ResponseDeclarationType>();

        for (Map.Entry<String, List<String>> interactionCorrectResponseValues : correctResponseValuesList.entrySet()) {
            ResponseDeclarationType respDeclaration;
            respDeclaration = BuildResponseDeclaration(
                    interactionCorrectResponseValues.getKey(), cardinality, baseType, interactionCorrectResponseValues.getValue(), childItemTotalScore, isMappingResponse);

            respDeclarations.add(respDeclaration);
        }

        return respDeclarations;
    }

    /**
     * 创建响应变量集合(基数类型相同，基本类型相同，单题)
     * 适用于单选题、判断题、问答题、上载题
     *
     * @param cardinality          基数
     * @param baseType             基本类型
     * @param correctResponseValue 正确答案
     * @return 响应变量集合 list
     */
    protected List<ResponseDeclarationType> BuildResponseDeclarationCollection(CardinalityType cardinality, BaseTypeType baseType,
                                                                               String correctResponseValue) {
        Map<String, List<String>> correctResponses = null;
        correctResponses = new HashMap<>();

        List<String> interactionCorrectResponses = new ArrayList<String>();
        interactionCorrectResponses.add(correctResponseValue);
        correctResponses.put("RESPONSE", interactionCorrectResponses);

        return BuildResponseDeclarationCollection(cardinality, baseType, correctResponses, false);
    }
    //endregion

    //region ResponseProcessing V2

    /**
     * 创建判分规则，含子题（子题分数平均分配）
     *
     * @param childItemCount    子题数
     * @param isMappingResponse 是否映射匹配给分
     * @return 判分规则 response processing type
     */
    protected ResponseProcessingType BuildResponseProcessing(int childItemCount, boolean isMappingResponse) {
        if (isMappingResponse) {
            return BuildMapResponseResponseProcessing(childItemCount);
        } else {
            return BuildMatchCorrectResponseProcessing(childItemCount);
        }
    }
    //endregion

    //region ResponseDeclaration

    /**
     * 创建响应变量#
     *
     * @param identifier            响应变量ID
     * @param cardinality           基数
     * @param baseType              基本类型
     * @param correctResponseValues 正确答案列表
     * @param mapEntrys             判分规则字典
     * @return 响应变量
     */
    private ResponseDeclarationType BuildResponseDeclaration(String identifier, CardinalityType cardinality, BaseTypeType baseType,
                                                             List<String> correctResponseValues, Map<String, Double> mapEntrys) {

        ResponseDeclarationType respDeclaration = new ResponseDeclarationType();

        respDeclaration.setIdentifier(identifier);//ID
        respDeclaration.setCardinality(cardinality);//基数
        respDeclaration.setBaseType(baseType);//基本类型

        if (correctResponseValues != null)//完全匹配答案
        {
            CorrectResponseType cortResponse = new CorrectResponseType();

            for (String correctResponseValue : correctResponseValues) {
                ValueType corrValue = new ValueType();
                corrValue.setValue(correctResponseValue);
                cortResponse.getValue().add(corrValue);
            }

            respDeclaration.setCorrectResponse(cortResponse);
        }

        if (mapEntrys != null)//映射匹配答案
        {
            MappingType map = new MappingType();

            map.setLowerBound(0d);
            map.setUpperBound(1d);
            map.setDefaultValue(0);

            for (Map.Entry<String, Double> mapEnt : mapEntrys.entrySet()) {
                MapEntryType mapEntry = new MapEntryType();
                mapEntry.setMapKey(mapEnt.getKey());
                mapEntry.setMappedValue(mapEnt.getValue());
                map.getMapEntry().add(mapEntry);
            }

            respDeclaration.setMapping(map);
        }

        return respDeclaration;
    }

    /**
     * 创建响应变量（映射匹配答案模式#）
     *
     * @param identifier  响应变量ID
     * @param cardinality 基数
     * @param baseType    基本类型
     * @param mapEntrys   判分规则字典
     * @return 响应变量
     */
    private ResponseDeclarationType BuildResponseDeclaration(String identifier, CardinalityType cardinality, BaseTypeType baseType,
                                                             Map<String, Double> mapEntrys) {
        return BuildResponseDeclaration(identifier, cardinality, baseType, null, mapEntrys);
    }

    /**
     * 创建响应变量集合（映射匹配模式--适用于填空题#）
     *
     * @param cardinality   基数
     * @param baseType      基本类型
     * @param mapEntrysList 所有子题的映射答案列表
     * @return 响应变量集合 list
     */
    protected List<ResponseDeclarationType> BuildResponseDeclarationCollection(CardinalityType cardinality, BaseTypeType baseType,
                                                                               List<Map<String, Double>> mapEntrysList) {
        boolean singleItem = (mapEntrysList.size() == 1);//单题项标志

        List<ResponseDeclarationType> respDeclarations = new ArrayList<ResponseDeclarationType>();
        for (int i = 0; i < mapEntrysList.size(); i++) {
            String identifier = singleItem ? "RESPONSE" : String.format("RESPONSE_%d", i + 1);//单题项ID为RESPONSE，否则为RESPONSE加序号

            ResponseDeclarationType respDeclaration = BuildResponseDeclaration(identifier, cardinality, baseType, mapEntrysList.get(i));

            respDeclarations.add(respDeclaration);
        }
        return respDeclarations;
    }
    //endregion

    //region OutcomeDeclaration

    /**
     * 创建结果变量
     *
     * @param identifier    结果变量ID
     * @param cardinality   基数
     * @param baseType      基本类型
     * @param normalMaximum 结果分数
     * @param defaultValue  默认值
     * @return 结果变量
     */
    private OutcomeDeclarationType BuildOutcomeDeclaration(String identifier, CardinalityType cardinality, BaseTypeType baseType, double normalMaximum,
                                                           double defaultValue) {
        OutcomeDeclarationType outDeclaration = new OutcomeDeclarationType();

        outDeclaration.setIdentifier(identifier);
        outDeclaration.setCardinality(cardinality);
        outDeclaration.setBaseType(baseType);
        outDeclaration.setNormalMaximum(DoubleUtil.round(normalMaximum, 4));//分数比例取4位小数

        DefaultValueType outDeclDefaultValue = new DefaultValueType();

        ValueType outDeclValue = new ValueType();
        outDeclValue.setValue(String.valueOf(defaultValue));
        outDeclDefaultValue.getValue().add(outDeclValue);

        outDeclaration.setDefaultValue(outDeclDefaultValue);

        return outDeclaration;
    }

    /**
     * 创建结果变量
     *
     * @param identifier 结果变量ID
     * @param score      结果变量分数
     * @return 结果变量 outcome declaration type
     */
    protected OutcomeDeclarationType BuildOutcomeDeclaration(String identifier, double score) {
        return BuildOutcomeDeclaration(identifier, CardinalityType.SINGLE, BaseTypeType.FLOAT, score, 0);
    }

    /**
     * 创建分数结果变量集合
     *
     * @param childItemCount 子题数量
     * @return 结果变量集合 list
     */
    protected List<OutcomeDeclarationType> BuildScoreOutcomeDeclarationCollection(int childItemCount) {
        List<OutcomeDeclarationType> outDeclarations = new ArrayList<OutcomeDeclarationType>();

        //总分数
        OutcomeDeclarationType outDeclaration = BuildOutcomeDeclaration("SCORE", 1);
        outDeclarations.add(outDeclaration);

        if (childItemCount > 1) {
            //子题默认分数
            double score = 1.0 / childItemCount;//子题分数平均分配
            for (int i = 0; i < childItemCount; i++) {
                OutcomeDeclarationType childItemOutDeclaration = BuildOutcomeDeclaration(String.format("SCORE_%d", i + 1), score);
                outDeclarations.add(childItemOutDeclaration);
            }
        }

        return outDeclarations;
    }

    /**
     * 创建分数结果变量集合
     *
     * @return 结果变量集合 list
     */
    protected List<OutcomeDeclarationType> BuildScoreOutcomeDeclarationCollection() {
        return BuildScoreOutcomeDeclarationCollection(1);
    }
    //endregion

    //region ResponseProcessing

    /**
     * 创建完全匹配判分规则，含子题（match_correct）
     *
     * @param childItemCount 子题分数
     * @return 判分规则 response processing type
     */
    protected ResponseProcessingType BuildMatchCorrectResponseProcessing(int childItemCount) {
        boolean singleItem = (childItemCount == 1);
        double childItemScore = DoubleUtil.round(1.0 / childItemCount, 4);

        ResponseProcessingType processing = new ResponseProcessingType();
        Collection<ResponseConditionType> processingResponseConditions = new ArrayList<>();
        Collection<SetOutcomeValueType> processingSetOutcomeValues = new ArrayList<>();

        Collection<VariableType> totalScoreSumVariables = new ArrayList<>();

        for (int i = 0; i < childItemCount; i++)//设定各子题的判分规则
        {
            ResponseConditionType respCondition = new ResponseConditionType();

            //responseIf
            ResponseIfType respIf = new ResponseIfType();

            //match
            MatchType mat = new MatchType();

            //variable
            VariableType var = new VariableType();
            var.setIdentifier(singleItem ? "RESPONSE" : String.format("RESPONSE_%d", i + 1));

            mat.getExpressionElementGroup().add(var);
            //end variable

            //correct
            CorrectType cor = new CorrectType();
            cor.setIdentifier(singleItem ? "RESPONSE" : String.format("RESPONSE_%d", i + 1));
            if (!mat.getExpressionElementGroup().contains(cor)) {
                mat.getExpressionElementGroup().add(cor);
            }
            //end correct

            respIf.setMatch(mat);
            //end match

            //setOutcomeValue
            SetOutcomeValueType setOutcomeResp = new SetOutcomeValueType();

            setOutcomeResp.setIdentifier(singleItem ? "SCORE" : String.format("SCORE_%d", i + 1));

            //baseValue
            BaseValueType bsValueResp = new BaseValueType();
            bsValueResp.setBaseType(BaseTypeType.FLOAT);
            bsValueResp.setValue(String.valueOf(childItemScore));
            setOutcomeResp.setBaseValue(bsValueResp);
            //end baseValue

            //end setOutcomeValue

            //getResponseRuleElementGroup
            respIf.getResponseRuleElementGroup().add(setOutcomeResp);
            respCondition.setResponseIf(respIf);
            //end responseIf

            processingResponseConditions.add(respCondition);

            if (!singleItem)//含子题，总分信息增加子题信息
            {
                VariableType varChildTotal = new VariableType();
                varChildTotal.setIdentifier(String.format("SCORE_%d", i + 1));
                totalScoreSumVariables.add(varChildTotal);
            }
        }

        if (!singleItem) {
            SetOutcomeValueType totalScoreSetOutcome = new SetOutcomeValueType();
            totalScoreSetOutcome.setIdentifier("SCORE");
            SumType totalScoreSum = new SumType();//增加总分信息
            totalScoreSum.getExpressionElementGroup().addAll(totalScoreSumVariables);
            totalScoreSetOutcome.setSum(totalScoreSum);
            processingSetOutcomeValues.add(totalScoreSetOutcome);
            processing.getResponseRuleElementGroup().add(processingSetOutcomeValues);//Match模式可能有setOutcomeValueCollection
        }

        processing.getResponseRuleElementGroup().addAll(processingResponseConditions);//Match模式必然有responseConditionCollection
        return processing;
    }

    /**
     * 创建完全匹配判分规则，含子题（match_correct）
     *
     * @param childItemScores 子题分数
     * @return 判分规则 response processing type
     */
    protected ResponseProcessingType BuildMatchCorrectResponseProcessing(List<Double> childItemScores) {
        boolean singleItem = (childItemScores.size() == 1);

        ResponseProcessingType processing = new ResponseProcessingType();
        Collection<ResponseConditionType> processingResponseConditions = new ArrayList<ResponseConditionType>();
        Collection<SetOutcomeValueType> processingSetOutcomeValues = new ArrayList<SetOutcomeValueType>();

        Collection<VariableType> totalScoreSumVariables = new ArrayList<VariableType>();

        for (int i = 0; i < childItemScores.size(); i++)//设定各子题的判分规则
        {
            ResponseConditionType respCondition = new ResponseConditionType();

            //responseIf
            ResponseIfType respIf = new ResponseIfType();

            //match
            MatchType mat = new MatchType();

            //variable
            VariableType var = new VariableType();
            var.setIdentifier(singleItem ? "RESPONSE" : String.format("RESPONSE_%d", i + 1));

            mat.getExpressionElementGroup().add(var);
            //end variable

            //correct
            CorrectType cor = new CorrectType();
            cor.setIdentifier(singleItem ? "RESPONSE" : String.format("RESPONSE_%d", i + 1));
            if (!mat.getExpressionElementGroup().contains(cor)) {
                mat.getExpressionElementGroup().add(cor);
            }
            //end correct

            respIf.setMatch(mat);
            //end match

            //setOutcomeValue
            SetOutcomeValueType setOutcomeResp = new SetOutcomeValueType();

            setOutcomeResp.setIdentifier(singleItem ? "SCORE" : String.format("SCORE_%d", i + 1));

            //baseValue
            BaseValueType bsValueResp = new BaseValueType();
            bsValueResp.setBaseType(BaseTypeType.FLOAT);
            bsValueResp.setValue(singleItem ? "1" : String.valueOf(childItemScores.get(i)));
            setOutcomeResp.setBaseValue(bsValueResp);
            //end baseValue

            //endregion

            respIf.getResponseRuleElementGroup().add(setOutcomeResp);
            respCondition.setResponseIf(respIf);
            //endregion

            processingResponseConditions.add(respCondition);

            if (!singleItem)//含子题，总分信息增加子题信息
            {
                VariableType varChildTotal = new VariableType();
                varChildTotal.setIdentifier(String.format("SCORE_%d", i + 1));
                totalScoreSumVariables.add(varChildTotal);
            }
        }

        if (!singleItem) {
            SetOutcomeValueType totalScoreSetOutcome = new SetOutcomeValueType();
            totalScoreSetOutcome.setIdentifier("SCORE");
            SumType totalScoreSum = new SumType();//增加总分信息
            totalScoreSum.getExpressionElementGroup().addAll(totalScoreSumVariables);
            totalScoreSetOutcome.setSum(totalScoreSum);
            processingSetOutcomeValues.add(totalScoreSetOutcome);
            processing.getResponseRuleElementGroup().add(processingSetOutcomeValues);//Match模式可能有setOutcomeValueCollection
        }

        processing.getResponseRuleElementGroup().add(processingResponseConditions);//Match模式必然有responseConditionCollection
        return processing;
    }

    /**
     * 创建完全匹配判分规则，不含子题（match_correct）
     *
     * @return 判分规则 response processing type
     */
    protected ResponseProcessingType BuildMatchCorrectResponseProcessing() {
        List<Double> childItemScores = new ArrayList<Double>();
        childItemScores.add(1d);

        ResponseProcessingType processing = BuildMatchCorrectResponseProcessing(childItemScores);

        return processing;
    }


    /**
     * 创建映射匹配判分规则，含子题
     *
     * @param childItemCount 子题数
     * @return 判分规则 response processing type
     */
    protected ResponseProcessingType BuildMapResponseResponseProcessing(int childItemCount) {
        boolean singleItem = (childItemCount == 1);

        ResponseProcessingType processing = new ResponseProcessingType();
        Collection<SetOutcomeValueType> processingSetOutcomeValues = new ArrayList<SetOutcomeValueType>();


        Collection<VariableType> totalScoreSumVariables = new ArrayList<VariableType>();

        for (int i = 0; i < childItemCount; i++) {
            //setOutcomeValue
            SetOutcomeValueType setOutcomeScore = new SetOutcomeValueType();
            setOutcomeScore.setIdentifier(singleItem ? "SCORE" : String.format("SCORE_%d", i + 1));

            MapResponseType mapResponseScore = new MapResponseType();
            mapResponseScore.setIdentifier(singleItem ? "RESPONSE" : String.format("RESPONSE_%d", i + 1));
            setOutcomeScore.setMapResponse(mapResponseScore);

            processingSetOutcomeValues.add(setOutcomeScore);

            if (!singleItem)//含子题，总分信息增加子题信息
            {
                VariableType varChildTotal = new VariableType();
                varChildTotal.setIdentifier(String.format("SCORE_%d", i + 1));
                totalScoreSumVariables.add(varChildTotal);
            }
        }

        if (!singleItem)//含子题，增加总分信息
        {
            SetOutcomeValueType totalScoreSetOutcome = new SetOutcomeValueType();
            totalScoreSetOutcome.setIdentifier("SCORE");
            SumType totalScoreSum = new SumType();
            totalScoreSum.getExpressionElementGroup().addAll(totalScoreSumVariables);
            totalScoreSetOutcome.setSum(totalScoreSum);
            processingSetOutcomeValues.add(totalScoreSetOutcome);

        }

        processing.getResponseRuleElementGroup().addAll(processingSetOutcomeValues);//Map模式必然有setOutcomeValueCollection
        return processing;
    }

    /**
     * 创建映射匹配判分规则，不含子题（map_response）
     *
     * @return 判分规则 response processing type
     */
    protected ResponseProcessingType BuildMapResponseResponseProcessing() {
        return BuildMapResponseResponseProcessing(1);
    }
    //endregion

    //region Reset Id

    /**
     * 重置ID（将ID重置为以baseId为基数的ID，如RESPONSE变为RESPONSE_1，RESPONSE_1变为RESPONSE_1.1）.
     * 用于构建复合题
     *
     * @param identifier 试题ID
     * @param title      标题
     * @param baseId     ID基数
     * @throws OpenCompositeSubItemContentNeedIdException    the open composite sub item content need id exception
     * @throws OpenTextEntryInteractionCountInvalidException the open text entry interaction count invalid exception
     */
    protected void ResetIdentifier(String identifier, String title, int baseId) throws OpenCompositeSubItemContentNeedIdException, OpenTextEntryInteractionCountInvalidException {
        //替换响应变量
        if (this.getResponseDeclarations() != null) {
            for (ResponseDeclarationType respDeclaration : getResponseDeclarations()) {
                respDeclaration.setIdentifier(GetResettedId(identifier, title, respDeclaration.getIdentifier(), baseId));
            }
        }
        //替换结果变量
        if (this.getOutcomeDeclarations() != null) {
            for (OutcomeDeclarationType outDeclaration : getOutcomeDeclarations()) {
                outDeclaration.setIdentifier(GetResettedId(identifier, title, outDeclaration.getIdentifier(), baseId));
            }
        }

        //region 替换交互
        if (this.getItemBody() != null && this.getItemBody().getBlockElementGroup() != null) {
            for (Object obj : this.getItemBody().getBlockElementGroup()) {
                if (obj instanceof ChoiceInteractionType) {
                    //choiceInteraction选择题
                    ChoiceInteractionType interaction = (ChoiceInteractionType) obj;
                    interaction.setResponseIdentifier(GetResettedId(identifier, title, interaction.getResponseIdentifier(), baseId));
                } else if (obj instanceof ExtendedTextInteractionType) {
                    //extendedTextInteraction问答题
                    ExtendedTextInteractionType interaction = (ExtendedTextInteractionType) obj;
                    interaction.setResponseIdentifier(GetResettedId(identifier, title, interaction.getResponseIdentifier(), baseId));
                } else if (obj instanceof MatchInteractionType) {
                    //matchInteraction匹配题
                    MatchInteractionType interaction = (MatchInteractionType) obj;
                    interaction.setResponseIdentifier(GetResettedId(identifier, title, interaction.getResponseIdentifier(), baseId));
                } else if (obj instanceof OrderInteractionType) {
                    //orderInteraction
                    OrderInteractionType interaction = (OrderInteractionType) obj;
                    interaction.setResponseIdentifier(GetResettedId(identifier, title, interaction.getResponseIdentifier(), baseId));
                } else if (obj instanceof UploadInteractionType) {
                    //uploadInteraction附件上传题
                    UploadInteractionType interaction = (UploadInteractionType) obj;
                    interaction.setResponseIdentifier(GetResettedId(identifier, title, interaction.getResponseIdentifier(), baseId));
                } else if (obj instanceof DivType) {
                    //textEntry 填空题TODO
                    DivType div = (DivType) obj;
                    //确定div的content必须有内容
                    if (div.getContent() != null) {
                        /*
                        for (Object contentSub : div.getContent()) {
                            if (contentSub instanceof TextEntryInteractionType) {
                                TextEntryInteractionType entry = (TextEntryInteractionType) contentSub;
                                entry.setResponseIdentifier(GetResettedId(identifier, title, entry.getResponseIdentifier(), baseId));
                            }
                        }
                        */

                        //假定填空题只有一个div节点，并且可以转换成为String
                        String textEntryItemBodyContent = div.getContent().get(0).toString();
                        //试题体题干内容

                        List<String> splittedItemBodyContents = PatternUtil.getPatternSplitList(textEntryItemBodyContent, "(<textEntryInteraction\\s.*?\\sexpectedLength=\"\\d+\"/>)");

                        if (splittedItemBodyContents.size() != this.getResponseDeclarations().size() * 2 + 1) {
                            throw new OpenTextEntryInteractionCountInvalidException(identifier, title);
                        }

                        StringBuilder resettedItemBodyContent = new StringBuilder();
                        for (int i = 0; i < splittedItemBodyContents.size(); i++) {
                            if (i % 2 != 0) {
                                //取出responseIdentifier值，赋值给对应的OpenTextEntryInteraction
                                int startPos = splittedItemBodyContents.get(i).indexOf("responseIdentifier=\" \"");
                                int endPos = splittedItemBodyContents.get(i).indexOf("\" \"", startPos + 20);
                                String resIdentifier = splittedItemBodyContents.get(i).substring(startPos + 20, endPos - startPos - 20);
                                String responseIdentifier = GetResettedId(identifier, title, resIdentifier, baseId);

                                splittedItemBodyContents.set(i, splittedItemBodyContents.get(i).replace(resIdentifier, responseIdentifier));
                                resettedItemBodyContent.append(splittedItemBodyContents.get(i));

                            } else {
                                resettedItemBodyContent.append(splittedItemBodyContents.get(i));
                            }

                        }
                        div.getContent().set(0, resettedItemBodyContent);

                    }
                }
            }
        }
        //endregion

        //region 替换判分规则
        if (this.responseProcessing != null && this.responseProcessing.getResponseRuleElementGroup() != null) {
            for (Object obj : this.responseProcessing.getResponseRuleElementGroup()) {
                if (obj instanceof SetOutcomeValueType) {
                    //替换<responseProcessing><setOutcomeValue>
                    SetOutcomeValueType setOutcome = (SetOutcomeValueType) obj;
                    //替换<setOutcomeValue>
                    setOutcome.setIdentifier(GetResettedId(identifier, title, setOutcome.getIdentifier(), baseId));

                    //替换<setOutcomeValue><mapResponse>
                    if (setOutcome.getMapResponse() != null && setOutcome.getMapResponse().getIdentifier() != null) {
                        setOutcome.getMapResponse().setIdentifier(GetResettedId(identifier, title, setOutcome.getMapResponse().getIdentifier(), baseId));
                    }

                    //替换<setOutcomeValue><sum><variable>
                    if (setOutcome.getSum() != null && setOutcome.getSum().getExpressionElementGroup() != null) {
                        for (Object sumObj : setOutcome.getSum().getExpressionElementGroup()) {
                            if (sumObj instanceof VariableType) {
                                VariableType var = (VariableType) sumObj;
                                var.setIdentifier(GetResettedId(identifier, title, var.getIdentifier(), baseId));
                            }
                        }
                    }
                } else if (obj instanceof ResponseConditionType) {
                    //替换<responseProcessing><responseCondition>
                    ResponseConditionType respCondition = (ResponseConditionType) obj;
                    if (respCondition.getResponseIf() != null) {
                        if (respCondition.getResponseIf().getMatch() != null && respCondition.getResponseIf().getMatch().getExpressionElementGroup() != null)//替换<responseCondition><responseIf><match>
                        {
                            for (Object matchObj : respCondition.getResponseIf().getMatch().getExpressionElementGroup()) {
                                if (matchObj instanceof VariableType) {
                                    //替换<responseCondition><responseIf><match><variable>
                                    VariableType var = (VariableType) matchObj;
                                    var.setIdentifier(GetResettedId(identifier, title, var.getIdentifier(), baseId));
                                } else if (matchObj instanceof CorrectType) {
                                    //替换<responseCondition><responseIf><match><correct>
                                    CorrectType correct = (CorrectType) matchObj;
                                    correct.setIdentifier(GetResettedId(identifier, title, correct.getIdentifier(), baseId));
                                }
                            }
                        }

                        if (respCondition.getResponseIf().getResponseRuleElementGroup() != null) {
                            for (Object ruleObj : respCondition.getResponseIf().getResponseRuleElementGroup()) {
                                if (ruleObj instanceof SetOutcomeValueType) {
                                    //替换<responseCondition><responseIf><setOutcomeValue>
                                    SetOutcomeValueType setOutcome = (SetOutcomeValueType) ruleObj;
                                    setOutcome.setIdentifier(GetResettedId(identifier, title, setOutcome.getIdentifier(), baseId));
                                }
                            }
                        }
                    }
                }
            }
        }
        //endregion
    }

    /**
     * 获取重置的ID（将ID重置为以baseId为基数的ID，如RESPONSE变为RESPONSE_1，RESPONSE_1变为RESPONSE_1.1）
     * 用于构建复合题
     *
     * @param identifier         试题ID
     * @param title              标题
     * @param originalIdentifier 原ID
     * @param baseId             基数
     * @return 重置的ID
     */
    private String GetResettedId(String identifier, String title, String originalIdentifier, int baseId) throws OpenCompositeSubItemContentNeedIdException {
        if (originalIdentifier == null || originalIdentifier.length() == 0) {
            throw new OpenCompositeSubItemContentNeedIdException(identifier, title, baseId);
        }

        int underlinePos = originalIdentifier.indexOf('_');
        if (underlinePos > 0)//RESPONSE_1变为RESPONSE_1.1
        {
            return String.format("%s%d.%s", originalIdentifier.substring(0, underlinePos + 1), baseId, originalIdentifier.substring(underlinePos + 1));
        } else//RESPONSE变为RESPONSE_1
        {
            return String.format("%s_%d", originalIdentifier, baseId);
        }
    }

    //endregion

    //region Translate Between IMS & OPEN

    /**
     * 转换为IMS试题
     *
     * @return assessment item
     * @throws Exception the exception
     */
    protected AssessmentItem translateToImsItem() throws Exception {
        handleBeforeTranslateToImsItem();
        AssessmentItem imsItem = new AssessmentItem();
        //属性
        imsItem.setIdentifier(getIdentifier());
        imsItem.setTitle(getTitle());
        imsItem.setAdaptive(false);
        imsItem.setTimeDependent(false);

        //元素
        imsItem.getResponseDeclaration().addAll(getResponseDeclarations());
        imsItem.getOutcomeDeclaration().addAll(getOutcomeDeclarations());
        imsItem.setItemBody(getItemBody());
        imsItem.setResponseProcessing(getResponseProcessing());
        imsItem.setQuestionAnalysis(getQuestionAnalysis());

        return imsItem;
    }

    /**
     * 从IMS试题转换
     *
     * @param imsItem IMS试题
     * @throws Exception the exception
     */
    protected void TranslateFromImsItem(AssessmentItem imsItem) throws Exception {
        this.setIdentifier(GuidUtil.formatGuid(imsItem.getIdentifier()));
        this.setTitle(imsItem.getTitle());
        this.setResponseDeclarations(imsItem.getResponseDeclaration());
        this.setOutcomeDeclarations(imsItem.getOutcomeDeclaration());
        this.setItemBody(imsItem.getItemBody());
        this.setResponseProcessing(imsItem.getResponseProcessing());
        this.setQuestionAnalysis(imsItem.getQuestionAnalysis());
        handleAfterTranslateFromImsItem();
    }

    /**
     * 从IMS试题转换后处理
     * 从ResponseDeclarations、OutcomeDeclarations、ItemBody、ResponseProcessing反向得到本题项内容
     *
     * @throws Exception the exception
     */
    protected void handleAfterTranslateFromImsItem() throws Exception {
    }

    /**
     * 转换为IMS试题前处理
     * 构建ResponseDeclarations、OutcomeDeclarations、ItemBody、ResponseProcessing
     *
     * @throws OpenSimpleChoiceInteractionNeedCorrectResponseValueException the open simple choice interaction need correct response value exception
     * @throws Exception                                                    the exception
     */
    protected void handleBeforeTranslateToImsItem() throws OpenSimpleChoiceInteractionNeedCorrectResponseValueException, Exception {
    }

    /**
     * 获取媒体资源列表
     *
     * @return media对象
     */
    public List<Media> GetMediaList() {
        return null;
    }

    //endregion
}