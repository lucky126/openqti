package cn.com.open.openqti.Exception;

/**
 * Created by lucky on 2017/6/26.
 */

/**
 * 复合题子题类别无效异常
 */
public class OpenCompositeSubItemTypeInvalidException extends Exception {

    /**
     * 复合题子题类别无效异常
     *
     * @param itemIdentifier 试题
     * @param itemTitle      试题标题
     * @param sequence       子题序号
     * @param childItemType  子题类别
     */
    public OpenCompositeSubItemTypeInvalidException(String itemIdentifier, String itemTitle, int sequence, String childItemType) {
        super(String.format(ExceptionMessage.openCompositeSubItemTypeInvalidMessage, itemIdentifier, itemTitle, sequence, childItemType));
    }

    /**
     * 复合题子题类别无效异常
     *
     * @param sequence      子题序号
     * @param childItemType 子题类别
     */
    public OpenCompositeSubItemTypeInvalidException(int sequence, String childItemType) {
        this("", "", sequence, childItemType);
    }

    /**
     * Instantiates a new Open composite sub item type invalid exception.
     */
    public OpenCompositeSubItemTypeInvalidException() {
        this(0, "");
    }
}
