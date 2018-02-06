package cn.com.open.openqti;

import cn.com.open.qti.BaseTypeType;
import cn.com.open.qti.CardinalityType;

/**
 * 评语输出变量
 */

/**
 * Created by lucky on 2017/11/10.
 */
public class OpenScorerCommentsOutcomeVariable extends OpenVariable {
    /**
     * 评语
     */
    private String scorerComments;

    /**
     * Gets scorer comments.
     *
     * @return the scorer comments
     */
    public String getScorerComments() {
        return scorerComments;
    }

    /**
     * Sets scorer comments.
     *
     * @param scorerComments the scorer comments
     */
    public void setScorerComments(String scorerComments) {
        this.scorerComments = scorerComments;
    }

    /**
     * 评语输出变量构造函数.
     *
     * @param identifier     评语标识符
     * @param scorerComments 评语
     * @param cardinality    基数
     * @param baseType       类型
     */
    public OpenScorerCommentsOutcomeVariable(String identifier, String scorerComments, CardinalityType cardinality, BaseTypeType baseType) {
        super(identifier, cardinality, baseType);
        this.scorerComments = scorerComments;
    }

    /**
     * 评语输出变量构造函数.
     *
     * @param identifier     评语标识符
     * @param scorerComments 评语
     */
    public OpenScorerCommentsOutcomeVariable(String identifier, String scorerComments) {
        this(identifier, scorerComments, CardinalityType.SINGLE, BaseTypeType.STRING);
    }

    /**
     * 评语输出变量构造函数.
     *
     * @param scorerComments 评语
     */
    public OpenScorerCommentsOutcomeVariable(String scorerComments) {
        this("scorerComments", scorerComments);
    }

    /**
     * 评语输出变量构造函数
     */
    public OpenScorerCommentsOutcomeVariable() {
        this(null);
    }
}
