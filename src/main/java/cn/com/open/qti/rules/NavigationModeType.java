package cn.com.open.qti.rules;

/**
 * Created by lucky on 2017/7/3.
 */

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>navigationMode.Type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="navigationMode.Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="linear"/>
 *     &lt;enumeration value="nonlinear"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "navigationMode.Type")
@XmlEnum
public enum NavigationModeType {

    @XmlEnumValue("linear")
    LINEAR("linear"),
    @XmlEnumValue("nonlinear")
    NONLINEAR("nonlinear");
    private final String value;

    NavigationModeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NavigationModeType fromValue(String v) {
        for (NavigationModeType c: NavigationModeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
