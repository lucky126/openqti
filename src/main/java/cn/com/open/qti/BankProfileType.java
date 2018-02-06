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
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>bankProfile.Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="bankProfile.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.open.com.cn/schemas/exam/openqti_v1}bankProfile.ContentGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bankProfile.Type", propOrder = {
    "usageDataVocabulary",
    "metadataProfile",
    "any"
})
public class BankProfileType {

    @XmlSchemaType(name = "anyURI")
    protected List<String> usageDataVocabulary;
    @XmlElement(required = true)
    protected MetadataProfileType metadataProfile;
    @XmlAnyElement
    protected List<Element> any;

    /**
     * Gets the value of the usageDataVocabulary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usageDataVocabulary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsageDataVocabulary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUsageDataVocabulary() {
        if (usageDataVocabulary == null) {
            usageDataVocabulary = new ArrayList<String>();
        }
        return this.usageDataVocabulary;
    }

    /**
     * 获取metadataProfile属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MetadataProfileType }
     *     
     */
    public MetadataProfileType getMetadataProfile() {
        return metadataProfile;
    }

    /**
     * 设置metadataProfile属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataProfileType }
     *     
     */
    public void setMetadataProfile(MetadataProfileType value) {
        this.metadataProfile = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * 
     * 
     */
    public List<Element> getAny() {
        if (any == null) {
            any = new ArrayList<Element>();
        }
        return this.any;
    }

}
