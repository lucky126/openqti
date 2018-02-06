//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.06.15 时间 10:58:25 AM CST 
//


package cn.com.open.qti;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}short"/>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}long" minOccurs="0"/>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}full" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "_short",
    "_long",
    "full"
})
@XmlRootElement(name = "description", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
public class Description {

    @XmlElement(name = "short", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", required = true)
    protected Short _short;
    @XmlElement(name = "long", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Long _long;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Full full;

    /**
     * 获取short属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getShort() {
        return _short;
    }

    /**
     * 设置short属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setShort(Short value) {
        this._short = value;
    }

    /**
     * 获取long属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLong() {
        return _long;
    }

    /**
     * 设置long属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLong(Long value) {
        this._long = value;
    }

    /**
     * 获取full属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Full }
     *     
     */
    public Full getFull() {
        return full;
    }

    /**
     * 设置full属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Full }
     *     
     */
    public void setFull(Full value) {
        this.full = value;
    }

}
