package cn.com.open.openqti.Exception;

/**
 * Created by lucky on 2017/6/20.
 */

/**
 * clozeGap元素缺少必选属性responseIdentifier异常
 *
 * @author lucky
 */
public class ClozeGapRequireResponseIdentifierException extends Exception {
    /**
     * clozeGap元素缺少必选属性responseIdentifier异常
     */
    public ClozeGapRequireResponseIdentifierException()
    {
            super(ExceptionMessage.clozeGapRequireResponseIdentifier);
    }
}
