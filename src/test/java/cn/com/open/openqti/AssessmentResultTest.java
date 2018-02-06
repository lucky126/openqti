package cn.com.open.openqti;

import cn.com.open.qti.*;
import cn.com.open.utils.FileUtil;
import junit.framework.Assert;
import org.junit.Test;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.net.URL;
import java.util.*;
import java.util.Date;

import static org.junit.Assert.assertNotNull;

/**
 * Created by lucky on 2017/11/13.
 */
public class AssessmentResultTest {
    /**
     * 将Date类转换为XMLGregorianCalendar
     *
     * @param date
     * @return
     */
    private XMLGregorianCalendar dateToXmlDate(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        DatatypeFactory dtf = null;
        try {
            dtf = DatatypeFactory.newInstance();
        } catch (DatatypeConfigurationException e) {
        }
        XMLGregorianCalendar dateType = dtf.newXMLGregorianCalendar();
        dateType.setYear(cal.get(Calendar.YEAR));
        //由于Calendar.MONTH取值范围为0~11,需要加1
        dateType.setMonth(cal.get(Calendar.MONTH) + 1);
        dateType.setDay(cal.get(Calendar.DAY_OF_MONTH));
        dateType.setHour(cal.get(Calendar.HOUR_OF_DAY));
        dateType.setMinute(cal.get(Calendar.MINUTE));
        dateType.setSecond(cal.get(Calendar.SECOND));
        return dateType;
    }

    /**
     * 将XMLGregorianCalendar转换为Date
     *
     * @param cal
     * @return
     */
    private Date xmlDate2Date(XMLGregorianCalendar cal) {
        return cal.toGregorianCalendar().getTime();
    }


    /**
     * 测试生成一个Result的QTI XML
     *
     * @throws Exception the exception
     */
    @Test
    public void makeResult() throws Exception {
        String resultIdentifier = "670721cc-b31b-42b0-b8c7-ea6d6d616d91";
        int examineeID = 37983;
        String examCardNo = "8800103";
        String examineeName = "王 文娟";
        int examSubjectID = 189;
        String examSubjectName = "SCCRA（上）";
        int examPlanID = 52;
        String examPlanName = "201507CCRA注册信贷分析师资格认证考试(模拟)";
        int examSiteID = 348;
        String examSiteName = "陕西工贸培训学院";
        int examRoomID = 467;
        String examRoomName = "1310";
        int examSceneID = 139;
        String examSceneName = "第一场";
        int organizerID = 1;
        String organizerName = "网考服务中心";
        String identifier = "0dbbfb7c-b01f-e511-ba8c-0050568c0ed6";
        XMLGregorianCalendar datestamp = dateToXmlDate(new Date());
        int candidateResponseDuration = 0;
        double testScore = 10;
        double candidateScore = 0;
        Collection<OpenItemResult> itemResults = new ArrayList<>();

        //region OpenResultResponseVariable
        List<OpenResultResponseVariable> responseVariables = new ArrayList<>();
        OpenResultResponseVariable resultResponseVar = new OpenResultResponseVariable("RESPONSE", CardinalityType.SINGLE, BaseTypeType.IDENTIFIER,
                "A B C D", "A", "B");
        responseVariables.add(resultResponseVar);
        //endregion

        //region OpenScoreOutcomeVariable
        List<OpenScoreOutcomeVariable> outcomeVariables = new ArrayList<>();


        OpenScoreOutcomeVariable outcomeVariable2 = new OpenScoreOutcomeVariable("SCORE", CardinalityType.SINGLE, BaseTypeType.FLOAT,
                0, 0, false);
        outcomeVariables.add(outcomeVariable2);
        //endregion

        List<OpenScorerCommentsOutcomeVariable> scorerCommentsOutcomeVariables = new ArrayList<>();

        OpenItemResult openItemResult = new OpenItemResult("db29292e-59bd-40d9-b080-bc533ec5a2ec", datestamp, 1, SessionStatusType.INITIAL,
                1, false, CompletionStatus.NOT_ATTEMPTED, responseVariables, outcomeVariables,
                scorerCommentsOutcomeVariables, 0);

        itemResults.add(openItemResult);

        OpenAssessmentResult assessmentResult = new OpenAssessmentResult(resultIdentifier, examineeID, examCardNo, examineeName,
                examSubjectID, examSubjectName, examPlanID, examPlanName,
                examSiteID, examSiteName, examRoomID, examRoomName,
                examSceneID, examSceneName, organizerID, organizerName,
                identifier, datestamp, candidateResponseDuration,
                testScore, candidateScore,
                itemResults);

        String result = assessmentResult.getXmlString();
        System.out.println(result);
        assertNotNull(null, result);
    }

    @Test
    public void makeResult2() throws Exception {
        URL url = getClass().getResource("result.xml");
        String xml = FileUtil.getFileContent(url);
        OpenAssessmentResult result = new OpenAssessmentResult();
        result.loadFromString(xml);

        String resultNew = result.getXmlString();
        System.out.println(resultNew);
        assertNotNull(null, result);
    }

    /**
     * 测试根据一个Result QTI XML得到一个对象
     *
     * @throws Exception the exception
     */
    @Test
    public void getResultFromXML() throws Exception {
        URL url = getClass().getResource("result.xml");
        String xml = FileUtil.getFileContent(url);
        OpenAssessmentResult result = new OpenAssessmentResult();
        result.loadFromString(xml);

        Assert.assertEquals(result.getExamineeID(), 37983);
    }
}
