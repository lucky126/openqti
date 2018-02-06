package cn.com.open.openqti.rules;

import cn.com.open.qti.rules.AssessmentRule;
import cn.com.open.qti.rules.PartType;
import cn.com.open.utils.JaxbUtil;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucky on 2017/7/3.
 */
public class OpenAssessmentRule {
    /**
     * The Part.
     */
    protected List<PartType> part;
    /**
     * The Identifier.
     */
    protected String identifier;
    /**
     * The Total score.
     */
    protected float totalScore;
    /**
     * The Item application type id list.
     */
    protected String itemApplicationTypeIDList;

    /**
     * Gets part.
     *
     * @return the part
     */
    public List<PartType> getPart() {
        if (part == null) {
            part = new ArrayList<PartType>();
        }
        return part;
    }

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
     * Gets total score.
     *
     * @return the total score
     */
    public float getTotalScore() {
        return totalScore;
    }

    /**
     * Sets total score.
     *
     * @param totalScore the total score
     */
    public void setTotalScore(float totalScore) {
        this.totalScore = totalScore;
    }

    /**
     * Gets item application type id list.
     *
     * @return the item application type id list
     */
    public String getItemApplicationTypeIDList() {
        return itemApplicationTypeIDList;
    }

    /**
     * Sets item application type id list.
     *
     * @param itemApplicationTypeIDList the item application type id list
     */
    public void setItemApplicationTypeIDList(String itemApplicationTypeIDList) {
        this.itemApplicationTypeIDList = itemApplicationTypeIDList;
    }

    /**
     * Instantiates a new Open assessment rule.
     */
    public OpenAssessmentRule() {
    }

    /**
     * Instantiates a new Open assessment rule.
     *
     * @param identifier the identifier
     * @param totalScore the total score
     * @param part       the part
     */
    public OpenAssessmentRule(String identifier, float totalScore, List<PartType> part) {
        this.getPart().addAll(part);
        this.setIdentifier(identifier);
        this.setTotalScore(totalScore);
    }

    /**
     * Init.
     *
     * @param openAssessmentRule the open assessment rule
     */
    private void Init(AssessmentRule openAssessmentRule) {
        this.setIdentifier(openAssessmentRule.getIdentifier());
        this.setTotalScore(openAssessmentRule.getTotalScore());
        this.setItemApplicationTypeIDList(openAssessmentRule.getItemApplicationTypeIDList());
        this.getPart().addAll(openAssessmentRule.getPart());
    }

    /**
     * 从XML文本加载试题.
     *
     * @param xmlString the xml string
     * @throws Exception the exception
     */
    public void LoadFromString(String xmlString) throws Exception {
        AssessmentRule imsOpenAssessmentRule;

        JAXBContext jc = JaxbUtil.jaxbContextMap.get(AssessmentRule.class.getName());
        if(jc == null){
            // 如果每次都调用JAXBContext.newInstance方法，会导致性能急剧下降
            jc = JAXBContext.newInstance(AssessmentRule.class);
            JaxbUtil.jaxbContextMap.put(AssessmentRule.class.getName(), jc);
        }

        Unmarshaller unmarshaller = jc.createUnmarshaller();
        imsOpenAssessmentRule = (AssessmentRule) unmarshaller.unmarshal(new StringReader(xmlString));

        Init(imsOpenAssessmentRule);
    }

    /**
     * 获取试题XML内容
     *
     * @return xml string
     * @throws Exception the exception
     */
    public String getXmlString() throws Exception {
        AssessmentRule imsOpenAssessmentRule = translateToImsItem();

        String xml = convertToXml(imsOpenAssessmentRule, "UTF-8");

        return xml.replace("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>", "");
    }

    /**
     * JavaBean转换成xml
     * @param obj
     * @param encoding
     * @return
     */
    public static String convertToXml(AssessmentRule obj, String encoding) {
        String result = null;
        try {
            JAXBContext jc = JaxbUtil.jaxbContextMap.get(AssessmentRule.class.getName());
            if(jc == null){
                // 如果每次都调用JAXBContext.newInstance方法，会导致性能急剧下降
                jc = JAXBContext.newInstance(AssessmentRule.class);
                JaxbUtil.jaxbContextMap.put(AssessmentRule.class.getName(), jc);
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

    /**
     * Translate to ims item assessment rule.
     *
     * @return the assessment rule
     */
    private AssessmentRule translateToImsItem() {
        AssessmentRule imsItem = new AssessmentRule();

        imsItem.setIdentifier(this.getIdentifier());
        imsItem.setTotalScore(this.getTotalScore());
        imsItem.setItemApplicationTypeIDList(this.getItemApplicationTypeIDList());
        imsItem.getPart().addAll(this.getPart());

        return imsItem;
    }
}
