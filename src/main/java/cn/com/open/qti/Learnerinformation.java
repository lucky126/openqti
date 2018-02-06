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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}contentype" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}identification"/>
 *           &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}goal"/>
 *           &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}qcl"/>
 *           &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}activity"/>
 *           &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}competency"/>
 *           &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}transcript"/>
 *           &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}accessibility"/>
 *           &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}interest"/>
 *           &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}affiliation"/>
 *           &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}securitykey"/>
 *           &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}relationship"/>
 *           &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}ext_learnerinfo"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.open.com.cn/schemas/exam/openqti_v1}lang.attr"/>
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
    "contentype",
    "identificationOrGoalOrQcl"
})
@XmlRootElement(name = "learnerinformation", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
public class Learnerinformation {

    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Comment comment;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Contentype contentype;
    @XmlElements({
        @XmlElement(name = "identification", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = Identification.class),
        @XmlElement(name = "goal", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = Goal.class),
        @XmlElement(name = "qcl", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = Qcl.class),
        @XmlElement(name = "activity", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = Activity.class),
        @XmlElement(name = "competency", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = Competency.class),
        @XmlElement(name = "transcript", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = Transcript.class),
        @XmlElement(name = "accessibility", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = Accessibility.class),
        @XmlElement(name = "interest", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = Interest.class),
        @XmlElement(name = "affiliation", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = Affiliation.class),
        @XmlElement(name = "securitykey", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = Securitykey.class),
        @XmlElement(name = "relationship", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = Relationship.class),
        @XmlElement(name = "ext_learnerinfo", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    })
    protected List<Object> identificationOrGoalOrQcl;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String lang;

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
     * Gets the value of the identificationOrGoalOrQcl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identificationOrGoalOrQcl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentificationOrGoalOrQcl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Identification }
     * {@link Goal }
     * {@link Qcl }
     * {@link Activity }
     * {@link Competency }
     * {@link Transcript }
     * {@link Accessibility }
     * {@link Interest }
     * {@link Affiliation }
     * {@link Securitykey }
     * {@link Relationship }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getIdentificationOrGoalOrQcl() {
        if (identificationOrGoalOrQcl == null) {
            identificationOrGoalOrQcl = new ArrayList<Object>();
        }
        return this.identificationOrGoalOrQcl;
    }

    /**
     * 获取lang属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        if (lang == null) {
            return "en";
        } else {
            return lang;
        }
    }

    /**
     * 设置lang属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

}
