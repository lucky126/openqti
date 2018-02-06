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


/**
 * <p>areaMapping.Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="areaMapping.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.open.com.cn/schemas/exam/openqti_v1}areaMapping.ContentGroup"/>
 *       &lt;attGroup ref="{http://www.open.com.cn/schemas/exam/openqti_v1}areaMapping.AttrGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "areaMapping.Type", propOrder = {
    "areaMapEntry"
})
public class AreaMappingType {

    @XmlElement(required = true)
    protected List<AreaMapEntryType> areaMapEntry;
    @XmlAttribute(name = "lowerBound")
    protected Double lowerBound;
    @XmlAttribute(name = "upperBound")
    protected Double upperBound;
    @XmlAttribute(name = "defaultValue", required = true)
    protected double defaultValue;

    /**
     * Gets the value of the areaMapEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the areaMapEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAreaMapEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AreaMapEntryType }
     * 
     * 
     */
    public List<AreaMapEntryType> getAreaMapEntry() {
        if (areaMapEntry == null) {
            areaMapEntry = new ArrayList<AreaMapEntryType>();
        }
        return this.areaMapEntry;
    }

    /**
     * 获取lowerBound属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLowerBound() {
        return lowerBound;
    }

    /**
     * 设置lowerBound属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLowerBound(Double value) {
        this.lowerBound = value;
    }

    /**
     * 获取upperBound属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUpperBound() {
        return upperBound;
    }

    /**
     * 设置upperBound属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUpperBound(Double value) {
        this.upperBound = value;
    }

    /**
     * 获取defaultValue属性的值。
     * 
     */
    public double getDefaultValue() {
        return defaultValue;
    }

    /**
     * 设置defaultValue属性的值。
     * 
     */
    public void setDefaultValue(double value) {
        this.defaultValue = value;
    }

}
