package cn.com.open.openqti;

import cn.com.open.openqti.Exception.*;
import cn.com.open.qti.AssessmentItemRefType;
import cn.com.open.qti.Media;
import cn.com.open.qti.WeightType;
import cn.com.open.utils.GuidUtil;

import java.util.List;

/**
 * Created by lucky on 2017/6/30.
 */
public class OpenAssessmentItemRef {
    /**
     * ID
     */
    private String identifier;

    /**
     * 超链接地址
     */
    private String href;

    /**
     * 是否主观题
     */
    private boolean subjective;

    /**
     * 试题类型
     */
    private ItemType type;

    /**
     * 分数权重
     */
    private double weight;

    /**
     * 是否为例题
     */
    private boolean isExample;

    /**
     * 试题的准备时间（以秒为单位）
     */
    private double prepareDuration;

    /**
     * 试题的作答时间（以秒为单位）
     */
    private double responseDuration;

    /**
     * 题干显示时间（以秒为单位,问答题专用）
     */
    private double promptShowDuration;

    /**
     * 媒体资源
     */
    private Media media;

    /**
     * Gets identifier.
     *
     * @return the identifier
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets identifier.
     *
     * @param identifier the identifier
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * Gets href.
     *
     * @return the href
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets href.
     *
     * @param href the href
     */
    public void setHref(String href) {
        this.href = href;
    }

    /**
     * Is subjective boolean.
     *
     * @return the boolean
     */
    public boolean isSubjective() {
        return subjective;
    }

    /**
     * Sets subjective.
     *
     * @param subjective the subjective
     */
    public void setSubjective(boolean subjective) {
        this.subjective = subjective;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public ItemType getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(ItemType type) {
        this.type = type;
    }

    /**
     * Gets weight.
     *
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Sets weight.
     *
     * @param weight the weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Is is example boolean.
     *
     * @return the boolean
     */
    public boolean isExample() {
        return isExample;
    }

    /**
     * Sets is example.
     *
     * @param example the is example
     */
    public void setExample(boolean example) {
        this.isExample = example;
    }

    /**
     * Gets prepare duration.
     *
     * @return the prepare duration
     */
    public double getPrepareDuration() {
        return prepareDuration;
    }

    /**
     * Sets prepare duration.
     *
     * @param prepareDuration the prepare duration
     */
    public void setPrepareDuration(double prepareDuration) {
        this.prepareDuration = prepareDuration;
    }

    /**
     * Gets response duration.
     *
     * @return the response duration
     */
    public double getResponseDuration() {
        return responseDuration;
    }

    /**
     * Sets response duration.
     *
     * @param responseDuration the response duration
     */
    public void setResponseDuration(double responseDuration) {
        this.responseDuration = responseDuration;
    }

    /**
     * Gets prompt show duration.
     *
     * @return the prompt show duration
     */
    public double getPromptShowDuration() {
        return promptShowDuration;
    }

    /**
     * Sets prompt show duration.
     *
     * @param promptShowDuration the prompt show duration
     */
    public void setPromptShowDuration(double promptShowDuration) {
        this.promptShowDuration = promptShowDuration;
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
     * 试题引用构造函数
     */
    public OpenAssessmentItemRef() {
    }

    /**
     * 试题引用构造函数
     *
     * @param identifier         ID
     * @param href               超链接地址
     * @param subjective         是否主观题
     * @param itemType           试题类型
     * @param weight             分数权重
     * @param isExample          是否为例题
     * @param prepareDuration    试题的准备时间
     * @param responseDuration   试题的作答时间
     * @param promptShowDuration 题干显示时间
     * @param media              媒体资源
     * @throws Exception the exception
     */
    public OpenAssessmentItemRef(String identifier, String href, boolean subjective, ItemType itemType, double weight, boolean isExample, double prepareDuration,
                                 double responseDuration, double promptShowDuration, Media media) throws Exception {
        setIdentifier(identifier);
        setHref(href);
        setSubjective(subjective);
        setType(itemType);
        setWeight(weight);
        setExample(isExample);
        setPrepareDuration(prepareDuration);
        setResponseDuration(responseDuration);
        setPromptShowDuration(promptShowDuration);
        setMedia(media);

        if (getPrepareDuration() != 0) {
            if ((itemType != ItemType.EXTENDEDTEXT) && (itemType != ItemType.UPLOAD)) {
                throw new OnlyExtendedTextSupportPromptShowDurationException();
            }
        }
        if (isExample()) {
            if (getWeight() != 0.0) {
                throw new ExampleItemWeightMustBeZeroException();
            }
            if (getPrepareDuration() != 0) {
                throw new ExampleItemNotSupportPrepareDurationException();
            }
            if (getResponseDuration() != 0) {
                throw new ExampleItemNotSupportResponseDurationException();
            }
            if (getPromptShowDuration() != 0) {
                throw new ExampleItemNotSupportPromptShowDurationException();
            }
        }
    }

    /**
     * 试题引用构造函数
     *
     * @param openAssessmentItem Qti试题
     * @param subjective         是否主观题
     * @param weight             分数权重
     * @param isExample          是否为例题
     * @param prepareDuration    试题的准备时间
     * @param responseDuration   试题的作答时间
     * @param promptShowDuration 题干显示时间
     * @param repeatInterval     重复时间间隔
     * @param repeatTimes        重复播放次数
     * @throws Exception the exception
     */
    public OpenAssessmentItemRef(OpenAssessmentItem openAssessmentItem, boolean subjective, double weight, boolean isExample, double prepareDuration,
                                 double responseDuration, double promptShowDuration, double repeatInterval, int repeatTimes) throws Exception {
        this(openAssessmentItem.getIdentifier(), subjective, openAssessmentItem.getAssessmentItemType(), weight, isExample, prepareDuration, responseDuration,
                promptShowDuration, getMediaByOpenAssessmentItem(openAssessmentItem, repeatInterval, repeatTimes));
    }

    /**
     * 试题引用构造函数(音频重复次数和重复时间间隔不变)
     *
     * @param openAssessmentItem Qti试题
     * @param subjective         是否主观题
     * @param weight             分数权重
     * @param isExample          是否为例题
     * @param prepareDuration    试题的准备时间
     * @param responseDuration   试题的作答时间
     * @param promptShowDuration 题干显示时间
     * @throws Exception the exception
     */
    public OpenAssessmentItemRef(OpenAssessmentItem openAssessmentItem, boolean subjective, double weight, boolean isExample, double prepareDuration,
                                 double responseDuration, double promptShowDuration) throws Exception {
        this(openAssessmentItem.getIdentifier(), subjective, openAssessmentItem.getAssessmentItemType(), weight, isExample, prepareDuration, responseDuration,
                promptShowDuration, getMediaByOpenAssessmentItem(openAssessmentItem));
    }

    /**
     * 通过openAssessmentItem获取media
     * 由于现在假定每道试题仅含有一个媒体资源，故只返回list的第一项
     *
     * @param openAssessmentItem 试题
     * @param repeatInterval     repeatInterval
     * @param repeatTimes        repeatTimes
     * @return the media
     */
    private static Media getMediaByOpenAssessmentItem(OpenAssessmentItem openAssessmentItem, double repeatInterval, int repeatTimes) {
        List<Media> mediaList = openAssessmentItem.GetMediaList();
        if ((mediaList == null) || (mediaList.size() == 0)) {
            return null;
        } else {
            mediaList.get(0).setRepeatInterval(repeatInterval);
            mediaList.get(0).setRepeatTimes(repeatTimes);
            return mediaList.get(0);
        }
    }

    /**
     * 通过openAssessmentItem获取media
     *
     * @param openAssessmentItem 试题
     * @return the media
     */
    public static Media getMediaByOpenAssessmentItem(OpenAssessmentItem openAssessmentItem) {
        List<Media> mediaList = openAssessmentItem.GetMediaList();
        if ((mediaList == null) || (mediaList.size() == 0)) {
            return null;
        } else {
            return mediaList.get(0);
        }
    }

    /**
     * 试题引用构造函数(超链接地址根据identifier确定)
     *
     * @param identifier         ID
     * @param subjective         是否主观题
     * @param itemType           试题类型
     * @param weight             分数权重
     * @param isExample          是否为例题
     * @param prepareDuration    试题的准备时间
     * @param responseDuration   试题的作答时间
     * @param promptShowDuration 题干显示时间
     * @param media              媒体资源
     * @throws Exception the exception
     */
    public OpenAssessmentItemRef(String identifier, boolean subjective, ItemType itemType, double weight, boolean isExample, double prepareDuration,
                                 double responseDuration, double promptShowDuration, Media media) throws Exception {
        this(identifier, "AssessmentItems/ASI_" + identifier.toString() + ".xml", subjective, itemType, weight, isExample, prepareDuration, responseDuration,
                promptShowDuration, media);
    }

    /**
     * 试题引用构造函数(普通非听力试题没有时间限制)
     *
     * @param identifier ID
     * @param subjective 是否主观题
     * @param itemType   试题类型
     * @param weight     分数权重
     * @throws Exception the exception
     */
    public OpenAssessmentItemRef(String identifier, boolean subjective, ItemType itemType, double weight) throws Exception {
        this(identifier, subjective, itemType, weight, false, 0, 0, 0, null);
    }

    /**
     * 试题引用构造函数(普通听力试题)
     *
     * @param identifier       ID
     * @param subjective       是否主观题
     * @param itemType         试题类型
     * @param weight           分数权重
     * @param responseDuration 试题的作答时间
     * @param media            媒体资源
     * @throws Exception the exception
     */
    public OpenAssessmentItemRef(String identifier, boolean subjective, ItemType itemType, double weight, double responseDuration, Media media) throws Exception {
        this(identifier, subjective, itemType, weight, false, 0, responseDuration, 0, media);
    }

    /**
     * 试题引用构造函数(例题听力试题)
     *
     * @param identifier ID
     * @param subjective 是否主观题
     * @param itemType   试题类型
     * @param media      媒体资源
     * @throws Exception the exception
     */
    public OpenAssessmentItemRef(String identifier, boolean subjective, ItemType itemType, Media media) throws Exception {
        this(identifier, subjective, itemType, 0.0, true, 0, 0, 0, media);
    }

    /**
     * 试题引用构造函数(例题非听力试题)
     *
     * @param identifier ID
     * @param subjective 是否主观题
     * @param itemType   试题类型
     * @throws Exception the exception
     */
    public OpenAssessmentItemRef(String identifier, boolean subjective, ItemType itemType) throws Exception {
        this(identifier, subjective, itemType, 0.0, true, 0, 0, 0, null);
    }

    /**
     * 试题引用构造函数(原构造函数)
     *
     * @param identifier ID
     * @param href       超链接地址
     * @param subjective 是否主观题
     * @param itemType   试题类型
     * @param weight     分数权重
     */
    private OpenAssessmentItemRef(String identifier, String href, boolean subjective, ItemType itemType, double weight) throws Exception {
        this(identifier, href, subjective, itemType, weight, false, 0, 0, 0, null);
    }

    /**
     * 试题引用构造函数
     *
     * @param imsItemRef IMS试题引用
     */
    public OpenAssessmentItemRef(AssessmentItemRefType imsItemRef) {
        TranslateFromImsItemRef(imsItemRef);
    }

    /**
     * 转换为IMS试题引用
     *
     * @param imsItemRef IMS试题引用
     */
    private void TranslateFromImsItemRef(AssessmentItemRefType imsItemRef) {
        setIdentifier(GuidUtil.formatGuid(imsItemRef.getIdentifier()));
        setHref(imsItemRef.getHref());
        setSubjective(imsItemRef.getSubjective());
        setType(ItemType.valueOf(imsItemRef.getType().toUpperCase()));//TODO: enum ims item type?
        setWeight(imsItemRef.getWeight().get(0).getValue());
        setExample(imsItemRef.getExample());
        setPrepareDuration(imsItemRef.getPrepareDuration());
        setResponseDuration(imsItemRef.getResponseDuration());
        setPromptShowDuration(imsItemRef.getPromptShowDuration());
        setMedia(imsItemRef.getMedia());
    }

    /**
     * 从IMS试题引用转换
     *
     * @return IMS试题引用
     */
    public AssessmentItemRefType TranslateToImsItemRef() {
        AssessmentItemRefType imsItemRef = new AssessmentItemRefType();
        imsItemRef.setIdentifier(getIdentifier());
        imsItemRef.setHref(getHref());
        imsItemRef.setSubjective(isSubjective());
        imsItemRef.setType(getType().toString());//TODO: enum ims item type?

        imsItemRef.setExample(isExample());
        imsItemRef.setPrepareDuration(getPrepareDuration());
        imsItemRef.setPromptShowDuration(getPromptShowDuration());
        imsItemRef.setResponseDuration(getResponseDuration());
        imsItemRef.setMedia(getMedia());

        WeightType imsItemRefWeight = new WeightType();
        imsItemRefWeight.setIdentifier("WEIGHT");
        imsItemRefWeight.setValue(getWeight());
        imsItemRef.getWeight().add(imsItemRefWeight);

        return imsItemRef;
    }
}
