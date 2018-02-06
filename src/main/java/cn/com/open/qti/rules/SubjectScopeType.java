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
@XmlType(name = "subjectScope.type", propOrder = {
        "subject"
})
public class SubjectScopeType {

    /**
     * The Subject.
     */
    protected List<SubjectType> subject;

    /**
     * Gets subject.
     *
     * @return the subject
     */
    public List<SubjectType> getSubject() {
        if (subject == null) {
            subject = new ArrayList<SubjectType>();
        }
        return this.subject;
    }
}
