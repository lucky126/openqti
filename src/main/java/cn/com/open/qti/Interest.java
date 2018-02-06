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
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}product" minOccurs="0"/>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}description" minOccurs="0"/>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}ext_interest" minOccurs="0"/>
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
    "product",
    "description",
    "extInterest"
})
@XmlRootElement(name = "interest", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
public class Interest {

    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Typename typename;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Comment comment;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Contentype contentype;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Product product;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Description description;
    @XmlElement(name = "ext_interest", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Object extInterest;

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
     * 获取product属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProduct() {
        return product;
    }

    /**
     * 设置product属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProduct(Product value) {
        this.product = value;
    }

    /**
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Description }
     *     
     */
    public Description getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Description }
     *     
     */
    public void setDescription(Description value) {
        this.description = value;
    }

    /**
     * 获取extInterest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExtInterest() {
        return extInterest;
    }

    /**
     * 设置extInterest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExtInterest(Object value) {
        this.extInterest = value;
    }

}
