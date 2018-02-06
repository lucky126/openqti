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
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}nonfieldedstreetaddress" minOccurs="0"/>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}complex" minOccurs="0"/>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}streetnumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}streetprefix" minOccurs="0"/>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}streetname" minOccurs="0"/>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}streetype" minOccurs="0"/>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}streetsuffix" minOccurs="0"/>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}apttype" minOccurs="0"/>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}aptnumprefix" minOccurs="0"/>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}aptnumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}aptnumsuffix" minOccurs="0"/>
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
    "nonfieldedstreetaddress",
    "complex",
    "streetnumber",
    "streetprefix",
    "streetname",
    "streetype",
    "streetsuffix",
    "apttype",
    "aptnumprefix",
    "aptnumber",
    "aptnumsuffix"
})
@XmlRootElement(name = "street", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
public class Street {

    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Nonfieldedstreetaddress nonfieldedstreetaddress;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Complex complex;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Streetnumber streetnumber;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Streetprefix streetprefix;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Streetname streetname;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Streetype streetype;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Streetsuffix streetsuffix;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Apttype apttype;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Aptnumprefix aptnumprefix;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Aptnumber aptnumber;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Aptnumsuffix aptnumsuffix;

    /**
     * 获取nonfieldedstreetaddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Nonfieldedstreetaddress }
     *     
     */
    public Nonfieldedstreetaddress getNonfieldedstreetaddress() {
        return nonfieldedstreetaddress;
    }

    /**
     * 设置nonfieldedstreetaddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Nonfieldedstreetaddress }
     *     
     */
    public void setNonfieldedstreetaddress(Nonfieldedstreetaddress value) {
        this.nonfieldedstreetaddress = value;
    }

    /**
     * 获取complex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Complex }
     *     
     */
    public Complex getComplex() {
        return complex;
    }

    /**
     * 设置complex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Complex }
     *     
     */
    public void setComplex(Complex value) {
        this.complex = value;
    }

    /**
     * 获取streetnumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Streetnumber }
     *     
     */
    public Streetnumber getStreetnumber() {
        return streetnumber;
    }

    /**
     * 设置streetnumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Streetnumber }
     *     
     */
    public void setStreetnumber(Streetnumber value) {
        this.streetnumber = value;
    }

    /**
     * 获取streetprefix属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Streetprefix }
     *     
     */
    public Streetprefix getStreetprefix() {
        return streetprefix;
    }

    /**
     * 设置streetprefix属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Streetprefix }
     *     
     */
    public void setStreetprefix(Streetprefix value) {
        this.streetprefix = value;
    }

    /**
     * 获取streetname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Streetname }
     *     
     */
    public Streetname getStreetname() {
        return streetname;
    }

    /**
     * 设置streetname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Streetname }
     *     
     */
    public void setStreetname(Streetname value) {
        this.streetname = value;
    }

    /**
     * 获取streetype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Streetype }
     *     
     */
    public Streetype getStreetype() {
        return streetype;
    }

    /**
     * 设置streetype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Streetype }
     *     
     */
    public void setStreetype(Streetype value) {
        this.streetype = value;
    }

    /**
     * 获取streetsuffix属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Streetsuffix }
     *     
     */
    public Streetsuffix getStreetsuffix() {
        return streetsuffix;
    }

    /**
     * 设置streetsuffix属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Streetsuffix }
     *     
     */
    public void setStreetsuffix(Streetsuffix value) {
        this.streetsuffix = value;
    }

    /**
     * 获取apttype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Apttype }
     *     
     */
    public Apttype getApttype() {
        return apttype;
    }

    /**
     * 设置apttype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Apttype }
     *     
     */
    public void setApttype(Apttype value) {
        this.apttype = value;
    }

    /**
     * 获取aptnumprefix属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Aptnumprefix }
     *     
     */
    public Aptnumprefix getAptnumprefix() {
        return aptnumprefix;
    }

    /**
     * 设置aptnumprefix属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Aptnumprefix }
     *     
     */
    public void setAptnumprefix(Aptnumprefix value) {
        this.aptnumprefix = value;
    }

    /**
     * 获取aptnumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Aptnumber }
     *     
     */
    public Aptnumber getAptnumber() {
        return aptnumber;
    }

    /**
     * 设置aptnumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Aptnumber }
     *     
     */
    public void setAptnumber(Aptnumber value) {
        this.aptnumber = value;
    }

    /**
     * 获取aptnumsuffix属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Aptnumsuffix }
     *     
     */
    public Aptnumsuffix getAptnumsuffix() {
        return aptnumsuffix;
    }

    /**
     * 设置aptnumsuffix属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Aptnumsuffix }
     *     
     */
    public void setAptnumsuffix(Aptnumsuffix value) {
        this.aptnumsuffix = value;
    }

}
