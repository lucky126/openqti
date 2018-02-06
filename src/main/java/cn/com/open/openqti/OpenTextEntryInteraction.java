package cn.com.open.openqti;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lucky on 2017/6/23.
 */

/**
 * 文本输入交互项
 */
public class OpenTextEntryInteraction extends OpenInteraction {
    /**
     * 响应变量标识
     */
    private String responseIdentifier;
    /**
     * 最大字符长度
     */
    private int expectedLength;
    /**
     * 答案（答案标识/分数字典）
     */
    private Map<String, Double> correctResponseValues;


    /**
     * Gets response identifier.
     *
     * @return the response identifier
     */
    public String getResponseIdentifier() {
        return responseIdentifier;
    }

    /**
     * Sets response identifier.
     *
     * @param responseIdentifier the response identifier
     */
    public void setResponseIdentifier(String responseIdentifier) {
        this.responseIdentifier = responseIdentifier;
    }

    /**
     * Gets expected length.
     *
     * @return the expected length
     */
    public int getExpectedLength() {
        return expectedLength;
    }

    /**
     * Sets expected length.
     *
     * @param expectedLength the expected length
     */
    public void setExpectedLength(int expectedLength) {
        this.expectedLength = expectedLength;
    }

    /**
     * Gets correct response values.
     *
     * @return the correct response values
     */
    public Map<String, Double> getCorrectResponseValues() {
        if (correctResponseValues == null) {
            correctResponseValues = new HashMap<String, Double>();
        }
        return correctResponseValues;
    }

    /**
     * Sets correct response values.
     *
     * @param correctResponseValues the correct response values
     */
    public void setCorrectResponseValues(Map<String, Double> correctResponseValues) {
        this.correctResponseValues = correctResponseValues;
    }

    /**
     * 文本题项构造函数
     *
     * @param responseIdentifier    响应标识
     * @param expectedLength        最大字符长度
     * @param correctResponseValues 答案（答案标识/分数字典）
     */
    public OpenTextEntryInteraction(String responseIdentifier, int expectedLength, Map<String, Double> correctResponseValues) {
        this.setResponseIdentifier(responseIdentifier);
        this.setExpectedLength(expectedLength);
        this.setCorrectResponseValues(correctResponseValues);
    }

    /**
     * 文本题项构造函数
     * 无字符长度限制
     *
     * @param correctResponseValues 答案（答案标识/分数字典）
     */
    public OpenTextEntryInteraction(Map<String, Double> correctResponseValues) {
        this(null, 0, correctResponseValues);
    }

    /**
     * 文本题项构造函数
     *
     * @param expectedLength        最大字符长度
     * @param correctResponseValues 答案（答案标识/分数字典）
     */
    public OpenTextEntryInteraction(int expectedLength, Map<String, Double> correctResponseValues) {
        this(null, expectedLength, correctResponseValues);
    }

    /**
     * 文本题项构造函数
     * 唯一正确答案
     *
     * @param expectedLength  最大字符长度
     * @param correctResponse 答案
     */
    public OpenTextEntryInteraction(int expectedLength, String correctResponse) {
        this.setExpectedLength(expectedLength);

        Map<String, Double> correctResponseValues = new HashMap<String, Double>();
        correctResponseValues.put(correctResponse, 1.0);

        this.setCorrectResponseValues(correctResponseValues);
    }

    /**
     * 文本题项构造函数
     * 无字符长度限制
     * 唯一正确答案
     *
     * @param correctResponse 答案
     */
    public OpenTextEntryInteraction(String correctResponse) {
        this(0, correctResponse);
    }
}
