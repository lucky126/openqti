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
 * <p>sessionStatus.Type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="sessionStatus.Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="final"/>
 *     &lt;enumeration value="initial"/>
 *     &lt;enumeration value="pendingResponseProcessing"/>
 *     &lt;enumeration value="pendingSubmission"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "sessionStatus.Type")
@XmlEnum
public enum SessionStatusType {

    @XmlEnumValue("final")
    FINAL("final"),
    @XmlEnumValue("initial")
    INITIAL("initial"),
    @XmlEnumValue("pendingResponseProcessing")
    PENDING_RESPONSE_PROCESSING("pendingResponseProcessing"),
    @XmlEnumValue("pendingSubmission")
    PENDING_SUBMISSION("pendingSubmission");
    private final String value;

    SessionStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SessionStatusType fromValue(String v) {
        for (SessionStatusType c: SessionStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
