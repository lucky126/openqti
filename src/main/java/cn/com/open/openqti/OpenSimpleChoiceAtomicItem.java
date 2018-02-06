package cn.com.open.openqti;

/**
 * 选择题项
 *
 * @author lucky
 */
public class OpenSimpleChoiceAtomicItem extends OpenAtomicItem {
    /**
     * 标识
     */
    private String identifier;
    /**
     * 内容
     */
    private String content;
    /**
     * 题项是否固定位置
     */
    private boolean fixed;
    /**
     * 是否正确答案
     */
    private boolean isCorrectResponse;

    /**
     * Gets 标识.
     *
     * @return the identifier
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets 标识.
     *
     * @param identifier the identifier
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * Gets 内容.
     *
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets 内容.
     *
     * @param content the content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Gets 题项是否固定位置.
     *
     * @return the boolean
     */
    public boolean isFixed() {
        return fixed;
    }

    /**
     * Sets 题项是否固定位置.
     *
     * @param fixed the fixed
     */
    public void setFixed(boolean fixed) {
        this.fixed = fixed;
    }

    /**
     * Gets 是否正确答案.
     *
     * @return the boolean
     */
    public boolean isCorrectResponse() {
        return isCorrectResponse;
    }

    /**
     * Sets 是否正确答案.
     *
     * @param correctResponse the correct response
     */
    public void setCorrectResponse(boolean correctResponse) {
        isCorrectResponse = correctResponse;
    }

    /**
     * 构造.
     */
    public OpenSimpleChoiceAtomicItem() {
    }

    /**
     * 选择题项构造函数
     *
     * @param identifier        题项ID
     * @param content           题项内容
     * @param isCorrectResponse 题项是否固定位置
     * @param fixed             是否正确答案
     */
    public OpenSimpleChoiceAtomicItem(String identifier, String content, boolean isCorrectResponse, boolean fixed) {
        this.setIdentifier(identifier);
        this.setContent(content);
        this.setFixed(fixed);
        this.setCorrectResponse(isCorrectResponse);
    }

    /**
     * 选择题项构造函数（非固定位置选项）
     *
     * @param identifier        题项ID
     * @param content           题项内容
     * @param isCorrectResponse 是否正确答案
     */
    public OpenSimpleChoiceAtomicItem(String identifier, String content, boolean isCorrectResponse) {
        this(identifier, content, isCorrectResponse, false);
    }

    /**
     * 选择题项构造函数（错误选项，非固定位置选项）
     *
     * @param identifier 题项ID
     * @param content    题项内容
     */
    public OpenSimpleChoiceAtomicItem(String identifier, String content) {
        this(identifier, content, false);
    }
}
