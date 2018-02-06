//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.06.15 时间 10:58:25 AM CST 
//


package cn.com.open.qti;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>feedbackType.Type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="feedbackType.Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="adaptive"/>
 *     &lt;enumeration value="nonadaptive"/>
 *     &lt;enumeration value="none"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "feedbackType.Type")
@XmlEnum
public enum FeedbackTypeType {

    @XmlEnumValue("adaptive")
    ADAPTIVE("adaptive"),
    @XmlEnumValue("nonadaptive")
    NONADAPTIVE("nonadaptive"),
    @XmlEnumValue("none")
    NONE("none");
    private final String value;

    FeedbackTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeedbackTypeType fromValue(String v) {
        for (FeedbackTypeType c: FeedbackTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
