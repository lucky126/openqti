package cn.com.open.testpapertransfer;


import java.io.Serializable;

/**
 * Created by lucky on 2017/11/7.
 */
public class PaperModel implements Serializable {

    //region property define
    /**
     * 试卷ID
     */
    private String P1;
    /**
     * 试卷标题
     */
    private String P2;
    /**
     * 所属课程
     */
    private String P3;
    /**
     * 所属机构
     */
    private String P4;
    /**
     * 试卷分数
     */
    private double P5;
    /**
     * 创建者
     */
    private String P6;


    /**
     * Gets p 1.
     *
     * @return the p 1
     */
    public String getP1() {
        return P1;
    }

    /**
     * Sets p 1.
     *
     * @param p1 the p 1
     */
    public void setP1(String p1) {
        P1 = p1;
    }

    /**
     * Gets p 2.
     *
     * @return the p 2
     */
    public String getP2() {
        return P2;
    }

    /**
     * Sets p 2.
     *
     * @param p2 the p 2
     */
    public void setP2(String p2) {
        P2 = p2;
    }

    /**
     * Gets p 3.
     *
     * @return the p 3
     */
    public String getP3() {
        return P3;
    }

    /**
     * Sets p 3.
     *
     * @param p3 the p 3
     */
    public void setP3(String p3) {
        P3 = p3;
    }

    /**
     * Gets p 4.
     *
     * @return the p 4
     */
    public String getP4() {
        return P4;
    }

    /**
     * Sets p 4.
     *
     * @param p4 the p 4
     */
    public void setP4(String p4) {
        P4 = p4;
    }

    /**
     * Gets p 5.
     *
     * @return the p 5
     */
    public double getP5() {
        return P5;
    }

    /**
     * Sets p 5.
     *
     * @param p5 the p 5
     */
    public void setP5(double p5) {
        P5 = p5;
    }

    /**
     * Gets p 6.
     *
     * @return the p 6
     */
    public String getP6() {
        return P6;
    }

    /**
     * Sets p 6.
     *
     * @param p6 the p 6
     */
    public void setP6(String p6) {
        P6 = p6;
    }

    //endregion

    /**
     * 构造函数
     * 用于构建试卷实体后形成xml用
     */
    public PaperModel() {
        P1 = "";
        P2 = "";
        P3 = "";
        P4 = "";
        P5 = 0;
        P6 = "";
    }
}
