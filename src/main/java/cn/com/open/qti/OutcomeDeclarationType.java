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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>outcomeDeclaration.Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="outcomeDeclaration.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.open.com.cn/schemas/exam/openqti_v1}outcomeDeclaration.ContentGroup"/>
 *       &lt;attGroup ref="{http://www.open.com.cn/schemas/exam/openqti_v1}outcomeDeclaration.AttrGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outcomeDeclaration.Type", propOrder = {
    "defaultValue",
    "matchTable",
    "interpolationTable"
})
public class OutcomeDeclarationType {

    protected DefaultValueType defaultValue;
    protected MatchTableType matchTable;
    protected InterpolationTableType interpolationTable;
    @XmlAttribute(name = "view")
    protected List<ViewType> view;
    @XmlAttribute(name = "interpretation")
    protected String interpretation;
    @XmlAttribute(name = "longInterpretation")
    protected String longInterpretation;
    @XmlAttribute(name = "normalMaximum")
    protected Double normalMaximum;
    @XmlAttribute(name = "normalMinimum")
    protected Double normalMinimum;
    @XmlAttribute(name = "masteryValue")
    protected Double masteryValue;
    @XmlAttribute(name = "identifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String identifier;
    @XmlAttribute(name = "cardinality", required = true)
    protected CardinalityType cardinality;
    @XmlAttribute(name = "baseType")
    protected BaseTypeType baseType;

    /**
     * 获取defaultValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DefaultValueType }
     *     
     */
    public DefaultValueType getDefaultValue() {
        return defaultValue;
    }

    /**
     * 设置defaultValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultValueType }
     *     
     */
    public void setDefaultValue(DefaultValueType value) {
        this.defaultValue = value;
    }

    /**
     * 获取matchTable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MatchTableType }
     *     
     */
    public MatchTableType getMatchTable() {
        return matchTable;
    }

    /**
     * 设置matchTable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MatchTableType }
     *     
     */
    public void setMatchTable(MatchTableType value) {
        this.matchTable = value;
    }

    /**
     * 获取interpolationTable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InterpolationTableType }
     *     
     */
    public InterpolationTableType getInterpolationTable() {
        return interpolationTable;
    }

    /**
     * 设置interpolationTable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InterpolationTableType }
     *     
     */
    public void setInterpolationTable(InterpolationTableType value) {
        this.interpolationTable = value;
    }

    /**
     * Gets the value of the view property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the view property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getView().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ViewType }
     * 
     * 
     */
    public List<ViewType> getView() {
        if (view == null) {
            view = new ArrayList<ViewType>();
        }
        return this.view;
    }

    /**
     * 获取interpretation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterpretation() {
        return interpretation;
    }

    /**
     * 设置interpretation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterpretation(String value) {
        this.interpretation = value;
    }

    /**
     * 获取longInterpretation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongInterpretation() {
        return longInterpretation;
    }

    /**
     * 设置longInterpretation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongInterpretation(String value) {
        this.longInterpretation = value;
    }

    /**
     * 获取normalMaximum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNormalMaximum() {
        return normalMaximum;
    }

    /**
     * 设置normalMaximum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNormalMaximum(Double value) {
        this.normalMaximum = value;
    }

    /**
     * 获取normalMinimum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNormalMinimum() {
        return normalMinimum;
    }

    /**
     * 设置normalMinimum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNormalMinimum(Double value) {
        this.normalMinimum = value;
    }

    /**
     * 获取masteryValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMasteryValue() {
        return masteryValue;
    }

    /**
     * 设置masteryValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMasteryValue(Double value) {
        this.masteryValue = value;
    }

    /**
     * 获取identifier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * 设置identifier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * 获取cardinality属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CardinalityType }
     *     
     */
    public CardinalityType getCardinality() {
        return cardinality;
    }

    /**
     * 设置cardinality属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CardinalityType }
     *     
     */
    public void setCardinality(CardinalityType value) {
        this.cardinality = value;
    }

    /**
     * 获取baseType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BaseTypeType }
     *     
     */
    public BaseTypeType getBaseType() {
        return baseType;
    }

    /**
     * 设置baseType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BaseTypeType }
     *     
     */
    public void setBaseType(BaseTypeType value) {
        this.baseType = value;
    }

}
