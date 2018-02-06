package cn.com.open.openqti.Exception;

/**
 * Created by lucky on 2017/6/20.
 */

/**
 * 选择类试题缺少正确答案异常
 *
 * @author lucky
 */
public class OpenChoiceAssessmentItemNeedCorrectResponseValueException extends Exception {
    /**
     * 选择类试题缺少正确答案异常
     *
     * @param identifier 试题ID
     * @param title      试题标题
     */
    public OpenChoiceAssessmentItemNeedCorrectResponseValueException(String identifier, String title) {
        super(String.format(ExceptionMessage.openChoiceAssessmentItemHasNoCorrectResponseValueMessage, identifier, title));
    }

    /**
     * Instantiates a new Open choice assessment item need correct response value exception.
     */
    public OpenChoiceAssessmentItemNeedCorrectResponseValueException() {
        this("","");
    }
}
