//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.06.15 时间 10:58:25 AM CST 
//


package cn.com.open.qti;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>anonymous complex type的 Java 类。
 * <p>
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="mediamode" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Text"/>
 *             &lt;enumeration value="Image"/>
 *             &lt;enumeration value="Video"/>
 *             &lt;enumeration value="Audio"/>
 *             &lt;enumeration value="Applet"/>
 *             &lt;enumeration value="Application"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="contentreftype" default="Base-64">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="uri"/>
 *             &lt;enumeration value="entityref"/>
 *             &lt;enumeration value="Base-64"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="mimetype" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "media")
public class Media {

    /**
     * The Value.
     */
    @XmlValue
    protected String value;
    /**
     * The Mediamode.
     */
    @XmlAttribute(name = "mediamode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String mediamode;
    /**
     * The Contentreftype.
     */
    @XmlAttribute(name = "contentreftype")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String contentreftype;
    /**
     * The Mimetype.
     */
    @XmlAttribute(name = "mimetype", required = true)
    protected String mimetype;
    /**
     * The Src.
     */
    @XmlAttribute(name = "src")
    protected String src;
    /**
     * The Duration.
     */
    @XmlAttribute(name = "duration")
    protected Double duration;
    /**
     * The Content.
     */
    @XmlAttribute(name = "content")
    protected String content;
    /**
     * The Repeat times.
     */
    @XmlAttribute(name = "repeatTimes")
    protected Integer repeatTimes;
    /**
     * The Repeat interval.
     */
    @XmlAttribute(name = "repeatInterval")
    protected Double repeatInterval;

    /**
     * Gets src.
     *
     * @return the src
     */
    public String getSrc() {
        return src;
    }

    /**
     * Sets src.
     *
     * @param src the src
     */
    public void setSrc(String src) {
        this.src = src;
    }

    /**
     * Gets duration.
     *
     * @return the duration
     */
    public Double getDuration() {
        return duration;
    }

    /**
     * Sets duration.
     *
     * @param duration the duration
     */
    public void setDuration(Double duration) {
        this.duration = duration;
    }

    /**
     * Gets content.
     *
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets content.
     *
     * @param content the content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Gets repeat times.
     *
     * @return the repeat times
     */
    public Integer getRepeatTimes() {
        return repeatTimes;
    }

    /**
     * Sets repeat times.
     *
     * @param repeatTimes the repeat times
     */
    public void setRepeatTimes(Integer repeatTimes) {
        this.repeatTimes = repeatTimes;
    }

    /**
     * Gets repeat interval.
     *
     * @return the repeat interval
     */
    public Double getRepeatInterval() {
        return repeatInterval;
    }

    /**
     * Sets repeat interval.
     *
     * @param repeatInterval the repeat interval
     */
    public void setRepeatInterval(Double repeatInterval) {
        this.repeatInterval = repeatInterval;
    }

    /**
     * 获取value属性的值。
     *
     * @return possible      object is     {@link String }
     */
    public String getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     *
     * @param value allowed object is     {@link String }
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 获取mediamode属性的值。
     *
     * @return possible      object is     {@link String }
     */
    public String getMediamode() {
        return mediamode;
    }

    /**
     * 设置mediamode属性的值。
     *
     * @param value allowed object is     {@link String }
     */
    public void setMediamode(String value) {
        this.mediamode = value;
    }

    /**
     * 获取contentreftype属性的值。
     *
     * @return possible      object is     {@link String }
     */
    public String getContentreftype() {
        if (contentreftype == null) {
            return "Base-64";
        } else {
            return contentreftype;
        }
    }

    /**
     * 设置contentreftype属性的值。
     *
     * @param value allowed object is     {@link String }
     */
    public void setContentreftype(String value) {
        this.contentreftype = value;
    }

    /**
     * 获取mimetype属性的值。
     *
     * @return possible      object is     {@link String }
     */
    public String getMimetype() {
        return mimetype;
    }

    /**
     * 设置mimetype属性的值。
     *
     * @param value allowed object is     {@link String }
     */
    public void setMimetype(String value) {
        this.mimetype = value;
    }

    public Media() {
        this.mimetype = "";
        this.src = "";
        this.duration = 0d;
        this.content = "";
        this.repeatTimes = 0;
        this.repeatInterval = 0d;
    }
}
