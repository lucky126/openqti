package cn.com.open.openqti.Exception;

/**
 * Created by lucky on 2017/6/26.
 */
/**
 * 复合题不能用于构建复合题异常
 */
public class OpenCompositeSubItemTypeCanNotBeCompositeItemException extends Exception {
    /**
     * 复合题不能用于构建复合题异常
     *
     * @param itemIdentifier 试题
     * @param itemTitle      试题标题
     * @param sequence       子题序号
     */
    public OpenCompositeSubItemTypeCanNotBeCompositeItemException(String itemIdentifier, String itemTitle, int sequence) {
        super(String.format(ExceptionMessage.openCompositeSubItemTypeCanNotBeCompositeItemMessage, itemIdentifier, itemTitle, sequence));
    }

    /**
     * 复合题不能用于构建复合题异常
     *
     * @param sequence 子题序号
     */
    public OpenCompositeSubItemTypeCanNotBeCompositeItemException(int sequence) {
        this("", "", sequence);
    }

    /**
     * Instantiates a new Open composite sub item type can not be composite item exception.
     */
    public OpenCompositeSubItemTypeCanNotBeCompositeItemException() {
        this(0);
    }
}
