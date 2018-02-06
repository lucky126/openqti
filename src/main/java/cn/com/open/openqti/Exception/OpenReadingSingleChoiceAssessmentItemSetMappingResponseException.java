package cn.com.open.openqti.Exception;

/**
 * Created by lucky on 2017/6/20.
 */

/**
 * 阅读并单选类试题禁止设置MappingResponse
 *
 * @author lucky
 */
public class OpenReadingSingleChoiceAssessmentItemSetMappingResponseException extends Exception {
    /**
     * 阅读并单选类试题禁止设置MappingResponse
     */
    public OpenReadingSingleChoiceAssessmentItemSetMappingResponseException() {
        super(ExceptionMessage.openReadingSingleChoiceAssessmentItemSetMappingResponseMessage);
    }
}
