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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>qtiMetadata.Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="qtiMetadata.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.open.com.cn/schemas/exam/openqti_v1}qtiMetadata.ContentGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "qtiMetadata.Type", propOrder = {
    "itemTemplate",
    "timeDependent",
    "composite",
    "interactionType",
    "feedbackType",
    "solutionAvailable",
    "toolName",
    "toolVersion",
    "toolVendor"
})
public class QtiMetadataType {

    protected Boolean itemTemplate;
    protected Boolean timeDependent;
    protected Boolean composite;
    @XmlSchemaType(name = "NMTOKEN")
    protected List<InteractionTypeType> interactionType;
    @XmlSchemaType(name = "NMTOKEN")
    protected FeedbackTypeType feedbackType;
    protected Boolean solutionAvailable;
    protected String toolName;
    protected String toolVersion;
    protected String toolVendor;

    /**
     * 获取itemTemplate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isItemTemplate() {
        return itemTemplate;
    }

    /**
     * 设置itemTemplate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setItemTemplate(Boolean value) {
        this.itemTemplate = value;
    }

    /**
     * 获取timeDependent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimeDependent() {
        return timeDependent;
    }

    /**
     * 设置timeDependent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimeDependent(Boolean value) {
        this.timeDependent = value;
    }

    /**
     * 获取composite属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComposite() {
        return composite;
    }

    /**
     * 设置composite属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComposite(Boolean value) {
        this.composite = value;
    }

    /**
     * Gets the value of the interactionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interactionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInteractionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InteractionTypeType }
     * 
     * 
     */
    public List<InteractionTypeType> getInteractionType() {
        if (interactionType == null) {
            interactionType = new ArrayList<InteractionTypeType>();
        }
        return this.interactionType;
    }

    /**
     * 获取feedbackType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FeedbackTypeType }
     *     
     */
    public FeedbackTypeType getFeedbackType() {
        return feedbackType;
    }

    /**
     * 设置feedbackType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FeedbackTypeType }
     *     
     */
    public void setFeedbackType(FeedbackTypeType value) {
        this.feedbackType = value;
    }

    /**
     * 获取solutionAvailable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSolutionAvailable() {
        return solutionAvailable;
    }

    /**
     * 设置solutionAvailable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSolutionAvailable(Boolean value) {
        this.solutionAvailable = value;
    }

    /**
     * 获取toolName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToolName() {
        return toolName;
    }

    /**
     * 设置toolName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToolName(String value) {
        this.toolName = value;
    }

    /**
     * 获取toolVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToolVersion() {
        return toolVersion;
    }

    /**
     * 设置toolVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToolVersion(String value) {
        this.toolVersion = value;
    }

    /**
     * 获取toolVendor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToolVendor() {
        return toolVendor;
    }

    /**
     * 设置toolVendor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToolVendor(String value) {
        this.toolVendor = value;
    }

}
