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
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}tysource" minOccurs="0"/>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}tyvalue"/>
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
    "tysource",
    "tyvalue"
})
@XmlRootElement(name = "typename", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
public class Typename {

    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Tysource tysource;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", required = true)
    protected Tyvalue tyvalue;

    /**
     * 获取tysource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Tysource }
     *     
     */
    public Tysource getTysource() {
        return tysource;
    }

    /**
     * 设置tysource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Tysource }
     *     
     */
    public void setTysource(Tysource value) {
        this.tysource = value;
    }

    /**
     * 获取tyvalue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Tyvalue }
     *     
     */
    public Tyvalue getTyvalue() {
        return tyvalue;
    }

    /**
     * 设置tyvalue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Tyvalue }
     *     
     */
    public void setTyvalue(Tyvalue value) {
        this.tyvalue = value;
    }

}
