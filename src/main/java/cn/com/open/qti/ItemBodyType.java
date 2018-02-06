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
 * <p>itemBody.Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="itemBody.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.open.com.cn/schemas/exam/openqti_v1}itemBody.ContentGroup"/>
 *       &lt;attGroup ref="{http://www.open.com.cn/schemas/exam/openqti_v1}itemBody.AttrGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemBody.Type", propOrder = {
    "blockElementGroup"
})
public class ItemBodyType {

    @XmlElements({
        @XmlElement(name = "positionObjectStage", type = PositionObjectStageType.class),
        @XmlElement(name = "customInteraction", type = CustomInteractionType.class),
        @XmlElement(name = "drawingInteraction", type = DrawingInteractionType.class),
        @XmlElement(name = "gapMatchInteraction", type = GapMatchInteractionType.class),
        @XmlElement(name = "matchInteraction", type = MatchInteractionType.class),
        @XmlElement(name = "graphicGapMatchInteraction", type = GraphicGapMatchInteractionType.class),
        @XmlElement(name = "hotspotInteraction", type = HotspotInteractionType.class),
        @XmlElement(name = "graphicOrderInteraction", type = GraphicOrderInteractionType.class),
        @XmlElement(name = "selectPointInteraction", type = SelectPointInteractionType.class),
        @XmlElement(name = "graphicAssociateInteraction", type = GraphicAssociateInteractionType.class),
        @XmlElement(name = "sliderInteraction", type = SliderInteractionType.class),
        @XmlElement(name = "choiceInteraction", type = ChoiceInteractionType.class),
        @XmlElement(name = "mediaInteraction", type = MediaInteractionType.class),
        @XmlElement(name = "hottextInteraction", type = HottextInteractionType.class),
        @XmlElement(name = "orderInteraction", type = OrderInteractionType.class),
        @XmlElement(name = "extendedTextInteraction", type = ExtendedTextInteractionType.class),
        @XmlElement(name = "uploadInteraction", type = UploadInteractionType.class),
        @XmlElement(name = "associateInteraction", type = AssociateInteractionType.class),
        @XmlElement(name = "compositeInteraction", type = CompositeInteractionType.class),
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
    protected List<Object> blockElementGroup;
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
     * Gets the value of the blockElementGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the blockElementGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlockElementGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionObjectStageType }
     * {@link CustomInteractionType }
     * {@link DrawingInteractionType }
     * {@link GapMatchInteractionType }
     * {@link MatchInteractionType }
     * {@link GraphicGapMatchInteractionType }
     * {@link HotspotInteractionType }
     * {@link GraphicOrderInteractionType }
     * {@link SelectPointInteractionType }
     * {@link GraphicAssociateInteractionType }
     * {@link SliderInteractionType }
     * {@link ChoiceInteractionType }
     * {@link MediaInteractionType }
     * {@link HottextInteractionType }
     * {@link OrderInteractionType }
     * {@link ExtendedTextInteractionType }
     * {@link UploadInteractionType }
     * {@link AssociateInteractionType }
     * {@link CompositeInteractionType }
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
    public List<Object> getBlockElementGroup() {
        if (blockElementGroup == null) {
            blockElementGroup = new ArrayList<Object>();
        }
        return this.blockElementGroup;
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
