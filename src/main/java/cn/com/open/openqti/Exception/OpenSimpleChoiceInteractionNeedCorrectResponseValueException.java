package cn.com.open.openqti.Exception;

/**
 * Created by lucky on 2017/6/21.
 */

/**
 * 单项选择交互项（子题）缺少正确答案异常
 *
 * @author lucky
 */
public class OpenSimpleChoiceInteractionNeedCorrectResponseValueException extends Exception {
    /**
     * 单项选择交互项（子题）缺少正确答案异常
     *
     * @param itemIdentifier 试题
     * @param itemTitle      试题标题
     * @param sequence       子题序号
     */
    public OpenSimpleChoiceInteractionNeedCorrectResponseValueException(String itemIdentifier, String itemTitle, int sequence) {
        super(String.format(ExceptionMessage.openChoiceAssessmentItemHasNoCorrectResponseValueMessage, itemIdentifier, itemTitle, sequence));
    }

    /**
     * Instantiates a new Open simple choice interaction need correct response value exception.
     */
    public OpenSimpleChoiceInteractionNeedCorrectResponseValueException() {
        this("", "", 0);
    }
}
