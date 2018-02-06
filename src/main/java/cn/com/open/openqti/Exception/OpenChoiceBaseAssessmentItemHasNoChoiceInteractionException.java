package cn.com.open.openqti.Exception;

/**
 * Created by lucky on 2017/6/20.
 */

/**
 * 选择类试题缺少交互项异常
 *
 * @author lucky
 */
public class OpenChoiceBaseAssessmentItemHasNoChoiceInteractionException extends Exception {
    /**
     * 选择类试题缺少交互项异常
     *
     * @param identifier 试题ID
     * @param title      试题标题
     */
    public OpenChoiceBaseAssessmentItemHasNoChoiceInteractionException(String identifier, String title) {
        super(String.format(ExceptionMessage.openChoiceBaseAssessmentItemHasNoChoiceInteractionMessage, identifier, title));
    }

    /**
     * Instantiates a new Open choice base assessment item has no choice interaction exception.
     */
    public OpenChoiceBaseAssessmentItemHasNoChoiceInteractionException() {
        this("", "");
    }
}
