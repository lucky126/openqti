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
 * <p>timeLimits.Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="timeLimits.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://www.open.com.cn/schemas/exam/openqti_v1}timeLimits.AttrGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "timeLimits.Type",namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
public class TimeLimitsType {

    @XmlAttribute(name = "minTime")
    protected Double minTime;
    @XmlAttribute(name = "maxTime")
    protected Double maxTime;
    @XmlAttribute(name = "checkTime")
    protected Double checkTime;
    @XmlAttribute(name = "expectedTime")
    protected Double expectedTime;

    /**
     * 获取minTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinTime() {
        return minTime;
    }

    /**
     * 设置minTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinTime(Double value) {
        this.minTime = value;
    }

    /**
     * 获取maxTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxTime() {
        return maxTime;
    }

    /**
     * 设置maxTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxTime(Double value) {
        this.maxTime = value;
    }

    /**
     * 获取checkTime属性的值。
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getCheckTime() {
        return checkTime;
    }

    /**
     * 设置checkTime属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setCheckTime(Double value) {
        this.checkTime = value;
    }

    /**
     * 获取expectedTime属性的值。
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getExpectedTime() {
        return expectedTime;
    }

    /**
     * 设置expectedTime属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setExpectedTime(Double value) {
        this.expectedTime = value;
    }

}
