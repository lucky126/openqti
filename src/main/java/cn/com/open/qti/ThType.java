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
 * <p>th.Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="th.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.open.com.cn/schemas/exam/openqti_v1}th.ContentGroup"/>
 *       &lt;attGroup ref="{http://www.open.com.cn/schemas/exam/openqti_v1}th.AttrGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "th.Type", propOrder = {
    "content"
})
public class ThType {

    @XmlElementRefs({
        @XmlElementRef(name = "div", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sup", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "hottextInteraction", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ol", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "inlineChoiceInteraction", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "extendedTextInteraction", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ul", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "hotspotInteraction", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "b", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "selectPointInteraction", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "a", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "choiceInteraction", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "em", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "graphicOrderInteraction", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "pre", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "templateBlock", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "drawingInteraction", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "printedVariable", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "dl", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "dfn", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "code", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "address", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "h1", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "gapMatchInteraction", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "object", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cite", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "textEntryInteraction", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "associateInteraction", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "p", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "acronym", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "i", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "h3", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "rubricBlock", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "include", namespace = "http://www.w3.org/2001/XInclude", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "templateInline", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "orderInteraction", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sub", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "h4", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tt", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "feedbackInline", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "var", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "customInteraction", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "h5", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "abbr", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "matchInteraction", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "br", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "endAttemptInteraction", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "h2", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "graphicGapMatchInteraction", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "strong", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "uploadInteraction", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "blockquote", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "span", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "samp", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sliderInteraction", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "img", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "h6", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mediaInteraction", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "graphicAssociateInteraction", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "q", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "big", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "kbd", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "hottext", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "small", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "feedbackBlock", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "hr", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "table", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "headers")
    protected List<String> headers;
    @XmlAttribute(name = "scope")
    protected TableCellScopeType scope;
    @XmlAttribute(name = "abbr")
    protected String abbr;
    @XmlAttribute(name = "axis")
    protected String axis;
    @XmlAttribute(name = "rowspan")
    protected Integer rowspan;
    @XmlAttribute(name = "colspan")
    protected Integer colspan;
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
     * {@link JAXBElement }{@code <}{@link DivType }{@code >}
     * {@link JAXBElement }{@code <}{@link SupType }{@code >}
     * {@link JAXBElement }{@code <}{@link HottextInteractionType }{@code >}
     * {@link JAXBElement }{@code <}{@link OlType }{@code >}
     * {@link JAXBElement }{@code <}{@link InlineChoiceInteractionType }{@code >}
     * {@link JAXBElement }{@code <}{@link ExtendedTextInteractionType }{@code >}
     * {@link JAXBElement }{@code <}{@link UlType }{@code >}
     * {@link JAXBElement }{@code <}{@link HotspotInteractionType }{@code >}
     * {@link JAXBElement }{@code <}{@link BType }{@code >}
     * {@link JAXBElement }{@code <}{@link SelectPointInteractionType }{@code >}
     * {@link JAXBElement }{@code <}{@link AType }{@code >}
     * {@link JAXBElement }{@code <}{@link ChoiceInteractionType }{@code >}
     * {@link JAXBElement }{@code <}{@link EmType }{@code >}
     * {@link JAXBElement }{@code <}{@link GraphicOrderInteractionType }{@code >}
     * {@link JAXBElement }{@code <}{@link PreType }{@code >}
     * {@link JAXBElement }{@code <}{@link TemplateBlockType }{@code >}
     * {@link JAXBElement }{@code <}{@link DrawingInteractionType }{@code >}
     * {@link JAXBElement }{@code <}{@link PrintedVariableType }{@code >}
     * {@link JAXBElement }{@code <}{@link DlType }{@code >}
     * {@link JAXBElement }{@code <}{@link DfnType }{@code >}
     * {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     * {@link JAXBElement }{@code <}{@link AddressType }{@code >}
     * {@link JAXBElement }{@code <}{@link H1Type }{@code >}
     * {@link JAXBElement }{@code <}{@link GapMatchInteractionType }{@code >}
     * {@link JAXBElement }{@code <}{@link ObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link CiteType }{@code >}
     * {@link JAXBElement }{@code <}{@link TextEntryInteractionType }{@code >}
     * {@link JAXBElement }{@code <}{@link AssociateInteractionType }{@code >}
     * {@link JAXBElement }{@code <}{@link PType }{@code >}
     * {@link JAXBElement }{@code <}{@link AcronymType }{@code >}
     * {@link JAXBElement }{@code <}{@link IType }{@code >}
     * {@link JAXBElement }{@code <}{@link H3Type }{@code >}
     * {@link JAXBElement }{@code <}{@link RubricBlockType }{@code >}
     * {@link JAXBElement }{@code <}{@link IncludeType }{@code >}
     * {@link JAXBElement }{@code <}{@link TemplateInlineType }{@code >}
     * {@link JAXBElement }{@code <}{@link OrderInteractionType }{@code >}
     * {@link JAXBElement }{@code <}{@link SubType }{@code >}
     * {@link JAXBElement }{@code <}{@link H4Type }{@code >}
     * {@link JAXBElement }{@code <}{@link TtType }{@code >}
     * {@link JAXBElement }{@code <}{@link FeedbackInlineType }{@code >}
     * {@link JAXBElement }{@code <}{@link VarType }{@code >}
     * {@link JAXBElement }{@code <}{@link CustomInteractionType }{@code >}
     * {@link JAXBElement }{@code <}{@link H5Type }{@code >}
     * {@link JAXBElement }{@code <}{@link AbbrType }{@code >}
     * {@link JAXBElement }{@code <}{@link MatchInteractionType }{@code >}
     * {@link JAXBElement }{@code <}{@link BrType }{@code >}
     * {@link JAXBElement }{@code <}{@link EndAttemptInteractionType }{@code >}
     * {@link JAXBElement }{@code <}{@link H2Type }{@code >}
     * {@link JAXBElement }{@code <}{@link GraphicGapMatchInteractionType }{@code >}
     * {@link JAXBElement }{@code <}{@link StrongType }{@code >}
     * {@link JAXBElement }{@code <}{@link UploadInteractionType }{@code >}
     * {@link JAXBElement }{@code <}{@link BlockquoteType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpanType }{@code >}
     * {@link JAXBElement }{@code <}{@link SampType }{@code >}
     * {@link JAXBElement }{@code <}{@link SliderInteractionType }{@code >}
     * {@link JAXBElement }{@code <}{@link ImgType }{@code >}
     * {@link JAXBElement }{@code <}{@link H6Type }{@code >}
     * {@link JAXBElement }{@code <}{@link MediaInteractionType }{@code >}
     * {@link JAXBElement }{@code <}{@link GraphicAssociateInteractionType }{@code >}
     * {@link JAXBElement }{@code <}{@link QType }{@code >}
     * {@link JAXBElement }{@code <}{@link BigType }{@code >}
     * {@link JAXBElement }{@code <}{@link KbdType }{@code >}
     * {@link String }
     * {@link JAXBElement }{@code <}{@link HottextType }{@code >}
     * {@link JAXBElement }{@code <}{@link SmallType }{@code >}
     * {@link JAXBElement }{@code <}{@link FeedbackBlockType }{@code >}
     * {@link JAXBElement }{@code <}{@link HrType }{@code >}
     * {@link JAXBElement }{@code <}{@link TableType }{@code >}
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
     * Gets the value of the headers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the headers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeaders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getHeaders() {
        if (headers == null) {
            headers = new ArrayList<String>();
        }
        return this.headers;
    }

    /**
     * 获取scope属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TableCellScopeType }
     *     
     */
    public TableCellScopeType getScope() {
        return scope;
    }

    /**
     * 设置scope属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TableCellScopeType }
     *     
     */
    public void setScope(TableCellScopeType value) {
        this.scope = value;
    }

    /**
     * 获取abbr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbbr() {
        return abbr;
    }

    /**
     * 设置abbr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbbr(String value) {
        this.abbr = value;
    }

    /**
     * 获取axis属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAxis() {
        return axis;
    }

    /**
     * 设置axis属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAxis(String value) {
        this.axis = value;
    }

    /**
     * 获取rowspan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRowspan() {
        return rowspan;
    }

    /**
     * 设置rowspan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRowspan(Integer value) {
        this.rowspan = value;
    }

    /**
     * 获取colspan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getColspan() {
        return colspan;
    }

    /**
     * 设置colspan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setColspan(Integer value) {
        this.colspan = value;
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

}
