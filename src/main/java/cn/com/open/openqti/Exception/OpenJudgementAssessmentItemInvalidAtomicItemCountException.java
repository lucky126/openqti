package cn.com.open.openqti.Exception;

/**
 * Created by lucky on 2017/6/20.
 */

/**
 * 判断题错误题项数异常
 *
 * @author lucky
 */
public class OpenJudgementAssessmentItemInvalidAtomicItemCountException extends Exception {

    /**
     * 判断题错误题项数异常
     *
     * @param identifier 试题ID
     * @param title      试题标题
     */
    public OpenJudgementAssessmentItemInvalidAtomicItemCountException(String identifier, String title) {
        super(String.format(ExceptionMessage.openJudgementAssessmentItemInvalidAtomicItemCountMessage, identifier, title));
    }


    /**
     * Instantiates a new Open judgement assessment item invalid atomic item count exception.
     */
    public OpenJudgementAssessmentItemInvalidAtomicItemCountException() {
        this("", "");
    }
}
