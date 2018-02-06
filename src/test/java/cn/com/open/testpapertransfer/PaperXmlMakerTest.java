package cn.com.open.testpapertransfer;

import cn.com.open.openqti.ItemType;
import cn.com.open.utils.FileUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.test.context.web.WebAppConfiguration;

import java.net.URL;
import java.util.Map;
import java.util.UUID;

/**
 * Created by lucky on 2017/11/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringBootTest
@TestExecutionListeners(listeners = {DependencyInjectionTestExecutionListener.class, TransactionalTestExecutionListener.class})
public class PaperXmlMakerTest {

    /**
     * Gets full paper xml.
     *
     * @throws Exception the exception
     */
    @Test
    public void getFullPaperXml() throws Exception {
        TestPaper testPaper = new TestPaper();

        PaperModel paper = new PaperModel();
        String uuid = UUID.randomUUID().toString();
        String title = "title";

        paper.setP1(uuid);
        paper.setP2(title);

        testPaper.setModel(paper);

        PaperPart part = new PaperPart();
        PaperSection section = new PaperSection();
        section.setIdentifier("S1");
        section.setScore(100);
        section.setShuf(false);
        section.setTitle("单选题");

        PaperItem item = new PaperItem();
        item.setQuestionTypeId(1);
        item.setSubjective(false);
        item.setScore(100);
        item.setItemId(UUID.randomUUID().toString());

        section.getItems().add(item);
        part.getSections().add(section);
        testPaper.getParts().add(part);

        Map<String, Object> map = PaperXmlMaker.getFullPaperXml(testPaper);
        System.out.println(map.get("xml").toString());
        Assert.assertTrue(map.get("xml").toString().indexOf(uuid) > 0);
        Assert.assertTrue(map.get("xml").toString().indexOf(title) > 0);
    }

    /**
     * Gets new paper xml test.
     *
     * @throws Exception the exception
     */
    @Test
    public void getNewPaperXmlTest() throws Exception {
        PaperModel paper = new PaperModel();
        String uuid = UUID.randomUUID().toString();
        String title = "title";

        paper.setP1(uuid);
        paper.setP2(title);

        Map<String, Object> map = PaperXmlMaker.getNewPaperXml(paper);

        Assert.assertTrue(map.get("xml").toString().indexOf(uuid) > 0);
        Assert.assertTrue(map.get("xml").toString().indexOf(title) > 0);
    }

    /**
     * Gets add question xml test existpaper.
     *
     * @throws Exception the exception
     */
    @Test
    public void getAddQuestionXmlTest_existpaper() throws Exception {
        URL url = getClass().getResource("Test.xml");
        String xml = FileUtil.getFileContent(url);
        String sectionId = "S2";
        String title = "title";

        String questionId = UUID.randomUUID().toString();
        double score = 1d;
        ItemType itemType = ItemType.SINGLECHOICE;

        Map<String, Object> map = PaperXmlMaker.getAddQuestionXml(xml, sectionId, title, false, questionId, score, itemType);

        Assert.assertTrue(map.get("xml").toString().indexOf(sectionId) > 0);
        Assert.assertTrue(map.get("xml").toString().indexOf(questionId) > 0);
        Assert.assertTrue(map.get("xml").toString().indexOf(title) > 0);
    }

    /**
     * Gets add question xml test newpaper.
     *
     * @throws Exception the exception
     */
    @Test
    public void getAddQuestionXmlTest_newpaper() throws Exception {
        PaperModel paper = new PaperModel();
        String uuid = UUID.randomUUID().toString();
        String title = "title";

        paper.setP1(uuid);
        paper.setP2(title);

        Map<String, Object> mapOrgin = PaperXmlMaker.getNewPaperXml(paper);
        String xml = mapOrgin.get("xml").toString();

        String sectionId = "S1";

        String questionId = UUID.randomUUID().toString();
        double score = 1d;
        ItemType itemType = ItemType.SINGLECHOICE;

        Map<String, Object> map = PaperXmlMaker.getAddQuestionXml(xml, sectionId, title, false, questionId, score, itemType);

        String resultXml = map.get("xml").toString();
        System.out.println(resultXml);
        Assert.assertTrue(resultXml.indexOf(sectionId) > 0);
        Assert.assertTrue(resultXml.indexOf(questionId) > 0);
        Assert.assertTrue(resultXml.indexOf(title) > 0);
        Assert.assertTrue((double) map.get("score") == score);
    }

    /**
     * Gets add question xml test existpaper existsection.
     *
     * @throws Exception the exception
     */
    @Test
    public void getAddQuestionXmlTest_existpaper_existsection() throws Exception {
        URL url = getClass().getResource("Test.xml");
        String xml = FileUtil.getFileContent(url);
        String sectionId = "S2";
        String title = "多选题";

        String questionId = UUID.randomUUID().toString();
        double score = 2d;
        ItemType itemType = ItemType.SINGLECHOICE;

        Map<String, Object> map = PaperXmlMaker.getAddQuestionXml(xml, sectionId, title, false, questionId, score, itemType);
        String resultXml = map.get("xml").toString();
        System.out.println(resultXml);
        Assert.assertTrue(map.get("xml").toString().indexOf(sectionId) > 0);
        Assert.assertTrue(map.get("xml").toString().indexOf(questionId) > 0);
        Assert.assertTrue(map.get("xml").toString().indexOf(title) > 0);
    }

    /**
     * Gets remove section xml test.
     *
     * @throws Exception the exception
     */
    @Test
    public void getRemoveSectionXmlTest() throws Exception {
        URL url = getClass().getResource("Test.xml");
        String xml = FileUtil.getFileContent(url);
        String sectionId = "S2";

        Map<String, Object> map = PaperXmlMaker.getRemoveSectionXml(xml, sectionId);
        String resultXml = map.get("xml").toString();
        System.out.println(resultXml);
        Assert.assertTrue(map.get("xml").toString().indexOf(sectionId) < 0);
    }

    /**
     * Gets remove question xml test.
     *
     * @throws Exception the exception
     */
    @Test
    public void getRemoveQuestionXmlTest() throws Exception {
        URL url = getClass().getResource("Test4.xml");
        String xml = FileUtil.getFileContent(url);
        String questionId = "62067f42-d1f3-43d5-95cc-77c24307f417";

        Map<String, Object> map = PaperXmlMaker.getRemoveQuestionXml(xml, questionId);
        String resultXml = map.get("xml").toString();
        System.out.println(resultXml);
        Assert.assertTrue(map.get("xml").toString().indexOf(questionId) < 0);
    }

    /**
     * Gets edit section xml test.
     *
     * @throws Exception the exception
     */
    @Test
    public void getEditSectionXmlTest() throws Exception {
        URL url = getClass().getResource("Test.xml");
        String xml = FileUtil.getFileContent(url);

        String sectionId = "S2";
        String title = "多选题2";

        Map<String, Object> map = PaperXmlMaker.getEditSectionXml(xml, sectionId, title, false);
        String resultXml = map.get("xml").toString();
        System.out.println(resultXml);
        Assert.assertTrue(map.get("xml").toString().indexOf(title) > 0);
    }

    /**
     * Gets edit section score xml test question.
     *
     * @throws Exception the exception
     */
    @Test
    public void getEditSectionScoreXmlTest_Question() throws Exception {
        URL url = getClass().getResource("Test.xml");
        String xml = FileUtil.getFileContent(url);
        String sectionId = "S2";

        String questionId = "ad75e128-33e9-b41e-05a7-b56055cdb603";
        double score = 20d;

        Map<String, Object> map = PaperXmlMaker.getEditSectionScoreXml(xml, sectionId, questionId, score);
        String resultXml = map.get("xml").toString();
        System.out.println(resultXml);
        Assert.assertTrue(map.get("xml").toString().indexOf(sectionId) > 0);
        Assert.assertTrue(map.get("xml").toString().indexOf(String.valueOf(score)) > 0);
    }

    /**
     * Gets edit section score xml test.
     *
     * @throws Exception the exception
     */
    @Test
    public void getEditSectionScoreXmlTest() throws Exception {
        URL url = getClass().getResource("Test.xml");
        String xml = FileUtil.getFileContent(url);
        String sectionId = "S2";

        String questionId = "";
        double score = 20d;

        Map<String, Object> map = PaperXmlMaker.getEditSectionScoreXml(xml, sectionId, questionId, score);
        String resultXml = map.get("xml").toString();
        System.out.println(resultXml);
        Assert.assertTrue(map.get("xml").toString().indexOf(sectionId) > 0);
        Assert.assertTrue(map.get("xml").toString().indexOf(String.valueOf(score)) > 1);
    }

    /**
     * Gets move section xml test.
     *
     * @throws Exception the exception
     */
    @Test
    public void getMoveSectionXmlTest() throws Exception {
        URL url = getClass().getResource("Test.xml");
        String xml = FileUtil.getFileContent(url);
        String sectionId = "S2";

        Map<String, Object> map = PaperXmlMaker.getMoveSectionXml(xml, sectionId, true);
        String resultXml = map.get("xml").toString();
        System.out.println(resultXml);
        Assert.assertTrue(map.get("xml").toString().indexOf(sectionId) > 0);
    }

    /**
     * Gets move section xml test down.
     *
     * @throws Exception the exception
     */
    @Test
    public void getMoveSectionXmlTest_down() throws Exception {
        URL url = getClass().getResource("Test.xml");
        String xml = FileUtil.getFileContent(url);
        String sectionId = "S2";

        Map<String, Object> map = PaperXmlMaker.getMoveSectionXml(xml, sectionId, false);
        String resultXml = map.get("xml").toString();
        System.out.println(resultXml);
        Assert.assertTrue(map.get("xml").toString().indexOf(sectionId) > 0);
    }

    /**
     * Gets move question xml test.
     *
     * @throws Exception the exception
     */
    @Test
    public void getMoveQuestionXmlTest() throws Exception {
        URL url = getClass().getResource("Test.xml");
        String xml = FileUtil.getFileContent(url);
        String sectionId = "S2";
        String questionId = "ad75e128-33e9-b41e-05a7-b56055cdb603";

        Map<String, Object> map = PaperXmlMaker.getMoveQuestionXml(xml, sectionId, questionId, true);
        String resultXml = map.get("xml").toString();
        System.out.println(resultXml);
        Assert.assertTrue(map.get("xml").toString().indexOf(sectionId) > 0);
    }

    /**
     * Gets move question xml test down.
     *
     * @throws Exception the exception
     */
    @Test
    public void getMoveQuestionXmlTest_down() throws Exception {
        URL url = getClass().getResource("Test.xml");
        String xml = FileUtil.getFileContent(url);
        String sectionId = "S3";
        String questionId = "f56bfbdb-cbd1-e014-1539-f3269017d42f";

        Map<String, Object> map = PaperXmlMaker.getMoveQuestionXml(xml, sectionId, questionId, false);
        String resultXml = map.get("xml").toString();
        System.out.println(resultXml);
        Assert.assertTrue(map.get("xml").toString().indexOf(sectionId) > 0);
    }

    /**
     * Gets edit question xml test.
     *
     * @throws Exception the exception
     */
    @Test
    public void getEditQuestionXmlTest() throws Exception {
        URL url = getClass().getResource("Test.xml");
        String xml = FileUtil.getFileContent(url);
        String sectionId = "S3";

        String questionId = "f56bfbdb-cbd1-e014-1539-f3269017d42f";
        String newQuestionId = UUID.randomUUID().toString();
        double score = 2d;
        ItemType itemType = ItemType.SINGLECHOICE;

        Map<String, Object> map = PaperXmlMaker.getEditQuestionXml(xml, sectionId, questionId, newQuestionId, score, itemType);
        String resultXml = map.get("xml").toString();
        System.out.println(resultXml);
        Assert.assertTrue(map.get("xml").toString().indexOf(newQuestionId) > 0);
        Assert.assertTrue(map.get("xml").toString().indexOf(questionId) < 0);
    }

    /**
     * Gets copy test paper xml test.
     *
     * @throws Exception the exception
     */
    @Test
    public void getCopyTestPaperXmlTest() throws Exception {
        URL url = getClass().getResource("Test.xml");
        String xml = FileUtil.getFileContent(url);

        String newId = "f56bfbdb-cbd1-e014-1539-f3269017d42f";

        Map<String, Object> map = PaperXmlMaker.getCopyTestPaperXml(xml, newId);
        String resultXml = map.get("xml").toString();
        System.out.println(resultXml);
        Assert.assertTrue(map.get("xml").toString().indexOf(newId) > 0);
    }
}
