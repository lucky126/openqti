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
 * <p>areaMapEntry.Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="areaMapEntry.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://www.open.com.cn/schemas/exam/openqti_v1}areaMapEntry.AttrGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "areaMapEntry.Type")
public class AreaMapEntryType {

    @XmlAttribute(name = "shape", required = true)
    protected ShapeType shape;
    @XmlAttribute(name = "coords", required = true)
    protected String coords;
    @XmlAttribute(name = "mappedValue", required = true)
    protected double mappedValue;

    /**
     * 获取shape属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ShapeType }
     *     
     */
    public ShapeType getShape() {
        return shape;
    }

    /**
     * 设置shape属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ShapeType }
     *     
     */
    public void setShape(ShapeType value) {
        this.shape = value;
    }

    /**
     * 获取coords属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoords() {
        return coords;
    }

    /**
     * 设置coords属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoords(String value) {
        this.coords = value;
    }

    /**
     * 获取mappedValue属性的值。
     * 
     */
    public double getMappedValue() {
        return mappedValue;
    }

    /**
     * 设置mappedValue属性的值。
     * 
     */
    public void setMappedValue(double value) {
        this.mappedValue = value;
    }

}
