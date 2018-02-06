package cn.com.open.openqti.Exception;

/**
 * Created by lucky on 2017/6/26.
 */

/**
 * 复合题的问答子题缺少输入框异常
 */
public class OpenCompositeExtendedTextSubItemNeedInteractionException extends Exception {
    /**
     * 复合题的问答子题缺少输入框异常
     *
     * @param itemIdentifier 试题
     * @param itemTitle      试题标题
     * @param sequence       子题序号
     */
    public OpenCompositeExtendedTextSubItemNeedInteractionException(String itemIdentifier, String itemTitle, int sequence) {
        super(String.format(ExceptionMessage.openCompositeExtendedTextSubItemNeedInteractionMessage, itemIdentifier, itemTitle, sequence));
    }

    /**
     * 复合题的问答子题缺少输入框异常
     *
     * @param sequence 子题序号
     */
    public OpenCompositeExtendedTextSubItemNeedInteractionException(int sequence) {
        this("", "", sequence);
    }

    /**
     * Instantiates a new Open composite extended text sub item need interaction exception.
     */
    public OpenCompositeExtendedTextSubItemNeedInteractionException() {
        this(0);
    }
}
