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
public class ClozeTest {

    private String getIdentifier() {
        return String.valueOf(UUID.randomUUID());
    }

    /**
     * 测试生成一个阅读理解题的QTI XML
     *
     * @throws Exception the exception
     */
    @Test
    public void makeClozeItem() throws Exception {
        String identifier = getIdentifier();
        String title = "Test cloze <clozeGap responseIdentifier=\"\"/> and <clozeGap responseIdentifier=\"\"/>";
        OpenPrompt prompt = new OpenPrompt(title);
        boolean shuffle = false;
        String QuestionAnalysis = "no analysis";
        List<OpenSingleChoiceAssessmentItem> singleChoiceItems = new ArrayList<OpenSingleChoiceAssessmentItem>();

        List<OpenSimpleChoiceAtomicItem> choices = new ArrayList<OpenSimpleChoiceAtomicItem>();
        OpenSimpleChoiceAtomicItem choice = new OpenSimpleChoiceAtomicItem("A", "AA", true);
        choices.add(choice);
        choice = new OpenSimpleChoiceAtomicItem("B", "BB");
        choices.add(choice);
        choice = new OpenSimpleChoiceAtomicItem("B", "CC");
        choices.add(choice);

        String subTitle = "";
        OpenPrompt subPrompt = new OpenPrompt(subTitle);
        OpenSingleChoiceAssessmentItem item = new OpenSingleChoiceAssessmentItem(getIdentifier(), subTitle, subPrompt, shuffle, choices, QuestionAnalysis);
        singleChoiceItems.add(item);

        choices.clear();
        choice = new OpenSimpleChoiceAtomicItem("A", "AA1");
        choices.add(choice);
        choice = new OpenSimpleChoiceAtomicItem("B", "BB1", true);
        choices.add(choice);
        choice = new OpenSimpleChoiceAtomicItem("B", "CC1");
        choices.add(choice);

        subTitle = "";
        subPrompt = new OpenPrompt(subTitle);
        item = new OpenSingleChoiceAssessmentItem(getIdentifier(), subTitle, subPrompt, shuffle, choices, QuestionAnalysis);
        singleChoiceItems.add(item);

        OpenClozeAssessmentItem cloze = new OpenClozeAssessmentItem(identifier, "cloze", prompt, singleChoiceItems, QuestionAnalysis);
        String result = cloze.getXmlString();
        System.out.println(result);
        assertNotNull(null, result);
    }

    /**
     * 测试根据一个cloze QTI XML得到一个对象
     *
     * @throws Exception the exception
     */
    @Test
    public void getClozeModelFromXML() throws Exception {
        URL url = getClass().getResource("cloze.xml");
        String QuestionQTI = FileUtil.getFileContent(url);
        OpenAssessmentItem item = OpenAssessmentItem.createInstance(ItemType.CLOZE);
        item.LoadFromString(QuestionQTI);
        Assert.assertEquals(item.getIdentifier(), "77520e97-908d-4516-83f5-fde39f23e991");

        OpenClozeAssessmentItem cloze = (OpenClozeAssessmentItem) item;
        org.junit.Assert.assertEquals(cloze.getSubItems().size(), 5);
    }
}
