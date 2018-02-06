package cn.com.open.openqti.Exception;

/**
 * Created by lucky on 2017/6/20.
 */

/**
 * 复合题子题内容标识不能为空异常
 *
 * @author lucky
 */
public class OpenCompositeSubItemContentNeedIdException extends Exception {

    /**
     * 复合题子题内容标识不能为空异常
     *
     * @param itemIdentifier 试题
     * @param itemTitle      试题标题
     * @param sequence       子题序号
     */
    public OpenCompositeSubItemContentNeedIdException(String itemIdentifier, String itemTitle, int sequence) {
        super(String.format(ExceptionMessage.openCompositeSubItemContentNeedIdMessage, itemIdentifier, itemTitle, sequence));
    }

    /**
     * 复合题子题内容标识不能为空异常
     *
     * @param sequence 子题序号
     */
    public OpenCompositeSubItemContentNeedIdException(int sequence) {
        this("", "", sequence);
    }

    /**
     * Instantiates a new Open composite sub item content need id exception.
     */
    public OpenCompositeSubItemContentNeedIdException() {
        this(0);
    }
}
