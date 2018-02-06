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
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}pobox" minOccurs="0"/>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}street" minOccurs="0"/>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}locality" minOccurs="0"/>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}city" minOccurs="0"/>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}statepr" minOccurs="0"/>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}region" minOccurs="0"/>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}country" minOccurs="0"/>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}postcode" minOccurs="0"/>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}timezone" minOccurs="0"/>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}geo" minOccurs="0"/>
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
    "pobox",
    "street",
    "locality",
    "city",
    "statepr",
    "region",
    "country",
    "postcode",
    "timezone",
    "geo"
})
@XmlRootElement(name = "address", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
public class Address {

    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Typename typename;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Comment comment;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Contentype contentype;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Pobox pobox;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Street street;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Locality locality;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected City city;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Statepr statepr;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Region region;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Country country;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Postcode postcode;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Timezone timezone;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Geo geo;

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
     * 获取pobox属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Pobox }
     *     
     */
    public Pobox getPobox() {
        return pobox;
    }

    /**
     * 设置pobox属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Pobox }
     *     
     */
    public void setPobox(Pobox value) {
        this.pobox = value;
    }

    /**
     * 获取street属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Street }
     *     
     */
    public Street getStreet() {
        return street;
    }

    /**
     * 设置street属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Street }
     *     
     */
    public void setStreet(Street value) {
        this.street = value;
    }

    /**
     * 获取locality属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Locality }
     *     
     */
    public Locality getLocality() {
        return locality;
    }

    /**
     * 设置locality属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Locality }
     *     
     */
    public void setLocality(Locality value) {
        this.locality = value;
    }

    /**
     * 获取city属性的值。
     * 
     * @return
     *     possible object is
     *     {@link City }
     *     
     */
    public City getCity() {
        return city;
    }

    /**
     * 设置city属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link City }
     *     
     */
    public void setCity(City value) {
        this.city = value;
    }

    /**
     * 获取statepr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Statepr }
     *     
     */
    public Statepr getStatepr() {
        return statepr;
    }

    /**
     * 设置statepr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Statepr }
     *     
     */
    public void setStatepr(Statepr value) {
        this.statepr = value;
    }

    /**
     * 获取region属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Region }
     *     
     */
    public Region getRegion() {
        return region;
    }

    /**
     * 设置region属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Region }
     *     
     */
    public void setRegion(Region value) {
        this.region = value;
    }

    /**
     * 获取country属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getCountry() {
        return country;
    }

    /**
     * 设置country属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setCountry(Country value) {
        this.country = value;
    }

    /**
     * 获取postcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Postcode }
     *     
     */
    public Postcode getPostcode() {
        return postcode;
    }

    /**
     * 设置postcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Postcode }
     *     
     */
    public void setPostcode(Postcode value) {
        this.postcode = value;
    }

    /**
     * 获取timezone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Timezone }
     *     
     */
    public Timezone getTimezone() {
        return timezone;
    }

    /**
     * 设置timezone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Timezone }
     *     
     */
    public void setTimezone(Timezone value) {
        this.timezone = value;
    }

    /**
     * 获取geo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Geo }
     *     
     */
    public Geo getGeo() {
        return geo;
    }

    /**
     * 设置geo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Geo }
     *     
     */
    public void setGeo(Geo value) {
        this.geo = value;
    }

}
