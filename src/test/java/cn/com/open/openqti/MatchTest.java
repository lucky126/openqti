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
 * Created by lucky on 2017/6/29.
 */
public class MatchTest {

    /**
     * 测试生成一个匹配题的QTI XML
     *
     * @throws Exception the exception
     */
    @Test
    public void makeMatchItem() throws Exception {
        String identifier = String.valueOf(UUID.randomUUID());
        String title = "Test match";
        OpenPrompt prompt = new OpenPrompt(title);
        boolean shuffle = false;
        String QuestionAnalysis = "no analysis";

        List<OpenLeftSimpleAssociableChoiceAtomicItem> leftAssociableChoices = new ArrayList<OpenLeftSimpleAssociableChoiceAtomicItem>();
        List<OpenRightSimpleAssociableChoiceAtomicItem> rightAssociableChoices = new ArrayList<OpenRightSimpleAssociableChoiceAtomicItem>();

        List<String> correct = new ArrayList<String>();
        correct.add("1");
        OpenLeftSimpleAssociableChoiceAtomicItem left = new OpenLeftSimpleAssociableChoiceAtomicItem("A", "A", correct);
        leftAssociableChoices.add(left);

        List<String> correct2 = new ArrayList<String>();
        correct2.add("2");
        left = new OpenLeftSimpleAssociableChoiceAtomicItem("B", "B", correct2);
        leftAssociableChoices.add(left);

        OpenRightSimpleAssociableChoiceAtomicItem right = new OpenRightSimpleAssociableChoiceAtomicItem("1","1");
        rightAssociableChoices.add(right);

        right = new OpenRightSimpleAssociableChoiceAtomicItem("2","2");
        rightAssociableChoices.add(right);

        right = new OpenRightSimpleAssociableChoiceAtomicItem("3","3");
        rightAssociableChoices.add(right);

        OpenMatchAssessmentItem match = new OpenMatchAssessmentItem(identifier, title, prompt, shuffle, leftAssociableChoices, rightAssociableChoices, QuestionAnalysis);
        String result = match.getXmlString();
        System.out.println(result);
        assertNotNull(null, result);
    }

    /**
     * 测试根据一个match QTI XML得到一个对象
     *
     * @throws Exception the exception
     */
    @Test
    public void getMatchModelFromXML() throws Exception {
        URL url = getClass().getResource("match.xml");
        String QuestionQTI = FileUtil.getFileContent(url);
        OpenAssessmentItem item = OpenAssessmentItem.createInstance(ItemType.MATCH);
        item.LoadFromString(QuestionQTI);
        Assert.assertEquals(item.getIdentifier(), "acbc9d0b-a927-4af1-83c0-010047f2b093");

        OpenMatchAssessmentItem match = (OpenMatchAssessmentItem) item;

        Assert.assertEquals(match.getLeftAssociableChoices().size(), 3);
        Assert.assertEquals(match.getRightAssociableChoices().size(), 5);
    }
}
