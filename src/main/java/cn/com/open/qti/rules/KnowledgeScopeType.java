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
@XmlType(name = "knowledgeScope.type")
public class KnowledgeScopeType {
    /**
     * The Chapter id.
     */
    protected List<String> knowledgeID;

    /**
     * Gets knowledgeID.
     *
     * @return the subject
     */
    public List<String> getKnowledgeID() {
        if (knowledgeID == null) {
            knowledgeID = new ArrayList<String>();
        }
        return this.knowledgeID;
    }
}
