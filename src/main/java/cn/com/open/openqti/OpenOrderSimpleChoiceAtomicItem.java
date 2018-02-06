package cn.com.open.openqti;

/**
 * Created by lucky on 2017/6/29.
 */
public class OpenOrderSimpleChoiceAtomicItem extends OpenAtomicItem {
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
     * 正确的顺序号
     */
    private int correctSequence;


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
     * Gets content.
     *
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets content.
     *
     * @param content the content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Is fixed boolean.
     *
     * @return the boolean
     */
    public boolean isFixed() {
        return fixed;
    }

    /**
     * Sets fixed.
     *
     * @param fixed the fixed
     */
    public void setFixed(boolean fixed) {
        this.fixed = fixed;
    }

    /**
     * Gets correct sequence.
     *
     * @return the correct sequence
     */
    public int getCorrectSequence() {
        return correctSequence;
    }

    /**
     * Sets correct sequence.
     *
     * @param correctSequence the correct sequence
     */
    public void setCorrectSequence(int correctSequence) {
        this.correctSequence = correctSequence;
    }

    /**
     * 排序项构造函数
     *
     * @param identifier      题项ID
     * @param content         题项内容
     * @param correctSequence 正确序号
     * @param isFixed         是否固定位置
     */
    public OpenOrderSimpleChoiceAtomicItem(String identifier, String content, int correctSequence, boolean isFixed) {
        setIdentifier(identifier);
        setContent(content);
        setCorrectSequence(correctSequence);
        setFixed(isFixed);
    }

    /**
     * 排序项构造函数（不固定位置）
     *
     * @param identifier      题项ID
     * @param content         题项内容
     * @param correctSequence 正确序号
     */
    public OpenOrderSimpleChoiceAtomicItem(String identifier, String content, int correctSequence) {
        this(identifier, content, correctSequence, false);
    }
}
