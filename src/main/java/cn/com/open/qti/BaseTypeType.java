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
 * <p>baseType.Type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="baseType.Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="boolean"/>
 *     &lt;enumeration value="directedPair"/>
 *     &lt;enumeration value="duration"/>
 *     &lt;enumeration value="file"/>
 *     &lt;enumeration value="float"/>
 *     &lt;enumeration value="identifier"/>
 *     &lt;enumeration value="integer"/>
 *     &lt;enumeration value="pair"/>
 *     &lt;enumeration value="point"/>
 *     &lt;enumeration value="string"/>
 *     &lt;enumeration value="uri"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "baseType.Type")
@XmlEnum
public enum BaseTypeType {

    @XmlEnumValue("boolean")
    BOOLEAN("boolean"),
    @XmlEnumValue("directedPair")
    DIRECTED_PAIR("directedPair"),
    @XmlEnumValue("duration")
    DURATION("duration"),
    @XmlEnumValue("file")
    FILE("file"),
    @XmlEnumValue("float")
    FLOAT("float"),
    @XmlEnumValue("identifier")
    IDENTIFIER("identifier"),
    @XmlEnumValue("integer")
    INTEGER("integer"),
    @XmlEnumValue("pair")
    PAIR("pair"),
    @XmlEnumValue("point")
    POINT("point"),
    @XmlEnumValue("string")
    STRING("string"),
    @XmlEnumValue("uri")
    URI("uri");
    private final String value;

    BaseTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BaseTypeType fromValue(String v) {
        for (BaseTypeType c: BaseTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
