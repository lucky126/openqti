package cn.com.open.openqti.Exception;

/**
 * Created by lucky on 2017/6/30.
 */

/**
 * 例题不支持题目准备时长
 */
public class ExampleItemNotSupportPrepareDurationException extends Exception {
    /**
     * 例题不支持题目准备时长异常
     */
    public ExampleItemNotSupportPrepareDurationException() {
        super(ExceptionMessage.exampleItemNotSupportPrepareDuration);
    }
}
