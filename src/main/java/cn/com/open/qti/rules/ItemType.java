package cn.com.open.qti.rules;

import cn.com.open.qti.Media;

import javax.xml.bind.annotation.*;

/**
 * Created by lucky on 2017/7/3.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "item.type")
public class ItemType {
    /**
     * The Identifier.
     */
    @XmlAttribute(name = "identifier", required = true)
    protected String identifier;
    /**
     * The Title.
     */
    @XmlAttribute(name = "title", required = true)
    protected String title;
    /**
     * The Item type id.
     */
    @XmlAttribute(name = "itemTypeID", required = true)
    protected String itemTypeID;
    /**
     * The Subjective.
     */
    @XmlAttribute(name = "subjective", required = true)
    protected boolean subjective;
    /**
     * The Difficulty.
     */
    @XmlAttribute(name = "difficulty", required = true)
    protected float difficulty;
    /**
     * The Score.
     */
    @XmlAttribute(name = "score", required = true)
    protected float score;
    /**
     * The Chapter id.
     */
    @XmlAttribute(name = "chapterID", required = true)
    protected String chapterID;
    /**
     * The Knowleged relation.
     */
    @XmlAttribute(name = "knowlegedRelation")
    protected String knowlegedRelation;
    /**
     * The Application type id list.
     */
    @XmlAttribute(name = "applicationTypeIDList")
    protected String applicationTypeIDList;
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
     * The Subject code.
     */
    @XmlAttribute(name = "subjectCode")
    protected Integer subjectCode;

    /**
     * The Media.
     */
    protected Media media;

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
     * Gets difficulty.
     *
     * @return the difficulty
     */
    public float getDifficulty() {
        return difficulty;
    }

    /**
     * Sets difficulty.
     *
     * @param difficulty the difficulty
     */
    public void setDifficulty(float difficulty) {
        this.difficulty = difficulty;
    }

    /**
     * Gets score.
     *
     * @return the score
     */
    public float getScore() {
        return score;
    }

    /**
     * Sets score.
     *
     * @param score the score
     */
    public void setScore(float score) {
        this.score = score;
    }

    /**
     * Gets chapter id.
     *
     * @return the chapter id
     */
    public String getChapterID() {
        return chapterID;
    }

    /**
     * Sets chapter id.
     *
     * @param chapterID the chapter id
     */
    public void setChapterID(String chapterID) {
        this.chapterID = chapterID;
    }

    /**
     * Gets knowleged relation.
     *
     * @return the knowleged relation
     */
    public String getKnowlegedRelation() {
        return knowlegedRelation;
    }

    /**
     * Sets knowleged relation.
     *
     * @param knowlegedRelation the knowleged relation
     */
    public void setKnowlegedRelation(String knowlegedRelation) {
        this.knowlegedRelation = knowlegedRelation;
    }

    /**
     * Gets application type id list.
     *
     * @return the application type id list
     */
    public String getApplicationTypeIDList() {
        return applicationTypeIDList;
    }

    /**
     * Sets application type id list.
     *
     * @param applicationTypeIDList the application type id list
     */
    public void setApplicationTypeIDList(String applicationTypeIDList) {
        this.applicationTypeIDList = applicationTypeIDList;
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
     * Gets subject code.
     *
     * @return the subject code
     */
    public int getSubjectCode() {
        return subjectCode;
    }

    /**
     * Sets subject code.
     *
     * @param subjectCode the subject code
     */
    public void setSubjectCode(int subjectCode) {
        this.subjectCode = subjectCode;
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
}
