package cn.com.open.qti.rules;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by lucky on 2017/7/3.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemGroup.type", propOrder = {
        "subjectScope"
})
public class ItemGroupType {
    /**
     * The Subject scope.
     */
    protected SubjectScopeType subjectScope;
    /**
     * The Sequence index.
     */
    @XmlAttribute(name = "sequenceIndex", required = true)
    protected int sequenceIndex;
    /**
     * The Item type id.
     */
    @XmlAttribute(name = "itemTypeID", required = true)
    protected String itemTypeID;
    /**
     * The Subjective search scope.
     */
    @XmlAttribute(name = "subjectiveSearchScope")
    protected SubjectiveSearchScopeType subjectiveSearchScope;
    /**
     * The Subjective.
     */
    @XmlAttribute(name = "subjective", required = true)
    protected Boolean subjective;
    /**
     * 抽题用题目数.
     */
    @XmlAttribute(name = "itemCount", required = true)
    protected int itemCount;
    /**
     * 实际计算的题目数.
     */
    @XmlAttribute(name = "realitemCount", required = true)
    protected float realItemCount;
    /**
     * The Item score.
     */
    @XmlAttribute(name = "itemScore", required = true)
    protected float itemScore;
    /**
     * The Item application type id list.
     */
    @XmlAttribute(name = "itemApplicationTypeIDList", required = true)
    protected String itemApplicationTypeIDList;
    /**
     * The Sub item count.
     */
    @XmlAttribute(name = "subItemCount")
    protected Integer subItemCount;
    /**
     * The Min difficulty.
     */
    @XmlAttribute(name = "minDifficulty", required = true)
    protected float minDifficulty;
    /**
     * The Max difficulty.
     */
    @XmlAttribute(name = "maxDifficulty", required = true)
    protected float maxDifficulty;
    /**
     * The Prepare duration.
     */
    @XmlAttribute(name = "prepareDuration")
    protected Double prepareDuration;
    /**
     * The Response duration.
     */
    @XmlAttribute(name = "responseDuration")
    protected Double responseDuration;
    /**
     * The Prompt show duration.
     */
    @XmlAttribute(name = "promptShowDuration")
    protected Double promptShowDuration;
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
     * The Min duration.
     */
    @XmlAttribute(name = "minDuration")
    protected double minDuration;
    /**
     * The Max duration.
     */
    @XmlAttribute(name = "maxDuration")
    protected double maxDuration;
    /**
     * The Available item count.
     */
    @XmlAttribute(name = "availableItemCount")
    protected Integer availableItemCount;

    /**
     * Gets real item count.
     *
     * @return the real item count
     */
    public float getRealItemCount() {
        return realItemCount;
    }

    /**
     * Sets real item count.
     *
     * @param realItemCount the real item count
     */
    public void setRealItemCount(float realItemCount) {
        this.realItemCount = realItemCount;
    }

    /**
     * Gets subject scope.
     *
     * @return the subject scope
     */
    public SubjectScopeType getSubjectScope() {
        return subjectScope;
    }

    /**
     * Sets subject scope.
     *
     * @param subjectScope the subject scope
     */
    public void setSubjectScope(SubjectScopeType subjectScope) {
        this.subjectScope = subjectScope;
    }

    /**
     * Gets sequence index.
     *
     * @return the sequence index
     */
    public int getSequenceIndex() {
        return sequenceIndex;
    }

    /**
     * Sets sequence index.
     *
     * @param sequenceIndex the sequence index
     */
    public void setSequenceIndex(int sequenceIndex) {
        this.sequenceIndex = sequenceIndex;
    }

    /**
     * Gets item type id.
     *
     * @return the item type id
     */
    public String getItemTypeID() {
        return itemTypeID;
    }

    /**
     * Sets item type id.
     *
     * @param itemTypeID the item type id
     */
    public void setItemTypeID(String itemTypeID) {
        this.itemTypeID = itemTypeID;
    }

    /**
     * Gets subjective search scope.
     *
     * @return the subjective search scope
     */
    public SubjectiveSearchScopeType getSubjectiveSearchScope() {
        return subjectiveSearchScope;
    }

    /**
     * Sets subjective search scope.
     *
     * @param subjectiveSearchScope the subjective search scope
     */
    public void setSubjectiveSearchScope(SubjectiveSearchScopeType subjectiveSearchScope) {
        this.subjectiveSearchScope = subjectiveSearchScope;
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
     * Gets item count.
     *
     * @return the item count
     */
    public int getItemCount() {
        return itemCount;
    }

    /**
     * Sets item count.
     *
     * @param itemCount the item count
     */
    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    /**
     * Gets item score.
     *
     * @return the item score
     */
    public float getItemScore() {
        return itemScore;
    }

    /**
     * Sets item score.
     *
     * @param itemScore the item score
     */
    public void setItemScore(float itemScore) {
        this.itemScore = itemScore;
    }

    /**
     * Gets item application type id list.
     *
     * @return the item application type id list
     */
    public String getItemApplicationTypeIDList() {
        return itemApplicationTypeIDList;
    }

    /**
     * Sets item application type id list.
     *
     * @param itemApplicationTypeIDList the item application type id list
     */
    public void setItemApplicationTypeIDList(String itemApplicationTypeIDList) {
        this.itemApplicationTypeIDList = itemApplicationTypeIDList;
    }

    /**
     * Gets sub item count.
     *
     * @return the sub item count
     */
    public int getSubItemCount() {
        return subItemCount;
    }

    /**
     * Sets sub item count.
     *
     * @param subItemCount the sub item count
     */
    public void setSubItemCount(int subItemCount) {
        this.subItemCount = subItemCount;
    }

    /**
     * Gets min difficulty.
     *
     * @return the min difficulty
     */
    public float getMinDifficulty() {
        return minDifficulty;
    }

    /**
     * Sets min difficulty.
     *
     * @param minDifficulty the min difficulty
     */
    public void setMinDifficulty(float minDifficulty) {
        this.minDifficulty = minDifficulty;
    }

    /**
     * Gets max difficulty.
     *
     * @return the max difficulty
     */
    public float getMaxDifficulty() {
        return maxDifficulty;
    }

    /**
     * Sets max difficulty.
     *
     * @param maxDifficulty the max difficulty
     */
    public void setMaxDifficulty(float maxDifficulty) {
        this.maxDifficulty = maxDifficulty;
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
     * Gets repeat times.
     *
     * @return the repeat times
     */
    public int getRepeatTimes() {
        return repeatTimes;
    }

    /**
     * Sets repeat times.
     *
     * @param repeatTimes the repeat times
     */
    public void setRepeatTimes(int repeatTimes) {
        this.repeatTimes = repeatTimes;
    }

    /**
     * Gets repeat interval.
     *
     * @return the repeat interval
     */
    public double getRepeatInterval() {
        return repeatInterval;
    }

    /**
     * Sets repeat interval.
     *
     * @param repeatInterval the repeat interval
     */
    public void setRepeatInterval(double repeatInterval) {
        this.repeatInterval = repeatInterval;
    }

    /**
     * Gets min duration.
     *
     * @return the min duration
     */
    public double getMinDuration() {
        return minDuration;
    }

    /**
     * Sets min duration.
     *
     * @param minDuration the min duration
     */
    public void setMinDuration(double minDuration) {
        this.minDuration = minDuration;
    }

    /**
     * Gets max duration.
     *
     * @return the max duration
     */
    public double getMaxDuration() {
        return maxDuration;
    }

    /**
     * Sets max duration.
     *
     * @param maxDuration the max duration
     */
    public void setMaxDuration(double maxDuration) {
        this.maxDuration = maxDuration;
    }

    /**
     * Gets available item count.
     *
     * @return the available item count
     */
    public int getAvailableItemCount() {
        return availableItemCount;
    }

    /**
     * Sets available item count.
     *
     * @param availableItemCount the available item count
     */
    public void setAvailableItemCount(int availableItemCount) {
        this.availableItemCount = availableItemCount;
    }


    /**
     * Instantiates a new Item group type.
     */
    public ItemGroupType() {
        this.subItemCount = 0;
        this.subjective = false;
    }
}
