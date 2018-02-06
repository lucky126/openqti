//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.06.15 时间 10:58:25 AM CST 
//


package cn.com.open.qti;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>responseVariable.Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="responseVariable.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.open.com.cn/schemas/exam/openqti_v1}responseVariable.ContentGroup"/>
 *       &lt;attGroup ref="{http://www.open.com.cn/schemas/exam/openqti_v1}responseVariable.AttrGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseVariable.Type", propOrder = {
    "correctResponse",
    "candidateResponse"
})
public class ResponseVariableType implements Serializable {

    protected CorrectResponseType correctResponse;
    @XmlElement(required = true)
    protected CandidateResponseType candidateResponse;
    @XmlAttribute(name = "choiceSequence")
    protected List<String> choiceSequence;
    @XmlAttribute(name = "identifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String identifier;
    @XmlAttribute(name = "cardinality", required = true)
    protected CardinalityType cardinality;
    @XmlAttribute(name = "baseType")
    protected BaseTypeType baseType;

    /**
     * 获取correctResponse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CorrectResponseType }
     *     
     */
    public CorrectResponseType getCorrectResponse() {
        return correctResponse;
    }

    /**
     * 设置correctResponse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectResponseType }
     *     
     */
    public void setCorrectResponse(CorrectResponseType value) {
        this.correctResponse = value;
    }

    /**
     * 获取candidateResponse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CandidateResponseType }
     *     
     */
    public CandidateResponseType getCandidateResponse() {
        return candidateResponse;
    }

    /**
     * 设置candidateResponse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CandidateResponseType }
     *     
     */
    public void setCandidateResponse(CandidateResponseType value) {
        this.candidateResponse = value;
    }

    /**
     * Gets the value of the choiceSequence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the choiceSequence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChoiceSequence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getChoiceSequence() {
        if (choiceSequence == null) {
            choiceSequence = new ArrayList<String>();
        }
        return this.choiceSequence;
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
