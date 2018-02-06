package cn.com.open.questiontransfer;

import cn.com.open.qti.Media;
import cn.com.open.utils.PatternUtil;

import java.util.List;

/**
 * Created by lucky on 2017/7/6.
 */
public class MediaMaker {
    /**
     * 原始的文本信息
     */
    private String orginalString;
    /**
     * 不包含media的文本信息
     */
    private String withoutMediaString;
    /**
     * media标签
     */
    private Media media;

    /**
     * Gets 不包含media的文本信息.
     *
     * @return the without media string
     */
    public String getWithoutMediaString() {
        return withoutMediaString;
    }

    /**
     * Gets media标签.
     *
     * @return the media
     */
    public Media getMedia() {
        return media;
    }

    public MediaMaker(String sourse) {
        orginalString = sourse;
        replaceAudioSign();
    }

    /**
     * Replace audio sign map.
     *
     * @return the map
     */
    public void replaceAudioSign() {

        String resultStr = orginalString;
        //得到<img ...>的结束位置
        int imgEndIndex = orginalString.indexOf(">", orginalString.indexOf("videourl"));
        //从orginalString中得到endsign之前的所有字符
        String includeVideoStringSub = orginalString.substring(0, imgEndIndex);
        //将videoString以<img分隔成为三段
        List<String> videoStringList = PatternUtil.getPatternSplitList(includeVideoStringSub, "<img");
        //得到最后一段的内容，也就是<img..>的内容
        String mediaString = videoStringList.get(videoStringList.size() - 1);
        mediaString = String.format("<img%s>", mediaString);
        withoutMediaString = resultStr.replace(mediaString, "<media/>");
        //属性定义
        String videourl = "";
        String hearingcontent = "";
        String repeatcount = "";
        String repeatinterval = "";
        String videocontent = "";
        String workvideotimes = "";
        String videotype = "";

        //获取属性值
        List<String> stringList = PatternUtil.getPatternSplit(mediaString,"(\")");
        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).indexOf("videourl") >= 0) {
                videourl = stringList.get(i + 1);
            }
            if (stringList.get(i).indexOf("hearingcontent") >= 0) {
                hearingcontent = stringList.get(i + 1);
            }
            if (stringList.get(i).indexOf("repeatcount") >= 0) {
                repeatcount = stringList.get(i + 1);
            }
            if (stringList.get(i).indexOf("repeatinterval") >= 0) {
                repeatinterval = stringList.get(i + 1);
            }
            if (stringList.get(i).indexOf("videocontent") >= 0) {
                videocontent = stringList.get(i + 1);
            }
            if (stringList.get(i).indexOf("workvideotimes") >= 0) {
                workvideotimes = stringList.get(i + 1);
            }
            if (stringList.get(i).indexOf("videotype") >= 0) {
                videotype = stringList.get(i + 1);
            }
        }

        //填充media
        media = new Media();
        media.setContent(hearingcontent);
        media.setDuration(Double.valueOf(workvideotimes));
        media.setMimetype(videotype);
        media.setSrc(videourl);
        media.setValue(videocontent);
        media.setRepeatTimes(Integer.valueOf(repeatinterval));
        media.setRepeatInterval(Double.valueOf(repeatcount));
    }
}
