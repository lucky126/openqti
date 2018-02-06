package cn.com.open.testpapertransfer;

import cn.com.open.itembank.utils.JsonUtil;
import cn.com.open.openqti.ItemType;
import cn.com.open.utils.FileUtil;
import org.apache.commons.collections.map.HashedMap;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

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
public class TestPaperControllerTest {

    @Autowired
    private WebApplicationContext context;
    private MockMvc mvc;

    /**
     * Sets up.
     *
     * @throws Exception the exception
     */
    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void getFullPaperXmlTest() throws Exception {
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

        String content = JsonUtil.getJson(testPaper);

        mvc.perform(MockMvcRequestBuilders.post("/openqti/testpaper/getFullPaperXml")
                .accept(MediaType.APPLICATION_JSON).contentType(MediaType.APPLICATION_JSON).content(content))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.handler().methodName("getFullPaperXml"))
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }

    /**
     * Gets new paper xml test.
     *
     * @throws Exception the exception
     */
    @Test
    public void getNewPaperXmlTest() throws Exception {
        String uuid = UUID.randomUUID().toString();
        String content = "{\"P1\":\"" + uuid + "\", \"P2\":\"title\"}";

        mvc.perform(MockMvcRequestBuilders.post("/openqti/testpaper/getNewPaperXml")
                .accept(MediaType.APPLICATION_JSON).contentType(MediaType.APPLICATION_JSON).content(content))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.handler().methodName("getNewPaperXml"))
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }

    /**
     * Gets app list test true.
     *
     * @throws Exception the exception
     */
    @Test
    public void getAppListTest_true() throws Exception {
        URL url = getClass().getResource("Test.xml");
        String xml = FileUtil.getFileContent(url);

        String sectionId = "S2";
        String sectionTitle = "title";

        String questionId = UUID.randomUUID().toString();
        double score = 1d;
        ItemType itemType = ItemType.SINGLECHOICE;

        Map<String, Object> map = new HashedMap();
        map.put("xml", xml);
        map.put("sectionId", sectionId);
        map.put("sectionTitle", sectionTitle);
        map.put("isShuf", false);
        map.put("questionId", questionId);
        map.put("score", score);
        map.put("itemType", itemType);

        String content = JsonUtil.getJson(map);

        mvc.perform(MockMvcRequestBuilders.post("/openqti/testpaper/getAddQuestionXml")
                .accept(MediaType.APPLICATION_JSON).contentType(MediaType.APPLICATION_JSON).content(content))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.handler().methodName("getAddQuestionXml"))
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
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

        mvc.perform(MockMvcRequestBuilders.post("/openqti/testpaper/getRemoveSectionXml?sectionId=S2")
                .accept(MediaType.APPLICATION_JSON).contentType(MediaType.APPLICATION_JSON).content(xml))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.handler().methodName("getRemoveSectionXml"))
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
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

        mvc.perform(MockMvcRequestBuilders.post("/openqti/testpaper/getCopyTestPaperXml?newId=f56bfbdb-cbd1-e014-1539-f3269017d42f")
                .accept(MediaType.APPLICATION_JSON).contentType(MediaType.APPLICATION_JSON).content(xml))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.handler().methodName("getCopyTestPaperXml"))
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }

    /**
     * Gets test.
     *
     * @throws Exception the exception
     */
    @Test
    public void getTest() throws Exception {
        URL url = getClass().getResource("Test2.xml");
        String xml = FileUtil.getFileContent(url);
        long begin = System.currentTimeMillis();
        mvc.perform(MockMvcRequestBuilders.post("/openqti/testpaper/get")
                .accept(MediaType.APPLICATION_JSON).contentType(MediaType.APPLICATION_JSON).content(xml))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.handler().methodName("get"))
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
        long end = System.currentTimeMillis();
        System.out.println(String.valueOf(end - begin));
    }
}
