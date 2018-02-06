package cn.com.open.rulestransfer;

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

import java.math.BigDecimal;
import java.net.URL;
import java.util.UUID;


/**
 * Created by lucky on 2017/12/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringBootTest
@TestExecutionListeners(listeners = {DependencyInjectionTestExecutionListener.class, TransactionalTestExecutionListener.class})
public class RuleXmlMakerTest {
    @Test
    public void getFullQtiXmlTest() throws Exception {
        Rules rules = new Rules();
        rules.setRuleID(UUID.randomUUID().toString());
        rules.setRuleName("Test");
        rules.setTotalScore(BigDecimal.valueOf(100f));

        String category1 = UUID.randomUUID().toString();
        String category2 = UUID.randomUUID().toString();
        rules.getQuestionCategories().add(category1);
        rules.getQuestionCategories().add(category2);

        RulePartModel partModel = new RulePartModel();

        RuleSectionModel sectionModel = new RuleSectionModel();
        sectionModel.setShuffle(false);
        sectionModel.setQuestionTypeId(UUID.randomUUID().toString());
        sectionModel.getExampleQuestion().add(UUID.randomUUID().toString());
        sectionModel.getMustQuestion().add(UUID.randomUUID().toString());

        RuleDifficultyModel difficultyModel = new RuleDifficultyModel();
        difficultyModel.setType(DifficultyType.ALL);
        difficultyModel.setQuestionCategory(category1);
        difficultyModel.setCount(4);
        difficultyModel.setRealCount(4);
        difficultyModel.setSubItemCount(2);
        difficultyModel.setScore(BigDecimal.valueOf(5f));
        difficultyModel.getChapterList().add(UUID.randomUUID().toString());
        sectionModel.getDifficultyList().add(difficultyModel);

        difficultyModel = new RuleDifficultyModel();
        difficultyModel.setType(DifficultyType.ALL);
        difficultyModel.setQuestionCategory(category2);
        difficultyModel.setCount(6);
        difficultyModel.setRealCount(6);
        difficultyModel.setSubItemCount(2);
        difficultyModel.setScore(BigDecimal.valueOf(5f));
        difficultyModel.getChapterList().add(UUID.randomUUID().toString());
        sectionModel.getDifficultyList().add(difficultyModel);

        partModel.getSections().add(sectionModel);
        rules.getParts().add(partModel);
/*
        partModel = new RulePartModel();
        partModel.setListening(true);

        partModel.setCheckTime(120);
        partModel.setExpectedTime(120);

        InstructionModel instructionModel = new InstructionModel();
        instructionModel.setText("top");
        instructionModel.setMediaUrl("url1");
        instructionModel.setDuration(1);
        partModel.getInstruction().add(instructionModel);

        instructionModel = new InstructionModel();
        instructionModel.setText("end");
        instructionModel.setMediaUrl("url2");
        instructionModel.setDuration(1);
        partModel.getInstruction().add(instructionModel);

        sectionModel = new RuleSectionModel();
        sectionModel.setShuffle(false);
        sectionModel.setQuestionTypeId(UUID.randomUUID().toString());

        sectionModel.getQuestionCategories().putAll(categoryList);

        difficultyModel = new RuleDifficultyModel();
        difficultyModel.setType(DifficultyType.NORMAL);
        difficultyModel.setCount(1);
        difficultyModel.setSubItemCount(0);
        difficultyModel.setScore(BigDecimal.valueOf(50f));
        difficultyModel.getChapterList().add(UUID.randomUUID().toString());
        difficultyModel.setResponseDuration(1);
        difficultyModel.setRepeatTimes(1);
        difficultyModel.setRepeatInterval(1);
        difficultyModel.setDurationStart(1);
        difficultyModel.setDurationEnd(1);
        sectionModel.getDifficultyList().add(difficultyModel);

        instructionModel = new InstructionModel();
        instructionModel.setMediaUrl("url3");
        instructionModel.setDuration(1);
        sectionModel.getInstruction().add(instructionModel);

        partModel.getSections().add(sectionModel);

        rules.getParts().add(partModel);
*/
        String xml = RulesXmlMaker.getFullQtiXml(rules);

        System.out.println(xml);
        Assert.assertTrue(xml.indexOf("exampleItemGroup") > 0);
    }

    @Test
    public void getRuleModelFromXML() throws Exception {
        URL url = getClass().getResource("rules.xml");
        String QuestionQTI = FileUtil.getFileContent(url);
        Rules rules = new Rules(QuestionQTI);
        Assert.assertTrue(rules.getRuleID() != null);
    }
}
