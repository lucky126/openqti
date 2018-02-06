package cn.com.open.openqti.Exception;

/**
 * Created by lucky on 2017/6/21.
 */

/**
 * OpenPrompt元素中ConvertValue中clozeGap元素个数与clozeGap元素不一致异常
 *
 * @author lucky
 */
public class OpenPromptConvertValueNotMatchClozeGapException extends Exception {
    /**
     * OpenPrompt元素中ConvertValue中clozeGap元素个数与clozeGap元素不一致异常
     */
    public OpenPromptConvertValueNotMatchClozeGapException() {
        super(ExceptionMessage.openPromptConvertValueNotMatchClozeGap);
    }
}
