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
 * <p>assessmentResult.Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="assessmentResult.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.open.com.cn/schemas/exam/openqti_v1}assessmentResult.ContentGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assessmentResult", propOrder = {
    "context",
    "testResult",
    "itemResult"
})
public class AssessmentResult {

    @XmlElement(required = true)
    protected ContextType context;
    protected TestResultType testResult;
    protected List<ItemResultType> itemResult;

    /**
     * 获取context属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ContextType }
     *     
     */
    public ContextType getContext() {
        return context;
    }

    /**
     * 设置context属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ContextType }
     *     
     */
    public void setContext(ContextType value) {
        this.context = value;
    }

    /**
     * 获取testResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TestResultType }
     *     
     */
    public TestResultType getTestResult() {
        return testResult;
    }

    /**
     * 设置testResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TestResultType }
     *     
     */
    public void setTestResult(TestResultType value) {
        this.testResult = value;
    }

    /**
     * Gets the value of the itemResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemResultType }
     * 
     * 
     */
    public List<ItemResultType> getItemResult() {
        if (itemResult == null) {
            itemResult = new ArrayList<>();
        }
        return this.itemResult;
    }

}
