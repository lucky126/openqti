//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.06.15 时间 10:58:25 AM CST 
//


package cn.com.open.qti;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>interpolationTableEntry.Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="interpolationTableEntry.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://www.open.com.cn/schemas/exam/openqti_v1}interpolationTableEntry.AttrGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "interpolationTableEntry.Type")
public class InterpolationTableEntryType {

    @XmlAttribute(name = "sourceValue", required = true)
    protected double sourceValue;
    @XmlAttribute(name = "includeBoundary")
    protected Boolean includeBoundary;
    @XmlAttribute(name = "targetValue", required = true)
    protected String targetValue;

    /**
     * 获取sourceValue属性的值。
     * 
     */
    public double getSourceValue() {
        return sourceValue;
    }

    /**
     * 设置sourceValue属性的值。
     * 
     */
    public void setSourceValue(double value) {
        this.sourceValue = value;
    }

    /**
     * 获取includeBoundary属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeBoundary() {
        return includeBoundary;
    }

    /**
     * 设置includeBoundary属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeBoundary(Boolean value) {
        this.includeBoundary = value;
    }

    /**
     * 获取targetValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetValue() {
        return targetValue;
    }

    /**
     * 设置targetValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetValue(String value) {
        this.targetValue = value;
    }

}
