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
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}formname"/>
 *           &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}name"/>
 *           &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}address"/>
 *           &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}contactinfo"/>
 *           &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}demographics"/>
 *           &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}agent"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.open.com.cn/schemas/exam/openqti_v1}ext_identification" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "identification", propOrder = {
    "comment",
    "contentype",
    "formnameOrNameOrAddress",
    "extIdentification"
})
public class Identification {

    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Comment comment;
    @XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Contentype contentype;
    @XmlElements({
        @XmlElement(name = "formname", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = Formname.class),
        @XmlElement(name = "name", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = Name.class),
        @XmlElement(name = "address", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = Address.class),
        @XmlElement(name = "contactinfo", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = Contactinfo.class),
        @XmlElement(name = "demographics", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = Demographics.class),
        @XmlElement(name = "agent", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", type = Agent.class)
    })
    protected List<Object> formnameOrNameOrAddress;
    @XmlElement(name = "ext_identification", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected ExtIdentificationType extIdentification;

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
     * Gets the value of the formnameOrNameOrAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formnameOrNameOrAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormnameOrNameOrAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Formname }
     * {@link Name }
     * {@link Address }
     * {@link Contactinfo }
     * {@link Demographics }
     * {@link Agent }
     * 
     * 
     */
    public List<Object> getFormnameOrNameOrAddress() {
        if (formnameOrNameOrAddress == null) {
            formnameOrNameOrAddress = new ArrayList<Object>();
        }
        return this.formnameOrNameOrAddress;
    }

    /**
     * 获取extIdentification属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public ExtIdentificationType getExtIdentification() {
        return extIdentification;
    }

    /**
     * 设置extIdentification属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExtIdentification(ExtIdentificationType value) {
        this.extIdentification = value;
    }

}
