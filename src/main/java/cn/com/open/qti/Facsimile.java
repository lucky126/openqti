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
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}countrycode" minOccurs="0"/>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}areacode"/>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}indnumber"/>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}extnumber" minOccurs="0"/>
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
    "countrycode",
    "areacode",
    "indnumber",
    "extnumber"
})
@XmlRootElement(name = "facsimile", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
public class Facsimile {

    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected String countrycode;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", required = true)
    protected String areacode;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", required = true)
    protected String indnumber;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected String extnumber;

    /**
     * 获取countrycode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountrycode() {
        return countrycode;
    }

    /**
     * 设置countrycode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountrycode(String value) {
        this.countrycode = value;
    }

    /**
     * 获取areacode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreacode() {
        return areacode;
    }

    /**
     * 设置areacode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreacode(String value) {
        this.areacode = value;
    }

    /**
     * 获取indnumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndnumber() {
        return indnumber;
    }

    /**
     * 设置indnumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndnumber(String value) {
        this.indnumber = value;
    }

    /**
     * 获取extnumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtnumber() {
        return extnumber;
    }

    /**
     * 设置extnumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtnumber(String value) {
        this.extnumber = value;
    }

}
