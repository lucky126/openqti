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
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}contentype" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}language"/>
 *           &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}eligibility"/>
 *           &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}preference"/>
 *           &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}disability"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}ext_accessibility" minOccurs="0"/>
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
    "contentype",
    "languageOrEligibilityOrPreference",
    "extAccessibility"
})
@XmlRootElement(name = "accessibility", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
public class Accessibility {

    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Comment comment;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Contentype contentype;
    @XmlElements({
        @XmlElement(name = "language", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = Language.class),
        @XmlElement(name = "eligibility", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = Eligibility.class),
        @XmlElement(name = "preference", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = Preference.class),
        @XmlElement(name = "disability", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = Disability.class)
    })
    protected List<Object> languageOrEligibilityOrPreference;
    @XmlElement(name = "ext_accessibility", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Object extAccessibility;

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
     * Gets the value of the languageOrEligibilityOrPreference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the languageOrEligibilityOrPreference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguageOrEligibilityOrPreference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Language }
     * {@link Eligibility }
     * {@link Preference }
     * {@link Disability }
     * 
     * 
     */
    public List<Object> getLanguageOrEligibilityOrPreference() {
        if (languageOrEligibilityOrPreference == null) {
            languageOrEligibilityOrPreference = new ArrayList<>();
        }
        return this.languageOrEligibilityOrPreference;
    }

    /**
     * 获取extAccessibility属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExtAccessibility() {
        return extAccessibility;
    }

    /**
     * 设置extAccessibility属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExtAccessibility(Object value) {
        this.extAccessibility = value;
    }

}
