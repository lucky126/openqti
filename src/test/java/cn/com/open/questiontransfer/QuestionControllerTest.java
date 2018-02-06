package cn.com.open.questiontransfer;

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

/**
 * Created by lucky on 2018/1/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringBootTest
@TestExecutionListeners(listeners = {DependencyInjectionTestExecutionListener.class, TransactionalTestExecutionListener.class})
public class QuestionControllerTest {

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
    public void get() throws Exception {
        String xml="<assessmentItem xmlns=\"http://www.open.com.cn/schemas/exam/openqti_v1\" xmlns:ns2=\"http://www.w3.org/2001/XInclude\" xmlns:ns3=\"http://www.imsglobal.org/xsd/imslip_v1p0\" identifier=\"77520e97-908d-4516-83f5-fde39f23e991\" title=\"single\" adaptive=\"false\" timeDependent=\"false\" QuestionAnalysis=\"ana\"><responseDeclaration identifier=\"RESPONSE\" cardinality=\"single\" baseType=\"identifier\"><correctResponse><value>A</value></correctResponse></responseDeclaration><outcomeDeclaration normalMaximum=\"1.0\" identifier=\"SCORE\" cardinality=\"single\" baseType=\"float\"><defaultValue><value>0.0</value></defaultValue></outcomeDeclaration><itemBody><choiceInteraction shuffle=\"false\" maxChoices=\"1\" responseIdentifier=\"RESPONSE\"><prompt>single</prompt><simpleChoice identifier=\"A\">11</simpleChoice><simpleChoice identifier=\"B\">22</simpleChoice><simpleChoice identifier=\"C\">33</simpleChoice></choiceInteraction></itemBody><responseProcessing><responseCondition><responseIf><match><variable identifier=\"RESPONSE\"/><correct identifier=\"RESPONSE\"/></match><setOutcomeValue identifier=\"SCORE\"><baseValue baseType=\"float\">1.0</baseValue></setOutcomeValue></responseIf></responseCondition></responseProcessing></assessmentItem>";

        mvc.perform(MockMvcRequestBuilders.post("/openqti/question/get?i3=1&needAnswer=true")
                .accept(MediaType.APPLICATION_JSON).contentType(MediaType.APPLICATION_JSON).content(xml))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.handler().methodName("get"))
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }
}
