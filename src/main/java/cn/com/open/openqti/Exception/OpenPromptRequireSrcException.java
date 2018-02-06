package cn.com.open.openqti.Exception;

/**
 * Created by lucky on 2017/6/20.
 */

/**
 * OpenPrompt元素缺少必选属性src异常
 *
 * @author lucky
 */
public class OpenPromptRequireSrcException extends Exception {
    /**
     * OpenPrompt元素缺少必选属性src异常
     */
    public OpenPromptRequireSrcException() {
        super(ExceptionMessage.openPromptRequireSrc);
    }
}
