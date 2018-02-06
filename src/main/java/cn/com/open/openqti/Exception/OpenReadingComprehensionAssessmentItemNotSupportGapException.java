package cn.com.open.openqti.Exception;

/**
 * Created by lucky on 2017/6/28.
 */

/**
 * 阅读理解不允许含空
 */
public class OpenReadingComprehensionAssessmentItemNotSupportGapException extends Exception {
    /**
     * 阅读理解不允许含空
     *
     * @param itemIdentifier 试题
     * @param itemTitle      试题标题
     */
    public OpenReadingComprehensionAssessmentItemNotSupportGapException(String itemIdentifier, String itemTitle) {
        super(String.format(ExceptionMessage.openReadingComprehensionAssessmentItemNotSupportGap, itemIdentifier, itemTitle));
    }

    /**
     * Instantiates a new Open reading comprehension assessment item not support gap exception.
     */
    public OpenReadingComprehensionAssessmentItemNotSupportGapException() {
        this("", "");
    }
}
