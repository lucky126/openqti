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
import javax.xml.bind.annotation.XmlElements;
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
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}referential"/>
 *           &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}temporal"/>
 *           &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}privacy"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}ext_contentype" minOccurs="0"/>
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
    "referentialOrTemporalOrPrivacy",
    "extContentype"
})
@XmlRootElement(name = "contentype", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
public class Contentype {

    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Comment comment;
    @XmlElements({
        @XmlElement(name = "referential", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = Referential.class),
        @XmlElement(name = "temporal", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = Temporal.class),
        @XmlElement(name = "privacy", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = Privacy.class)
    })
    protected List<Object> referentialOrTemporalOrPrivacy;
    @XmlElement(name = "ext_contentype", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Object extContentype;

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
     * Gets the value of the referentialOrTemporalOrPrivacy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referentialOrTemporalOrPrivacy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferentialOrTemporalOrPrivacy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Referential }
     * {@link Temporal }
     * {@link Privacy }
     * 
     * 
     */
    public List<Object> getReferentialOrTemporalOrPrivacy() {
        if (referentialOrTemporalOrPrivacy == null) {
            referentialOrTemporalOrPrivacy = new ArrayList<Object>();
        }
        return this.referentialOrTemporalOrPrivacy;
    }

    /**
     * 获取extContentype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExtContentype() {
        return extContentype;
    }

    /**
     * 设置extContentype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExtContentype(Object value) {
        this.extContentype = value;
    }

}
