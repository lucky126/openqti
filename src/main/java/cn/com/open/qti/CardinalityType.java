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
 * <p>cardinality.Type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="cardinality.Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="multiple"/>
 *     &lt;enumeration value="ordered"/>
 *     &lt;enumeration value="record"/>
 *     &lt;enumeration value="single"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cardinality.Type")
@XmlEnum
public enum CardinalityType {

    @XmlEnumValue("multiple")
    MULTIPLE("multiple"),
    @XmlEnumValue("ordered")
    ORDERED("ordered"),
    @XmlEnumValue("record")
    RECORD("record"),
    @XmlEnumValue("single")
    SINGLE("single");
    private final String value;

    CardinalityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CardinalityType fromValue(String v) {
        for (CardinalityType c: CardinalityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
