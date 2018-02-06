package cn.com.open.openqti.Exception;

/**
 * Created by lucky on 2017/6/30.
 */

/**
 * 例题不支持题干显示时长异常
 */
public class ExampleItemNotSupportPromptShowDurationException extends Exception {
    /**
     * 例题不支持题干显示时长异常
     */
    public ExampleItemNotSupportPromptShowDurationException() {
        super(ExceptionMessage.exampleItemNotSupportPromptShowDuration);
    }
}
