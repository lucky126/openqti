package cn.com.open.openqti;

/**
 * Created by lucky on 2017/6/29.
 */

/**
 * 匹配题项
 */
public class OpenSimpleAssociableChoiceAtomicItem extends OpenAtomicItem {
    /**
     * 标识
     */
    private String identifier;
    /**
     * 内容
     */
    private String content;

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
     * 匹配题项构造函数
     *
     * @param identifier 标识
     * @param content    内容
     */
    public OpenSimpleAssociableChoiceAtomicItem(String identifier, String content) {
        this.identifier = identifier;
        this.content = content;
    }
}
