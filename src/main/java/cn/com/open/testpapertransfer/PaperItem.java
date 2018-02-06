package cn.com.open.testpapertransfer;

import java.io.Serializable;

/**
 * Created by lucky on 2018/1/11.
 */
public class PaperItem implements Serializable {
    /**
     * 试题id.
     */
    private String itemId;
    /**
     * 是否主观.
     */
    private boolean isSubjective;
    /**
     * 试题分数.
     */
    private double score;
    /**
     * 持续响应时间.
     */
    private double responseDuration;
    /**
     * 内部题型id.
     */
    private int questionTypeId;

    /**
     * Gets question type id.
     *
     * @return the question type id
     */
    public int getQuestionTypeId() {
        return questionTypeId;
    }

    /**
     * Sets question type id.
     *
     * @param questionTypeId the question type id
     */
    public void setQuestionTypeId(int questionTypeId) {
        this.questionTypeId = questionTypeId;
    }

    /**
     * Gets item id.
     *
     * @return the item id
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * Sets item id.
     *
     * @param itemId the item id
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
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
     * Gets score.
     *
     * @return the score
     */
    public double getScore() {
        return score;
    }

    /**
     * Sets score.
     *
     * @param score the score
     */
    public void setScore(double score) {
        this.score = score;
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
}
