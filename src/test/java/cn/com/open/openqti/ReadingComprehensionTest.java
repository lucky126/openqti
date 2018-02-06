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
public class ReadingComprehensionTest {

    private String getIdentifier() {
        return String.valueOf(UUID.randomUUID());
    }

    /**
     * 测试生成一个阅读理解题的QTI XML
     *
     * @throws Exception the exception
     */
    @Test
    public void makeReadComprehensionItem() throws Exception {
        String identifier = getIdentifier();
        String title = "Test reading comprehension";
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

        String subTitle = "sub 1";
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

        subTitle = "sub 2";
        subPrompt = new OpenPrompt(subTitle);
        item = new OpenSingleChoiceAssessmentItem(getIdentifier(), subTitle, subPrompt, shuffle, choices, QuestionAnalysis);
        singleChoiceItems.add(item);


        OpenReadingComprehensionAssessmentItem reading = new OpenReadingComprehensionAssessmentItem(identifier, title, shuffle, prompt, singleChoiceItems, QuestionAnalysis);
        String result = reading.getXmlString();
        System.out.println(result);
        assertNotNull(null, result);
    }


    /**
     * 测试根据一个reading QTI XML得到一个对象
     *
     * @throws Exception the exception
     */
    @Test
    public void getReadingModelFromXML() throws Exception {
        URL url = getClass().getResource("reading.xml");
        String QuestionQTI = FileUtil.getFileContent(url);
        OpenAssessmentItem item = OpenAssessmentItem.createInstance(ItemType.READINGCOMPREHENSION);
        item.LoadFromString(QuestionQTI);
        Assert.assertEquals(item.getIdentifier(), "741b1462-74db-4a1c-b942-ffe50daafb1a");

        OpenReadingComprehensionAssessmentItem reading = (OpenReadingComprehensionAssessmentItem) item;
        org.junit.Assert.assertEquals(reading.getSubItems().size(), 2);
    }
}
