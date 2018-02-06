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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>outcomeMinimum.Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="outcomeMinimum.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://www.open.com.cn/schemas/exam/openqti_v1}outcomeMinimum.AttrGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outcomeMinimum.Type")
public class OutcomeMinimumType {

    @XmlAttribute(name = "outcomeIdentifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String outcomeIdentifier;
    @XmlAttribute(name = "weightIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String weightIdentifier;
    @XmlAttribute(name = "sectionIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sectionIdentifier;
    @XmlAttribute(name = "includeCategory")
    protected List<String> includeCategory;
    @XmlAttribute(name = "excludeCategory")
    protected List<String> excludeCategory;

    /**
     * 获取outcomeIdentifier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutcomeIdentifier() {
        return outcomeIdentifier;
    }

    /**
     * 设置outcomeIdentifier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutcomeIdentifier(String value) {
        this.outcomeIdentifier = value;
    }

    /**
     * 获取weightIdentifier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeightIdentifier() {
        return weightIdentifier;
    }

    /**
     * 设置weightIdentifier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeightIdentifier(String value) {
        this.weightIdentifier = value;
    }

    /**
     * 获取sectionIdentifier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionIdentifier() {
        return sectionIdentifier;
    }

    /**
     * 设置sectionIdentifier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionIdentifier(String value) {
        this.sectionIdentifier = value;
    }

    /**
     * Gets the value of the includeCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includeCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludeCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIncludeCategory() {
        if (includeCategory == null) {
            includeCategory = new ArrayList<String>();
        }
        return this.includeCategory;
    }

    /**
     * Gets the value of the excludeCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excludeCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcludeCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExcludeCategory() {
        if (excludeCategory == null) {
            excludeCategory = new ArrayList<String>();
        }
        return this.excludeCategory;
    }

}
