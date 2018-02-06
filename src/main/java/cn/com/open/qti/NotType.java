//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.06.15 时间 10:58:25 AM CST 
//


package cn.com.open.qti;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>not.Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="not.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.open.com.cn/schemas/exam/openqti_v1}not.ContentGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "not.Type", propOrder = {
    "and",
    "gt",
    "ordered",
    "divide",
    "customOperator",
    "random",
    "numberIncorrect",
    "substring",
    "not",
    "equalRounded",
    "multiple",
    "integerToFloat",
    "_null",
    "index",
    "testVariables",
    "integerDivide",
    "gte",
    "durationLT",
    "contains",
    "member",
    "lt",
    "correct",
    "numberSelected",
    "patternMatch",
    "product",
    "numberPresented",
    "power",
    "mapResponsePoint",
    "mapResponse",
    "randomFloat",
    "stringMatch",
    "variable",
    "integerModulus",
    "subtract",
    "durationGTE",
    "outcomeMaximum",
    "anyN",
    "round",
    "numberResponded",
    "baseValue",
    "_default",
    "inside",
    "containerSize",
    "equal",
    "outcomeMinimum",
    "or",
    "randomInteger",
    "isNull",
    "numberCorrect",
    "match",
    "lte",
    "sum",
    "truncate",
    "fieldValue",
    "delete"
})
public class NotType {

    protected AndType and;
    protected GtType gt;
    protected OrderedType ordered;
    protected DivideType divide;
    protected CustomOperatorType customOperator;
    protected RandomType random;
    protected NumberIncorrectType numberIncorrect;
    protected SubstringType substring;
    protected NotType not;
    protected EqualRoundedType equalRounded;
    protected MultipleType multiple;
    protected IntegerToFloatType integerToFloat;
    @XmlElement(name = "null")
    protected NullType _null;
    protected IndexType index;
    protected TestVariablesType testVariables;
    protected IntegerDivideType integerDivide;
    protected GteType gte;
    protected DurationLTType durationLT;
    protected ContainsType contains;
    protected MemberType member;
    protected LtType lt;
    protected CorrectType correct;
    protected NumberSelectedType numberSelected;
    protected PatternMatchType patternMatch;
    protected ProductType product;
    protected NumberPresentedType numberPresented;
    protected PowerType power;
    protected MapResponsePointType mapResponsePoint;
    protected MapResponseType mapResponse;
    protected RandomFloatType randomFloat;
    protected StringMatchType stringMatch;
    protected VariableType variable;
    protected IntegerModulusType integerModulus;
    protected SubtractType subtract;
    protected DurationGTEType durationGTE;
    protected OutcomeMaximumType outcomeMaximum;
    protected AnyNType anyN;
    protected RoundType round;
    protected NumberRespondedType numberResponded;
    protected BaseValueType baseValue;
    @XmlElement(name = "default")
    protected DefaultType _default;
    protected InsideType inside;
    protected ContainerSizeType containerSize;
    protected EqualType equal;
    protected OutcomeMinimumType outcomeMinimum;
    protected OrType or;
    protected RandomIntegerType randomInteger;
    protected IsNullType isNull;
    protected NumberCorrectType numberCorrect;
    protected MatchType match;
    protected LteType lte;
    protected SumType sum;
    protected TruncateType truncate;
    protected FieldValueType fieldValue;
    protected DeleteType delete;

    /**
     * 获取and属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AndType }
     *     
     */
    public AndType getAnd() {
        return and;
    }

    /**
     * 设置and属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AndType }
     *     
     */
    public void setAnd(AndType value) {
        this.and = value;
    }

    /**
     * 获取gt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GtType }
     *     
     */
    public GtType getGt() {
        return gt;
    }

    /**
     * 设置gt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GtType }
     *     
     */
    public void setGt(GtType value) {
        this.gt = value;
    }

    /**
     * 获取ordered属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OrderedType }
     *     
     */
    public OrderedType getOrdered() {
        return ordered;
    }

    /**
     * 设置ordered属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OrderedType }
     *     
     */
    public void setOrdered(OrderedType value) {
        this.ordered = value;
    }

    /**
     * 获取divide属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DivideType }
     *     
     */
    public DivideType getDivide() {
        return divide;
    }

    /**
     * 设置divide属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DivideType }
     *     
     */
    public void setDivide(DivideType value) {
        this.divide = value;
    }

    /**
     * 获取customOperator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomOperatorType }
     *     
     */
    public CustomOperatorType getCustomOperator() {
        return customOperator;
    }

    /**
     * 设置customOperator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomOperatorType }
     *     
     */
    public void setCustomOperator(CustomOperatorType value) {
        this.customOperator = value;
    }

    /**
     * 获取random属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RandomType }
     *     
     */
    public RandomType getRandom() {
        return random;
    }

    /**
     * 设置random属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RandomType }
     *     
     */
    public void setRandom(RandomType value) {
        this.random = value;
    }

    /**
     * 获取numberIncorrect属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NumberIncorrectType }
     *     
     */
    public NumberIncorrectType getNumberIncorrect() {
        return numberIncorrect;
    }

    /**
     * 设置numberIncorrect属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NumberIncorrectType }
     *     
     */
    public void setNumberIncorrect(NumberIncorrectType value) {
        this.numberIncorrect = value;
    }

    /**
     * 获取substring属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SubstringType }
     *     
     */
    public SubstringType getSubstring() {
        return substring;
    }

    /**
     * 设置substring属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SubstringType }
     *     
     */
    public void setSubstring(SubstringType value) {
        this.substring = value;
    }

    /**
     * 获取not属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NotType }
     *     
     */
    public NotType getNot() {
        return not;
    }

    /**
     * 设置not属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NotType }
     *     
     */
    public void setNot(NotType value) {
        this.not = value;
    }

    /**
     * 获取equalRounded属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EqualRoundedType }
     *     
     */
    public EqualRoundedType getEqualRounded() {
        return equalRounded;
    }

    /**
     * 设置equalRounded属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EqualRoundedType }
     *     
     */
    public void setEqualRounded(EqualRoundedType value) {
        this.equalRounded = value;
    }

    /**
     * 获取multiple属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MultipleType }
     *     
     */
    public MultipleType getMultiple() {
        return multiple;
    }

    /**
     * 设置multiple属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleType }
     *     
     */
    public void setMultiple(MultipleType value) {
        this.multiple = value;
    }

    /**
     * 获取integerToFloat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IntegerToFloatType }
     *     
     */
    public IntegerToFloatType getIntegerToFloat() {
        return integerToFloat;
    }

    /**
     * 设置integerToFloat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerToFloatType }
     *     
     */
    public void setIntegerToFloat(IntegerToFloatType value) {
        this.integerToFloat = value;
    }

    /**
     * 获取null属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NullType }
     *     
     */
    public NullType getNull() {
        return _null;
    }

    /**
     * 设置null属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NullType }
     *     
     */
    public void setNull(NullType value) {
        this._null = value;
    }

    /**
     * 获取index属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IndexType }
     *     
     */
    public IndexType getIndex() {
        return index;
    }

    /**
     * 设置index属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IndexType }
     *     
     */
    public void setIndex(IndexType value) {
        this.index = value;
    }

    /**
     * 获取testVariables属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TestVariablesType }
     *     
     */
    public TestVariablesType getTestVariables() {
        return testVariables;
    }

    /**
     * 设置testVariables属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TestVariablesType }
     *     
     */
    public void setTestVariables(TestVariablesType value) {
        this.testVariables = value;
    }

    /**
     * 获取integerDivide属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IntegerDivideType }
     *     
     */
    public IntegerDivideType getIntegerDivide() {
        return integerDivide;
    }

    /**
     * 设置integerDivide属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerDivideType }
     *     
     */
    public void setIntegerDivide(IntegerDivideType value) {
        this.integerDivide = value;
    }

    /**
     * 获取gte属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GteType }
     *     
     */
    public GteType getGte() {
        return gte;
    }

    /**
     * 设置gte属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GteType }
     *     
     */
    public void setGte(GteType value) {
        this.gte = value;
    }

    /**
     * 获取durationLT属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DurationLTType }
     *     
     */
    public DurationLTType getDurationLT() {
        return durationLT;
    }

    /**
     * 设置durationLT属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DurationLTType }
     *     
     */
    public void setDurationLT(DurationLTType value) {
        this.durationLT = value;
    }

    /**
     * 获取contains属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ContainsType }
     *     
     */
    public ContainsType getContains() {
        return contains;
    }

    /**
     * 设置contains属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ContainsType }
     *     
     */
    public void setContains(ContainsType value) {
        this.contains = value;
    }

    /**
     * 获取member属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MemberType }
     *     
     */
    public MemberType getMember() {
        return member;
    }

    /**
     * 设置member属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MemberType }
     *     
     */
    public void setMember(MemberType value) {
        this.member = value;
    }

    /**
     * 获取lt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LtType }
     *     
     */
    public LtType getLt() {
        return lt;
    }

    /**
     * 设置lt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LtType }
     *     
     */
    public void setLt(LtType value) {
        this.lt = value;
    }

    /**
     * 获取correct属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CorrectType }
     *     
     */
    public CorrectType getCorrect() {
        return correct;
    }

    /**
     * 设置correct属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectType }
     *     
     */
    public void setCorrect(CorrectType value) {
        this.correct = value;
    }

    /**
     * 获取numberSelected属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NumberSelectedType }
     *     
     */
    public NumberSelectedType getNumberSelected() {
        return numberSelected;
    }

    /**
     * 设置numberSelected属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NumberSelectedType }
     *     
     */
    public void setNumberSelected(NumberSelectedType value) {
        this.numberSelected = value;
    }

    /**
     * 获取patternMatch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PatternMatchType }
     *     
     */
    public PatternMatchType getPatternMatch() {
        return patternMatch;
    }

    /**
     * 设置patternMatch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PatternMatchType }
     *     
     */
    public void setPatternMatch(PatternMatchType value) {
        this.patternMatch = value;
    }

    /**
     * 获取product属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProductType }
     *     
     */
    public ProductType getProduct() {
        return product;
    }

    /**
     * 设置product属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProductType }
     *     
     */
    public void setProduct(ProductType value) {
        this.product = value;
    }

    /**
     * 获取numberPresented属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NumberPresentedType }
     *     
     */
    public NumberPresentedType getNumberPresented() {
        return numberPresented;
    }

    /**
     * 设置numberPresented属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NumberPresentedType }
     *     
     */
    public void setNumberPresented(NumberPresentedType value) {
        this.numberPresented = value;
    }

    /**
     * 获取power属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PowerType }
     *     
     */
    public PowerType getPower() {
        return power;
    }

    /**
     * 设置power属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PowerType }
     *     
     */
    public void setPower(PowerType value) {
        this.power = value;
    }

    /**
     * 获取mapResponsePoint属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MapResponsePointType }
     *     
     */
    public MapResponsePointType getMapResponsePoint() {
        return mapResponsePoint;
    }

    /**
     * 设置mapResponsePoint属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MapResponsePointType }
     *     
     */
    public void setMapResponsePoint(MapResponsePointType value) {
        this.mapResponsePoint = value;
    }

    /**
     * 获取mapResponse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MapResponseType }
     *     
     */
    public MapResponseType getMapResponse() {
        return mapResponse;
    }

    /**
     * 设置mapResponse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MapResponseType }
     *     
     */
    public void setMapResponse(MapResponseType value) {
        this.mapResponse = value;
    }

    /**
     * 获取randomFloat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RandomFloatType }
     *     
     */
    public RandomFloatType getRandomFloat() {
        return randomFloat;
    }

    /**
     * 设置randomFloat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RandomFloatType }
     *     
     */
    public void setRandomFloat(RandomFloatType value) {
        this.randomFloat = value;
    }

    /**
     * 获取stringMatch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StringMatchType }
     *     
     */
    public StringMatchType getStringMatch() {
        return stringMatch;
    }

    /**
     * 设置stringMatch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StringMatchType }
     *     
     */
    public void setStringMatch(StringMatchType value) {
        this.stringMatch = value;
    }

    /**
     * 获取variable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VariableType }
     *     
     */
    public VariableType getVariable() {
        return variable;
    }

    /**
     * 设置variable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VariableType }
     *     
     */
    public void setVariable(VariableType value) {
        this.variable = value;
    }

    /**
     * 获取integerModulus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IntegerModulusType }
     *     
     */
    public IntegerModulusType getIntegerModulus() {
        return integerModulus;
    }

    /**
     * 设置integerModulus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerModulusType }
     *     
     */
    public void setIntegerModulus(IntegerModulusType value) {
        this.integerModulus = value;
    }

    /**
     * 获取subtract属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SubtractType }
     *     
     */
    public SubtractType getSubtract() {
        return subtract;
    }

    /**
     * 设置subtract属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SubtractType }
     *     
     */
    public void setSubtract(SubtractType value) {
        this.subtract = value;
    }

    /**
     * 获取durationGTE属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DurationGTEType }
     *     
     */
    public DurationGTEType getDurationGTE() {
        return durationGTE;
    }

    /**
     * 设置durationGTE属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DurationGTEType }
     *     
     */
    public void setDurationGTE(DurationGTEType value) {
        this.durationGTE = value;
    }

    /**
     * 获取outcomeMaximum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OutcomeMaximumType }
     *     
     */
    public OutcomeMaximumType getOutcomeMaximum() {
        return outcomeMaximum;
    }

    /**
     * 设置outcomeMaximum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OutcomeMaximumType }
     *     
     */
    public void setOutcomeMaximum(OutcomeMaximumType value) {
        this.outcomeMaximum = value;
    }

    /**
     * 获取anyN属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AnyNType }
     *     
     */
    public AnyNType getAnyN() {
        return anyN;
    }

    /**
     * 设置anyN属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AnyNType }
     *     
     */
    public void setAnyN(AnyNType value) {
        this.anyN = value;
    }

    /**
     * 获取round属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RoundType }
     *     
     */
    public RoundType getRound() {
        return round;
    }

    /**
     * 设置round属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RoundType }
     *     
     */
    public void setRound(RoundType value) {
        this.round = value;
    }

    /**
     * 获取numberResponded属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NumberRespondedType }
     *     
     */
    public NumberRespondedType getNumberResponded() {
        return numberResponded;
    }

    /**
     * 设置numberResponded属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NumberRespondedType }
     *     
     */
    public void setNumberResponded(NumberRespondedType value) {
        this.numberResponded = value;
    }

    /**
     * 获取baseValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BaseValueType }
     *     
     */
    public BaseValueType getBaseValue() {
        return baseValue;
    }

    /**
     * 设置baseValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BaseValueType }
     *     
     */
    public void setBaseValue(BaseValueType value) {
        this.baseValue = value;
    }

    /**
     * 获取default属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DefaultType }
     *     
     */
    public DefaultType getDefault() {
        return _default;
    }

    /**
     * 设置default属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultType }
     *     
     */
    public void setDefault(DefaultType value) {
        this._default = value;
    }

    /**
     * 获取inside属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InsideType }
     *     
     */
    public InsideType getInside() {
        return inside;
    }

    /**
     * 设置inside属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InsideType }
     *     
     */
    public void setInside(InsideType value) {
        this.inside = value;
    }

    /**
     * 获取containerSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ContainerSizeType }
     *     
     */
    public ContainerSizeType getContainerSize() {
        return containerSize;
    }

    /**
     * 设置containerSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ContainerSizeType }
     *     
     */
    public void setContainerSize(ContainerSizeType value) {
        this.containerSize = value;
    }

    /**
     * 获取equal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EqualType }
     *     
     */
    public EqualType getEqual() {
        return equal;
    }

    /**
     * 设置equal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EqualType }
     *     
     */
    public void setEqual(EqualType value) {
        this.equal = value;
    }

    /**
     * 获取outcomeMinimum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OutcomeMinimumType }
     *     
     */
    public OutcomeMinimumType getOutcomeMinimum() {
        return outcomeMinimum;
    }

    /**
     * 设置outcomeMinimum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OutcomeMinimumType }
     *     
     */
    public void setOutcomeMinimum(OutcomeMinimumType value) {
        this.outcomeMinimum = value;
    }

    /**
     * 获取or属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OrType }
     *     
     */
    public OrType getOr() {
        return or;
    }

    /**
     * 设置or属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OrType }
     *     
     */
    public void setOr(OrType value) {
        this.or = value;
    }

    /**
     * 获取randomInteger属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RandomIntegerType }
     *     
     */
    public RandomIntegerType getRandomInteger() {
        return randomInteger;
    }

    /**
     * 设置randomInteger属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RandomIntegerType }
     *     
     */
    public void setRandomInteger(RandomIntegerType value) {
        this.randomInteger = value;
    }

    /**
     * 获取isNull属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IsNullType }
     *     
     */
    public IsNullType getIsNull() {
        return isNull;
    }

    /**
     * 设置isNull属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IsNullType }
     *     
     */
    public void setIsNull(IsNullType value) {
        this.isNull = value;
    }

    /**
     * 获取numberCorrect属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NumberCorrectType }
     *     
     */
    public NumberCorrectType getNumberCorrect() {
        return numberCorrect;
    }

    /**
     * 设置numberCorrect属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NumberCorrectType }
     *     
     */
    public void setNumberCorrect(NumberCorrectType value) {
        this.numberCorrect = value;
    }

    /**
     * 获取match属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MatchType }
     *     
     */
    public MatchType getMatch() {
        return match;
    }

    /**
     * 设置match属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MatchType }
     *     
     */
    public void setMatch(MatchType value) {
        this.match = value;
    }

    /**
     * 获取lte属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LteType }
     *     
     */
    public LteType getLte() {
        return lte;
    }

    /**
     * 设置lte属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LteType }
     *     
     */
    public void setLte(LteType value) {
        this.lte = value;
    }

    /**
     * 获取sum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SumType }
     *     
     */
    public SumType getSum() {
        return sum;
    }

    /**
     * 设置sum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SumType }
     *     
     */
    public void setSum(SumType value) {
        this.sum = value;
    }

    /**
     * 获取truncate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TruncateType }
     *     
     */
    public TruncateType getTruncate() {
        return truncate;
    }

    /**
     * 设置truncate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TruncateType }
     *     
     */
    public void setTruncate(TruncateType value) {
        this.truncate = value;
    }

    /**
     * 获取fieldValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FieldValueType }
     *     
     */
    public FieldValueType getFieldValue() {
        return fieldValue;
    }

    /**
     * 设置fieldValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FieldValueType }
     *     
     */
    public void setFieldValue(FieldValueType value) {
        this.fieldValue = value;
    }

    /**
     * 获取delete属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DeleteType }
     *     
     */
    public DeleteType getDelete() {
        return delete;
    }

    /**
     * 设置delete属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteType }
     *     
     */
    public void setDelete(DeleteType value) {
        this.delete = value;
    }

}
