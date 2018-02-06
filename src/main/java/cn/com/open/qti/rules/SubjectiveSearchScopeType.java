package cn.com.open.qti.rules;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by lucky on 2017/7/3.
 */
/**
 * <p>subjectiveSearchScope.Type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="subjectiveSearchScope.Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="subjective"/>
 *     &lt;enumeration value="objective"/>
 *     &lt;enumeration value="all"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "subjectiveSearchScope.Type")
@XmlEnum
public enum SubjectiveSearchScopeType {

    @XmlEnumValue("subjective")
    SUBJECTIVE("subjective"),
    @XmlEnumValue("objective")
    OBJECTIVE("objective"),
    @XmlEnumValue("all")
    ALL("all");
    private final String value;

    SubjectiveSearchScopeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SubjectiveSearchScopeType fromValue(String v) {
        for (SubjectiveSearchScopeType c: SubjectiveSearchScopeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}