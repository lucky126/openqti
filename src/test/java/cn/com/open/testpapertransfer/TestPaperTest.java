package cn.com.open.testpapertransfer;

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

/**
 * Created by lucky on 2017/11/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringBootTest
@TestExecutionListeners(listeners = {DependencyInjectionTestExecutionListener.class, TransactionalTestExecutionListener.class})
public class TestPaperTest {

    @Test
    public void TestPaperTest() throws Exception {
        long begin = System.currentTimeMillis();
        URL url = getClass().getResource("Test3.xml");
        String xml = FileUtil.getFileContent(url);

        TestPaper testPaper = new TestPaper(xml);
        Assert.assertTrue(testPaper.getParts().get(0).getSections().size() == 5);
        long end = System.currentTimeMillis();
        System.out.println(String.valueOf(end - begin));
    }
}
