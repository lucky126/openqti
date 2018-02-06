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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>templateProcessing.Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="templateProcessing.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.open.com.cn/schemas/exam/openqti_v1}templateProcessing.ContentGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "templateProcessing.Type", propOrder = {
    "templateRuleElementGroup"
})
public class TemplateProcessingType {

    @XmlElements({
        @XmlElement(name = "setTemplateValue", type = SetTemplateValueType.class),
        @XmlElement(name = "exitTemplate", type = ExitTemplateType.class),
        @XmlElement(name = "templateCondition", type = TemplateConditionType.class),
        @XmlElement(name = "setDefaultValue", type = SetDefaultValueType.class),
        @XmlElement(name = "setCorrectResponse", type = SetCorrectResponseType.class)
    })
    protected List<Object> templateRuleElementGroup;

    /**
     * Gets the value of the templateRuleElementGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the templateRuleElementGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemplateRuleElementGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SetTemplateValueType }
     * {@link ExitTemplateType }
     * {@link TemplateConditionType }
     * {@link SetDefaultValueType }
     * {@link SetCorrectResponseType }
     * 
     * 
     */
    public List<Object> getTemplateRuleElementGroup() {
        if (templateRuleElementGroup == null) {
            templateRuleElementGroup = new ArrayList<Object>();
        }
        return this.templateRuleElementGroup;
    }

}
