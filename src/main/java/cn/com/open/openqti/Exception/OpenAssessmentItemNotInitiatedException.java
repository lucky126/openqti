package cn.com.open.openqti.Exception;

/**
 * Created by lucky on 2017/6/20.
 */

/**
 * 试题未初始化异常
 *
 * @author lucky
 */
public class OpenAssessmentItemNotInitiatedException extends Exception {
    /**
     * 试题未初始化异常
     */
    public OpenAssessmentItemNotInitiatedException() {
        super(ExceptionMessage.openAssessmentItemNotInitiatedMessage);
    }
}
