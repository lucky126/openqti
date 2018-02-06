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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>assessmentItemRef.Type complex type的 Java 类。
 * <p>
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;complexType name="assessmentItemRef.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.open.com.cn/schemas/exam/openqti_v1}assessmentItemRef.ContentGroup"/>
 *       &lt;attGroup ref="{http://www.open.com.cn/schemas/exam/openqti_v1}assessmentItemRef.AttrGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assessmentItemRef.Type", propOrder = {
        "preCondition",
        "branchRule",
        "itemSessionControl",
        "timeLimits",
        "variableMapping",
        "weight",
        "templateDefault",
        "media"
})
public class AssessmentItemRefType {

    protected List<PreConditionType> preCondition;
    protected List<BranchRuleType> branchRule;
    protected ItemSessionControlType itemSessionControl;
    protected TimeLimitsType timeLimits;
    protected List<VariableMappingType> variableMapping;
    protected List<WeightType> weight;
    protected List<TemplateDefaultType> templateDefault;
    @XmlAttribute(name = "href", required = true)
    protected String href;
    @XmlAttribute(name = "category")
    protected List<String> category;
    @XmlAttribute(name = "identifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String identifier;
    @XmlAttribute(name = "required")
    protected Boolean required;
    @XmlAttribute(name = "fixed")
    protected Boolean fixed;
    @XmlAttribute(name = "subjective")
    protected Boolean subjective;
    @XmlAttribute(name = "difficulty")
    protected double difficulty;
    @XmlAttribute(name = "isExample")
    protected Boolean isExample;
    @XmlAttribute(name = "prepareDuration")
    protected double prepareDuration;
    @XmlAttribute(name = "responseDuration")
    protected double responseDuration;
    @XmlAttribute(name = "promptShowDuration")
    protected double promptShowDuration;
    protected Media media;
    @XmlAttribute(name = "type")
    protected String type;

    /**
     * Gets the value of the preCondition property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preCondition property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreCondition().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreConditionType }
     */
    public List<PreConditionType> getPreCondition() {
        if (preCondition == null) {
            preCondition = new ArrayList<PreConditionType>();
        }
        return this.preCondition;
    }

    /**
     * Gets the value of the branchRule property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the branchRule property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBranchRule().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BranchRuleType }
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
     * @return possible object is
     * {@link ItemSessionControlType }
     */
    public ItemSessionControlType getItemSessionControl() {
        return itemSessionControl;
    }

    /**
     * 设置itemSessionControl属性的值。
     *
     * @param value allowed object is
     *              {@link ItemSessionControlType }
     */
    public void setItemSessionControl(ItemSessionControlType value) {
        this.itemSessionControl = value;
    }

    /**
     * 获取timeLimits属性的值。
     *
     * @return possible object is
     * {@link TimeLimitsType }
     */
    public TimeLimitsType getTimeLimits() {
        return timeLimits;
    }

    /**
     * 设置timeLimits属性的值。
     *
     * @param value allowed object is
     *              {@link TimeLimitsType }
     */
    public void setTimeLimits(TimeLimitsType value) {
        this.timeLimits = value;
    }

    /**
     * Gets the value of the variableMapping property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variableMapping property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariableMapping().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VariableMappingType }
     */
    public List<VariableMappingType> getVariableMapping() {
        if (variableMapping == null) {
            variableMapping = new ArrayList<VariableMappingType>();
        }
        return this.variableMapping;
    }

    /**
     * Gets the value of the weight property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weight property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeight().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeightType }
     */
    public List<WeightType> getWeight() {
        if (weight == null) {
            weight = new ArrayList<WeightType>();
        }
        return this.weight;
    }

    /**
     * Gets the value of the templateDefault property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the templateDefault property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemplateDefault().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TemplateDefaultType }
     */
    public List<TemplateDefaultType> getTemplateDefault() {
        if (templateDefault == null) {
            templateDefault = new ArrayList<TemplateDefaultType>();
        }
        return this.templateDefault;
    }

    /**
     * 获取href属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getHref() {
        return href;
    }

    /**
     * 设置href属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the category property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the category property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategory().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getCategory() {
        if (category == null) {
            category = new ArrayList<String>();
        }
        return this.category;
    }

    /**
     * 获取identifier属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * 设置identifier属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * 获取required属性的值。
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isRequired() {
        return required;
    }

    /**
     * 设置required属性的值。
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setRequired(Boolean value) {
        this.required = value;
    }

    /**
     * 获取fixed属性的值。
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isFixed() {
        return fixed;
    }

    /**
     * 设置fixed属性的值。
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setFixed(Boolean value) {
        this.fixed = value;
    }

    /**
     * 获取subjective属性的值。
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean getSubjective() {
        return subjective;
    }

    /**
     * 设置subjective属性的值。
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setSubjective(Boolean value) {
        this.subjective = value;
    }

    /**
     * 获取difficulty属性的值。
     *
     * @return possible object is
     * {@link Double }
     */
    public double getDifficulty() {
        return difficulty;
    }

    /**
     * 设置difficulty属性的值。
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setDifficulty(double value) {
        this.difficulty = value;
    }

    /**
     * 获取isExample属性的值。
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean getExample() {
        return isExample;
    }

    /**
     * 设置isExample属性的值。
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setExample(Boolean value) {
        this.isExample = value;
    }

    /**
     * 获取prepareDuration属性的值。
     *
     * @return possible object is
     * {@link Double }
     */
    public double getPrepareDuration() {
        return prepareDuration;
    }

    /**
     * 设置prepareDuration属性的值。
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setPrepareDuration(double value) {
        this.prepareDuration = value;
    }

    /**
     * 获取responseDuration属性的值。
     *
     * @return possible object is
     * {@link Double }
     */
    public double getResponseDuration() {
        return responseDuration;
    }

    /**
     * 设置responseDuration属性的值。
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setResponseDuration(double value) {
        this.responseDuration = value;
    }

    /**
     * 获取promptShowDuration属性的值。
     *
     * @return possible object is
     * {@link Double }
     */
    public double getPromptShowDuration() {
        return promptShowDuration;
    }

    /**
     * 设置promptShowDuration属性的值。
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setPromptShowDuration(double value) {
        this.promptShowDuration = value;
    }

    /**
     * 获取media属性的值。
     *
     * @return possible object is
     * {@link Media }
     */
    public Media getMedia() {
        return media;
    }

    /**
     * 设置media属性的值。
     *
     * @param value allowed object is
     *              {@link Media }
     */
    public void setMedia(Media value) {
        this.media = value;
    }

    /**
     * 获取type属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setType(String value) {
        this.type = value;
    }


}
