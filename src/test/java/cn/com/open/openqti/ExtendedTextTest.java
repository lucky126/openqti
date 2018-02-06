package cn.com.open.openqti;

import cn.com.open.utils.FileUtil;
import junit.framework.Assert;
import org.junit.Test;

import java.net.URL;
import java.util.UUID;

import static org.junit.Assert.assertNotNull;

/**
 * Created by lucky on 2017/6/28.
 */
public class ExtendedTextTest {

    /**
     * 测试生成一个问答题的QTI XML
     *
     * @throws Exception the exception
     */
    @Test
    public void makeExtendedTextItem() throws Exception {
        String identifier = String.valueOf(UUID.randomUUID());
        String title = "Test text";
        OpenPrompt singleChoicePrompt = new OpenPrompt(title);
        String QuestionAnalysis = "no analysis";
        String correct = "correct";

        OpenExtendedTextAssessmentItem text = new OpenExtendedTextAssessmentItem(identifier, title, singleChoicePrompt, correct, QuestionAnalysis);
        String result = text.getXmlString();
        System.out.println(result);
        assertNotNull(null, result);
    }

    /**
     * 测试根据一个extendedtext QTI XML得到一个对象
     *
     * @throws Exception the exception
     */
    @Test
    public void getExtendedTextModelFromXML() throws Exception {
        URL url = getClass().getResource("extend.xml");
        String QuestionQTI = FileUtil.getFileContent(url);
        OpenAssessmentItem item = OpenAssessmentItem.createInstance(ItemType.EXTENDEDTEXT);
        item.LoadFromString(QuestionQTI);
        Assert.assertEquals(item.getIdentifier(), "dfbbc493-5796-4fa7-94db-0066b529bef1");

        OpenExtendedTextAssessmentItem extended = (OpenExtendedTextAssessmentItem) item;
    }
}
