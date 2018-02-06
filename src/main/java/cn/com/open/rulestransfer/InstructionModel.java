package cn.com.open.rulestransfer;

import java.io.Serializable;

/**
 * Created by lucky on 2018/1/3.
 * 听力题说明模型，主要记录媒体文件路径，媒体时长，文本
 */
public class InstructionModel implements Serializable {
    /**
     * 媒体文件路径
     */
    private String mediaUrl;
    /**
     * 媒体时长
     */
    private int duration;
    /**
     * 文本
     */
    private String text;

    /**
     * Gets media url.
     *
     * @return the media url
     */
    public String getMediaUrl() {
        return mediaUrl;
    }

    /**
     * Sets media url.
     *
     * @param mediaUrl the media url
     */
    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    /**
     * Gets duration.
     *
     * @return the duration
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Sets duration.
     *
     * @param duration the duration
     */
    public void setDuration(int duration) {
        this.duration = duration;
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
