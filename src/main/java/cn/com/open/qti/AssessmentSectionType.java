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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>assessmentSection.Type complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="assessmentSection.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.open.com.cn/schemas/exam/openqti_v1}assessmentSection.ContentGroup"/>
 *       &lt;attGroup ref="{http://www.open.com.cn/schemas/exam/openqti_v1}assessmentSection.AttrGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assessmentSection.Type", propOrder = {
    "rubricBlock",
    "endBlock",
    "preCondition",
    "branchRule",
    "itemSessionControl",
    "timeLimits",
    "selection",
    "ordering",
    "sectionPartElementGroup"
})
public class AssessmentSectionType {

    protected List<PreConditionType> preCondition;
    protected List<BranchRuleType> branchRule;
    protected ItemSessionControlType itemSessionControl;
    protected TimeLimitsType timeLimits;
    protected SelectionType selection;
    protected OrderingType ordering;
    protected List<RubricBlockType> rubricBlock;
    @XmlElements({
        @XmlElement(name = "include", namespace = "http://www.w3.org/2001/XInclude", type = IncludeType.class),
        @XmlElement(name = "assessmentItemRef", type = AssessmentItemRefType.class),
        @XmlElement(name = "assessmentSection", type = AssessmentSectionType.class)
    })
    protected List<Object> sectionPartElementGroup;
    @XmlAttribute(name = "title", required = true)
    protected String title;
    @XmlAttribute(name = "visible", required = true)
    protected boolean visible;
    @XmlAttribute(name = "keepTogether")
    protected Boolean keepTogether;
    @XmlAttribute(name = "identifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String identifier;
    @XmlAttribute(name = "required")
    protected Boolean required;
    @XmlAttribute(name = "fixed")
    protected Boolean fixed;
    @XmlAttribute(name = "score")
    protected double score;
    @XmlAttribute(name = "itemCount")
    protected int itemCount;
    @XmlAttribute(name = "optionalItemCount")
    protected int optionalItemCount;
    @XmlAttribute(name = "optionalItemScore")
    protected double optionalItemScore;
    @XmlAttribute(name = "mediaType")
    protected int mediaType;
    protected EndBlock endBlock;

    /**
     * Gets the value of the preCondition property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preCondition property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreCondition().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreConditionType }
     *
     *
     */
    public List<PreConditionType> getPreCondition() {
        if (preCondition == null) {
            preCondition = new ArrayList<PreConditionType>();
        }
        return this.preCondition;
    }

    /**
     * Gets the value of the branchRule property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the branchRule property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBranchRule().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BranchRuleType }
     *
     *
     */
    public List<BranchRuleType> getBranchRule() {
        if (branchRule == null) {
            branchRule = new ArrayList<BranchRuleType>();
        }
        return this.branchRule;
    }

    /**
     * 获取itemSessionControl属性的值。
     *
     * @return
     *     possible object is
     *     {@link ItemSessionControlType }
     *
     */
    public ItemSessionControlType getItemSessionControl() {
        return itemSessionControl;
    }

    /**
     * 设置itemSessionControl属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ItemSessionControlType }
     *

     */
    public void setItemSessionControl(ItemSessionControlType value) {
        this.itemSessionControl = value;
    }

    /**
     * 获取timeLimits属性的值。
     *
     * @return
     *     possible object is
     *     {@link TimeLimitsType }
     *
     */
    public TimeLimitsType getTimeLimits() {
        return timeLimits;
    }

    /**
     * 设置timeLimits属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link TimeLimitsType }
     *
     */
    public void setTimeLimits(TimeLimitsType value) {
        this.timeLimits = value;
    }

    /**
     * 获取selection属性的值。
     *
     * @return
     *     possible object is
     *     {@link SelectionType }
     *
     */
    public SelectionType getSelection() {
        return selection;
    }

    /**
     * 设置selection属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link SelectionType }
     *
     */
    public void setSelection(SelectionType value) {
        this.selection = value;
    }

    /**
     * 获取ordering属性的值。
     *
     * @return
     *     possible object is
     *     {@link OrderingType }
     *
     */
    public OrderingType getOrdering() {
        return ordering;
    }

    /**
     * 设置ordering属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link OrderingType }
     *
     */
    public void setOrdering(OrderingType value) {
        this.ordering = value;
    }

    /**
     * Gets the value of the rubricBlock property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rubricBlock property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRubricBlock().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RubricBlockType }
     *
     *
     */
    public List<RubricBlockType> getRubricBlock() {
        if (rubricBlock == null) {
            rubricBlock = new ArrayList<RubricBlockType>();
        }
        return this.rubricBlock;
    }

    /**
     * Gets the value of the sectionPartElementGroup property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sectionPartElementGroup property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSectionPartElementGroup().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IncludeType }
     * {@link AssessmentItemRefType }
     * {@link AssessmentSectionType }
     *
     *
     */
    public List<Object> getSectionPartElementGroup() {
        if (sectionPartElementGroup == null) {
            sectionPartElementGroup = new ArrayList<Object>();
        }
        return this.sectionPartElementGroup;
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
     * 获取visible属性的值。
     *
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     * 设置visible属性的值。
     *
     */
    public void setVisible(boolean value) {
        this.visible = value;
    }

    /**
     * 获取keepTogether属性的值。
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isKeepTogether() {
        return keepTogether;
    }

    /**
     * 设置keepTogether属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setKeepTogether(Boolean value) {
        this.keepTogether = value;
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
     * 获取required属性的值。
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isRequired() {
        return required;
    }

    /**
     * 设置required属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setRequired(Boolean value) {
        this.required = value;
    }

    /**
     * 获取fixed属性的值。
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isFixed() {
        return fixed;
    }

    /**
     * 设置fixed属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setFixed(Boolean value) {
        this.fixed = value;
    }
    /**
     * 获取score属性的值。
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public double getScore() {
        return score;
    }
    /**
     * 设置score属性的值。
     *s
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setScore(double value) {
        this.score = value;
    }
    /**
     * 获取itemCount属性的值。
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public int getItemCount() {
        return itemCount;
    }
    /**
     * 设置itemCount属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setItemCount(int value) {
        this.itemCount = value;
    }
    /**
     * 获取optionalItemCount属性的值。
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public int getOptionalItemCount() {
        return optionalItemCount;
    }
    /**
     * 设置optionalItemCount属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setOptionalItemCount(int value) {
        this.optionalItemCount = value;
    }
    /**
     * 获取optionalItemScore属性的值。
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public double getOptionalItemScore() {
        return optionalItemScore;
    }
    /**
     * 设置optionalItemScore属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setOptionalItemScore(double value) {
        this.optionalItemScore = value;
    }
    /**
     * 获取mediaType属性的值。
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public int getMediaType() {
        return mediaType;
    }
    /**
     * 设置mediaType属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setMediaType(int value) {
        this.mediaType = value;
    }
    /**
     * 获取endBlock属性的值。
     *
     * @return
     *     possible object is
     *     {@link EndBlock }
     *
     */
    public EndBlock getEndBlock() {
        return endBlock;
    }
    /**
     * 设置endBlock属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link EndBlock }
     *
     */
    public void setEndBlock(EndBlock value) {
        this.endBlock = value;
    }

}
