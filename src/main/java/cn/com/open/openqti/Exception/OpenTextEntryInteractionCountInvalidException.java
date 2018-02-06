package cn.com.open.openqti.Exception;

/**
 * Created by lucky on 2017/6/21.
 */

/**
 * 填空题试题体内容中的填空项数无效异常
 *
 * @author lucky
 */
public class OpenTextEntryInteractionCountInvalidException extends Exception {
    /**
     * 填空项分数无效异常
     *
     * @param itemIdentifier 试题
     * @param itemTitle      试题标题
     */
    public OpenTextEntryInteractionCountInvalidException(String itemIdentifier, String itemTitle) {
        super(String.format(ExceptionMessage.openTextEntryInteractionCountInvalidMessage, itemIdentifier, itemTitle));
    }

    /**
     * Instantiates a new Open text entry interaction count invalid exception.
     */
    public OpenTextEntryInteractionCountInvalidException() {
        this("", "");
    }
}
