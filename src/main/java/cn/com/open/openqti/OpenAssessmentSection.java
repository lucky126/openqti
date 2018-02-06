package cn.com.open.openqti;

import cn.com.open.qti.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by lucky on 2017/6/30.
 */
public class OpenAssessmentSection {
    /**
     * ID
     */
    private String identifier;
    /**
     * 标题
     */
    private String title;
    /**
     * 试题是否乱序
     */
    private boolean shuffle;
    /**
     * 题目说明内容
     */
    private OpenPrompt prompt;
    /**
     * 末尾的答题说明内容
     */
    private OpenPrompt endPrompt;
    /**
     * 试题引用集合
     */
    private List<OpenAssessmentItemRef> assessmentItemRefCollection;
    /**
     * 可选试题数量
     */
    private int optionalItemCount;
    /**
     * 可选试题（小题）分数
     */
    private double optionalItemScore;
    /**
     * 大题的媒体类型
     */
    private int mediaType;
    /**
     * 试题Session控制
     */
    private ItemSessionControlType itemSessionControl;
    /**
     * 时间限制
     */
    private TimeLimitsType timeLimits;

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
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Is shuffle boolean.
     *
     * @return the boolean
     */
    public boolean isShuffle() {
        return shuffle;
    }

    /**
     * Sets shuffle.
     *
     * @param shuffle the shuffle
     */
    public void setShuffle(boolean shuffle) {
        this.shuffle = shuffle;
    }

    /**
     * Gets prompt.
     *
     * @return the prompt
     */
    public OpenPrompt getPrompt() {
        return prompt;
    }

    /**
     * Sets prompt.
     *
     * @param prompt the prompt
     */
    public void setPrompt(OpenPrompt prompt) {
        this.prompt = prompt;
    }

    /**
     * Gets end prompt.
     *
     * @return the end prompt
     */
    public OpenPrompt getEndPrompt() {
        return endPrompt;
    }

    /**
     * Sets end prompt.
     *
     * @param endPrompt the end prompt
     */
    public void setEndPrompt(OpenPrompt endPrompt) {
        this.endPrompt = endPrompt;
    }

    /**
     * Gets assessment item ref collection.
     *
     * @return the assessment item ref collection
     */
    public List<OpenAssessmentItemRef> getAssessmentItemRefCollection() {
        if(this.assessmentItemRefCollection==null)
        {
            this.assessmentItemRefCollection = new ArrayList<OpenAssessmentItemRef>();
        }
        return assessmentItemRefCollection;
    }

    /**
     * Sets assessment item ref collection.
     *
     * @param assessmentItemRefCollection the assessment item ref collection
     */
    public void setAssessmentItemRefCollection(List<OpenAssessmentItemRef> assessmentItemRefCollection) {
        if(this.assessmentItemRefCollection==null)
        {
            this.assessmentItemRefCollection = new ArrayList<OpenAssessmentItemRef>();
        }
        this.assessmentItemRefCollection = assessmentItemRefCollection;
    }

    /**
     * 试题数量
     *
     * @return 试题数量 item count
     */
    public int getItemCount() {
        if (getAssessmentItemRefCollection() == null) {
            return 0;
        } else {
            int exampleItemCount = 0;
            for (OpenAssessmentItemRef oair : getAssessmentItemRefCollection()) {
                if (oair.isExample()) {
                    exampleItemCount++;
                }
            }
            return getAssessmentItemRefCollection().size() - exampleItemCount;
        }
    }

    /**
     * 计分试题数量
     *
     * @return 计分试题数量 int
     */
    public int ScoredItemCount() {
        int scoredItemCount = 0;

        for (int i = 0; i < getAssessmentItemRefCollection().size();
             i++) {
            OpenAssessmentItemRef ref = (OpenAssessmentItemRef) ((List) getAssessmentItemRefCollection()).get(i);
            if (!ref.isExample()) {
                scoredItemCount++;
            }
        }
        return scoredItemCount;
    }


    /**
     * Gets optional item count.
     *
     * @return the optional item count
     */
    public int getOptionalItemCount() {
        return optionalItemCount;
    }

    /**
     * Sets optional item count.
     *
     * @param optionalItemCount the optional item count
     */
    public void setOptionalItemCount(int optionalItemCount) {
        this.optionalItemCount = optionalItemCount;
    }

    /**
     * Gets optional item score.
     *
     * @return the optional item score
     */
    public double getOptionalItemScore() {
        return optionalItemScore;
    }

    /**
     * Sets optional item score.
     *
     * @param optionalItemScore the optional item score
     */
    public void setOptionalItemScore(double optionalItemScore) {
        this.optionalItemScore = optionalItemScore;
    }

    /**
     * 分数
     *
     * @return 分数 double
     */
    public double getScore() {
        if (optionalItemCount > 0) {
            return optionalItemCount * optionalItemScore;
        } else {
            if (getAssessmentItemRefCollection() == null || getAssessmentItemRefCollection().size() == 0) {
                return 0;
            } else {
                double scoreSum = 0;
                if (getAssessmentItemRefCollection() != null) {
                    //大题分数为各试题分数之和（例题分数为0）
                    for (OpenAssessmentItemRef openAssessmentItemRef : getAssessmentItemRefCollection()) {
                        scoreSum += openAssessmentItemRef.getWeight();
                    }
                }
                return scoreSum;
            }
        }
    }

    /**
     * Gets media type.
     *
     * @return the media type
     */
    public int getMediaType() {
        return mediaType;
    }

    /**
     * Sets media type.
     *
     * @param mediaType the media type
     */
    public void setMediaType(int mediaType) {
        this.mediaType = mediaType;
    }

    /**
     * Gets item session control.
     *
     * @return the item session control
     */
    public ItemSessionControlType getItemSessionControl() {
        return itemSessionControl;
    }

    /**
     * Sets item session control.
     *
     * @param itemSessionControl the item session control
     */
    public void setItemSessionControl(ItemSessionControlType itemSessionControl) {
        this.itemSessionControl = itemSessionControl;
    }

    /**
     * Gets time limits.
     *
     * @return the time limits
     */
    public TimeLimitsType getTimeLimits() {
        return timeLimits;
    }

    /**
     * Sets time limits.
     *
     * @param timeLimits the time limits
     */
    public void setTimeLimits(TimeLimitsType timeLimits) {
        this.timeLimits = timeLimits;
    }

    /**
     * 大题构造函数
     */
    public OpenAssessmentSection() {
    }

    /**
     * 大题构造函数
     *
     * @param identifier                  ID
     * @param title                       标题
     * @param shuffle                     试题是否乱序
     * @param prompt                      题目说明内容
     * @param assessmentItemRefCollection 试题引用集合
     * @param optionalItemCount           可选试题数目
     * @param optionalItemScore           可选试题（小题）分数
     * @param mediaType                   大题媒体类型
     * @param itemSessionControl          试题Session控制
     * @param timeLimits                  时间限制
     * @param endPrompt                   末尾答题说明
     */
    public OpenAssessmentSection(String identifier, String title, boolean shuffle,
                                 OpenPrompt prompt, List<OpenAssessmentItemRef> assessmentItemRefCollection,
                                 int optionalItemCount, double optionalItemScore, int mediaType,
                                 ItemSessionControlType itemSessionControl, TimeLimitsType timeLimits, OpenPrompt endPrompt) {
        setIdentifier(identifier);
        setTitle(title);
        setShuffle(shuffle);
        setPrompt(prompt);
        setAssessmentItemRefCollection(assessmentItemRefCollection);
        setOptionalItemCount(optionalItemCount);
        setOptionalItemScore(optionalItemScore);
        setMediaType(mediaType);
        setTimeLimits(timeLimits);
        setItemSessionControl(itemSessionControl);
        setEndPrompt(endPrompt);
    }

    /**
     * 大题构造函数(可选题)
     *
     * @param identifier                  ID
     * @param title                       标题
     * @param shuffle                     试题是否乱序
     * @param prompt                      题目说明内容
     * @param assessmentItemRefCollection 试题引用集合
     * @param optionalItemCount           可选试题数目
     * @param optionalItemScore           可选试题（小题）分数
     * @param mediaType                   大题媒体类型
     */
    public OpenAssessmentSection(String identifier, String title, boolean shuffle,
                                 OpenPrompt prompt, List<OpenAssessmentItemRef> assessmentItemRefCollection,
                                 int optionalItemCount, double optionalItemScore, int mediaType) {
        this(identifier, title, shuffle, prompt, assessmentItemRefCollection, optionalItemCount, optionalItemScore, mediaType, null, null, null);
    }

    /**
     * 大题构造函数（非可选题）
     *
     * @param identifier                  ID
     * @param title                       标题
     * @param shuffle                     试题是否乱序
     * @param prompt                      题目说明内容
     * @param assessmentItemRefCollection 试题引用集合
     * @param mediaType                   大题媒体类型
     */
    public OpenAssessmentSection(String identifier, String title, boolean shuffle,
                                 OpenPrompt prompt, List<OpenAssessmentItemRef> assessmentItemRefCollection,
                                 int mediaType) {
        this(identifier, title, shuffle, prompt, assessmentItemRefCollection, 0, 0.0, mediaType, null, null, null);
    }

    /**
     * 大题构造函数
     *
     * @param identifier                  ID
     * @param title                       标题
     * @param shuffle                     试题是否乱序
     * @param promptOriginalValue         题目说明内容
     * @param assessmentItemRefCollection 试题引用集合
     * @param optionalItemCount           可选试题数目
     * @param optionalItemScore           可选试题（小题）分数
     */
    private OpenAssessmentSection(String identifier, String title, boolean shuffle,
                                  String promptOriginalValue, List<OpenAssessmentItemRef> assessmentItemRefCollection,
                                  int optionalItemCount, double optionalItemScore) throws Exception {
        this(identifier, title, shuffle, new OpenPrompt(promptOriginalValue), assessmentItemRefCollection, optionalItemCount, optionalItemScore, 0, null, null, null);
    }

    /**
     * 大题构造函数(非可选题)
     *
     * @param identifier                  ID
     * @param title                       标题
     * @param shuffle                     试题是否乱序
     * @param promptOriginalValue         题目说明内容
     * @param assessmentItemRefCollection 试题引用集合
     */
    private OpenAssessmentSection(String identifier, String title, boolean shuffle,
                                  String promptOriginalValue, List<OpenAssessmentItemRef> assessmentItemRefCollection) throws Exception {
        this(identifier, title, shuffle, promptOriginalValue, assessmentItemRefCollection, 0, 0.0);
    }

    /**
     * 大题构造函数
     *
     * @param imsSection IMS大题
     * @throws Exception the exception
     */
    public OpenAssessmentSection(AssessmentSectionType imsSection) throws Exception {
        TranslateFromImsSection(imsSection);
    }

    /**
     * 从IMS大题转换
     *
     * @param imsSection IMS大题
     * @throws Exception the exception
     */
    public void TranslateFromImsSection(AssessmentSectionType imsSection) throws Exception {
        setIdentifier(imsSection.getIdentifier());
        setTitle(imsSection.getTitle());
        if (imsSection.getOrdering() != null) {
            setShuffle(imsSection.getOrdering().isShuffle());
        }
        if (imsSection.getOptionalItemCount() != 0) {
            setOptionalItemCount(imsSection.getOptionalItemCount());
        }
        setOptionalItemScore(imsSection.getOptionalItemCount());

        if ((imsSection.getRubricBlock() != null) && (imsSection.getRubricBlock().get(0).getPrompt() != null) &&
                !imsSection.getRubricBlock().get(0).getPrompt().getContent().isEmpty()) {
            setPrompt(new OpenPrompt(imsSection.getRubricBlock().get(0).getPrompt().getContent().get(0).toString()));
        }
        if ((imsSection.getEndBlock() != null) && (imsSection.getEndBlock().getPrompt() != null) && (imsSection.getEndBlock().getPrompt().getContent() != null)) {
            setEndPrompt(new OpenPrompt(imsSection.getEndBlock().getPrompt().getContent().get(0).toString()));
        }
        setMediaType(imsSection.getMediaType());

        setItemSessionControl(imsSection.getItemSessionControl());
        setTimeLimits(imsSection.getTimeLimits());

        for (Object obj : imsSection.getSectionPartElementGroup()) {
            if (obj instanceof AssessmentItemRefType) {
                AssessmentItemRefType ref = (AssessmentItemRefType) obj;
                getAssessmentItemRefCollection().add(new OpenAssessmentItemRef(ref));
            }
        }

    }

    /**
     * 转换为IMS大题
     *
     * @return IMS大题 assessment section type
     */
    public AssessmentSectionType TranslateToImsSection() {
        AssessmentSectionType imsSection = new AssessmentSectionType();
        imsSection.setIdentifier(getIdentifier());
        imsSection.setTitle(getTitle());
        imsSection.setVisible(true);
        imsSection.setItemCount(getItemCount());
        imsSection.setScore(getScore());

        imsSection.setOptionalItemCount(getOptionalItemCount());

        imsSection.setOptionalItemScore(getOptionalItemScore());

        OrderingType ordering = new OrderingType();
        ordering.setShuffle(isShuffle());
        imsSection.setOrdering(ordering);

        RubricBlockType sectionRubricBlock = new RubricBlockType();
        sectionRubricBlock.getView().add(ViewType.CANDIDATE);
        if (getPrompt() != null) {
            sectionRubricBlock.setPrompt(getPrompt().ConvertToImsPrompt());
        }
        EndBlock sectionEndBlock = new EndBlock();
        if (getEndPrompt() != null) {
            sectionEndBlock.setPrompt(getEndPrompt().ConvertToImsPrompt());
        }
        imsSection.setMediaType(getMediaType());
        imsSection.getRubricBlock().add(sectionRubricBlock);
        imsSection.setTimeLimits(getTimeLimits());
        for (OpenAssessmentItemRef ref : getAssessmentItemRefCollection()) {
            imsSection.getSectionPartElementGroup().add(ref.TranslateToImsItemRef());
        }
        imsSection.setEndBlock(sectionEndBlock);
        return imsSection;
    }
}
