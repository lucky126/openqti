package cn.com.open.qti.rules;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucky on 2017/7/3.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chapterScope.type")
public class ChapterScopeType {
    /**
     * The Chapter id.
     */
    protected List<String> chapterID;

    /**
     * Gets chapterID.
     *
     * @return the subject
     */
    public List<String> getChapterID() {
        if (chapterID == null) {
            chapterID = new ArrayList<String>();
        }
        return this.chapterID;
    }
}
