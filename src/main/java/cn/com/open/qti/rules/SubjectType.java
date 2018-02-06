package cn.com.open.qti.rules;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by lucky on 2017/7/3.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subject.type", propOrder = {
        "chapterScope",
        "knowledgeScope"
})
public class SubjectType {
    /**
     * The Chapter scope.
     */
    protected ChapterScopeType chapterScope;
    /**
     * The Knowledge scope.
     */
    protected KnowledgeScopeType knowledgeScope;
    /**
     * The Subject code.
     */
    @XmlAttribute(name = "subjectCode")
    protected Integer subjectCode;

    /**
     * Gets chapter scope.
     *
     * @return the chapter scope
     */
    public ChapterScopeType getChapterScope() {
        return chapterScope;
    }

    /**
     * Sets chapter scope.
     *
     * @param chapterScope the chapter scope
     */
    public void setChapterScope(ChapterScopeType chapterScope) {
        this.chapterScope = chapterScope;
    }

    /**
     * Gets knowledge scope.
     *
     * @return the knowledge scope
     */
    public KnowledgeScopeType getKnowledgeScope() {
        return knowledgeScope;
    }

    /**
     * Sets knowledge scope.
     *
     * @param knowledgeScope the knowledge scope
     */
    public void setKnowledgeScope(KnowledgeScopeType knowledgeScope) {
        this.knowledgeScope = knowledgeScope;
    }

    /**
     * Gets subject code.
     *
     * @return the subject code
     */
    public int getSubjectCode() {
        return subjectCode;
    }

    /**
     * Sets subject code.
     *
     * @param subjectCode the subject code
     */
    public void setSubjectCode(int subjectCode) {
        this.subjectCode = subjectCode;
    }
}
