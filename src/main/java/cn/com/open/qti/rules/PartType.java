package cn.com.open.qti.rules;

import cn.com.open.qti.TimeLimitsType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucky on 2017/7/3.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "part.type", propOrder = {
        "instruction",
        "timeLimits",
        "section",
})
public class PartType {
    protected List<InstructionType> instruction;
    protected List<SectionType> section;
    @XmlAttribute(name = "identifier", required = true)
    protected String identifier;
    @XmlAttribute(name = "navigationMode", required = true)
    protected NavigationModeType navigationMode;
    @XmlAttribute(name = "submissionMode", required = true)
    protected SubmissionModeType submissionMode;
    @XmlAttribute(name = "mediaType")
    protected int mediaType;
    @XmlAttribute(name = "score")
    protected float score;
    protected TimeLimitsType timeLimits;

    /**
     * Gets the value of the instruction property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instruction property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstruction().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstructionType }
     *
     *
     */
    public List<InstructionType> getInstruction() {
        if (instruction == null) {
            instruction = new ArrayList<InstructionType>();
        }
        return this.instruction;
    }

    /**
     * Gets the value of the section property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the section property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSection().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SectionType }
     *
     *
     */
    public List<SectionType> getSection() {
        if (section == null) {
            section = new ArrayList<SectionType>();
        }
        return this.section;
    }

    /**
     * 获取identifier属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * 设置identifier属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * 获取navigationMode属性的值。
     *
     * @return
     *     possible object is
     *     {@link NavigationModeType }
     *
     */
    public NavigationModeType getNavigationMode() {
        return navigationMode;
    }

    /**
     * 设置navigationMode属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link NavigationModeType }
     *
     */
    public void setNavigationMode(NavigationModeType value) {
        this.navigationMode = value;
    }

    /**
     * 获取submissionMode属性的值。
     *
     * @return
     *     possible object is
     *     {@link SubmissionModeType }
     *
     */
    public SubmissionModeType getSubmissionMode() {
        return submissionMode;
    }

    /**
     * 设置submissionMode属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link SubmissionModeType }
     *
     */
    public void setSubmissionMode(SubmissionModeType value) {
        this.submissionMode = value;
    }

    /**
     * 获取mediaType属性的值。
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public int getMediaType() {
        return mediaType;
    }

    /**
     * 设置mediaType属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setMediaType(int value) {
        this.mediaType = value;
    }

    /**
     * 获取score属性的值。
     *
     * @return
     *     possible object is
     *     {@link Float }
     *
     */
    public float getScore() {
        return score;
    }

    /**
     * 设置score属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Float }
     *
     */
    public void setScore(float value) {
        this.score = value;
    }


    /**
     * 获取timeLimits属性的值。
     *
     * @return possible object is
     * {@link TimeLimitsType }
     */
    public TimeLimitsType getTimeLimits() {
        return timeLimits;
    }

    /**
     * 设置timeLimits属性的值。
     *
     * @param value allowed object is
     *              {@link TimeLimitsType }
     */
    public void setTimeLimits(TimeLimitsType value) {
        this.timeLimits = value;
    }

}
