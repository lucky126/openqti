package cn.com.open.openqti.Exception;

/**
 * Created by lucky on 2017/6/27.
 */

/**
 * 复合题子题总分无效异常
 */
public class OpenCompositeSubItemTotalScoreInvalidException extends Exception {
    /**
     * 复合题子题总分无效异常
     *
     * @param itemIdentifier 试题
     * @param itemTitle      试题标题
     */
    public OpenCompositeSubItemTotalScoreInvalidException(String itemIdentifier, String itemTitle) {
        super(String.format(ExceptionMessage.openCompositeSubItemTotalScoreInvalidMessage, itemIdentifier, itemTitle));
    }

    /**
     * Instantiates a new Open composite sub item total score invalid exception.
     */
    public OpenCompositeSubItemTotalScoreInvalidException() {
        this("", "");
    }
}
