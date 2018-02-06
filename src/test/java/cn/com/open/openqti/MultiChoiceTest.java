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
public class MultiChoiceTest {

    /**
     * 测试生成一个多选题的QTI XML
     *
     * @throws Exception the exception
     */
    @Test
    public void makeMultiChoiceItem() throws Exception {
        String identifier = String.valueOf(UUID.randomUUID());
        String title = "Test multi choice";
        OpenPrompt singleChoicePrompt = new OpenPrompt(title);
        boolean shuffle = false;
        String QuestionAnalysis = "no analysis";
        List<OpenSimpleChoiceAtomicItem> choices = new ArrayList<OpenSimpleChoiceAtomicItem>();
        OpenSimpleChoiceAtomicItem choice = new OpenSimpleChoiceAtomicItem("A", "AA", true);
        choices.add(choice);
        choice = new OpenSimpleChoiceAtomicItem("B", "BB", true);
        choices.add(choice);
        choice = new OpenSimpleChoiceAtomicItem("B", "CC");
        choices.add(choice);

        OpenMultipleChoiceAssessmentItem multi = new OpenMultipleChoiceAssessmentItem(identifier, title, singleChoicePrompt, shuffle, choices, QuestionAnalysis);
        String result = multi.getXmlString();
        System.out.println(result);
        assertNotNull(null, result);
    }

    /**
     * 测试根据一个multi QTI XML得到一个对象
     *
     * @throws Exception the exception
     */
    @Test
    public void getMultiModelFromXML() throws Exception {
        URL url = getClass().getResource("multi.xml");
        String QuestionQTI = FileUtil.getFileContent(url);
        OpenAssessmentItem item = OpenAssessmentItem.createInstance(ItemType.MULTIPLECHOICE);
        item.LoadFromString(QuestionQTI);
        Assert.assertEquals(item.getIdentifier(), "ca62447f-5b57-4677-b815-00515faed8fa");

        OpenMultipleChoiceAssessmentItem multi = (OpenMultipleChoiceAssessmentItem) item;
        Assert.assertEquals(multi.getMaxChoice(), 0);

        int iCorrectChoiceCount = 0;
        for (OpenSimpleChoiceAtomicItem obj : multi.getChoices()) {
            if (obj.isCorrectResponse()) {
                iCorrectChoiceCount++;
            }
        }
        Assert.assertEquals(iCorrectChoiceCount, 1);
    }
}
