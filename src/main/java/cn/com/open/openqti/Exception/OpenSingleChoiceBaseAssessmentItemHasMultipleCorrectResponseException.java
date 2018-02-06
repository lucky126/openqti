package cn.com.open.openqti.Exception;

/**
 * Created by lucky on 2017/6/20.
 */

/**
 * 单选类试题有多个正确答案异常
 *
 * @author lucky
 */
public class OpenSingleChoiceBaseAssessmentItemHasMultipleCorrectResponseException extends Exception {
    /**
     * 单选类试题有多个正确答案异常
     *
     * @param identifier 试题ID
     * @param title      试题标题
     */
    public OpenSingleChoiceBaseAssessmentItemHasMultipleCorrectResponseException(String identifier, String title) {
        super(String.format(ExceptionMessage.openSingleChoiceBaseAssessmentItemHasMultipleCorrectResponseMessage, identifier, title));
    }

    /**
     * Instantiates a new Open single choice base assessment item has multiple correct response exception.
     */
    public OpenSingleChoiceBaseAssessmentItemHasMultipleCorrectResponseException() {
        this("", "");
    }
}
