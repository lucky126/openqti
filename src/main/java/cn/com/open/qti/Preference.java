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
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}prefcode" minOccurs="0"/>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}description" minOccurs="0"/>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}ext_preference" minOccurs="0"/>
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
    "prefcode",
    "description",
    "extPreference"
})
@XmlRootElement(name = "preference", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
public class Preference {

    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Typename typename;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Comment comment;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Contentype contentype;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Prefcode prefcode;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Description description;
    @XmlElement(name = "ext_preference", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Object extPreference;

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
     * 获取prefcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Prefcode }
     *     
     */
    public Prefcode getPrefcode() {
        return prefcode;
    }

    /**
     * 设置prefcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Prefcode }
     *     
     */
    public void setPrefcode(Prefcode value) {
        this.prefcode = value;
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
     * 获取extPreference属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExtPreference() {
        return extPreference;
    }

    /**
     * 设置extPreference属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExtPreference(Object value) {
        this.extPreference = value;
    }

}
