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
public class SingleChoiceTest {

    /**
     * 测试生成一个单选题的QTI XML
     *
     * @throws Exception the exception
     */
    @Test
    public void makeSingleChoiceItem() throws Exception {
        String identifier = String.valueOf(UUID.randomUUID());
        String title = "Test single choice";
        OpenPrompt singleChoicePrompt = new OpenPrompt(title);
        boolean shuffle = false;
        String QuestionAnalysis = "no analysis";
        List<OpenSimpleChoiceAtomicItem> choices = new ArrayList<OpenSimpleChoiceAtomicItem>();
        OpenSimpleChoiceAtomicItem choice = new OpenSimpleChoiceAtomicItem("A", "AA", true);
        choices.add(choice);
        choice = new OpenSimpleChoiceAtomicItem("B", "BB");
        choices.add(choice);
        choice = new OpenSimpleChoiceAtomicItem("B", "CC");
        choices.add(choice);

        OpenSingleChoiceAssessmentItem single = new OpenSingleChoiceAssessmentItem(identifier, title, singleChoicePrompt, shuffle, choices, QuestionAnalysis);
        String result = single.getXmlString();
        System.out.println(result);
        assertNotNull(null, result);
    }

    /**
     * 测试根据一个single QTI XML得到一个对象
     *
     * @throws Exception the exception
     */
    @Test
    public void getSingleModelFromXML() throws Exception {
        URL url = getClass().getResource("single.xml");
        String QuestionQTI = FileUtil.getFileContent(url);
        OpenAssessmentItem item = OpenAssessmentItem.createInstance(ItemType.SINGLECHOICE);
        item.LoadFromString(QuestionQTI);
        Assert.assertEquals(item.getIdentifier(), "43101d61-cc52-48b2-9b7e-000011dd9f91");

        OpenSingleChoiceAssessmentItem single = (OpenSingleChoiceAssessmentItem) item;
        org.junit.Assert.assertEquals(single.getMaxChoice(), 1);

        String correctChoiceId = "";
        for (OpenSimpleChoiceAtomicItem obj : single.getChoices()) {
            if (obj.isCorrectResponse()) {
                correctChoiceId = obj.getIdentifier();
            }
        }
        Assert.assertEquals(correctChoiceId, "D");
    }
}
