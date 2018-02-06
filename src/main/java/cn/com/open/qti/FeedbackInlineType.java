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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>feedbackInline.Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="feedbackInline.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.open.com.cn/schemas/exam/openqti_v1}feedbackInline.ContentGroup"/>
 *       &lt;attGroup ref="{http://www.open.com.cn/schemas/exam/openqti_v1}feedbackInline.AttrGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "feedbackInline.Type", propOrder = {
    "content"
})
public class FeedbackInlineType {

    @XmlElementRefs({
        @XmlElementRef(name = "acronym", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sup", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "i", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "gap", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "include", namespace = "http://www.w3.org/2001/XInclude", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "inlineChoiceInteraction", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "templateInline", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sub", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tt", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "feedbackInline", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "var", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "abbr", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "b", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "a", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "endAttemptInteraction", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "br", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "em", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "strong", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "span", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "samp", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "img", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "printedVariable", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "q", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "dfn", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "code", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "big", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "kbd", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "hottext", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "small", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "object", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cite", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "textEntryInteraction", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "outcomeIdentifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String outcomeIdentifier;
    @XmlAttribute(name = "showHide", required = true)
    protected ShowHideType showHide;
    @XmlAttribute(name = "identifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String identifier;
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
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link AcronymType }{@code >}
     * {@link JAXBElement }{@code <}{@link SupType }{@code >}
     * {@link JAXBElement }{@code <}{@link IType }{@code >}
     * {@link JAXBElement }{@code <}{@link GapType }{@code >}
     * {@link JAXBElement }{@code <}{@link IncludeType }{@code >}
     * {@link JAXBElement }{@code <}{@link InlineChoiceInteractionType }{@code >}
     * {@link JAXBElement }{@code <}{@link TemplateInlineType }{@code >}
     * {@link JAXBElement }{@code <}{@link SubType }{@code >}
     * {@link JAXBElement }{@code <}{@link TtType }{@code >}
     * {@link JAXBElement }{@code <}{@link FeedbackInlineType }{@code >}
     * {@link JAXBElement }{@code <}{@link VarType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbbrType }{@code >}
     * {@link JAXBElement }{@code <}{@link BType }{@code >}
     * {@link JAXBElement }{@code <}{@link AType }{@code >}
     * {@link JAXBElement }{@code <}{@link EndAttemptInteractionType }{@code >}
     * {@link JAXBElement }{@code <}{@link BrType }{@code >}
     * {@link JAXBElement }{@code <}{@link EmType }{@code >}
     * {@link JAXBElement }{@code <}{@link StrongType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpanType }{@code >}
     * {@link JAXBElement }{@code <}{@link SampType }{@code >}
     * {@link JAXBElement }{@code <}{@link ImgType }{@code >}
     * {@link JAXBElement }{@code <}{@link PrintedVariableType }{@code >}
     * {@link JAXBElement }{@code <}{@link QType }{@code >}
     * {@link JAXBElement }{@code <}{@link DfnType }{@code >}
     * {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     * {@link JAXBElement }{@code <}{@link BigType }{@code >}
     * {@link JAXBElement }{@code <}{@link KbdType }{@code >}
     * {@link String }
     * {@link JAXBElement }{@code <}{@link HottextType }{@code >}
     * {@link JAXBElement }{@code <}{@link SmallType }{@code >}
     * {@link JAXBElement }{@code <}{@link ObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link CiteType }{@code >}
     * {@link JAXBElement }{@code <}{@link TextEntryInteractionType }{@code >}
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

    /**
     * 获取outcomeIdentifier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutcomeIdentifier() {
        return outcomeIdentifier;
    }

    /**
     * 设置outcomeIdentifier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutcomeIdentifier(String value) {
        this.outcomeIdentifier = value;
    }

    /**
     * 获取showHide属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ShowHideType }
     *     
     */
    public ShowHideType getShowHide() {
        return showHide;
    }

    /**
     * 设置showHide属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ShowHideType }
     *     
     */
    public void setShowHide(ShowHideType value) {
        this.showHide = value;
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
