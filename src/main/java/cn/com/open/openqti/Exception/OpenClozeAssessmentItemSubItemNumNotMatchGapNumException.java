package cn.com.open.openqti.Exception;

/**
 * Created by lucky on 2017/6/28.
 */

/**
 * 完形填空空数和子题数不相符异常
 */
public class OpenClozeAssessmentItemSubItemNumNotMatchGapNumException extends Exception {
    /**
     * 完形填空空数和子题数不相符
     *
     * @param itemIdentifier 试题
     * @param itemTitle      试题标题
     */
    public OpenClozeAssessmentItemSubItemNumNotMatchGapNumException(String itemIdentifier, String itemTitle) {
        super(String.format(ExceptionMessage.openClozeAssessmentItemSubItemNumNotMatchGapNum, itemIdentifier, itemTitle));
    }

    /**
     * Instantiates a new Open cloze assessment item sub item num not match gap num exception.
     */
    public OpenClozeAssessmentItemSubItemNumNotMatchGapNumException() {
        this("", "");
    }
}
