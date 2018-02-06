//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.06.15 时间 10:58:25 AM CST 
//


package cn.com.open.qti;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>contains.Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="contains.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.open.com.cn/schemas/exam/openqti_v1}contains.ContentGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contains.Type", propOrder = {
    "expressionElementGroup"
})
public class ContainsType {

    @XmlElements({
        @XmlElement(name = "and", type = AndType.class),
        @XmlElement(name = "gt", type = GtType.class),
        @XmlElement(name = "ordered", type = OrderedType.class),
        @XmlElement(name = "divide", type = DivideType.class),
        @XmlElement(name = "customOperator", type = CustomOperatorType.class),
        @XmlElement(name = "random", type = RandomType.class),
        @XmlElement(name = "numberIncorrect", type = NumberIncorrectType.class),
        @XmlElement(name = "substring", type = SubstringType.class),
        @XmlElement(name = "not", type = NotType.class),
        @XmlElement(name = "equalRounded", type = EqualRoundedType.class),
        @XmlElement(name = "multiple", type = MultipleType.class),
        @XmlElement(name = "integerToFloat", type = IntegerToFloatType.class),
        @XmlElement(name = "null", type = NullType.class),
        @XmlElement(name = "index", type = IndexType.class),
        @XmlElement(name = "testVariables", type = TestVariablesType.class),
        @XmlElement(name = "integerDivide", type = IntegerDivideType.class),
        @XmlElement(name = "gte", type = GteType.class),
        @XmlElement(name = "durationLT", type = DurationLTType.class),
        @XmlElement(name = "contains", type = ContainsType.class),
        @XmlElement(name = "member", type = MemberType.class),
        @XmlElement(name = "lt", type = LtType.class),
        @XmlElement(name = "correct", type = CorrectType.class),
        @XmlElement(name = "numberSelected", type = NumberSelectedType.class),
        @XmlElement(name = "patternMatch", type = PatternMatchType.class),
        @XmlElement(name = "product", type = ProductType.class),
        @XmlElement(name = "numberPresented", type = NumberPresentedType.class),
        @XmlElement(name = "power", type = PowerType.class),
        @XmlElement(name = "mapResponsePoint", type = MapResponsePointType.class),
        @XmlElement(name = "mapResponse", type = MapResponseType.class),
        @XmlElement(name = "randomFloat", type = RandomFloatType.class),
        @XmlElement(name = "stringMatch", type = StringMatchType.class),
        @XmlElement(name = "variable", type = VariableType.class),
        @XmlElement(name = "integerModulus", type = IntegerModulusType.class),
        @XmlElement(name = "subtract", type = SubtractType.class),
        @XmlElement(name = "durationGTE", type = DurationGTEType.class),
        @XmlElement(name = "outcomeMaximum", type = OutcomeMaximumType.class),
        @XmlElement(name = "anyN", type = AnyNType.class),
        @XmlElement(name = "round", type = RoundType.class),
        @XmlElement(name = "numberResponded", type = NumberRespondedType.class),
        @XmlElement(name = "baseValue", type = BaseValueType.class),
        @XmlElement(name = "default", type = DefaultType.class),
        @XmlElement(name = "inside", type = InsideType.class),
        @XmlElement(name = "containerSize", type = ContainerSizeType.class),
        @XmlElement(name = "equal", type = EqualType.class),
        @XmlElement(name = "outcomeMinimum", type = OutcomeMinimumType.class),
        @XmlElement(name = "or", type = OrType.class),
        @XmlElement(name = "randomInteger", type = RandomIntegerType.class),
        @XmlElement(name = "isNull", type = IsNullType.class),
        @XmlElement(name = "numberCorrect", type = NumberCorrectType.class),
        @XmlElement(name = "match", type = MatchType.class),
        @XmlElement(name = "lte", type = LteType.class),
        @XmlElement(name = "sum", type = SumType.class),
        @XmlElement(name = "truncate", type = TruncateType.class),
        @XmlElement(name = "fieldValue", type = FieldValueType.class),
        @XmlElement(name = "delete", type = DeleteType.class)
    })
    protected List<Object> expressionElementGroup;

    /**
     * Gets the value of the expressionElementGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expressionElementGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpressionElementGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AndType }
     * {@link GtType }
     * {@link OrderedType }
     * {@link DivideType }
     * {@link CustomOperatorType }
     * {@link RandomType }
     * {@link NumberIncorrectType }
     * {@link SubstringType }
     * {@link NotType }
     * {@link EqualRoundedType }
     * {@link MultipleType }
     * {@link IntegerToFloatType }
     * {@link NullType }
     * {@link IndexType }
     * {@link TestVariablesType }
     * {@link IntegerDivideType }
     * {@link GteType }
     * {@link DurationLTType }
     * {@link ContainsType }
     * {@link MemberType }
     * {@link LtType }
     * {@link CorrectType }
     * {@link NumberSelectedType }
     * {@link PatternMatchType }
     * {@link ProductType }
     * {@link NumberPresentedType }
     * {@link PowerType }
     * {@link MapResponsePointType }
     * {@link MapResponseType }
     * {@link RandomFloatType }
     * {@link StringMatchType }
     * {@link VariableType }
     * {@link IntegerModulusType }
     * {@link SubtractType }
     * {@link DurationGTEType }
     * {@link OutcomeMaximumType }
     * {@link AnyNType }
     * {@link RoundType }
     * {@link NumberRespondedType }
     * {@link BaseValueType }
     * {@link DefaultType }
     * {@link InsideType }
     * {@link ContainerSizeType }
     * {@link EqualType }
     * {@link OutcomeMinimumType }
     * {@link OrType }
     * {@link RandomIntegerType }
     * {@link IsNullType }
     * {@link NumberCorrectType }
     * {@link MatchType }
     * {@link LteType }
     * {@link SumType }
     * {@link TruncateType }
     * {@link FieldValueType }
     * {@link DeleteType }
     * 
     * 
     */
    public List<Object> getExpressionElementGroup() {
        if (expressionElementGroup == null) {
            expressionElementGroup = new ArrayList<Object>();
        }
        return this.expressionElementGroup;
    }

}
