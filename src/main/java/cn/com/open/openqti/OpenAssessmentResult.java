package cn.com.open.openqti;

import cn.com.open.qti.*;
import cn.com.open.utils.JaxbUtil;
import org.apache.commons.collections.map.HashedMap;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/**
 * Created by lucky on 2017/11/13.
 */
public class OpenAssessmentResult {
    /**
     * ID
     */
    private String identifier;

    /**
     * 最后作答时间
     */
    private XMLGregorianCalendar datestamp;

    /**
     * 考生作答时长
     */
    private int candidateResponseDuration;

    /**
     * 试卷分数
     */
    private double testScore;

    /**
     * 考生分数
     */
    private double candidateScore;

    /**
     * 试题作答结果集合
     */
    private Collection<OpenItemResult> itemResultCollection;

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
     * Gets datestamp.
     *
     * @return the datestamp
     */
    public XMLGregorianCalendar getDatestamp() {
        return datestamp;
    }

    /**
     * Sets datestamp.
     *
     * @param datestamp the datestamp
     */
    public void setDatestamp(XMLGregorianCalendar datestamp) {
        this.datestamp = datestamp;
    }

    /**
     * Gets candidate response duration.
     *
     * @return the candidate response duration
     */
    public int getCandidateResponseDuration() {
        return candidateResponseDuration;
    }

    /**
     * Sets candidate response duration.
     *
     * @param candidateResponseDuration the candidate response duration
     */
    public void setCandidateResponseDuration(int candidateResponseDuration) {
        this.candidateResponseDuration = candidateResponseDuration;
    }

    /**
     * Gets test score.
     *
     * @return the test score
     */
    public double getTestScore() {
        return testScore;
    }

    /**
     * Sets test score.
     *
     * @param testScore the test score
     */
    public void setTestScore(double testScore) {
        this.testScore = testScore;
    }

    /**
     * Gets candidate score.
     *
     * @return the candidate score
     */
    public double getCandidateScore() {
        return candidateScore;
    }

    /**
     * Sets candidate score.
     *
     * @param candidateScore the candidate score
     */
    public void setCandidateScore(double candidateScore) {
        this.candidateScore = candidateScore;
    }

    /**
     * Gets item result collection.
     *
     * @return the item result collection
     */
    public Collection<OpenItemResult> getItemResultCollection() {
        return itemResultCollection;
    }

    /**
     * Sets item result collection.
     *
     * @param itemResultCollection the item result collection
     */
    public void setItemResultCollection(Collection<OpenItemResult> itemResultCollection) {
        this.itemResultCollection = itemResultCollection;
    }

    //region 扩展信息
    /**
     * 扩展信息
     */
    private Map<String, String> extInfo;

    /**
     * Gets ext info.
     *
     * @return the ext info
     */
    public Map<String, String> getExtInfo() {
        if (extInfo == null) {
            extInfo = new HashedMap();
        }
        return extInfo;
    }

    /**
     * 设置扩展信息
     *
     * @param key   the key
     * @param value the value
     */
    public void SetExtInfo(String key, String value) {
        getExtInfo().put(key, value);
    }

    /**
     * 获取扩展信息
     *
     * @param key the key
     * @return the String
     */
    public String getExtInfo(String key) {
        if (getExtInfo().containsKey(key)) {
            return getExtInfo().get(key);
        }

        return null;
    }


    //region 扩展考生信息
    /**
     * 考生作答结果编号
     */
    /**
     * Gets result identifier.
     *
     * @return the result identifier
     */
    public String getResultIdentifier() {
        String value = getExtInfo("resultIdentifier");
        if (value != null) {
            return value;
        } else {
            return "";
        }
    }

    /**
     * Sets result identifier.
     *
     * @param resultIdentifier the result identifier
     */
    public void setResultIdentifier(String resultIdentifier) {
        SetExtInfo("resultIdentifier", resultIdentifier);
    }

    /**
     * 考生编号
     */
    /**
     * Gets examinee id.
     *
     * @return the examinee id
     */
    public int getExamineeID() {
        String value = getExtInfo("examineeID");
        if (value != null) {
            return Integer.valueOf(value);
        } else {
            return 0;
        }
    }

    /**
     * Sets examinee id.
     *
     * @param examineeID the examinee id
     */
    public void setExamineeID(int examineeID) {
        SetExtInfo("examineeID", String.valueOf(examineeID));
    }

    /**
     * 考生登录号.
     */
    /**
     * Gets exam card no.
     *
     * @return the exam card no
     */
    public String getExamCardNo() {
        String value = getExtInfo("examCardNo");
        return value;
    }

    /**
     * Sets exam card no.
     *
     * @param examCardNo the exam card no
     */
    public void setExamCardNo(String examCardNo) {
        SetExtInfo("examCardNo", examCardNo);
    }

    /**
     * 考生姓名.
     */
    /**
     * Gets examinee name.
     *
     * @return the examinee name
     */
    public String getExamineeName() {
        String value = getExtInfo("examineeName");
        return value;
    }

    /**
     * Sets examinee name.
     *
     * @param examineeName the examinee name
     */
    public void setExamineeName(String examineeName) {
        SetExtInfo("examineeName", examineeName);
    }

    /**
     * 考试科目编号.
     */
    /**
     * Gets exam subject id.
     *
     * @return the exam subject id
     */
    public int getExamSubjectID() {
        String value = getExtInfo("examSubjectID");
        if (value != null) {
            return Integer.valueOf(value);
        } else {
            return 0;
        }
    }

    /**
     * Sets exam subject id.
     *
     * @param examSubjectID the exam subject id
     */
    public void setExamSubjectID(int examSubjectID) {
        SetExtInfo("examSubjectID", String.valueOf(examSubjectID));
    }


    /**
     * 考试科目名称.
     */
    /**
     * Gets exam subject name.
     *
     * @return the exam subject name
     */
    public String getExamSubjectName() {
        String value = getExtInfo("examSubjectName");
        return value;
    }

    /**
     * Sets exam subject name.
     *
     * @param examSubjectName the exam subject name
     */
    public void setExamSubjectName(String examSubjectName) {
        SetExtInfo("examSubjectName", examSubjectName);
    }

    /**
     * 考试计划编号.
     */
    /**
     * Gets exam plan id.
     *
     * @return the exam plan id
     */
    public int getExamPlanID() {
        String value = getExtInfo("examPlanID");
        if (value != null) {
            return Integer.valueOf(value);
        } else {
            return 0;
        }
    }

    /**
     * Sets exam plan id.
     *
     * @param examPlanID the exam plan id
     */
    public void setExamPlanID(int examPlanID) {
        SetExtInfo("examPlanID", String.valueOf(examPlanID));
    }

    /**
     * 考试计划名称.
     */
    /**
     * Gets exam plan name.
     *
     * @return the exam plan name
     */
    public String getExamPlanName() {
        String value = getExtInfo("examPlanName");
        return value;
    }

    /**
     * Sets exam plan name.
     *
     * @param examPlanName the exam plan name
     */
    public void setExamPlanName(String examPlanName) {
        SetExtInfo("examPlanName", examPlanName);
    }

    /**
     * 考点编号.
     */
    /**
     * Gets exam site id.
     *
     * @return the exam site id
     */
    public int getExamSiteID() {
        String value = getExtInfo("examSiteID");
        if (value != null) {
            return Integer.valueOf(value);
        } else {
            return 0;
        }
    }

    /**
     * Sets exam site id.
     *
     * @param examSiteID the exam site id
     */
    public void setExamSiteID(int examSiteID) {
        SetExtInfo("examSiteID", String.valueOf(examSiteID));
    }


    /**
     * 考点名称.
     */
    /**
     * Gets exam site name.
     *
     * @return the exam site name
     */
    public String getExamSiteName() {
        String value = getExtInfo("examSiteName");
        return value;
    }

    /**
     * Sets exam site name.
     *
     * @param examSiteName the exam site name
     */
    public void setExamSiteName(String examSiteName) {
        SetExtInfo("examSiteName", examSiteName);
    }


    /**
     * 考场编号.
     */
    /**
     * Gets exam room id.
     *
     * @return the exam room id
     */
    public int getExamRoomID() {
        String value = getExtInfo("examRoomID");
        if (value != null) {
            return Integer.valueOf(value);
        } else {
            return 0;
        }
    }

    /**
     * Sets exam room id.
     *
     * @param examRoomID the exam room id
     */
    public void setExamRoomID(int examRoomID) {
        SetExtInfo("examRoomID", String.valueOf(examRoomID));
    }


    /**
     * 考场名称.
     */
    /**
     * Gets exam room name.
     *
     * @return the exam room name
     */
    public String getExamRoomName() {
        String value = getExtInfo("examRoomName");
        return value;
    }

    /**
     * Sets exam room name.
     *
     * @param examRoomName the exam room name
     */
    public void setExamRoomName(String examRoomName) {
        SetExtInfo("examRoomName", examRoomName);
    }


    /**
     * 场次编号.
     */
    /**
     * Gets exam scene id.
     *
     * @return the exam scene id
     */
    public int getExamSceneID() {
        String value = getExtInfo("examSceneID");
        if (value != null) {
            return Integer.valueOf(value);
        } else {
            return 0;
        }
    }

    /**
     * Sets exam scene id.
     *
     * @param examSceneID the exam scene id
     */
    public void setExamSceneID(int examSceneID) {
        SetExtInfo("examSceneID", String.valueOf(examSceneID));
    }

    /**
     * 场次名称
     */
    /**
     * Gets exam scene name.
     *
     * @return the exam scene name
     */
    public String getExamSceneName() {
        String value = getExtInfo("examSceneName");
        return value;
    }

    /**
     * Sets exam scene name.
     *
     * @param examSceneName the exam scene name
     */
    public void setExamSceneName(String examSceneName) {
        SetExtInfo("examSceneName", examSceneName);
    }

    /**
     * 主办方编号
     */
    /**
     * Gets organizer id.
     *
     * @return the organizer id
     */
    public int getOrganizerID() {
        String value = getExtInfo("organizerID");
        if (value != null) {
            return Integer.valueOf(value);
        } else {
            return 0;
        }
    }

    /**
     * Sets organizer id.
     *
     * @param organizerID the organizer id
     */
    public void setOrganizerID(int organizerID) {
        SetExtInfo("organizerID", String.valueOf(organizerID));
    }

    /**
     * 主办方名称
     */
    /**
     * Gets organizer name.
     *
     * @return the organizer name
     */
    public String getOrganizerName() {
        String value = getExtInfo("organizerName");
        return value;
    }

    /**
     * Sets organizer name.
     *
     * @param organizerName the organizer name
     */
    public void setOrganizerName(String organizerName) {
        SetExtInfo("organizerName", organizerName);
    }
    //endregion

    //endregion


    /**
     * Instantiates a new Open assessment result.
     */
    public OpenAssessmentResult() {
    }

    /**
     * 试卷作答结果构造函数.
     *
     * @param resultIdentifier          作答结果编号
     * @param examineeID                考生编号
     * @param examCardNo                考生登录号
     * @param examineeName              考生姓名
     * @param examSubjectID             考试科目编号
     * @param examSubjectName           考试科目名称
     * @param examPlanID                考试计划编号
     * @param examPlanName              考试计划名称
     * @param examSiteID                考点编号
     * @param examSiteName              考点名称
     * @param examRoomID                考场编号
     * @param examRoomName              考场名称
     * @param examSceneID               场次编号
     * @param examSceneName             场次名称
     * @param organizerID               主办方编号
     * @param organizerName             主办方名称
     * @param identifier                试卷ID
     * @param datestamp                 最后作答时间
     * @param candidateResponseDuration 考生作答时长
     * @param testScore                 试卷分数
     * @param candidateScore            考生分数
     * @param itemResults               试题作答结果集合
     */
    public OpenAssessmentResult(
            String resultIdentifier, int examineeID, String examCardNo, String examineeName,
            int examSubjectID, String examSubjectName, int examPlanID, String examPlanName,
            int examSiteID, String examSiteName, int examRoomID, String examRoomName,
            int examSceneID, String examSceneName, int organizerID, String organizerName,
            String identifier, XMLGregorianCalendar datestamp, int candidateResponseDuration,
            double testScore, double candidateScore,
            Collection<OpenItemResult> itemResults) {
        setResultIdentifier(resultIdentifier);
        setExamineeID(examineeID);
        setExamCardNo(examCardNo);
        setExamineeName(examineeName);
        setExamSubjectID(examSubjectID);
        setExamSubjectName(examSubjectName);
        setExamPlanID(examPlanID);
        setExamPlanName(examPlanName);
        setExamSiteID(examSiteID);
        setExamSiteName(examSiteName);
        setExamRoomID(examRoomID);
        setExamRoomName(examRoomName);
        setExamSceneID(examSceneID);
        setExamSceneName(examSceneName);
        setOrganizerID(organizerID);
        setOrganizerName(organizerName);

        this.identifier = identifier;
        this.datestamp = datestamp;
        this.candidateResponseDuration = candidateResponseDuration;
        this.testScore = testScore;
        this.candidateScore = candidateScore;
        itemResultCollection = itemResults;
    }

    /**
     * 试卷作答结果构造函数.
     * 无试卷分数、考生分数
     *
     * @param resultIdentifier          作答结果编号
     * @param examineeID                考生编号
     * @param examCardNo                考生登录号
     * @param examineeName              考生姓名
     * @param examSubjectID             考试科目编号
     * @param examSubjectName           考试科目名称
     * @param examPlanID                考试计划编号
     * @param examPlanName              考试计划名称
     * @param examSiteID                考点编号
     * @param examSiteName              考点名称
     * @param examRoomID                考场编号
     * @param examRoomName              考场名称
     * @param examSceneID               场次编号
     * @param examSceneName             场次名称
     * @param organizerID               主办方编号
     * @param organizerName             主办方名称
     * @param identifier                试卷ID
     * @param datestamp                 最后作答时间
     * @param candidateResponseDuration 考生作答时长
     * @param itemResults               试题作答结果集合
     */
    public OpenAssessmentResult(
            String resultIdentifier, int examineeID, String examCardNo, String examineeName,
            int examSubjectID, String examSubjectName, int examPlanID, String examPlanName,
            int examSiteID, String examSiteName, int examRoomID, String examRoomName,
            int examSceneID, String examSceneName, int organizerID, String organizerName,
            String identifier, XMLGregorianCalendar datestamp, int candidateResponseDuration, Collection<OpenItemResult> itemResults) {
        this(
                resultIdentifier, examineeID, examCardNo, examineeName,
                examSubjectID, examSubjectName, examPlanID, examPlanName,
                examSiteID, examSiteName, examRoomID, examRoomName,
                examSceneID, examSceneName, organizerID, organizerName,
                identifier, datestamp, candidateResponseDuration, 0, 0, itemResults);
    }

    /**
     * 试卷作答结果构造函数.
     *
     * @param imsAssessmentResult IMS试卷作答结果
     */
    protected OpenAssessmentResult(AssessmentResult imsAssessmentResult) {
        translateFromImsAssessmentResult(imsAssessmentResult);
    }

    /**
     * 从IMS试题作答结果转换.
     *
     * @param imsAssessmentResult IMS试题作答结果
     */
    private void translateFromImsAssessmentResult(AssessmentResult imsAssessmentResult) {
        //region context 扩展考生信息
        if (imsAssessmentResult.getContext() != null &&
                imsAssessmentResult.getContext().getIdentification() != null &&
                imsAssessmentResult.getContext().getIdentification().getExtIdentification() != null &&
                imsAssessmentResult.getContext().getIdentification().getExtIdentification().getValue() != null &&
                imsAssessmentResult.getContext().getIdentification().getExtIdentification().getValue().size() > 0) {
            for (ValueType examineeValue : imsAssessmentResult.getContext().getIdentification().getExtIdentification().getValue()) {
                SetExtInfo(examineeValue.getFieldIdentifier(), examineeValue.getValue());
            }
        }
        //endregion

        //region testResult
        if (imsAssessmentResult.getTestResult() != null) {
            setIdentifier(imsAssessmentResult.getTestResult().getIdentifier());
            setDatestamp(imsAssessmentResult.getTestResult().getDatestamp());

            if (imsAssessmentResult.getTestResult().getItemVariableElementGroup() != null) {
                for (Object obj : imsAssessmentResult.getTestResult().getItemVariableElementGroup()) {
                    //region responseVariable
                    if (obj instanceof ResponseVariableType) {
                        ResponseVariableType respVar = (ResponseVariableType) obj;
                        switch (respVar.getIdentifier()) {
                            case "duration":
                                if (respVar.getCandidateResponse() != null &&
                                        respVar.getCandidateResponse().getValue() != null &&
                                        respVar.getCandidateResponse().getValue().size() > 0) {
                                    setCandidateResponseDuration(Integer.parseInt(respVar.getCandidateResponse().getValue().get(0).getValue()));
                                }
                                break;
                        }
                    }
                    //endregion

                    //region outcomeVariable
                    if (obj instanceof OutcomeVariableType) {
                        OutcomeVariableType outVar = (OutcomeVariableType) obj;

                        switch (outVar.getIdentifier()) {
                            case "SCORE":
                                setTestScore(outVar.getNormalMaximum());

                                if (outVar.getValue() != null &&
                                        outVar.getValue().size() > 0) {
                                    setCandidateScore(Double.parseDouble(outVar.getValue().get(0).getValue()));
                                }
                                break;
                        }
                    }
                    //endregion
                }
            }
        }
        //endregion

        setItemResultCollection(TranslateFromImsItemResultCollection(imsAssessmentResult.getItemResult()));
    }

    /**
     * 转换为IMS试题作答结果.
     *
     * @return IMS试题作答结果 assessment result
     */
    protected AssessmentResult TranslateToImsAssessmentResult() {
        AssessmentResult imsAssessmentResult = new AssessmentResult();

        //region context 扩展考生信息
        ContextType assessmentContext = new ContextType();
        Identification lipIdentification = new Identification();
        Collection<ValueType> examineeValues = new ArrayList<>();
        ValueType examineeValue = null;

        for (Map.Entry<String, String> kvp : extInfo.entrySet()) {
            examineeValue = new ValueType();
            examineeValue.setFieldIdentifier(kvp.getKey());
            examineeValue.setValue(kvp.getValue());
            examineeValues.add(examineeValue);
        }
        ExtIdentificationType extIdentificationType = new ExtIdentificationType();
        extIdentificationType.getValue().addAll(examineeValues);
        lipIdentification.setExtIdentification(extIdentificationType);
        assessmentContext.setIdentification(lipIdentification);

        imsAssessmentResult.setContext(assessmentContext);

        //endregion

        TestResultType imsTestResult = new TestResultType();
        imsTestResult.setIdentifier(getIdentifier());
        imsTestResult.setDatestamp(getDatestamp());

        //region duration responseVariable
        ResponseVariableType durationVar = new ResponseVariableType();
        durationVar.setIdentifier("duration");
        durationVar.setCardinality(CardinalityType.SINGLE);
        durationVar.setBaseType(BaseTypeType.DURATION);

        CandidateResponseType durationCandidateResponse = new CandidateResponseType();
        ValueType durationCandidateResponseValue = new ValueType();
        durationCandidateResponseValue.setValue(String.valueOf(getCandidateResponseDuration()));
        durationCandidateResponse.getValue().add(durationCandidateResponseValue);
        durationVar.setCandidateResponse(durationCandidateResponse);

        imsTestResult.getItemVariableElementGroup().add(durationVar);
        //endregion

        //region SCORE outcomeVariable
        OutcomeVariableType scoreVar = new OutcomeVariableType();
        scoreVar.setIdentifier("SCORE");
        scoreVar.setCardinality(CardinalityType.SINGLE);
        scoreVar.setBaseType(BaseTypeType.FLOAT);
        scoreVar.setNormalMaximum(getTestScore());

        ValueType candidateScoreValue = new ValueType();
        candidateScoreValue.setValue(String.valueOf(getCandidateScore()));
        scoreVar.getValue().add(candidateScoreValue);

        imsTestResult.getItemVariableElementGroup().add(scoreVar);
        //endregion

        imsAssessmentResult.setTestResult(imsTestResult);

        imsAssessmentResult.getItemResult().addAll(TranslateToImsItemResultCollection(getItemResultCollection()));

        return imsAssessmentResult;
    }

    /**
     * 从IMS试题作答结果集合转换.
     *
     * @param imsItemResultCollection IMS试题作答结果集合
     * @return the collection
     */
    protected Collection<OpenItemResult> TranslateFromImsItemResultCollection(Collection<ItemResultType> imsItemResultCollection) {
        Collection<OpenItemResult> openItemResults = new ArrayList<>();

        if (imsItemResultCollection != null) {
            for (ItemResultType imsItemResult : imsItemResultCollection) {
                openItemResults.add(new OpenItemResult(imsItemResult));
            }
        }

        return openItemResults;
    }

    /**
     * 转换为IMS试题作答结果集合.
     *
     * @param openItemResults the open item results
     * @return IMS试题作答结果集合 collection
     */
    protected Collection<ItemResultType> TranslateToImsItemResultCollection(Collection<OpenItemResult> openItemResults) {
        Collection<ItemResultType> imsItemResultCollection = new ArrayList<>();
        for (OpenItemResult openItemResult : openItemResults) {
            imsItemResultCollection.add(openItemResult.TranslateToImsItemResult());
        }

        return imsItemResultCollection;
    }

    /**
     * 从XML文本加载试卷作答结果
     *
     * @param xmlString the xml string
     * @throws Exception the exception
     */
    public void loadFromString(String xmlString) throws Exception {
        AssessmentResult imsAssessmentResult;

        JAXBContext jc = JaxbUtil.jaxbContextMap.get(AssessmentResult.class.getName());
        if(jc == null){
            // 如果每次都调用JAXBContext.newInstance方法，会导致性能急剧下降
            jc = JAXBContext.newInstance(AssessmentResult.class);
            JaxbUtil.jaxbContextMap.put(AssessmentResult.class.getName(), jc);
        }

        Unmarshaller u = jc.createUnmarshaller();
        imsAssessmentResult = (AssessmentResult) u.unmarshal(new StringReader(xmlString));

        translateFromImsAssessmentResult(imsAssessmentResult);
    }

    /**
     * 获取试卷作答结果XML内容
     *
     * @return xml string
     * @throws Exception the exception
     */
    public String getXmlString() throws Exception {
        AssessmentResult imsAssessmentResult = TranslateToImsAssessmentResult();

        String xml = convertToXml(imsAssessmentResult, "UTF-8");

        return xml.replace("<?xml version=\"1.0\" encoding=\"UTF-8\"?>", "");
    }

    /**
     * JavaBean转换成xml
     * @param obj
     * @param encoding
     * @return
     */
    public static String convertToXml(AssessmentResult obj, String encoding) {
        String result = null;
        try {
            JAXBContext jc = JaxbUtil.jaxbContextMap.get(AssessmentResult.class.getName());
            if(jc == null){
                // 如果每次都调用JAXBContext.newInstance方法，会导致性能急剧下降
                jc = JAXBContext.newInstance(AssessmentResult.class);
                JaxbUtil.jaxbContextMap.put(AssessmentResult.class.getName(), jc);
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
