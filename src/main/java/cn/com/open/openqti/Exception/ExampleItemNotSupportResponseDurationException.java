package cn.com.open.openqti.Exception;

/**
 * Created by lucky on 2017/6/30.
 */

/**
 * 例题不支持题目答题时长异常
 */
public class ExampleItemNotSupportResponseDurationException extends Exception {
    /**
     * 例题不支持题目答题时长异常
     */
    public ExampleItemNotSupportResponseDurationException() {
        super(ExceptionMessage.exampleItemNotSupportResponseDuration);
    }
}
