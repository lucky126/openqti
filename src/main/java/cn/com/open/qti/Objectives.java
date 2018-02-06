//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.06.15 时间 10:58:25 AM CST 
//


package cn.com.open.qti;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;


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
 *           &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}media"/>
 *           &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}contentref"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}ext_objectives" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="view" default="All">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="All"/>
 *             &lt;enumeration value="Administrator"/>
 *             &lt;enumeration value="AdminAuthority"/>
 *             &lt;enumeration value="Assessor"/>
 *             &lt;enumeration value="Author"/>
 *             &lt;enumeration value="Candidate"/>
 *             &lt;enumeration value="InvigilatorProctor"/>
 *             &lt;enumeration value="Psychometrician"/>
 *             &lt;enumeration value="Scorer"/>
 *             &lt;enumeration value="Tutor"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
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
    "mediaOrContentref",
    "extObjectives"
})
@XmlRootElement(name = "objectives", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
public class Objectives {

    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Comment comment;
    @XmlElementRefs({
        //@XmlElementRef(name = "media", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = Media.class, required = false),
        @XmlElementRef(name = "contentref", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = JAXBElement.class, required = false)
    })
    protected List<Object> mediaOrContentref;
    @XmlElement(name = "ext_objectives", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Object extObjectives;
    @XmlAttribute(name = "view")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String view;

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
     * Gets the value of the mediaOrContentref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediaOrContentref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediaOrContentref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Media }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<Object> getMediaOrContentref() {
        if (mediaOrContentref == null) {
            mediaOrContentref = new ArrayList<Object>();
        }
        return this.mediaOrContentref;
    }

    /**
     * 获取extObjectives属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExtObjectives() {
        return extObjectives;
    }

    /**
     * 设置extObjectives属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExtObjectives(Object value) {
        this.extObjectives = value;
    }

    /**
     * 获取view属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getView() {
        if (view == null) {
            return "All";
        } else {
            return view;
        }
    }

    /**
     * 设置view属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setView(String value) {
        this.view = value;
    }

}
