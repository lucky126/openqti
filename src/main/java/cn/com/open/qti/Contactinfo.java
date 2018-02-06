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
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}typename" minOccurs="0"/>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}comment" minOccurs="0"/>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}contentype" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}telephone"/>
 *           &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}facsimile"/>
 *           &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}mobile"/>
 *           &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}pager"/>
 *           &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}email"/>
 *           &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}web"/>
 *         &lt;/choice>
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
    "typename",
    "comment",
    "contentype",
    "telephone",
    "facsimile",
    "mobile",
    "pager",
    "email",
    "web"
})
@XmlRootElement(name = "contactinfo", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
public class Contactinfo {

    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Typename typename;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Comment comment;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Contentype contentype;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Telephone telephone;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Facsimile facsimile;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Mobile mobile;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Pager pager;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected String email;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected String web;

    /**
     * 获取typename属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Typename }
     *     
     */
    public Typename getTypename() {
        return typename;
    }

    /**
     * 设置typename属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Typename }
     *     
     */
    public void setTypename(Typename value) {
        this.typename = value;
    }

    /**
     * 获取comment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Comment }
     *     
     */
    public Comment getComment() {
        return comment;
    }

    /**
     * 设置comment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Comment }
     *     
     */
    public void setComment(Comment value) {
        this.comment = value;
    }

    /**
     * 获取contentype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Contentype }
     *     
     */
    public Contentype getContentype() {
        return contentype;
    }

    /**
     * 设置contentype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Contentype }
     *     
     */
    public void setContentype(Contentype value) {
        this.contentype = value;
    }

    /**
     * 获取telephone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Telephone }
     *     
     */
    public Telephone getTelephone() {
        return telephone;
    }

    /**
     * 设置telephone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Telephone }
     *     
     */
    public void setTelephone(Telephone value) {
        this.telephone = value;
    }

    /**
     * 获取facsimile属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Facsimile }
     *     
     */
    public Facsimile getFacsimile() {
        return facsimile;
    }

    /**
     * 设置facsimile属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Facsimile }
     *     
     */
    public void setFacsimile(Facsimile value) {
        this.facsimile = value;
    }

    /**
     * 获取mobile属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Mobile }
     *     
     */
    public Mobile getMobile() {
        return mobile;
    }

    /**
     * 设置mobile属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Mobile }
     *     
     */
    public void setMobile(Mobile value) {
        this.mobile = value;
    }

    /**
     * 获取pager属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Pager }
     *     
     */
    public Pager getPager() {
        return pager;
    }

    /**
     * 设置pager属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Pager }
     *     
     */
    public void setPager(Pager value) {
        this.pager = value;
    }

    /**
     * 获取email属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置email属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * 获取web属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeb() {
        return web;
    }

    /**
     * 设置web属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeb(String value) {
        this.web = value;
    }

}
