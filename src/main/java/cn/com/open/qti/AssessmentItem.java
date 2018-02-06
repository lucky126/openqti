//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.06.15 时间 10:58:25 AM CST 
//


package cn.com.open.qti;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>assessmentItem.Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="assessmentItem.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.open.com.cn/schemas/exam/openqti_v1}assessmentItem.ContentGroup"/>
 *       &lt;attGroup ref="{http://www.open.com.cn/schemas/exam/openqti_v1}assessmentItem.AttrGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assessmentItem", propOrder = {
    "responseDeclaration",
    "outcomeDeclaration",
    "templateDeclaration",
    "templateProcessing",
    "stylesheet",
    "itemBody",
    "responseProcessing",
    "modalFeedback"
})
public class AssessmentItem {

    protected List<ResponseDeclarationType> responseDeclaration;
    protected List<OutcomeDeclarationType> outcomeDeclaration;
    protected List<TemplateDeclarationType> templateDeclaration;
    protected TemplateProcessingType templateProcessing;
    protected List<StylesheetType> stylesheet;
    protected ItemBodyType itemBody;
    protected ResponseProcessingType responseProcessing;
    protected List<ModalFeedbackType> modalFeedback;
    @XmlAttribute(name = "identifier", required = true)
    protected String identifier;
    @XmlAttribute(name = "title", required = true)
    protected String title;
    @XmlAttribute(name = "label")
    protected String label;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String lang;
    @XmlAttribute(name = "adaptive", required = true)
    protected boolean adaptive;
    @XmlAttribute(name = "timeDependent", required = true)
    protected boolean timeDependent;
    @XmlAttribute(name = "toolName")
    protected String toolName;
    @XmlAttribute(name = "toolVersion")
    protected String toolVersion;
    @XmlAttribute(name = "QuestionAnalysis", required = true)
    protected String questionAnalysis;

    /**
     * Gets the value of the responseDeclaration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseDeclaration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseDeclaration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseDeclarationType }
     * 
     * 
     */
    public List<ResponseDeclarationType> getResponseDeclaration() {
        if (responseDeclaration == null) {
            responseDeclaration = new ArrayList<ResponseDeclarationType>();
        }
        return this.responseDeclaration;
    }

    /**
     * Gets the value of the outcomeDeclaration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outcomeDeclaration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutcomeDeclaration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutcomeDeclarationType }
     * 
     * 
     */
    public List<OutcomeDeclarationType> getOutcomeDeclaration() {
        if (outcomeDeclaration == null) {
            outcomeDeclaration = new ArrayList<OutcomeDeclarationType>();
        }
        return this.outcomeDeclaration;
    }

    /**
     * Gets the value of the templateDeclaration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the templateDeclaration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemplateDeclaration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TemplateDeclarationType }
     * 
     * 
     */
    public List<TemplateDeclarationType> getTemplateDeclaration() {
        if (templateDeclaration == null) {
            templateDeclaration = new ArrayList<TemplateDeclarationType>();
        }
        return this.templateDeclaration;
    }

    /**
     * 获取templateProcessing属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TemplateProcessingType }
     *     
     */
    public TemplateProcessingType getTemplateProcessing() {
        return templateProcessing;
    }

    /**
     * 设置templateProcessing属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TemplateProcessingType }
     *     
     */
    public void setTemplateProcessing(TemplateProcessingType value) {
        this.templateProcessing = value;
    }

    /**
     * Gets the value of the stylesheet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stylesheet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStylesheet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StylesheetType }
     * 
     * 
     */
    public List<StylesheetType> getStylesheet() {
        if (stylesheet == null) {
            stylesheet = new ArrayList<StylesheetType>();
        }
        return this.stylesheet;
    }

    /**
     * 获取itemBody属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemBodyType }
     *     
     */
    public ItemBodyType getItemBody() {
        return itemBody;
    }

    /**
     * 设置itemBody属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemBodyType }
     *     
     */
    public void setItemBody(ItemBodyType value) {
        this.itemBody = value;
    }

    /**
     * 获取responseProcessing属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResponseProcessingType }
     *     
     */
    public ResponseProcessingType getResponseProcessing() {
        return responseProcessing;
    }

    /**
     * 设置responseProcessing属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseProcessingType }
     *     
     */
    public void setResponseProcessing(ResponseProcessingType value) {
        this.responseProcessing = value;
    }

    /**
     * Gets the value of the modalFeedback property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modalFeedback property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModalFeedback().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModalFeedbackType }
     * 
     * 
     */
    public List<ModalFeedbackType> getModalFeedback() {
        if (modalFeedback == null) {
            modalFeedback = new ArrayList<ModalFeedbackType>();
        }
        return this.modalFeedback;
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
     * 获取title属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置title属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * 获取label属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * 设置label属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * 获取lang属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * 设置lang属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
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
     * 获取questionAnalysis属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getQuestionAnalysis() {
        return questionAnalysis;
    }

    /**
     * 设置questionAnalysis属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setQuestionAnalysis(String value) {
        this.questionAnalysis = value;
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

}
