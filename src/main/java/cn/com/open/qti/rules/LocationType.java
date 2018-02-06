package cn.com.open.qti.rules;

/**
 * Created by lucky on 2017/7/3.
 */

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>location.Type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="navigationMode.Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="top"/>
 *     &lt;enumeration value="foot"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "location.Type")
@XmlEnum
public enum LocationType {

    @XmlEnumValue("top")
    TOP("top"),
    @XmlEnumValue("foot")
    FOOT("foot");
    private final String value;

    LocationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationType fromValue(String v) {
        for (LocationType c: LocationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}