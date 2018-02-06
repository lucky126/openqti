package cn.com.open.openqti.Exception;

/**
 * Created by lucky on 2017/6/26.
 */
/**
 * 题型未知的试题不能用于构建复合题异常
 */
public class OpenCompositeSubItemTypeCanNotBeUnknownException extends Exception {
    /**
     * 题型未知的试题不能用于构建复合题异常
     *
     * @param itemIdentifier 试题
     * @param itemTitle      试题标题
     * @param sequence       子题序号
     */
    public OpenCompositeSubItemTypeCanNotBeUnknownException(String itemIdentifier, String itemTitle, int sequence) {
        super(String.format(ExceptionMessage.openCompositeSubItemTypeCanNotBeUnknownMessage, itemIdentifier, itemTitle, sequence));
    }

    /**
     * 题型未知的试题不能用于构建复合题异常
     *
     * @param sequence 子题序号
     */
    public OpenCompositeSubItemTypeCanNotBeUnknownException(int sequence) {
        this("", "", sequence);
    }

    /**
     * Instantiates a new Open composite sub item type can not be unknown exception.
     */
    public OpenCompositeSubItemTypeCanNotBeUnknownException() {
        this(0);

    }
}
