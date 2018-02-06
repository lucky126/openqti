package cn.com.open.openqti.rules;

import cn.com.open.qti.TimeLimitsType;
import cn.com.open.qti.rules.*;
import cn.com.open.utils.FileUtil;
import junit.framework.Assert;
import org.junit.Test;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.Assert.assertNotNull;

/**
 * Created by lucky on 2017/7/3.
 */
public class AssessmentRuleTest {
    /**
     * 测试生成一个rule的QTI XML
     *
     * @throws Exception the exception
     */
    @Test
    public void makeRule() throws Exception {
        String identifier = String.valueOf(UUID.randomUUID());
        float score = 100.0f;
        List<PartType> parts = new ArrayList<>();
        PartType part = new PartType();

        part.setIdentifier("P01");
        part.setScore(score);
        TimeLimitsType timeLimits = new TimeLimitsType();
        timeLimits.setMaxTime(0d);
        timeLimits.setMinTime(0d);
        timeLimits.setCheckTime(0d);
        timeLimits.setExpectedTime(0d);
        part.setTimeLimits(timeLimits);
        part.setMediaType(0);
        part.setNavigationMode(NavigationModeType.NONLINEAR);

        SectionType section = new SectionType();
        section.setSequenceIndex(1);
        section.setTitle("single");
        section.setShuffle(false);
        section.setOptionalItemCount(0);
        section.setItemCount(10);

        ItemGroupType itemGroup = new ItemGroupType();
        itemGroup.setSequenceIndex(1);
        itemGroup.setItemTypeID(String.valueOf(UUID.randomUUID()));
        itemGroup.setItemCount(1);
        itemGroup.setItemScore(10);
        itemGroup.setItemApplicationTypeIDList(String.valueOf(UUID.randomUUID()));
        itemGroup.setMinDifficulty(0);
        itemGroup.setMaxDifficulty(1);
        itemGroup.setMinDuration(0);
        itemGroup.setMaxDuration(0);

        SubjectScopeType subjectScope = new SubjectScopeType();
        SubjectType subject = new SubjectType();
        ChapterScopeType chapterScope = new ChapterScopeType();
        chapterScope.getChapterID().add(String.valueOf(UUID.randomUUID()));
        chapterScope.getChapterID().add(String.valueOf(UUID.randomUUID()));
        subject.setChapterScope(chapterScope);
        subjectScope.getSubject().add(subject);

        itemGroup.setSubjectScope(subjectScope);
        section.getItemGroup().add(itemGroup);
        part.getSection().add(section);
        parts.add(part);

        OpenAssessmentRule rule = new OpenAssessmentRule(identifier, score, parts);
        String result = rule.getXmlString();
        System.out.println(result);
        assertNotNull(null, result);
    }

    /**
     * 测试根据一个rule QTI XML得到一个对象
     *
     * @throws Exception the exception
     */
    @Test
    public void getRuleModelFromXML() throws Exception {
        URL url = getClass().getResource("rules.xml");
        String QuestionQTI = FileUtil.getFileContent(url);
        OpenAssessmentRule rule = new OpenAssessmentRule();
        rule.LoadFromString(QuestionQTI);
        Assert.assertEquals(rule.getIdentifier(), "dc3d66a4-9af4-4020-92c5-faa3bea31d85");
        Assert.assertEquals(rule.getPart().get(0).getSection().size(), 1);
        Assert.assertEquals(rule.getPart().get(0).getSection().get(0).getItemGroup().size(), 1);
        Assert.assertEquals(rule.getPart().get(0).getSection().get(0).getItemGroup().get(0).getSubjectScope().getSubject().get(0).getChapterScope().getChapterID().size(), 4);
    }
}
