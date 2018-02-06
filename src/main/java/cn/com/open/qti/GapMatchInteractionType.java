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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>gapMatchInteraction.Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="gapMatchInteraction.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.open.com.cn/schemas/exam/openqti_v1}gapMatchInteraction.ContentGroup"/>
 *       &lt;attGroup ref="{http://www.open.com.cn/schemas/exam/openqti_v1}gapMatchInteraction.AttrGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gapMatchInteraction.Type", propOrder = {
    "prompt",
    "gapChoiceElementGroup",
    "blockStaticElementGroup"
})
public class GapMatchInteractionType {

    protected PromptType prompt;
    @XmlElements({
        @XmlElement(name = "gapText", type = GapTextType.class),
        @XmlElement(name = "gapImg", type = GapImgType.class)
    })
    protected List<Object> gapChoiceElementGroup;
    @XmlElements({
        @XmlElement(name = "pre", type = PreType.class),
        @XmlElement(name = "h2", type = H2Type.class),
        @XmlElement(name = "h3", type = H3Type.class),
        @XmlElement(name = "h1", type = H1Type.class),
        @XmlElement(name = "h6", type = H6Type.class),
        @XmlElement(name = "h4", type = H4Type.class),
        @XmlElement(name = "h5", type = H5Type.class),
        @XmlElement(name = "p", type = PType.class),
        @XmlElement(name = "address", type = AddressType.class),
        @XmlElement(name = "dl", type = DlType.class),
        @XmlElement(name = "ol", type = OlType.class),
        @XmlElement(name = "hr", type = HrType.class),
        @XmlElement(name = "rubricBlock", type = RubricBlockType.class),
        @XmlElement(name = "blockquote", type = BlockquoteType.class),
        @XmlElement(name = "feedbackBlock", type = FeedbackBlockType.class),
        @XmlElement(name = "ul", type = UlType.class),
        @XmlElement(name = "templateBlock", type = TemplateBlockType.class),
        @XmlElement(name = "table", type = TableType.class),
        @XmlElement(name = "div", type = DivType.class),
        @XmlElement(name = "include", namespace = "http://www.w3.org/2001/XInclude", type = IncludeType.class)
    })
    protected List<Object> blockStaticElementGroup;
    @XmlAttribute(name = "shuffle", required = true)
    protected boolean shuffle;
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
     * Gets the value of the gapChoiceElementGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gapChoiceElementGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGapChoiceElementGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GapTextType }
     * {@link GapImgType }
     * 
     * 
     */
    public List<Object> getGapChoiceElementGroup() {
        if (gapChoiceElementGroup == null) {
            gapChoiceElementGroup = new ArrayList<Object>();
        }
        return this.gapChoiceElementGroup;
    }

    /**
     * Gets the value of the blockStaticElementGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the blockStaticElementGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlockStaticElementGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreType }
     * {@link H2Type }
     * {@link H3Type }
     * {@link H1Type }
     * {@link H6Type }
     * {@link H4Type }
     * {@link H5Type }
     * {@link PType }
     * {@link AddressType }
     * {@link DlType }
     * {@link OlType }
     * {@link HrType }
     * {@link RubricBlockType }
     * {@link BlockquoteType }
     * {@link FeedbackBlockType }
     * {@link UlType }
     * {@link TemplateBlockType }
     * {@link TableType }
     * {@link DivType }
     * {@link IncludeType }
     * 
     * 
     */
    public List<Object> getBlockStaticElementGroup() {
        if (blockStaticElementGroup == null) {
            blockStaticElementGroup = new ArrayList<Object>();
        }
        return this.blockStaticElementGroup;
    }

    /**
     * 获取shuffle属性的值。
     * 
     */
    public boolean isShuffle() {
        return shuffle;
    }

    /**
     * 设置shuffle属性的值。
     * 
     */
    public void setShuffle(boolean value) {
        this.shuffle = value;
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

}
