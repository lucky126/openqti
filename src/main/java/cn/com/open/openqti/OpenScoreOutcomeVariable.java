package cn.com.open.openqti;

import cn.com.open.qti.BaseTypeType;
import cn.com.open.qti.CardinalityType;

/**
 * 成绩输出变量
 */
/**
 * Created by lucky on 2017/11/10.
 */
public class OpenScoreOutcomeVariable extends OpenVariable {
    /**
     * 试题分数
     */
    private double itemScore;

    /**
     * 考生分数
     */
    private double candidateScore;

    /**
     * 考生分数是否舍弃（用于选做题）
     */
    private boolean abandonScore;

    /**
     * Gets item score.
     *
     * @return the item score
     */
    public double getItemScore() {
        return itemScore;
    }

    /**
     * Sets item score.
     *
     * @param itemScore the item score
     */
    public void setItemScore(double itemScore) {
        this.itemScore = itemScore;
    }

    /**
     * Gets candidate score.
     *
     * @return the candidate score
     */
    public double getCandidateScore() {
        return candidateScore;
    }

    /**
     * Sets candidate score.
     *
     * @param candidateScore the candidate score
     */
    public void setCandidateScore(double candidateScore) {
        this.candidateScore = candidateScore;
    }

    /**
     * Is abandon score boolean.
     *
     * @return the boolean
     */
    public boolean isAbandonScore() {
        return abandonScore;
    }

    /**
     * Sets abandon score.
     *
     * @param abandonScore the abandon score
     */
    public void setAbandonScore(boolean abandonScore) {
        this.abandonScore = abandonScore;
    }

    /**
     * 成绩输出变量构造函数.
     *
     * @param identifier     the identifier
     * @param cardinality    the cardinality
     * @param baseType       the base type
     * @param itemScore      the item score
     * @param candidateScore the candidate score
     * @param abandonScore   the abandon score
     */
    public OpenScoreOutcomeVariable(String identifier, CardinalityType cardinality, BaseTypeType baseType, double itemScore,
                                    double candidateScore, boolean abandonScore) {
        super(identifier, cardinality, baseType);
        itemScore = itemScore;
        candidateScore = candidateScore;
        abandonScore = abandonScore;
    }

    /**
     * Instantiates a new Open score outcome variable.
     *
     * @param identifier     the identifier
     * @param itemScore      the item score
     * @param candidateScore the candidate score
     * @param abandonScore   the abandon score
     */
    public OpenScoreOutcomeVariable(String identifier, double itemScore, double candidateScore, boolean abandonScore) {
        this(identifier, CardinalityType.SINGLE, BaseTypeType.FLOAT, itemScore, candidateScore, abandonScore);
    }

    /**
     * Instantiates a new Open score outcome variable.
     *
     * @param identifier     the identifier
     * @param itemScore      the item score
     * @param candidateScore the candidate score
     */
    public OpenScoreOutcomeVariable(String identifier, double itemScore, double candidateScore) {
        this(identifier, itemScore, candidateScore, false);
    }

    /**
     * Instantiates a new Open score outcome variable.
     *
     * @param itemScore      the item score
     * @param candidateScore the candidate score
     */
    public OpenScoreOutcomeVariable(double itemScore, double candidateScore) {
        this("SCORE", itemScore, candidateScore, false);
    }
}
