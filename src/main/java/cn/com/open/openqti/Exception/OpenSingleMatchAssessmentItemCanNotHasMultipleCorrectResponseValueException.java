package cn.com.open.openqti.Exception;

/**
 * Created by lucky on 2017/6/29.
 */

/**
 * 单项匹配题不能有多个正确答案异常
 */
public class OpenSingleMatchAssessmentItemCanNotHasMultipleCorrectResponseValueException extends Exception {
    /**
     * 单项匹配题不能有多个正确答案异常
     *
     * @param itemIdentifier 试题
     * @param itemTitle      试题标题
     * @param sequence       子题序号
     */
    public OpenSingleMatchAssessmentItemCanNotHasMultipleCorrectResponseValueException(String itemIdentifier, String itemTitle, int sequence) {
        super(String.format(ExceptionMessage.openSingleMatchAssessmentItemCanNotHasMultipleCorrectResponseValueMessage, itemIdentifier, itemTitle, sequence));
    }

    /**
     * Instantiates a new Open single match assessment item can not has multiple correct response value exception.
     */
    public OpenSingleMatchAssessmentItemCanNotHasMultipleCorrectResponseValueException() {
        this("", "", 0);
    }
}
