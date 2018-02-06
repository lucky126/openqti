package cn.com.open.questiontransfer;

import java.io.Serializable;

/**
 * Created by lucky on 2017/7/4.
 */
public class Choice implements Serializable {
    /**
     * 选项标识
     */
    private String I1;
    /**
     * 选项内容
     */
    private String I2;
    /**
     * 是否正确答案
     */
    private Boolean IsCorrect;

    /**
     * Gets i 1.
     *
     * @return the i 1
     */
    public String getI1() {
        return I1;
    }

    /**
     * Sets i 1.
     *
     * @param i1 the 1
     */
    public void setI1(String i1) {
        I1 = i1;
    }

    /**
     * Gets i 2.
     *
     * @return the i 2
     */
    public String getI2() {
        return I2;
    }

    /**
     * Sets i 2.
     *
     * @param i2 the 2
     */
    public void setI2(String i2) {
        I2 = i2;
    }

    /**
     * Gets correct.
     *
     * @return the correct
     */
    public Boolean getCorrect() {
        return IsCorrect;
    }

    /**
     * Sets correct.
     *
     * @param correct the correct
     */
    public void setCorrect(Boolean correct) {
        IsCorrect = correct;
    }
}
