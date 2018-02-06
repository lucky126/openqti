package cn.com.open.questiontransfer;

import cn.com.open.openqti.ItemType;
import cn.com.open.utils.FileUtil;
import cn.com.open.utils.GuidUtil;
import junit.framework.Assert;
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

/**
 * Created by lucky on 2017/7/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringBootTest
@TestExecutionListeners(listeners = {DependencyInjectionTestExecutionListener.class, TransactionalTestExecutionListener.class})
public class GetModelTest {

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
    public void getAppListTest_true() throws Exception {
        URL url = getClass().getResource("single.xml");
        String xml = FileUtil.getFileContent(url);
        mvc.perform(MockMvcRequestBuilders.post("/openqti/question/get?i3=1&needAnswer=true")
                .accept(MediaType.APPLICATION_JSON).contentType(MediaType.APPLICATION_JSON).content(xml))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.handler().methodName("get"))
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }

    @Test
    public void getAppListTest_false() throws Exception {
        URL url = getClass().getResource("single.xml");
        String xml = FileUtil.getFileContent(url);
        mvc.perform(MockMvcRequestBuilders.post("/openqti/question/get?i3=1&needAnswer=false")
                .accept(MediaType.APPLICATION_JSON).contentType(MediaType.APPLICATION_JSON).content(xml))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.handler().methodName("get"))
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }

    @Test
    public void getSingleModel() throws Exception {
        URL url = getClass().getResource("single.xml");
        String xml = FileUtil.getFileContent(url);
        Question question = new Question(ItemType.SINGLECHOICE.getIndex(), true, xml);
        Assert.assertEquals(question.getI1(), "e59cb40d-d07b-4e8b-889f-00284e6b342d");
        Assert.assertEquals(question.getI6().size(), 4);
        Assert.assertEquals(question.getI7().size(), 1);
        Assert.assertEquals(question.getI7().get(0), "0");
    }

    @Test
    public void getSingleModel_false() throws Exception {
        URL url = getClass().getResource("single.xml");
        String xml = FileUtil.getFileContent(url);
        Question question = new Question(ItemType.SINGLECHOICE.getIndex(), false, xml);
        Assert.assertEquals(question.getI1(), "e59cb40d-d07b-4e8b-889f-00284e6b342d");
        Assert.assertEquals(question.getI6().size(), 4);
        Assert.assertEquals(question.getI7().size(), 0);
    }

    @Test
    public void getMultiModel() throws Exception {
        URL url = getClass().getResource("multi.xml");
        String xml = FileUtil.getFileContent(url);
        Question question = new Question(ItemType.MULTIPLECHOICE.getIndex(), true, xml);
        Assert.assertEquals(question.getI1(), "ca62447f-5b57-4677-b815-00515faed8fa");
        Assert.assertEquals(question.getI2(), " (湖南永州)山脉是地形的骨架。图中a地形区是(    )<img src=\"\\UploadedFiles\\Image\\fc3b48c1-3771-483a-933a-03eb4431785c\\20160118\\4397a3f1-b68b-483a-ad35-ab1ae9339e53.png\" />");
        Assert.assertEquals(question.getI6().size(), 4);
        Assert.assertEquals(question.getI7().size(), 1);
        Assert.assertEquals(question.getI7().get(0), "0");
    }

    @Test
    public void getJudgeModel() throws Exception {
        URL url = getClass().getResource("judge.xml");
        String xml = FileUtil.getFileContent(url);
        Question question = new Question(ItemType.JUDGEMENT.getIndex(), true, xml);
        Assert.assertEquals(question.getI1(), "75b2f790-262d-44e3-bc5b-02029cb747b1");
        Assert.assertEquals(question.getI6().size(), 2);
        Assert.assertEquals(question.getI7().size(), 1);
        Assert.assertEquals(question.getI7().get(0), "0");
        Assert.assertEquals(question.getI33(), " 出租和出借包装物的摊销的价值");
    }

    @Test
    public void getTextentryModel() throws Exception {
        URL url = getClass().getResource("textentry.xml");
        String xml = FileUtil.getFileContent(url);
        Question question = new Question(ItemType.TEXTENTRY.getIndex(), true, xml);
        Assert.assertEquals(question.getI1(), "dee300dd-7390-456d-b0b1-3f91bb68535c");
        Assert.assertEquals(question.getI6().size(), 2);
        Assert.assertEquals(question.getI7().size(), 2);
        Assert.assertEquals(question.getI6().get(0), "空肠");
        Assert.assertEquals(question.getI7().get(0), "1.0");
        Assert.assertEquals(question.getI2(), "十二指肠是指，介于胃与##之间，长度为##");
    }

    @Test
    public void getExtendModel() throws Exception {
        URL url = getClass().getResource("extend.xml");
        String xml = FileUtil.getFileContent(url);
        Question question = new Question(ItemType.EXTENDEDTEXT.getIndex(), true, xml);
        Assert.assertEquals(question.getI1(), "dfbbc493-5796-4fa7-94db-0066b529bef1");
        Assert.assertEquals(question.getI6().size(), 1);
        Assert.assertEquals(question.getI7().size(), 1);
    }

    @Test
    public void getReadingModel() throws Exception {
        URL url = getClass().getResource("reading.xml");
        String xml = FileUtil.getFileContent(url);
        Question question = new Question(ItemType.READINGCOMPREHENSION.getIndex(), true, xml);
        Assert.assertEquals(question.getI1(), "741b1462-74db-4a1c-b942-ffe50daafb1a");
        Assert.assertEquals(question.getI6().size(), 0);
        Assert.assertEquals(question.getI7().size(), 0);
        Assert.assertEquals(question.getSub().size(), 2);
        Assert.assertEquals(question.getSub().get(0).getI1(), "62f570c6-21c5-402c-afd4-d728f771cad8");
        Assert.assertEquals(question.getSub().get(0).getI6().size(), 4);
        Assert.assertEquals(question.getSub().get(0).getI7().get(0), "1");
    }

    @Test
    public void getClozeModel() throws Exception {
        URL url = getClass().getResource("cloze.xml");
        String xml = FileUtil.getFileContent(url);
        Question question = new Question(ItemType.CLOZE.getIndex(), true, xml);
        Assert.assertEquals(question.getI1(), "77520e97-908d-4516-83f5-fde39f23e991");
        Assert.assertEquals(question.getI6().size(), 0);
        Assert.assertEquals(question.getI7().size(), 0);
        Assert.assertEquals(question.getSub().size(), 5);
        Assert.assertEquals(question.getSub().get(0).getI1(), "481cd500-2ef0-4d6d-aae7-1b6e27795719");
        Assert.assertEquals(question.getSub().get(0).getI6().size(), 5);
        Assert.assertEquals(question.getSub().get(0).getI7().get(0), "2");
    }

    @Test
    public void getMatchModel() throws Exception {
        URL url = getClass().getResource("match.xml");
        String xml = FileUtil.getFileContent(url);
        Question question = new Question(ItemType.MATCH.getIndex(), true, xml);
        Assert.assertEquals(question.getI1(), "acbc9d0b-a927-4af1-83c0-010047f2b093");
        Assert.assertEquals(question.getI6().size(), 5);
        Assert.assertEquals(question.getI7().size(), 0);
        Assert.assertEquals(question.getSub().size(), 3);
        //Assert.assertEquals(question.getSub().get(0).getI1(),"7abb8ae6-040a-4b3c-bbcc-333b4e0589ba");
        Assert.assertEquals(question.getSub().get(0).getI7().get(0), "0");
    }

    @Test
    public void getOrderModel() throws Exception {
        URL url = getClass().getResource("order.xml");
        String xml = FileUtil.getFileContent(url);
        Question question = new Question(ItemType.ORDER.getIndex(), true, xml);
        Assert.assertEquals(question.getI1(), "8e72099c-8258-4c53-b1a2-036a226122f6");
        Assert.assertEquals(question.getI6().size(), 4);
        Assert.assertEquals(question.getI7().size(), 4);
        //Assert.assertEquals(question.getSub().get(0).getI1(),"7abb8ae6-040a-4b3c-bbcc-333b4e0589ba");
        Assert.assertEquals(question.getI7().get(0), "1");
    }

    @Test
    public void formatGuidTest() {
        String orginalGuid = "_x0037_abb8ae6-040a-4b3c-bbcc-333b4e0589ba";
        String result = GuidUtil.formatGuid(orginalGuid);

        Assert.assertEquals(result, "7abb8ae6-040a-4b3c-bbcc-333b4e0589ba");
    }
}
