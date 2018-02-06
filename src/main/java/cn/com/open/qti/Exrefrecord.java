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
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}comment" minOccurs="0"/>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}recformat"/>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}recdata"/>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}date" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}description" minOccurs="0"/>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}ext_exrefrecord" minOccurs="0"/>
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
    "comment",
    "recformat",
    "recdata",
    "date",
    "description",
    "extExrefrecord"
})
@XmlRootElement(name = "exrefrecord", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
public class Exrefrecord {

    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Comment comment;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", required = true)
    protected Recformat recformat;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", required = true)
    protected Recdata recdata;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected List<Date> date;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Description description;
    @XmlElement(name = "ext_exrefrecord", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Object extExrefrecord;

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
     * 获取recformat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Recformat }
     *     
     */
    public Recformat getRecformat() {
        return recformat;
    }

    /**
     * 设置recformat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Recformat }
     *     
     */
    public void setRecformat(Recformat value) {
        this.recformat = value;
    }

    /**
     * 获取recdata属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Recdata }
     *     
     */
    public Recdata getRecdata() {
        return recdata;
    }

    /**
     * 设置recdata属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Recdata }
     *     
     */
    public void setRecdata(Recdata value) {
        this.recdata = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the date property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Date }
     * 
     * 
     */
    public List<Date> getDate() {
        if (date == null) {
            date = new ArrayList<Date>();
        }
        return this.date;
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
     * 获取extExrefrecord属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExtExrefrecord() {
        return extExrefrecord;
    }

    /**
     * 设置extExrefrecord属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExtExrefrecord(Object value) {
        this.extExrefrecord = value;
    }

}
