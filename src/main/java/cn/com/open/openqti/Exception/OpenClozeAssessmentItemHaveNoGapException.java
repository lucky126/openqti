package cn.com.open.openqti.Exception;

/**
 * Created by lucky on 2017/6/28.
 */

/**
 * 完形填空不含空
 */
public class OpenClozeAssessmentItemHaveNoGapException extends Exception {
    /**
     * 完形填空不含空
     *
     * @param itemIdentifier 试题
     * @param itemTitle      试题标题
     */
    public OpenClozeAssessmentItemHaveNoGapException(String itemIdentifier, String itemTitle) {
        super(String.format(ExceptionMessage.openClozeAssessmentItemHaveNoGap, itemIdentifier, itemTitle));
    }

    /**
     * Instantiates a new Open cloze assessment item have no gap exception.
     */
    public OpenClozeAssessmentItemHaveNoGapException() {
        this("", "");
    }
}
