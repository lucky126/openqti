package cn.com.open.qti;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Created by lucky on 2017/6/20.
 */
@XmlRootElement(namespace = "")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clozeGap")
public class ClozeGap {
    @XmlAttribute(name = "responseIdentifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String responseIdentifier;

    /**
     * 获取responseIdentifier属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getResponseIdentifier() {
        return responseIdentifier;
    }

    /**
     * 设置responseIdentifier属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setResponseIdentifier(String value) {
        this.responseIdentifier = value;
    }

}
