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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>categorizedStatistic.Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="categorizedStatistic.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.open.com.cn/schemas/exam/openqti_v1}categorizedStatistic.ContentGroup"/>
 *       &lt;attGroup ref="{http://www.open.com.cn/schemas/exam/openqti_v1}categorizedStatistic.AttrGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "categorizedStatistic.Type", propOrder = {
    "targetObject",
    "mapping"
})
public class CategorizedStatisticType {

    @XmlElement(required = true)
    protected List<TargetObjectType> targetObject;
    @XmlElement(required = true)
    protected MappingType mapping;
    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "glossary")
    protected String glossary;
    @XmlAttribute(name = "context", required = true)
    protected String context;
    @XmlAttribute(name = "caseCount")
    protected Integer caseCount;
    @XmlAttribute(name = "stdError")
    protected Double stdError;
    @XmlAttribute(name = "stdDeviation")
    protected Double stdDeviation;
    @XmlAttribute(name = "lastUpdated")
    protected XMLGregorianCalendar lastUpdated;

    /**
     * Gets the value of the targetObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TargetObjectType }
     * 
     * 
     */
    public List<TargetObjectType> getTargetObject() {
        if (targetObject == null) {
            targetObject = new ArrayList<TargetObjectType>();
        }
        return this.targetObject;
    }

    /**
     * 获取mapping属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MappingType }
     *     
     */
    public MappingType getMapping() {
        return mapping;
    }

    /**
     * 设置mapping属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MappingType }
     *     
     */
    public void setMapping(MappingType value) {
        this.mapping = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取glossary属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlossary() {
        return glossary;
    }

    /**
     * 设置glossary属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlossary(String value) {
        this.glossary = value;
    }

    /**
     * 获取context属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContext() {
        return context;
    }

    /**
     * 设置context属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContext(String value) {
        this.context = value;
    }

    /**
     * 获取caseCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCaseCount() {
        return caseCount;
    }

    /**
     * 设置caseCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCaseCount(Integer value) {
        this.caseCount = value;
    }

    /**
     * 获取stdError属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStdError() {
        return stdError;
    }

    /**
     * 设置stdError属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStdError(Double value) {
        this.stdError = value;
    }

    /**
     * 获取stdDeviation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStdDeviation() {
        return stdDeviation;
    }

    /**
     * 设置stdDeviation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStdDeviation(Double value) {
        this.stdDeviation = value;
    }

    /**
     * 获取lastUpdated属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdated() {
        return lastUpdated;
    }

    /**
     * 设置lastUpdated属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdated(XMLGregorianCalendar value) {
        this.lastUpdated = value;
    }

}
