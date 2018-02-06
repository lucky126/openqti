package cn.com.open.openqti.Exception;

/**
 * Created by lucky on 2017/6/29.
 */

/**
 * 单项匹配题左右匹配项数不一致异常
 */
public class OpenSingleMatchAssessmentItemMustHasSameChildItemCountException extends Exception {
    /**
     * 单项匹配题左右匹配项数不一致异常
     *
     * @param itemIdentifier 试题
     * @param itemTitle      试题标题
     */
    public OpenSingleMatchAssessmentItemMustHasSameChildItemCountException(String itemIdentifier, String itemTitle) {
        super(String.format(ExceptionMessage.openSingleMatchAssessmentItemMustHasSameChildItemCountMessage, itemIdentifier, itemTitle));
    }

    /**
     * Instantiates a new Open single match assessment item must has same child item count exception.
     */
    public OpenSingleMatchAssessmentItemMustHasSameChildItemCountException() {
        this("", "");
    }
}
