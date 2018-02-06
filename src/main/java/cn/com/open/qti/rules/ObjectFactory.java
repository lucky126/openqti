package cn.com.open.qti.rules;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * Created by lucky on 2017/7/3.
 */
@XmlRegistry
public class ObjectFactory {
    private final static QName _AssessmentRule_QNAME = new QName("http://www.open.com.cn/schemas/exam/openrule_v1", "assessmentRule");
    /**
     * Create an instance of {@link AssessmentRule }
     *
     */
    public AssessmentRule createAssessmentRuleType() {
        return new AssessmentRule();
    }
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentRule }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openrule_v1", name = "assessmentRule")
    public JAXBElement<AssessmentRule> createAssessmentRule(AssessmentRule value) {
        return new JAXBElement<AssessmentRule>(_AssessmentRule_QNAME, AssessmentRule.class, null, value);
    }
}
