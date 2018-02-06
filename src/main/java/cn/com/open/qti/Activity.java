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
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}typename" minOccurs="0"/>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}comment" minOccurs="0"/>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}contentype" minOccurs="0"/>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}date" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}status" minOccurs="0"/>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}units" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}learningactivityref"/>
 *           &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}definition"/>
 *           &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}product"/>
 *           &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}testimonial"/>
 *           &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}evaluation"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}description" minOccurs="0"/>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}activity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}ext_activity" minOccurs="0"/>
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
    "date",
    "status",
    "units",
    "learningactivityrefOrDefinitionOrProduct",
    "description",
    "activity",
    "extActivity"
})
@XmlRootElement(name = "activity", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
public class Activity {

    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Typename typename;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Comment comment;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Contentype contentype;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected List<Date> date;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Status status;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Units units;
    @XmlElements({
        @XmlElement(name = "learningactivityref", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = Learningactivityref.class),
        @XmlElement(name = "definition", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = Definition.class),
        @XmlElement(name = "product", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = Product.class),
        @XmlElement(name = "testimonial", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = Testimonial.class),
        @XmlElement(name = "evaluation", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = Evaluation.class)
    })
    protected List<Object> learningactivityrefOrDefinitionOrProduct;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Description description;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected List<Activity> activity;
    @XmlElement(name = "ext_activity", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Object extActivity;

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
            date = new ArrayList<>();
        }
        return this.date;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * 获取units属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Units }
     *     
     */
    public Units getUnits() {
        return units;
    }

    /**
     * 设置units属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Units }
     *     
     */
    public void setUnits(Units value) {
        this.units = value;
    }

    /**
     * Gets the value of the learningactivityrefOrDefinitionOrProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the learningactivityrefOrDefinitionOrProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLearningactivityrefOrDefinitionOrProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Learningactivityref }
     * {@link Definition }
     * {@link Product }
     * {@link Testimonial }
     * {@link Evaluation }
     * 
     * 
     */
    public List<Object> getLearningactivityrefOrDefinitionOrProduct() {
        if (learningactivityrefOrDefinitionOrProduct == null) {
            learningactivityrefOrDefinitionOrProduct = new ArrayList<>();
        }
        return this.learningactivityrefOrDefinitionOrProduct;
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
     * Gets the value of the activity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Activity }
     * 
     * 
     */
    public List<Activity> getActivity() {
        if (activity == null) {
            activity = new ArrayList<>();
        }
        return this.activity;
    }

    /**
     * 获取extActivity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExtActivity() {
        return extActivity;
    }

    /**
     * 设置extActivity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExtActivity(Object value) {
        this.extActivity = value;
    }

}
