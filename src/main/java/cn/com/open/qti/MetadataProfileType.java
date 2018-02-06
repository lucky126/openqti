//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.06.15 时间 10:58:25 AM CST 
//


package cn.com.open.qti;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>metadataProfile.Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="metadataProfile.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.open.com.cn/schemas/exam/openqti_v1}metadataProfile.ContentGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "metadataProfile.Type", propOrder = {
    "imsmd",
    "lomMetadata",
    "imsqtimd"
})
public class MetadataProfileType {

    protected boolean imsmd;
    protected boolean lomMetadata;
    protected boolean imsqtimd;

    /**
     * 获取imsmd属性的值。
     * 
     */
    public boolean isImsmd() {
        return imsmd;
    }

    /**
     * 设置imsmd属性的值。
     * 
     */
    public void setImsmd(boolean value) {
        this.imsmd = value;
    }

    /**
     * 获取lomMetadata属性的值。
     * 
     */
    public boolean isLomMetadata() {
        return lomMetadata;
    }

    /**
     * 设置lomMetadata属性的值。
     * 
     */
    public void setLomMetadata(boolean value) {
        this.lomMetadata = value;
    }

    /**
     * 获取imsqtimd属性的值。
     * 
     */
    public boolean isImsqtimd() {
        return imsqtimd;
    }

    /**
     * 设置imsqtimd属性的值。
     * 
     */
    public void setImsqtimd(boolean value) {
        this.imsqtimd = value;
    }

}
