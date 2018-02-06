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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>testPart.Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="testPart.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.open.com.cn/schemas/exam/openqti_v1}testPart.ContentGroup"/>
 *       &lt;attGroup ref="{http://www.open.com.cn/schemas/exam/openqti_v1}testPart.AttrGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "testPart.Type", propOrder = {
    "rubricBlock",
    "endBlock",
    "preCondition",
    "branchRule",
    "itemSessionControl",
    "timeLimits",
    "assessmentSection",
    "testFeedback"
})
public class TestPartType {

    protected List<PreConditionType> preCondition;
    protected List<BranchRuleType> branchRule;
    protected ItemSessionControlType itemSessionControl;
    protected TimeLimitsType timeLimits;
    @XmlElement(required = true)
    protected List<AssessmentSectionType> assessmentSection;
    protected List<TestFeedbackType> testFeedback;
    @XmlAttribute(name = "identifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String identifier;
    @XmlAttribute(name = "navigationMode", required = true)
    protected NavigationModeType navigationMode;
    @XmlAttribute(name = "submissionMode", required = true)
    protected SubmissionModeType submissionMode;
    protected EndBlock endBlock;
    protected List<RubricBlockType> rubricBlock;

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
     * Gets the value of the assessmentSection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assessmentSection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssessmentSection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssessmentSectionType }
     * 
     * 
     */
    public List<AssessmentSectionType> getAssessmentSection() {
        if (assessmentSection == null) {
            assessmentSection = new ArrayList<AssessmentSectionType>();
        }
        return this.assessmentSection;
    }

    /**
     * Gets the value of the testFeedback property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testFeedback property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestFeedback().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestFeedbackType }
     * 
     * 
     */
    public List<TestFeedbackType> getTestFeedback() {
        if (testFeedback == null) {
            testFeedback = new ArrayList<TestFeedbackType>();
        }
        return this.testFeedback;
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
     * 获取navigationMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NavigationModeType }
     *     
     */
    public NavigationModeType getNavigationMode() {
        return navigationMode;
    }

    /**
     * 设置navigationMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NavigationModeType }
     *     
     */
    public void setNavigationMode(NavigationModeType value) {
        this.navigationMode = value;
    }

    /**
     * 获取submissionMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SubmissionModeType }
     *     
     */
    public SubmissionModeType getSubmissionMode() {
        return submissionMode;
    }

    /**
     * 设置submissionMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SubmissionModeType }
     *     
     */
    public void setSubmissionMode(SubmissionModeType value) {
        this.submissionMode = value;
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

}
