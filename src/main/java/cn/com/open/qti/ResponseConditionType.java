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
 * <p>responseCondition.Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="responseCondition.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.open.com.cn/schemas/exam/openqti_v1}responseCondition.ContentGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseCondition.Type", propOrder = {
    "responseIf",
    "responseElseIf",
    "responseElse"
})
public class ResponseConditionType {

    @XmlElement(required = true)
    protected ResponseIfType responseIf;
    protected List<ResponseElseIfType> responseElseIf;
    protected ResponseElseType responseElse;

    /**
     * 获取responseIf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResponseIfType }
     *     
     */
    public ResponseIfType getResponseIf() {
        return responseIf;
    }

    /**
     * 设置responseIf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseIfType }
     *     
     */
    public void setResponseIf(ResponseIfType value) {
        this.responseIf = value;
    }

    /**
     * Gets the value of the responseElseIf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseElseIf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseElseIf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseElseIfType }
     * 
     * 
     */
    public List<ResponseElseIfType> getResponseElseIf() {
        if (responseElseIf == null) {
            responseElseIf = new ArrayList<ResponseElseIfType>();
        }
        return this.responseElseIf;
    }

    /**
     * 获取responseElse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResponseElseType }
     *     
     */
    public ResponseElseType getResponseElse() {
        return responseElse;
    }

    /**
     * 设置responseElse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseElseType }
     *     
     */
    public void setResponseElse(ResponseElseType value) {
        this.responseElse = value;
    }

}
