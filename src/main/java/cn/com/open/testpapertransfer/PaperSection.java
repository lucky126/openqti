package cn.com.open.testpapertransfer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucky on 2017/11/7.
 */
public class PaperSection implements Serializable {
    /**
     * 大题标识符
     */
    private String identifier;
    /**
     * 大题标题
     */
    private String Title;
    /**
     * 大题总分
     */
    private double Score;
    /**
     * 是否乱序
     */
    private boolean shuf;
    /**
     * 大题试题列表
     */
    private List<PaperItem> items;

    /**
     * Gets identifier.
     *
     * @return the identifier
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets identifier.
     *
     * @param identifier the identifier
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
        return Title;
    }

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
        Title = title;
    }

    /**
     * Gets score.
     *
     * @return the score
     */
    public double getScore() {
        return Score;
    }

    /**
     * Sets score.
     *
     * @param score the score
     */
    public void setScore(double score) {
        Score = score;
    }

    /**
     * Is shuf boolean.
     *
     * @return the boolean
     */
    public boolean isShuf() {
        return shuf;
    }

    /**
     * Sets shuf.
     *
     * @param shuf the shuf
     */
    public void setShuf(boolean shuf) {
        this.shuf = shuf;
    }

    /**
     * Gets item id.
     *
     * @return the item id
     */
    public List<PaperItem> getItems() {
        if (items == null) {
            items = new ArrayList<>();
        }
        return items;
    }

}
