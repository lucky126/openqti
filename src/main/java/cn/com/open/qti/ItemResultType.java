//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.06.15 时间 10:58:25 AM CST 
//


package cn.com.open.qti;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>itemResult.Type complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="itemResult.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.open.com.cn/schemas/exam/openqti_v1}itemResult.ContentGroup"/>
 *       &lt;attGroup ref="{http://www.open.com.cn/schemas/exam/openqti_v1}itemResult.AttrGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemResult.Type", propOrder = {
    "content"
})
public class ItemResultType {


    @XmlElements({
            @XmlElement(name = "responseVariable", type = ResponseVariableType.class),
            @XmlElement(name = "templateVariable", type = TemplateVariableType.class),
            @XmlElement(name = "outcomeVariable", type = OutcomeVariableType.class)
    })
    protected List<Object> content;
    @XmlAttribute(name = "identifier", required = true)
    protected String identifier;
    @XmlAttribute(name = "sequenceIndex")
    protected Integer sequenceIndex;
    @XmlAttribute(name = "datestamp", required = true)
    protected XMLGregorianCalendar datestamp;
    @XmlAttribute(name = "sessionStatus", required = true)
    protected SessionStatusType sessionStatus;

    /**
     * Gets the value of the content property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * {@link JAXBElement }{@code <}{@link TemplateVariableType }{@code >}
     * {@link JAXBElement }{@code <}{@link OutcomeVariableType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResponseVariableType }{@code >}
     *
     *
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<>();
        }
        return this.content;
    }

    /**
     * 获取identifier属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * 设置identifier属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * 获取sequenceIndex属性的值。
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getSequenceIndex() {
        return sequenceIndex;
    }

    /**
     * 设置sequenceIndex属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setSequenceIndex(Integer value) {
        this.sequenceIndex = value;
    }

    /**
     * 获取datestamp属性的值。
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDatestamp() {
        return datestamp;
    }

    /**
     * 设置datestamp属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDatestamp(XMLGregorianCalendar value) {
        this.datestamp = value;
    }

    /**
     * 获取sessionStatus属性的值。
     *
     * @return
     *     possible object is
     *     {@link SessionStatusType }
     *
     */
    public SessionStatusType getSessionStatus() {
        return sessionStatus;
    }

    /**
     * 设置sessionStatus属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link SessionStatusType }
     *
     */
    public void setSessionStatus(SessionStatusType value) {
        this.sessionStatus = value;
    }

}
