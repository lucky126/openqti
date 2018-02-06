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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>usageData.Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="usageData.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.open.com.cn/schemas/exam/openqti_v1}usageData.ContentGroup"/>
 *       &lt;attGroup ref="{http://www.open.com.cn/schemas/exam/openqti_v1}usageData.AttrGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usageData.Type", propOrder = {
    "itemStatisticElementGroup"
})
public class UsageDataType {

    @XmlElements({
        @XmlElement(name = "ordinaryStatistic", type = OrdinaryStatisticType.class),
        @XmlElement(name = "categorizedStatistic", type = CategorizedStatisticType.class)
    })
    protected List<Object> itemStatisticElementGroup;
    @XmlAttribute(name = "glossary")
    protected String glossary;

    /**
     * Gets the value of the itemStatisticElementGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemStatisticElementGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemStatisticElementGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrdinaryStatisticType }
     * {@link CategorizedStatisticType }
     * 
     * 
     */
    public List<Object> getItemStatisticElementGroup() {
        if (itemStatisticElementGroup == null) {
            itemStatisticElementGroup = new ArrayList<Object>();
        }
        return this.itemStatisticElementGroup;
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

}
