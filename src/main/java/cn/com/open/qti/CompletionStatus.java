package cn.com.open.qti;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by lucky on 2017/11/10.
 */
@XmlType(name = "completion.status")
@XmlEnum
public enum  CompletionStatus {
    @XmlEnumValue("unknown")
    UNKNOW("unknown"),
    @XmlEnumValue("not_attempted")
    NOT_ATTEMPTED("not_attempted"),
    @XmlEnumValue("incompleted")
    INCOMPLETED("incompleted"),
    @XmlEnumValue("completed")
    COMPLETED("completed");

    private final String value;

    CompletionStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompletionStatus fromValue(String v) {
        for (CompletionStatus c: CompletionStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
