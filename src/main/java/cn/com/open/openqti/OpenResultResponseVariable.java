package cn.com.open.openqti;

/**
 * 作答结果响应变量
 */

import cn.com.open.qti.BaseTypeType;
import cn.com.open.qti.CardinalityType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucky on 2017/11/10.
 */
public class OpenResultResponseVariable extends OpenVariable {
    /**
     * 选项顺序
     */
    private String choiceSequence;

    /**
     * 正确答案列表
     */
    private List<String> correctResponses;

    /**
     * 考生答案列表
     */
    private List<String> candidateResponses;

    /**
     * Gets choice sequence.
     *
     * @return the choice sequence
     */
    public String getChoiceSequence() {
        return choiceSequence;
    }

    /**
     * Sets choice sequence.
     *
     * @param choiceSequence the choice sequence
     */
    public void setChoiceSequence(String choiceSequence) {
        this.choiceSequence = choiceSequence;
    }

    /**
     * Gets correct responses.
     *
     * @return the correct responses
     */
    public List<String> getCorrectResponses() {
        return correctResponses;
    }

    /**
     * Sets correct responses.
     *
     * @param correctResponses the correct responses
     */
    public void setCorrectResponses(List<String> correctResponses) {
        this.correctResponses = correctResponses;
    }

    /**
     * Gets candidate responses.
     *
     * @return the candidate responses
     */
    public List<String> getCandidateResponses() {
        return candidateResponses;
    }

    /**
     * Sets candidate responses.
     *
     * @param candidateResponses the candidate responses
     */
    public void setCandidateResponses(List<String> candidateResponses) {
        this.candidateResponses = candidateResponses;
    }

    /**
     * 初始化.
     *
     * @param choiceSequence     the choice sequence
     * @param correctResponses   the correct responses
     * @param candidateResponses the candidate responses
     */
    private void Init(String choiceSequence, List<String> correctResponses, List<String> candidateResponses) {
        this.choiceSequence = choiceSequence;
        this.correctResponses = correctResponses;
        this.candidateResponses = candidateResponses;
    }

    /**
     * 作答结果响应变量构造函数.
     *
     * @param identifier         ID
     * @param cardinality        基数
     * @param baseType           类型
     * @param choiceSequence     选项顺序
     * @param correctResponses   正确答案列表
     * @param candidateResponses 考生答案列表
     */
    public OpenResultResponseVariable(String identifier, CardinalityType cardinality, BaseTypeType baseType, String choiceSequence,
                                      List<String> correctResponses, List<String> candidateResponses) {
        super(identifier, cardinality, baseType);
        Init(choiceSequence, correctResponses, candidateResponses);
    }

    /**
     * 作答结果响应变量构造函数（无选项乱序）.
     *
     * @param identifier         ID
     * @param cardinality        基数
     * @param baseType           类型
     * @param correctResponses   正确答案列表
     * @param candidateResponses 考生答案列表
     */
    public OpenResultResponseVariable(String identifier, CardinalityType cardinality, BaseTypeType baseType, List<String> correctResponses,
                                      List<String> candidateResponses) {
        this(identifier, cardinality, baseType, null, correctResponses, candidateResponses);
    }

    /**
     * 作答结果响应变量构造函数（RESPONSE变量）.
     *
     * @param cardinality        ID
     * @param baseType           类型
     * @param choiceSequence     选项顺序
     * @param correctResponses   正确答案列表
     * @param candidateResponses 考生答案列表
     */
    public OpenResultResponseVariable(CardinalityType cardinality, BaseTypeType baseType, String choiceSequence, List<String> correctResponses, List<String> candidateResponses) {
        this(Consts._RESPONSEVARIABLE, cardinality, baseType, choiceSequence, correctResponses, candidateResponses);
    }

    /**
     * 作答结果响应变量构造函数（RESPONSE变量、无选项乱序）.
     *
     * @param cardinality        ID
     * @param baseType           类型
     * @param correctResponses   正确答案列表
     * @param candidateResponses 考生答案列表
     */
    public OpenResultResponseVariable(CardinalityType cardinality, BaseTypeType baseType, List<String> correctResponses,
                                      List<String> candidateResponses) {
        this(Consts._RESPONSEVARIABLE, cardinality, baseType, null, correctResponses, candidateResponses);
    }

    /**
     * 作答结果响应变量构造函数（单一答案）.
     *
     * @param identifier        ID
     * @param cardinality       基数
     * @param baseType          类型
     * @param choiceSequence    选项顺序
     * @param correctResponse   正确答案
     * @param candidateResponse 考生答案
     */
    public OpenResultResponseVariable(String identifier, CardinalityType cardinality, BaseTypeType baseType, String choiceSequence,
                                      String correctResponse, String candidateResponse) {
        super(identifier, cardinality, baseType);
        List<String> correctResponses = new ArrayList<>();
        if (correctResponse != null) {
            correctResponses.add(correctResponse);
        }

        List<String> candidateResponses = new ArrayList<>();
        if (candidateResponse != null) {
            candidateResponses.add(candidateResponse);
        }

        Init(choiceSequence, correctResponses, candidateResponses);
    }

    /**
     * 作答结果响应变量构造函数（单一答案、无选项乱序）.
     *
     * @param identifier        ID
     * @param cardinality       基数
     * @param baseType          类型
     * @param correctResponse   正确答案
     * @param candidateResponse 考生答案
     */
    public OpenResultResponseVariable(String identifier, CardinalityType cardinality, BaseTypeType baseType, String correctResponse,
                                      String candidateResponse) {
        this(identifier, cardinality, baseType, null, correctResponse, candidateResponse);
    }

    /**
     * 作答结果响应变量构造函数（单一答案、RESPONSE变量）.
     *
     * @param cardinality       ID
     * @param baseType          类型
     * @param choiceSequence    选项顺序
     * @param correctResponse   正确答案
     * @param candidateResponse 考生答案
     */
    public OpenResultResponseVariable(CardinalityType cardinality, BaseTypeType baseType, String choiceSequence, String correctResponse,
                                      String candidateResponse) {
        this(Consts._RESPONSEVARIABLE, cardinality, baseType, choiceSequence, correctResponse, candidateResponse);
    }

    /**
     * 作答结果响应变量构造函数（单一答案、RESPONSE变量、无选项乱序）.
     *
     * @param cardinality       ID
     * @param baseType          类型
     * @param correctResponse   正确答案
     * @param candidateResponse 考生答案
     */
    public OpenResultResponseVariable(CardinalityType cardinality, BaseTypeType baseType, String correctResponse, String candidateResponse) {
        this(cardinality, baseType, null, correctResponse, candidateResponse);
    }
}
