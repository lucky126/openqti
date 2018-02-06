package cn.com.open.openqti.Exception;

/**
 * Created by lucky on 2017/6/26.
 */
/**
 * 试题标题
 */
public class OpenCompositeAssessmentItemHaveNoSubItemException extends Exception {
    /**
     * 复合题不含子题
     *
     * @param itemIdentifier 试题
     * @param itemTitle      试题标题
     */
    public OpenCompositeAssessmentItemHaveNoSubItemException(String itemIdentifier, String itemTitle) {
        super(String.format(ExceptionMessage.openCompositeAssessmentItemHaveNoSubItem, itemIdentifier, itemTitle));
    }

    /**
     * Instantiates a new Open composite assessment item have no sub item exception.
     */
    public OpenCompositeAssessmentItemHaveNoSubItemException() {
        this("","");
    }
}
