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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>templateCondition.Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="templateCondition.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.open.com.cn/schemas/exam/openqti_v1}templateCondition.ContentGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "templateCondition.Type", propOrder = {
    "templateIf",
    "templateElseIf",
    "templateElse"
})
public class TemplateConditionType {

    @XmlElement(required = true)
    protected TemplateIfType templateIf;
    protected List<TemplateElseIfType> templateElseIf;
    protected TemplateElseType templateElse;

    /**
     * 获取templateIf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TemplateIfType }
     *     
     */
    public TemplateIfType getTemplateIf() {
        return templateIf;
    }

    /**
     * 设置templateIf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TemplateIfType }
     *     
     */
    public void setTemplateIf(TemplateIfType value) {
        this.templateIf = value;
    }

    /**
     * Gets the value of the templateElseIf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the templateElseIf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemplateElseIf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TemplateElseIfType }
     * 
     * 
     */
    public List<TemplateElseIfType> getTemplateElseIf() {
        if (templateElseIf == null) {
            templateElseIf = new ArrayList<TemplateElseIfType>();
        }
        return this.templateElseIf;
    }

    /**
     * 获取templateElse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TemplateElseType }
     *     
     */
    public TemplateElseType getTemplateElse() {
        return templateElse;
    }

    /**
     * 设置templateElse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TemplateElseType }
     *     
     */
    public void setTemplateElse(TemplateElseType value) {
        this.templateElse = value;
    }

}
