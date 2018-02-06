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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>extendedTextInteraction.Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="extendedTextInteraction.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.open.com.cn/schemas/exam/openqti_v1}extendedTextInteraction.ContentGroup"/>
 *       &lt;attGroup ref="{http://www.open.com.cn/schemas/exam/openqti_v1}extendedTextInteraction.AttrGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "extendedTextInteraction.Type", propOrder = {
    "prompt"
})
public class ExtendedTextInteractionType {

    protected PromptType prompt;
    @XmlAttribute(name = "maxStrings")
    protected Integer maxStrings;
    @XmlAttribute(name = "minStrings")
    protected Integer minStrings;
    @XmlAttribute(name = "expectedLines")
    protected Integer expectedLines;
    @XmlAttribute(name = "format")
    protected TextFormatType format;
    @XmlAttribute(name = "responseIdentifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String responseIdentifier;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;
    @XmlAttribute(name = "class")
    protected List<String> clazz;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String lang;
    @XmlAttribute(name = "label")
    protected String label;
    @XmlAttribute(name = "base", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlSchemaType(name = "anyURI")
    protected String base;
    @XmlAttribute(name = "base")
    protected Integer base1;
    @XmlAttribute(name = "stringIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String stringIdentifier;
    @XmlAttribute(name = "expectedLength")
    protected Integer expectedLength;
    @XmlAttribute(name = "patternMask")
    protected String patternMask;
    @XmlAttribute(name = "placeholderText")
    protected String placeholderText;

    /**
     * 获取prompt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PromptType }
     *     
     */
    public PromptType getPrompt() {
        return prompt;
    }

    /**
     * 设置prompt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PromptType }
     *     
     */
    public void setPrompt(PromptType value) {
        this.prompt = value;
    }

    /**
     * 获取maxStrings属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxStrings() {
        return maxStrings;
    }

    /**
     * 设置maxStrings属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxStrings(Integer value) {
        this.maxStrings = value;
    }

    /**
     * 获取minStrings属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinStrings() {
        return minStrings;
    }

    /**
     * 设置minStrings属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinStrings(Integer value) {
        this.minStrings = value;
    }

    /**
     * 获取expectedLines属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExpectedLines() {
        return expectedLines;
    }

    /**
     * 设置expectedLines属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExpectedLines(Integer value) {
        this.expectedLines = value;
    }

    /**
     * 获取format属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TextFormatType }
     *     
     */
    public TextFormatType getFormat() {
        return format;
    }

    /**
     * 设置format属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TextFormatType }
     *     
     */
    public void setFormat(TextFormatType value) {
        this.format = value;
    }

    /**
     * 获取responseIdentifier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseIdentifier() {
        return responseIdentifier;
    }

    /**
     * 设置responseIdentifier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseIdentifier(String value) {
        this.responseIdentifier = value;
    }

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clazz property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClazz().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getClazz() {
        if (clazz == null) {
            clazz = new ArrayList<String>();
        }
        return this.clazz;
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
     * 获取base属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase() {
        return base;
    }

    /**
     * 设置base属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase(String value) {
        this.base = value;
    }

    /**
     * 获取base1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBase1() {
        return base1;
    }

    /**
     * 设置base1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBase1(Integer value) {
        this.base1 = value;
    }

    /**
     * 获取stringIdentifier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringIdentifier() {
        return stringIdentifier;
    }

    /**
     * 设置stringIdentifier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringIdentifier(String value) {
        this.stringIdentifier = value;
    }

    /**
     * 获取expectedLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExpectedLength() {
        return expectedLength;
    }

    /**
     * 设置expectedLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExpectedLength(Integer value) {
        this.expectedLength = value;
    }

    /**
     * 获取patternMask属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatternMask() {
        return patternMask;
    }

    /**
     * 设置patternMask属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatternMask(String value) {
        this.patternMask = value;
    }

    /**
     * 获取placeholderText属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceholderText() {
        return placeholderText;
    }

    /**
     * 设置placeholderText属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceholderText(String value) {
        this.placeholderText = value;
    }

}
