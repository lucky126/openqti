package cn.com.open.qti;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucky on 2017/11/14.
 */
@XmlAccessorType(XmlAccessType.FIELD)

@XmlRootElement(name = "media")
public class ExtIdentificationType {
    protected List<ValueType> value;

    public List<ValueType> getValue() {
        if (value == null) {
            value = new ArrayList<>();
        }
        return this.value;
    }
}
