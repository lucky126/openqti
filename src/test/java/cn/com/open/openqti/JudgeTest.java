package cn.com.open.openqti;

import cn.com.open.utils.FileUtil;
import junit.framework.Assert;
import org.junit.Test;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.Assert.assertNotNull;

/**
 * Created by lucky on 2017/6/28.
 */
public class JudgeTest {

    /**
     * 测试生成一个判断题的QTI XML
     *
     * @throws Exception the exception
     */
    @Test
    public void makeJudgeItem() throws Exception {
        String identifier = String.valueOf(UUID.randomUUID());
        String title = "Test judge choice";
        OpenPrompt singleChoicePrompt = new OpenPrompt(title);
        String QuestionAnalysis = "no analysis";
        List<OpenSimpleChoiceAtomicItem> choices = new ArrayList<OpenSimpleChoiceAtomicItem>();
        OpenSimpleChoiceAtomicItem choice = new OpenSimpleChoiceAtomicItem("T", "T", true);
        choices.add(choice);
        choice = new OpenSimpleChoiceAtomicItem("F", "F", false);
        choices.add(choice);

        OpenJudgementAssessmentItem judge = new OpenJudgementAssessmentItem(identifier, singleChoicePrompt, choices, QuestionAnalysis);
        String result = judge.getXmlString();
        System.out.println(result);
        assertNotNull(null, result);
    }

    /**
     * 测试根据一个judge QTI XML得到一个对象
     *
     * @throws Exception the exception
     */
    @Test
    public void getJudgeModelFromXML() throws Exception {
        URL url = getClass().getResource("judge.xml");
        String QuestionQTI = FileUtil.getFileContent(url);
        OpenAssessmentItem item = OpenAssessmentItem.createInstance(ItemType.JUDGEMENT);
        item.LoadFromString(QuestionQTI);
        Assert.assertEquals(item.getIdentifier(), "75b2f790-262d-44e3-bc5b-02029cb747b1");

        OpenJudgementAssessmentItem judge = (OpenJudgementAssessmentItem) item;

        int iCorrectChoiceCount = 0;
        for (OpenSimpleChoiceAtomicItem obj : judge.getChoices()) {
            if (obj.isCorrectResponse()) {
                iCorrectChoiceCount++;
            }
        }
        Assert.assertEquals(iCorrectChoiceCount, 1);
    }
}
