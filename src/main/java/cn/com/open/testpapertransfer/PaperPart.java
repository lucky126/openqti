package cn.com.open.testpapertransfer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucky on 2018/1/11.
 */
public class PaperPart implements Serializable {
    /**
     * 大题列表
     */
    private List<PaperSection> sections;

    /**
     * Gets sections.
     *
     * @return the sections
     */
    public List<PaperSection> getSections() {
        if (sections == null) {
            sections = new ArrayList<>();
        }
        return sections;
    }
}
