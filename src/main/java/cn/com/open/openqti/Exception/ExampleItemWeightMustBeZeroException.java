package cn.com.open.openqti.Exception;

/**
 * Created by lucky on 2017/6/30.
 */

/**
 * 例题分值必须为0异常
 */
public class ExampleItemWeightMustBeZeroException extends Exception {
    /**
     * 例题分值必须为0异常
     */
    public ExampleItemWeightMustBeZeroException() {
        super(ExceptionMessage.exampleItemWeightMustBeZero);
    }
}
