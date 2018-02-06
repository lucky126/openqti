package cn.com.open.openqti;

import cn.com.open.openqti.Exception.*;
import cn.com.open.qti.ClozeGap;
import cn.com.open.qti.Media;
import cn.com.open.qti.PromptType;
import cn.com.open.utils.JaxbUtil;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * 题干（答题说明）
 *
 * @author lucky
 */
public class OpenPrompt {
    /**
     * 文本序列（若含media元素则转换为去除属性后的单一元素）
     */
    private String convertedValue;
    /**
     * 媒体资源
     */
    private Media media;
    /**
     * 题干中的空(用于完型填空题)
     */
    private List<ClozeGap> clozeGapCollection;
    /**
     * 原始文本序列（不含CDATA）
     */
    private String originalValue;

    /**
     * 文本序列（若含media元素则转换为去除属性后的单一元素）
     *
     * @return the converted value
     */
    public String getConvertedValue() {
        return convertedValue;
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
     * Gets cloze gap collection.
     *
     * @return the cloze gap collection
     */
    public List<ClozeGap> getClozeGapCollection() {
        return clozeGapCollection;
    }

    /**
     * Gets original value.
     *
     * @return the original value
     */
    public String getOriginalValue() {
        return originalValue;
    }

    /**
     * 题干构造函数
     */
    public OpenPrompt() {
    }

    /**
     * 题干构造函数
     *
     * @param originalValue 原始文本序列
     * @throws Exception the exception
     */
    public OpenPrompt(String originalValue) throws Exception {
        this.originalValue = originalValue;
        //根据_OriginalValue建立media/convertedValue
        ConvertFromOriginalValue();
    }

    /**
     * 题干构造函数
     *
     * @param convertedValue     转换后文本序列
     * @param media              media元素
     * @param clozeGapCollection 完形填空空集合
     * @throws Exception the exception
     */
    public OpenPrompt(String convertedValue, Media media, List<ClozeGap> clozeGapCollection) throws Exception {
        this.convertedValue = convertedValue;
        this.media = media;
        this.clozeGapCollection = clozeGapCollection;
        //根据media/convertedValue建立_OriginalValue
        ConvertFromConvertedValueMediaGapColleciton();
    }

    /**
     * 题干构造函数
     *
     * @param convertedValue 转换后文本序列
     * @param media          media元素
     * @throws Exception the exception
     */
    public OpenPrompt(String convertedValue, Media media) throws Exception {
        this(convertedValue, media, null);
    }

    /**
     * 题干构造函数（用于构造只含音频的结束语）
     *
     * @param mediaPath     媒体路径
     * @param mimeType      媒体类型
     * @param mediaContent  媒体内容
     * @param mediaDuration 播放时间
     * @throws Exception the exception
     */
    public OpenPrompt(String mediaPath, String mimeType, String mediaContent, double mediaDuration) throws Exception {
        media = new Media();
        media.setDuration(mediaDuration);
        media.setContent(mediaContent);
        media.setMimetype(mimeType);
        media.setSrc(mediaPath);
        media.setRepeatInterval(0d);
        media.setRepeatTimes(0);

        this.convertedValue = "<media/>";
        this.clozeGapCollection = null;
        ConvertFromConvertedValueMediaGapColleciton();
    }

    /**
     * 题干构造函数
     *
     * @param convertedValue     转换后文本序列
     * @param clozeGapCollection 完形填空空集合
     * @throws Exception the exception
     */
    public OpenPrompt(String convertedValue, List<ClozeGap> clozeGapCollection) throws Exception {
        this(convertedValue, null, clozeGapCollection);
    }

    /**
     * 转换成ImsPrompt
     *
     * @return ImsPrompt prompt type
     */
    public PromptType ConvertToImsPrompt() {
        PromptType tmpPrompt = new PromptType();

        tmpPrompt.getContent().add(this.originalValue);

        return tmpPrompt;
    }

    /**
     * Instantiates a new Open prompt.
     *
     * @param prompt the prompt
     * @throws Exception the exception
     */
    public OpenPrompt(PromptType prompt) throws Exception {
        String tmpOriginalValue = "";
        if ((prompt != null) && (prompt.getContent() != null)) {
            tmpOriginalValue = prompt.getContent().get(0).toString();
        }
        this.originalValue = tmpOriginalValue;
        //根据_OriginalValue建立media/convertedValue
        ConvertFromOriginalValue();
    }

    /**
     * 根据_OriginalValue建立media/convertedValue
     */
    private void ConvertFromOriginalValue() throws Exception {
        //解决转换值为null时source.IndexOf("<media")取索引报错的问题
        if (this.originalValue != null) {
            this.convertedValue = this.originalValue;
        } else {
            this.originalValue = "";
            this.convertedValue = "";
        }
        String targetConvert = this.originalValue;
        String source = originalValue;
        int startPos = source.indexOf("<media");
        while (startPos != -1) {
            String endFlag;
            int endPos = source.indexOf("</media>", startPos);
            if (endPos < 0) {
                endPos = source.indexOf("/>", startPos);
                endFlag = "/>";
            } else {
                endFlag = "</media>";
            }
            if (endPos < 0) {
                throw new Exception(String.format("位置%d的<media>元素没有结束符！", startPos));
            }

            //替换内容，提取对象
            String media = source.substring(startPos, endPos + endFlag.length() - startPos);
            targetConvert = targetConvert.replace(media, "<media/>");

            Media docMedia = JaxbUtil.converyToJavaBean(media, Media.class);

            if (docMedia != null) {
                this.media = new Media();
                if (docMedia.getSrc() != null) {
                    this.media.setSrc(docMedia.getSrc());
                } else {
                    throw new OpenPromptRequireSrcException();
                }
                if (docMedia.getMimetype() != null) {
                    this.media.setMimetype(docMedia.getMimetype());
                } else {
                    throw new OpenPromptRequireMimeTypeException();
                }

                if (docMedia.getContent() != null) {
                    this.media.setContent(docMedia.getContent());
                } else {
                    this.media.setContent("");
                }

                if (docMedia.getDuration() != null) {
                    this.media.setDuration(docMedia.getDuration());
                } else {
                    this.media.setDuration(0.0);
                }
                if (docMedia.getRepeatInterval() != null) {
                    this.media.setRepeatInterval(docMedia.getRepeatInterval());
                } else {
                    this.media.setRepeatInterval(0.0);
                }
                if (docMedia.getRepeatTimes() != null) {
                    this.media.setRepeatTimes(docMedia.getRepeatTimes());
                } else {
                    this.media.setRepeatTimes(0);
                }
                //this.media.Value = docMedia.ChildNodes[0].InnerText;
            }
            startPos = source.indexOf("<media", endPos);
        }

        startPos = source.indexOf("<clozeGap");
        this.clozeGapCollection = new ArrayList<>();
        while (startPos != -1) {
            String endFlag;
            int endPos = source.indexOf("</clozeGap>", startPos);
            if (endPos < 0) {
                endPos = source.indexOf("/>", startPos);
                endFlag = "/>";
            } else {
                endFlag = "</clozeGap>";
            }
            if (endPos < 0) {
                throw new Exception(String.format("位置%d的<clozeGap>元素没有结束符！", startPos));
            }
            String clozeGap = source.substring(startPos, endPos + endFlag.length());
            targetConvert = targetConvert.replace(clozeGap, "<clozeGap/>");

            ClozeGap docClozeGap = JaxbUtil.converyToJavaBean(clozeGap, ClozeGap.class);

            if (docClozeGap != null) {
                ClozeGap tmpGap = new ClozeGap();
                if (docClozeGap.getResponseIdentifier() != null) {
                    tmpGap.setResponseIdentifier(docClozeGap.getResponseIdentifier());
                    this.clozeGapCollection.add(tmpGap);
                } else {
                    throw new ClozeGapRequireResponseIdentifierException();
                }
            }
            startPos = source.indexOf("<clozeGap", endPos);
        }
        this.convertedValue = targetConvert;
    }

    /**
     * 根据media/convertedValue建立_OriginalValue
     */
    private void ConvertFromConvertedValueMediaGapColleciton() throws Exception {
        boolean isIncludeMedia = false;
        boolean isIncludeClozeGap = false;
        if (this.media != null) {
            isIncludeMedia = true;
        }

        if ((this.clozeGapCollection != null) && (this.clozeGapCollection.size() > 0)) {
            isIncludeClozeGap = true;
        }
        if ((!isIncludeMedia) && (!isIncludeClozeGap)) {
            this.originalValue = this.convertedValue;
            return;
        }

        String targetOriginal = this.convertedValue;
        String source = convertedValue;
        if (isIncludeMedia) {
            int pos = source.indexOf("<media/>");
            if (pos != -1) {
                targetOriginal = targetOriginal.replace("<media/>", convertToXml(media, "UTF-8"));
            } else {
                throw new OpenPromptConvertValueNotMatchMediaException();
            }
        }

        if (isIncludeClozeGap) {
            String flag = "<clozeGap/>";
            int startPos = 0;
            int endPos = 0;
            for (ClozeGap curClozeGap : this.clozeGapCollection) {
                ClozeGap gapElement = new ClozeGap();
                gapElement.setResponseIdentifier(curClozeGap.getResponseIdentifier());
                startPos = source.indexOf("<clozeGap/>", endPos);
                if (startPos != -1) {
                    String pattern = "<clozeGap/>";

                    targetOriginal = targetOriginal.replaceFirst(pattern, convertToXml2(gapElement, "UTF-8"));
                    endPos = startPos + flag.length();
                } else {
                    throw new OpenPromptConvertValueNotMatchClozeGapException();
                }
            }
        }
        this.originalValue = targetOriginal;
    }

    /**
     * JavaBean转换成xml（2）
     *
     * @param obj      the obj
     * @param encoding the encoding
     * @return string
     */
    public static String convertToXml2(ClozeGap obj, String encoding) {
        String result = null;
        try {
            JAXBContext context = JAXBContext.newInstance(obj.getClass());
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.setProperty(Marshaller.JAXB_ENCODING, encoding);

            StringWriter writer = new StringWriter();
            marshaller.marshal(obj, writer);
            result = writer.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    /**
     * JavaBean转换成xml
     *
     * @param obj      the obj
     * @param encoding the encoding
     * @return string string
     */
    public static String convertToXml(Media obj, String encoding) {
        String result = null;
        try {
            JAXBContext context = JAXBContext.newInstance(obj.getClass());
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.setProperty(Marshaller.JAXB_ENCODING, encoding);

            StringWriter writer = new StringWriter();
            marshaller.marshal(obj, writer);
            result = writer.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}
