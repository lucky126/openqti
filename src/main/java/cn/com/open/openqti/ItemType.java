package cn.com.open.openqti;

/**
 * Created by lucky on 2017/6/13.
 */

/**
 * 题型
 */
public enum ItemType {
    /**
     * 未知
     */
    UNKNOW(0),
    /**
     * 单选
     */
    SINGLECHOICE(1),
    /**
     * 多选
     */
    MULTIPLECHOICE(2),
    /**
     * 判断
     */
    JUDGEMENT(3),
    /**
     * 填空
     */
    TEXTENTRY(4),
    /**
     * 阅读理解
     */
    READINGCOMPREHENSION(5),
    /**
     * 问答（简答）
     */
    EXTENDEDTEXT(6),
    /**
     * 完型填空
     */
    CLOZE(7),
    /**
     * 匹配
     */
    MATCH(8),
    /**
     * 上传
     */
    UPLOAD(9),
    /**
     * 组合
     */
    COMPOSITE(10),
    /**
     * 组合单选
     */
    COMPOSITESINGLECHOICE(11),
    /**
     * 组合多选
     */
    COMPOSITEMULTIPLECHOICE(12),
    /**
     * 排序
     */
    ORDER(13);
    private int index;

    ItemType(int idx) {
        this.index = idx;
    }

    /**
     * Gets index.
     *
     * @return the index
     */
    public int getIndex() {
        return index;
    }

    public static ItemType fromValue(int v) {
        for (ItemType c : ItemType.values()) {
            if (c.getIndex() == v) {
                return c;
            }
        }
        return null;
    }
}