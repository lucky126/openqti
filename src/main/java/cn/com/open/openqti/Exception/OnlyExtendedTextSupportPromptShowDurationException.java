package cn.com.open.openqti.Exception;

/**
 * Created by lucky on 2017/6/30.
 */

/**
 * 只有问答题支持题干显示时长异常
 */
public class OnlyExtendedTextSupportPromptShowDurationException extends Exception {
    /**
     * 只有问答题支持题干显示时长异常
     */
    public OnlyExtendedTextSupportPromptShowDurationException() {
        super(ExceptionMessage.onlyExtendedTextSupportPromptShowDuration);
    }
}
