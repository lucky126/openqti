package cn.com.open.rulestransfer;

/**
 * 获取难度类型：0，全部；1，简单；2，中等；3，复杂
 */
public enum DifficultyType {
    /**
     * 全部（默认）
     */
    ALL(0),
    /**
     * 简单
     */
    EASY(1),
    /**
     * 中等
     */
    NORMAL(2),
    /**
     * 复杂
     */
    HARD(3);

    private int index;

    DifficultyType(int idx) {
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

    /**
     * From value difficulty type.
     *
     * @param v the v
     * @return the difficulty type
     */
    public static DifficultyType fromValue(int v) {
        for (DifficultyType c : DifficultyType.values()) {
            if (c.getIndex() == v) {
                return c;
            }
        }
        return null;
    }
}
