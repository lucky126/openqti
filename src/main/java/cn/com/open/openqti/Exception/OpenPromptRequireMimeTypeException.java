package cn.com.open.openqti.Exception;

/**
 * Created by lucky on 2017/6/20.
 */

/**
 * OpenPrompt元素缺少必选属性MimeType异常
 *
 * @author lucky
 */
public class OpenPromptRequireMimeTypeException extends Exception {
    /**
     * OpenPrompt元素缺少必选属性MimeType异常
     */
    public OpenPromptRequireMimeTypeException()
    {
            super(ExceptionMessage.openPromptRequireMimeType);
    }
}
