package cn.com.open.openqti;

import cn.com.open.qti.NavigationModeType;
import cn.com.open.utils.FileUtil;
import junit.framework.Assert;
import org.junit.Test;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.Assert.assertNotNull;

/**
 * Created by lucky on 2017/6/30.
 */
public class AssessmentTestTest {
    /**
     * 测试生成一个Testpaper的QTI XML
     *
     * @throws Exception the exception
     */
    @Test
    public void makeTestPaper() throws Exception {
        String identifier = String.valueOf(UUID.randomUUID());
        String title = "Test Paper";
        List<OpenAssessmentItemRef> items = new ArrayList<OpenAssessmentItemRef>();
        List<OpenAssessmentSection> sections = new ArrayList<OpenAssessmentSection>();
        List<OpenTestPart> parts = new ArrayList<OpenTestPart>();

        OpenAssessmentItemRef ref = new OpenAssessmentItemRef(String.valueOf(UUID.randomUUID()), false, ItemType.SINGLECHOICE, 5);
        items.add(ref);

        OpenAssessmentSection section = new OpenAssessmentSection("S01", "section 1", false, new OpenPrompt(""), items, 0);
        sections.add(section);

        OpenTestPart part = new OpenTestPart("P01", new OpenPrompt(""), NavigationModeType.NONLINEAR, sections);
        parts.add(part);

        OpenAssessmentTest test = new OpenAssessmentTest(identifier, title, parts);
        String result = test.getXmlString();
        System.out.println(result);
        assertNotNull(null, result);
    }

    /**
     * 测试根据一个Test QTI XML得到一个对象
     *
     * @throws Exception the exception
     */
    @Test
    public void getTestModelFromXML() throws Exception {
        URL url = getClass().getResource("test.xml");
        String TestQti = FileUtil.getFileContent(url);
        OpenAssessmentTest test = new OpenAssessmentTest();
        test.LoadFromString(TestQti);
        Assert.assertEquals(test.getIdentifier(), "22debbc9-1cb6-42b8-a15c-ff399bc761bd");

        Assert.assertEquals(test.getTestPartCollection().size(), 1);
        OpenTestPart part = (OpenTestPart) ((List) test.getTestPartCollection()).get(0);
        Assert.assertEquals(part.getAssessmentSectionCollection().size(), 3);
        OpenAssessmentSection section1 = part.getAssessmentSectionCollection().get(0);
        Assert.assertEquals(section1.getAssessmentItemRefCollection().size(), 3);
        Assert.assertEquals(section1.getAssessmentItemRefCollection().get(0).getWeight(), 1.0);
    }
}
