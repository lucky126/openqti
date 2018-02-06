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


/**
 * <p>itemSessionControl.Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="itemSessionControl.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://www.open.com.cn/schemas/exam/openqti_v1}itemSessionControl.AttrGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemSessionControl.Type")
public class ItemSessionControlType {

    @XmlAttribute(name = "maxAttempts")
    protected Integer maxAttempts;
    @XmlAttribute(name = "showFeedback")
    protected Boolean showFeedback;
    @XmlAttribute(name = "allowReview")
    protected Boolean allowReview;
    @XmlAttribute(name = "showSolution")
    protected Boolean showSolution;
    @XmlAttribute(name = "allowComment")
    protected Boolean allowComment;
    @XmlAttribute(name = "allowSkipping")
    protected Boolean allowSkipping;
    @XmlAttribute(name = "validateResponses")
    protected Boolean validateResponses;

    /**
     * 获取maxAttempts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxAttempts() {
        return maxAttempts;
    }

    /**
     * 设置maxAttempts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxAttempts(Integer value) {
        this.maxAttempts = value;
    }

    /**
     * 获取showFeedback属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowFeedback() {
        return showFeedback;
    }

    /**
     * 设置showFeedback属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowFeedback(Boolean value) {
        this.showFeedback = value;
    }

    /**
     * 获取allowReview属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowReview() {
        return allowReview;
    }

    /**
     * 设置allowReview属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowReview(Boolean value) {
        this.allowReview = value;
    }

    /**
     * 获取showSolution属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowSolution() {
        return showSolution;
    }

    /**
     * 设置showSolution属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowSolution(Boolean value) {
        this.showSolution = value;
    }

    /**
     * 获取allowComment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowComment() {
        return allowComment;
    }

    /**
     * 设置allowComment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowComment(Boolean value) {
        this.allowComment = value;
    }

    /**
     * 获取allowSkipping属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowSkipping() {
        return allowSkipping;
    }

    /**
     * 设置allowSkipping属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowSkipping(Boolean value) {
        this.allowSkipping = value;
    }

    /**
     * 获取validateResponses属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValidateResponses() {
        return validateResponses;
    }

    /**
     * 设置validateResponses属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidateResponses(Boolean value) {
        this.validateResponses = value;
    }

}
