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
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>contentProfile.Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="contentProfile.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.open.com.cn/schemas/exam/openqti_v1}contentProfile.ContentGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contentProfile.Type", propOrder = {
    "composite",
    "adaptive",
    "timeDependent",
    "templates",
    "textElements",
    "listElements",
    "objectElements",
    "objectType",
    "presentationElements",
    "tableElements",
    "imageElement",
    "imageType",
    "hypertextElement",
    "mathElement",
    "mathVariable",
    "feedbackIntegrated",
    "feedbackModal",
    "rubric",
    "printedVariables",
    "interactionType",
    "responseRules",
    "rpTemplate",
    "rounding",
    "regexp",
    "metadataProfile",
    "any"
})
public class ContentProfileType {

    protected boolean composite;
    protected boolean adaptive;
    protected boolean timeDependent;
    protected boolean templates;
    protected boolean textElements;
    protected boolean listElements;
    protected boolean objectElements;
    protected List<String> objectType;
    protected boolean presentationElements;
    protected boolean tableElements;
    protected boolean imageElement;
    protected List<String> imageType;
    protected boolean hypertextElement;
    protected boolean mathElement;
    protected boolean mathVariable;
    protected boolean feedbackIntegrated;
    protected boolean feedbackModal;
    protected boolean rubric;
    protected boolean printedVariables;
    @XmlSchemaType(name = "NMTOKEN")
    protected List<InteractionTypeType> interactionType;
    protected boolean responseRules;
    @XmlSchemaType(name = "anyURI")
    protected List<String> rpTemplate;
    protected boolean rounding;
    protected boolean regexp;
    @XmlElement(required = true)
    protected MetadataProfileType metadataProfile;
    @XmlAnyElement
    protected List<Element> any;

    /**
     * 获取composite属性的值。
     * 
     */
    public boolean isComposite() {
        return composite;
    }

    /**
     * 设置composite属性的值。
     * 
     */
    public void setComposite(boolean value) {
        this.composite = value;
    }

    /**
     * 获取adaptive属性的值。
     * 
     */
    public boolean isAdaptive() {
        return adaptive;
    }

    /**
     * 设置adaptive属性的值。
     * 
     */
    public void setAdaptive(boolean value) {
        this.adaptive = value;
    }

    /**
     * 获取timeDependent属性的值。
     * 
     */
    public boolean isTimeDependent() {
        return timeDependent;
    }

    /**
     * 设置timeDependent属性的值。
     * 
     */
    public void setTimeDependent(boolean value) {
        this.timeDependent = value;
    }

    /**
     * 获取templates属性的值。
     * 
     */
    public boolean isTemplates() {
        return templates;
    }

    /**
     * 设置templates属性的值。
     * 
     */
    public void setTemplates(boolean value) {
        this.templates = value;
    }

    /**
     * 获取textElements属性的值。
     * 
     */
    public boolean isTextElements() {
        return textElements;
    }

    /**
     * 设置textElements属性的值。
     * 
     */
    public void setTextElements(boolean value) {
        this.textElements = value;
    }

    /**
     * 获取listElements属性的值。
     * 
     */
    public boolean isListElements() {
        return listElements;
    }

    /**
     * 设置listElements属性的值。
     * 
     */
    public void setListElements(boolean value) {
        this.listElements = value;
    }

    /**
     * 获取objectElements属性的值。
     * 
     */
    public boolean isObjectElements() {
        return objectElements;
    }

    /**
     * 设置objectElements属性的值。
     * 
     */
    public void setObjectElements(boolean value) {
        this.objectElements = value;
    }

    /**
     * Gets the value of the objectType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getObjectType() {
        if (objectType == null) {
            objectType = new ArrayList<String>();
        }
        return this.objectType;
    }

    /**
     * 获取presentationElements属性的值。
     * 
     */
    public boolean isPresentationElements() {
        return presentationElements;
    }

    /**
     * 设置presentationElements属性的值。
     * 
     */
    public void setPresentationElements(boolean value) {
        this.presentationElements = value;
    }

    /**
     * 获取tableElements属性的值。
     * 
     */
    public boolean isTableElements() {
        return tableElements;
    }

    /**
     * 设置tableElements属性的值。
     * 
     */
    public void setTableElements(boolean value) {
        this.tableElements = value;
    }

    /**
     * 获取imageElement属性的值。
     * 
     */
    public boolean isImageElement() {
        return imageElement;
    }

    /**
     * 设置imageElement属性的值。
     * 
     */
    public void setImageElement(boolean value) {
        this.imageElement = value;
    }

    /**
     * Gets the value of the imageType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imageType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImageType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getImageType() {
        if (imageType == null) {
            imageType = new ArrayList<String>();
        }
        return this.imageType;
    }

    /**
     * 获取hypertextElement属性的值。
     * 
     */
    public boolean isHypertextElement() {
        return hypertextElement;
    }

    /**
     * 设置hypertextElement属性的值。
     * 
     */
    public void setHypertextElement(boolean value) {
        this.hypertextElement = value;
    }

    /**
     * 获取mathElement属性的值。
     * 
     */
    public boolean isMathElement() {
        return mathElement;
    }

    /**
     * 设置mathElement属性的值。
     * 
     */
    public void setMathElement(boolean value) {
        this.mathElement = value;
    }

    /**
     * 获取mathVariable属性的值。
     * 
     */
    public boolean isMathVariable() {
        return mathVariable;
    }

    /**
     * 设置mathVariable属性的值。
     * 
     */
    public void setMathVariable(boolean value) {
        this.mathVariable = value;
    }

    /**
     * 获取feedbackIntegrated属性的值。
     * 
     */
    public boolean isFeedbackIntegrated() {
        return feedbackIntegrated;
    }

    /**
     * 设置feedbackIntegrated属性的值。
     * 
     */
    public void setFeedbackIntegrated(boolean value) {
        this.feedbackIntegrated = value;
    }

    /**
     * 获取feedbackModal属性的值。
     * 
     */
    public boolean isFeedbackModal() {
        return feedbackModal;
    }

    /**
     * 设置feedbackModal属性的值。
     * 
     */
    public void setFeedbackModal(boolean value) {
        this.feedbackModal = value;
    }

    /**
     * 获取rubric属性的值。
     * 
     */
    public boolean isRubric() {
        return rubric;
    }

    /**
     * 设置rubric属性的值。
     * 
     */
    public void setRubric(boolean value) {
        this.rubric = value;
    }

    /**
     * 获取printedVariables属性的值。
     * 
     */
    public boolean isPrintedVariables() {
        return printedVariables;
    }

    /**
     * 设置printedVariables属性的值。
     * 
     */
    public void setPrintedVariables(boolean value) {
        this.printedVariables = value;
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
     * 获取responseRules属性的值。
     * 
     */
    public boolean isResponseRules() {
        return responseRules;
    }

    /**
     * 设置responseRules属性的值。
     * 
     */
    public void setResponseRules(boolean value) {
        this.responseRules = value;
    }

    /**
     * Gets the value of the rpTemplate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rpTemplate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRpTemplate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRpTemplate() {
        if (rpTemplate == null) {
            rpTemplate = new ArrayList<String>();
        }
        return this.rpTemplate;
    }

    /**
     * 获取rounding属性的值。
     * 
     */
    public boolean isRounding() {
        return rounding;
    }

    /**
     * 设置rounding属性的值。
     * 
     */
    public void setRounding(boolean value) {
        this.rounding = value;
    }

    /**
     * 获取regexp属性的值。
     * 
     */
    public boolean isRegexp() {
        return regexp;
    }

    /**
     * 设置regexp属性的值。
     * 
     */
    public void setRegexp(boolean value) {
        this.regexp = value;
    }

    /**
     * 获取metadataProfile属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MetadataProfileType }
     *     
     */
    public MetadataProfileType getMetadataProfile() {
        return metadataProfile;
    }

    /**
     * 设置metadataProfile属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataProfileType }
     *     
     */
    public void setMetadataProfile(MetadataProfileType value) {
        this.metadataProfile = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * 
     * 
     */
    public List<Element> getAny() {
        if (any == null) {
            any = new ArrayList<Element>();
        }
        return this.any;
    }

}
