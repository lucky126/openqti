package cn.com.open.qti.rules;

import cn.com.open.qti.Media;

import javax.xml.bind.annotation.*;

/**
 * Created by lucky on 2017/7/3.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "instruction.type", propOrder = {
        "media",
        "text"
})
public class InstructionType {
    /**
     * The Location.
     */
    @XmlAttribute(name = "location")
    protected LocationType location;
    /**
     * The Media.
     */
    //@XmlElement(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
    protected Media media;
    /**
     * The Text.
     */
    protected String text;


    /**
     * Gets location.
     *
     * @return the location
     */
    public LocationType getLocation() {
        return location;
    }

    /**
     * Sets location.
     *
     * @param location the location
     */
    public void setLocation(LocationType location) {
        this.location = location;
    }

    /**
     * Gets media.
     *
     * @return the media
     */
    public Media getMedia() {
        return media;
    }

    /**
     * Sets media.
     *
     * @param media the media
     */
    public void setMedia(Media media) {
        this.media = media;
    }

    /**
     * Gets text.
     *
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * Sets text.
     *
     * @param text the text
     */
    public void setText(String text) {
        this.text = text;
    }
}
