package cn.com.open.openqti.Exception;

/**
 * Created by lucky on 2017/6/21.
 */

/**
 * OpenPrompt元素中ConvertValue中media元素个数与media元素不一致异常
 *
 * @author lucky
 */
public class OpenPromptConvertValueNotMatchMediaException extends Exception {
    /**
     * OpenPrompt元素中ConvertValue中media元素个数与media元素不一致异常
     */
    public OpenPromptConvertValueNotMatchMediaException() {
        super(ExceptionMessage.openPromptConvertValueNotMatchMedia);
    }
}
