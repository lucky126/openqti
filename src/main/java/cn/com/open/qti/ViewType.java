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
 * <p>view.Type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="view.Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="author"/>
 *     &lt;enumeration value="candidate"/>
 *     &lt;enumeration value="proctor"/>
 *     &lt;enumeration value="scorer"/>
 *     &lt;enumeration value="testConstructor"/>
 *     &lt;enumeration value="tutor"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "view.Type")
@XmlEnum
public enum ViewType {

    @XmlEnumValue("author")
    AUTHOR("author"),
    @XmlEnumValue("candidate")
    CANDIDATE("candidate"),
    @XmlEnumValue("proctor")
    PROCTOR("proctor"),
    @XmlEnumValue("scorer")
    SCORER("scorer"),
    @XmlEnumValue("testConstructor")
    TEST_CONSTRUCTOR("testConstructor"),
    @XmlEnumValue("tutor")
    TUTOR("tutor");
    private final String value;

    ViewType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ViewType fromValue(String v) {
        for (ViewType c: ViewType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
