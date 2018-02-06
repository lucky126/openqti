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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>outcomeCondition.Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="outcomeCondition.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.open.com.cn/schemas/exam/openqti_v1}outcomeCondition.ContentGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outcomeCondition.Type", propOrder = {
    "outcomeIf",
    "outcomeElseIf",
    "outcomeElse"
})
public class OutcomeConditionType {

    @XmlElement(required = true)
    protected OutcomeIfType outcomeIf;
    protected List<OutcomeElseIfType> outcomeElseIf;
    protected OutcomeElseType outcomeElse;

    /**
     * 获取outcomeIf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OutcomeIfType }
     *     
     */
    public OutcomeIfType getOutcomeIf() {
        return outcomeIf;
    }

    /**
     * 设置outcomeIf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OutcomeIfType }
     *     
     */
    public void setOutcomeIf(OutcomeIfType value) {
        this.outcomeIf = value;
    }

    /**
     * Gets the value of the outcomeElseIf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outcomeElseIf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutcomeElseIf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutcomeElseIfType }
     * 
     * 
     */
    public List<OutcomeElseIfType> getOutcomeElseIf() {
        if (outcomeElseIf == null) {
            outcomeElseIf = new ArrayList<OutcomeElseIfType>();
        }
        return this.outcomeElseIf;
    }

    /**
     * 获取outcomeElse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OutcomeElseType }
     *     
     */
    public OutcomeElseType getOutcomeElse() {
        return outcomeElse;
    }

    /**
     * 设置outcomeElse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OutcomeElseType }
     *     
     */
    public void setOutcomeElse(OutcomeElseType value) {
        this.outcomeElse = value;
    }

}
