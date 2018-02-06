package cn.com.open.rulestransfer;

import cn.com.open.utils.FileUtil;
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
 * Created by lucky on 2017/12/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringBootTest
@TestExecutionListeners(listeners = {DependencyInjectionTestExecutionListener.class, TransactionalTestExecutionListener.class})
public class RulesControllerTest {

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
    public void getTest() throws Exception {
        URL url = getClass().getResource("rules2.xml");
        String xml = FileUtil.getFileContent(url);

        mvc.perform(MockMvcRequestBuilders.post("/openqti/rules/get")
                .accept(MediaType.APPLICATION_JSON).contentType(MediaType.APPLICATION_JSON).content(xml))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.handler().methodName("get"))
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }
}
