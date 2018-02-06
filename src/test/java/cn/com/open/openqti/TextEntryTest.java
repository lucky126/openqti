package cn.com.open.openqti;

import cn.com.open.questiontransfer.Question;
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
public class TextEntryTest {

    /**
     * 测试生成一个填空题的QTI XML
     *
     * @throws Exception the exception
     */
    @Test
    public void makeTextentryItem() throws Exception {
        String identifier = String.valueOf(UUID.randomUUID());
        String title = "Test textentry";
        String prompt = "Test textentry<textEntryInteraction/>.";
        String QuestionAnalysis = "no analysis";
        List<OpenTextEntryInteraction> interactions = new ArrayList<OpenTextEntryInteraction>();
        OpenTextEntryInteraction interaction = new OpenTextEntryInteraction(10, "Answer");
        interactions.add(interaction);

        OpenTextEntryAssessmentItem text = new OpenTextEntryAssessmentItem(identifier, title, prompt, interactions, QuestionAnalysis);
        String result = text.getXmlString();
        System.out.println(result);
        assertNotNull(null, result);
    }

    /**
     * 测试根据一个textentry QTI XML得到一个对象
     *
     * @throws Exception the exception
     */
    @Test
    public void getTextentryModelFromXML() throws Exception {
        URL url = getClass().getResource("textentry.xml");
        String QuestionQTI = FileUtil.getFileContent(url);
        OpenAssessmentItem item = OpenAssessmentItem.createInstance(ItemType.TEXTENTRY);
        item.LoadFromString(QuestionQTI);
        Assert.assertEquals(item.getIdentifier(), "dee300dd-7390-456d-b0b1-3f91bb68535c");

        OpenTextEntryAssessmentItem textentry = (OpenTextEntryAssessmentItem) item;

        Assert.assertEquals(textentry.getTextEntryInteractions().size(), 2);

    }
}
