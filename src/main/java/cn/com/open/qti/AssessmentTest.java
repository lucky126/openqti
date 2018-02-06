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


/**
 * <p>assessmentTest.Type complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="assessmentTest.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.open.com.cn/schemas/exam/openqti_v1}assessmentTest.ContentGroup"/>
 *       &lt;attGroup ref="{http://www.open.com.cn/schemas/exam/openqti_v1}assessmentTest.AttrGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assessmentTest.Type", propOrder = {
    "outcomeDeclaration",
    "timeLimits",
    "testPart",
    "outcomeProcessing",
    "testFeedback"
})
public class AssessmentTest {

    protected List<OutcomeDeclarationType> outcomeDeclaration;
    protected TimeLimitsType timeLimits;
    @XmlElement(required = true)
    protected List<TestPartType> testPart;
    protected OutcomeProcessingType outcomeProcessing;
    protected List<TestFeedbackType> testFeedback;
    @XmlAttribute(name = "identifier", required = true)
    protected String identifier;
    @XmlAttribute(name = "title", required = true)
    protected String title;
    @XmlAttribute(name = "toolName")
    protected String toolName;
    @XmlAttribute(name = "toolVersion")
    protected String toolVersion;

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
     * Gets the value of the testPart property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testPart property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestPart().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestPartType }
     *
     *
     */
    public List<TestPartType> getTestPart() {
        if (testPart == null) {
            testPart = new ArrayList<TestPartType>();
        }
        return this.testPart;
    }

    /**
     * 获取outcomeProcessing属性的值。
     *
     * @return
     *     possible object is
     *     {@link OutcomeProcessingType }
     *
     */
    public OutcomeProcessingType getOutcomeProcessing() {
        return outcomeProcessing;
    }

    /**
     * 设置outcomeProcessing属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link OutcomeProcessingType }
     *
     */
    public void setOutcomeProcessing(OutcomeProcessingType value) {
        this.outcomeProcessing = value;
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
