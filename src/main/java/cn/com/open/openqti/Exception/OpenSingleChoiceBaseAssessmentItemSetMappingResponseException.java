package cn.com.open.openqti.Exception;

/**
 * Created by lucky on 2017/6/20.
 */

/**
 * 单选类试题禁止设置MappingResponse
 *
 * @author lucky
 */
public class OpenSingleChoiceBaseAssessmentItemSetMappingResponseException extends  Exception {
    /**
     * 单选类试题禁止设置MappingResponse
     */
    public OpenSingleChoiceBaseAssessmentItemSetMappingResponseException()
    {
        super(ExceptionMessage.openSingleChoiceBaseAssessmentItemSetMappingResponseMessage);
    }
}
