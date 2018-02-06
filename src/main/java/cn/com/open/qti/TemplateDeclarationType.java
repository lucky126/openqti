//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.06.15 时间 10:58:25 AM CST 
//


package cn.com.open.qti;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>templateDeclaration.Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="templateDeclaration.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.open.com.cn/schemas/exam/openqti_v1}templateDeclaration.ContentGroup"/>
 *       &lt;attGroup ref="{http://www.open.com.cn/schemas/exam/openqti_v1}templateDeclaration.AttrGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "templateDeclaration.Type", propOrder = {
    "defaultValue"
})
public class TemplateDeclarationType {

    protected DefaultValueType defaultValue;
    @XmlAttribute(name = "paramVariable")
    protected Boolean paramVariable;
    @XmlAttribute(name = "mathVariable")
    protected Boolean mathVariable;
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
     * 获取paramVariable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isParamVariable() {
        return paramVariable;
    }

    /**
     * 设置paramVariable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParamVariable(Boolean value) {
        this.paramVariable = value;
    }

    /**
     * 获取mathVariable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMathVariable() {
        return mathVariable;
    }

    /**
     * 设置mathVariable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMathVariable(Boolean value) {
        this.mathVariable = value;
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
