package cn.com.open.openqti;

import cn.com.open.qti.*;
import cn.com.open.utils.JaxbUtil;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by lucky on 2017/6/30.
 */
public class OpenAssessmentTest {
    /**
     * ID
     */
    private String identifier;
    /**
     * 标题
     */
    private String title;
    /**
     * 部分（Part）集合
     */
    private Collection<OpenTestPart> testPartCollection;

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
        return title;
    }

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets test part collection.
     *
     * @return the test part collection
     */
    public Collection<OpenTestPart> getTestPartCollection() {
        if(this.testPartCollection==null)
        {
            this.testPartCollection = new ArrayList<OpenTestPart>();
        }
        return testPartCollection;
    }

    /**
     * Sets test part collection.
     *
     * @param testPartCollection the test part collection
     */
    public void setTestPartCollection(Collection<OpenTestPart> testPartCollection) {
        if(this.testPartCollection==null)
        {
            this.testPartCollection = new ArrayList<OpenTestPart>();
        }
        this.testPartCollection = testPartCollection;
    }

    /**
     * 转换为IMS试卷
     *
     * @return IMS试卷
     */
    private AssessmentTest TranslateToImsTest() {
        AssessmentTest imsTest = new AssessmentTest();
        imsTest.setIdentifier(getIdentifier());
        imsTest.setTitle(getTitle());

        OutcomeDeclarationType imsScoreOutcomeDeclaration = new OutcomeDeclarationType();
        imsScoreOutcomeDeclaration.setIdentifier("SCORE");
        imsScoreOutcomeDeclaration.setBaseType(BaseTypeType.FLOAT);
        imsScoreOutcomeDeclaration.setCardinality(CardinalityType.SINGLE);
        imsTest.getOutcomeDeclaration().add(imsScoreOutcomeDeclaration);

        for (OpenTestPart part : getTestPartCollection()) {
            imsTest.getTestPart().add(part.TranslateToImsTestPart());
        }

        return imsTest;
    }

    /**
     * 从IMS试卷转换
     *
     * @param imsTest IMS试卷
     */
    private void TranslateFromImsTest(AssessmentTest imsTest) throws Exception {
        setIdentifier(imsTest.getIdentifier());
        setTitle(imsTest.getTitle());
        for (TestPartType part : imsTest.getTestPart()) {
            getTestPartCollection().add(new OpenTestPart(part));
        }
    }

    /**
     * 试卷构造函数
     */
    public OpenAssessmentTest() {
    }

    /**
     * 试卷构造函数
     *
     * @param identifier         试卷ID
     * @param title              标题
     * @param testPartCollection 试题部分集合
     */
    public OpenAssessmentTest(String identifier, String title, List<OpenTestPart> testPartCollection) {
        setIdentifier(identifier);
        setTitle(title);
        setTestPartCollection(testPartCollection);
    }

    /**
     * 从XML文本加载试题.
     *
     * @param xmlString the xml string
     * @throws Exception the exception
     */
    public void LoadFromString(String xmlString) throws Exception {
        AssessmentTest imsAssessmentTest;

        JAXBContext jc = JaxbUtil.jaxbContextMap.get(AssessmentTest.class.getName());
        if(jc == null){
            // 如果每次都调用JAXBContext.newInstance方法，会导致性能急剧下降
            jc = JAXBContext.newInstance(AssessmentTest.class);
            JaxbUtil.jaxbContextMap.put(AssessmentTest.class.getName(), jc);
        }

        Unmarshaller u = jc.createUnmarshaller();
        JAXBElement<AssessmentTest> o = (JAXBElement<AssessmentTest>) u.unmarshal(new StringReader(xmlString));
        imsAssessmentTest = o.getValue();

        TranslateFromImsTest(imsAssessmentTest);
    }

    /**
     * 获取试题XML内容
     *
     * @return xml string
     * @throws Exception the exception
     */
    public String getXmlString() throws Exception {
        AssessmentTest imsAssessmentTest = TranslateToImsTest();

        String xml = convertToXml(imsAssessmentTest, "UTF-8");

        return xml.replace("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>", "");
    }

    /**
     * JavaBean转换成xml
     * @param obj
     * @param encoding
     * @return
     */
    public static String convertToXml(AssessmentTest obj, String encoding) {
        String result = null;
        try {
            JAXBContext jc = JaxbUtil.jaxbContextMap.get(AssessmentTest.class.getName());
            if(jc == null){
                // 如果每次都调用JAXBContext.newInstance方法，会导致性能急剧下降
                jc = JAXBContext.newInstance(AssessmentTest.class);
                JaxbUtil.jaxbContextMap.put(AssessmentTest.class.getName(), jc);
            }

            Marshaller marshaller = jc.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.setProperty(Marshaller.JAXB_ENCODING, encoding);

            StringWriter writer = new StringWriter();
            marshaller.marshal(obj, writer);
            result = writer.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}
