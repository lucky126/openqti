package cn.com.open.openqti;

/**
 * Created by lucky on 2017/6/26.
 */
public class OpenCompositeSubItem {
    /**
     * 子题试题
     */
    private OpenAssessmentItem subOpenAssessmentItem;
    /**
     * 子题分数
     */
    private double subItemScore;
    /**
     * 试题解析
     */
    private String questionAnalysis;

    /**
     * 小题ID
     */
    private String identifier;
    /**
     * 子题序号
     */
    private int sequenceIndex;
    /**
     * 是否主观题
     */
    private boolean subjective;

    /**
     * Gets sub open assessment item.
     *
     * @return the sub open assessment item
     */
    public OpenAssessmentItem getSubOpenAssessmentItem() {
        return subOpenAssessmentItem;
    }

    /**
     * Sets sub open assessment item.
     *
     * @param subOpenAssessmentItem the sub open assessment item
     */
    public void setSubOpenAssessmentItem(OpenAssessmentItem subOpenAssessmentItem) {
        this.subOpenAssessmentItem = subOpenAssessmentItem;
    }

    /**
     * Gets sub item score.
     *
     * @return the sub item score
     */
    public double getSubItemScore() {
        return subItemScore;
    }

    /**
     * Sets sub item score.
     *
     * @param subItemScore the sub item score
     */
    public void setSubItemScore(double subItemScore) {
        this.subItemScore = subItemScore;
    }

    /**
     * Gets question analysis.
     *
     * @return the question analysis
     */
    public String getQuestionAnalysis() {
        return questionAnalysis;
    }

    /**
     * Sets question analysis.
     *
     * @param questionAnalysis the question analysis
     */
    public void setQuestionAnalysis(String questionAnalysis) {
        this.questionAnalysis = questionAnalysis;
    }

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
     * Gets item type.
     *
     * @return the item type
     */
    public ItemType getItemType() {
        return getSubOpenAssessmentItem().getAssessmentItemType();
    }

    /**
     * 复合题子题构造函数
     */
    public OpenCompositeSubItem() {
    }

    /**
     * 复合题子题构造函数
     *
     * @param subOpenAssessmentItem 子题试题
     * @param subItemScore          子题分数
     * @param sequenceIndex         子题序号
     * @param subjective            子题是否主观题
     * @param Identifier            子题标识
     * @param questionAnalysis      子题解析
     */
    public OpenCompositeSubItem(OpenAssessmentItem subOpenAssessmentItem, double subItemScore, int sequenceIndex, boolean subjective, String Identifier, String questionAnalysis) {
        this.setSubOpenAssessmentItem(subOpenAssessmentItem);
        this.setSubItemScore(subItemScore);
        this.setSequenceIndex(sequenceIndex);
        this.setSubjective(subjective);
        this.setIdentifier(Identifier);
        this.setQuestionAnalysis(questionAnalysis);
    }

    /**
     * 复合题客观子题构造函数
     *
     * @param subOpenAssessmentItem 子题试题
     * @param subItemScore          子题分数
     * @param sequenceIndex         子题序号
     * @param Identifier            子题标识
     * @param questionAnalysis      子题解析
     */
    public OpenCompositeSubItem(OpenAssessmentItem subOpenAssessmentItem, double subItemScore, int sequenceIndex, String Identifier, String questionAnalysis) {
        this(subOpenAssessmentItem, subItemScore, sequenceIndex, false, Identifier, questionAnalysis);
    }

    /**
     * 复合题子题构造函数
     *
     * @param subOpenAssessmentItem 子题试题
     * @param subItemScore          子题分数
     */
    private OpenCompositeSubItem(OpenAssessmentItem subOpenAssessmentItem, double subItemScore) {
        this.setSubOpenAssessmentItem(subOpenAssessmentItem);
        this.setSubItemScore(subItemScore);
    }
}
