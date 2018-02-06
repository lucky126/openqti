package cn.com.open.rulestransfer;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucky on 2017/12/7.
 */
public class RuleDifficultyModel implements Serializable {
    /**
     * 章节ID列表.
     */
    private List<String> chapterList;

    /**
     * 难度类型
     */
    private DifficultyType type;

    /**
     * 子题数量
     */
    private int subItemCount;

    /**
     * 实际计算的题目数
     */
    private float realCount;

    /**
     * 抽题用题目数
     */
    private int count;

    /**
     * 分数
     */
    private BigDecimal score;

    /**
     * 音频时长范围起始值
     */
    private int durationStart;

    /**
     * 音频时长范围截止值
     */
    private int durationEnd;

    /**
     * 音频重复播放次数
     */
    private int repeatTimes;

    /**
     * 音频重复播放间隔
     */
    private int repeatInterval;

    /**
     * 答题时间
     */
    private int responseDuration;

    /**
     * 是否主观
     */
    private boolean isSubjective;

    /**
     * 应用类别
     */
    private String questionCategory;

    /**
     * Gets chapter list.
     *
     * @return the chapter list
     */
    public List<String> getChapterList() {
        if (chapterList == null) {
            chapterList = new ArrayList<>();
        }
        return chapterList;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public DifficultyType getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(DifficultyType type) {
        this.type = type;
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
     * Gets real count.
     *
     * @return the real count
     */
    public float getRealCount() {
        return realCount;
    }

    /**
     * Sets real count.
     *
     * @param realCount the real count
     */
    public void setRealCount(float realCount) {
        this.realCount = realCount;
    }

    /**
     * Gets count.
     *
     * @return the count
     */
    public int getCount() {
        return count;
    }

    /**
     * Sets count.
     *
     * @param count the count
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * Gets score.
     *
     * @return the score
     */
    public BigDecimal getScore() {
        return score;
    }

    /**
     * Sets score.
     *
     * @param score the score
     */
    public void setScore(BigDecimal score) {
        this.score = score;
    }


    /**
     * Gets responseDuration start.
     *
     * @return the responseDuration start
     */
    public int getDurationStart() {
        return durationStart;
    }

    /**
     * Sets responseDuration start.
     *
     * @param durationStart the responseDuration start
     */
    public void setDurationStart(int durationStart) {
        this.durationStart = durationStart;
    }

    /**
     * Gets responseDuration end.
     *
     * @return the responseDuration end
     */
    public int getDurationEnd() {
        return durationEnd;
    }

    /**
     * Sets responseDuration end.
     *
     * @param durationEnd the responseDuration end
     */
    public void setDurationEnd(int durationEnd) {
        this.durationEnd = durationEnd;
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
    public int getRepeatInterval() {
        return repeatInterval;
    }

    /**
     * Sets repeat interval.
     *
     * @param repeatInterval the repeat interval
     */
    public void setRepeatInterval(int repeatInterval) {
        this.repeatInterval = repeatInterval;
    }

    /**
     * Gets responseDuration.
     *
     * @return the responseDuration
     */
    public int getResponseDuration() {
        return responseDuration;
    }

    /**
     * Sets responseDuration.
     *
     * @param responseDuration the responseDuration
     */
    public void setResponseDuration(int responseDuration) {
        this.responseDuration = responseDuration;
    }


    /**
     * Is subjective boolean.
     *
     * @return the boolean
     */
    public boolean isSubjective() {
        return isSubjective;
    }

    /**
     * Sets subjective.
     *
     * @param subjective the subjective
     */
    public void setSubjective(boolean subjective) {
        isSubjective = subjective;
    }

    /**
     * Instantiates a new Rule difficulty model.
     */
    public RuleDifficultyModel() {
        isSubjective = false;
    }

    /**
     * Gets question category.
     *
     * @return the question category
     */
    public String getQuestionCategory() {
        return questionCategory;
    }

    /**
     * Sets question category.
     *
     * @param questionCategory the question category
     */
    public void setQuestionCategory(String questionCategory) {
        this.questionCategory = questionCategory;
    }

}
