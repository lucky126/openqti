package cn.com.open.controller;

import cn.com.open.openqti.ItemType;
import cn.com.open.testpapertransfer.PaperModel;
import cn.com.open.testpapertransfer.PaperXmlMaker;
import cn.com.open.testpapertransfer.TestPaper;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by lucky on 2017/11/8.
 */
@RestController
@RequestMapping(value = "/openqti/testpaper")
public class QtiTestPaperController {

    @PostMapping(value = "/getFullPaperXml")
    public Map<String, Object> getFullPaperXml(@RequestBody TestPaper paper) throws Exception {
        return PaperXmlMaker.getFullPaperXml(paper);
    }

    /**
     * 根据试卷模型得到空试卷xml.
     * <p>
     * 返回map说明：
     * xml=试卷qti的xml;
     * score=试卷总分;
     * exist=操作的数据是否存在;
     *
     * @param paper 试卷模型
     * @return 试卷返回数据map new paper xml
     * @throws Exception the exception
     */
    @PostMapping(value = "/getNewPaperXml")
    public Map<String, Object> getNewPaperXml(@RequestBody PaperModel paper) throws Exception {
        return PaperXmlMaker.getNewPaperXml(paper);
    }

    /**
     * 得到更新试卷标题xml.
     *
     * @param orginalXml the orginal xml
     * @param title      the title
     * @return the edit title xml
     * @throws Exception the exception
     */
    @PostMapping(value = "/getEditTitleXml")
    public Map<String, Object> getEditTitleXml(@RequestBody String orginalXml, @RequestParam("title") String title) throws Exception {
        return PaperXmlMaker.getEditTitleXml(orginalXml, title);
    }

    /**
     * 得到新增试题的试卷xml.
     * <p>
     * 输入参数说明：Object/String
     * String/xml
     * PaperSection/section
     * String/questionId
     * double/score
     * ItemType/itemType
     * <p>
     * 返回map说明：
     * xml=试卷qti的xml;
     * score=试卷总分;
     * exist=操作的数据是否存在;
     *
     * @param info 请求模型
     * @return 试卷返回数据map add question xml
     * @throws Exception the exception
     */
    @PostMapping(value = "/getAddQuestionXml")
    public Map<String, Object> getAddQuestionXml(@RequestBody Map<String, Object> info) throws Exception {

        String orginalXml = info.get("xml").toString();
        String sectionId = info.get("sectionId").toString();
        String title = info.get("sectionTitle").toString();
        boolean isShuf = Boolean.valueOf(info.get("isShuf").toString());
        String questionId = info.get("questionId").toString();
        double score = (double) info.get("score");
        ItemType itemType = ItemType.valueOf(info.get("itemType").toString());

        return PaperXmlMaker.getAddQuestionXml(orginalXml, sectionId, title, isShuf, questionId, score, itemType);
    }

    /**
     * 得到删除大题的试卷xml.
     * <p>
     * 返回map说明：
     * xml=试卷qti的xml;
     * score=试卷总分;
     * exist=操作的数据是否存在;
     *
     * @param orginalXml 删除前的试卷xml
     * @param sectionId  要删除的大题id
     * @return 试卷返回数据map remove section xml
     * @throws Exception the exception
     */
    @PostMapping(value = "/getRemoveSectionXml")
    public Map<String, Object> getRemoveSectionXml(@RequestBody String orginalXml, @RequestParam("sectionId") String sectionId) throws Exception {
        return PaperXmlMaker.getRemoveSectionXml(orginalXml, sectionId);
    }

    /**
     * 得到删除试题的试卷xml.
     * <p>
     * 返回map说明：
     * xml=试卷qti的xml;
     * score=试卷总分;
     * exist=操作的数据是否存在;
     *
     * @param orginalXml 删除前的试卷xml
     * @param questionId 要删除的试题id
     * @return 试卷返回数据map remove question xml
     * @throws Exception the exception
     */
    @PostMapping(value = "/getRemoveQuestionXml")
    public static Map<String, Object> getRemoveQuestionXml(@RequestBody String orginalXml, @RequestParam("questionId") String questionId) throws Exception {
        return PaperXmlMaker.getRemoveQuestionXml(orginalXml, questionId);
    }

    /**
     * 得到修改大题的试卷xml.
     * <p>
     * 输入参数说明：Object/String
     * Object/String
     * String/xml
     * PaperSection/section
     * <p>
     * 返回map说明：
     * xml=试卷qti的xml;
     * score=试卷总分;
     * exist=操作的数据是否存在;
     *
     * @param info 请求模型
     * @return 试卷返回数据map edit section xml
     * @throws Exception the exception
     */
    @PostMapping(value = "/getEditSectionXml")
    public static Map<String, Object> getEditSectionXml(@RequestBody Map<String, Object> info) throws Exception {
        String orginalXml = info.get("xml").toString();
        String sectionId = info.get("sectionId").toString();
        String title = info.get("sectionTitle").toString();
        boolean isShuf = Boolean.valueOf(info.get("isShuf").toString());

        return PaperXmlMaker.getEditSectionXml(orginalXml, sectionId, title, isShuf);
    }

    /**
     * 得到修改大题试题分数的试卷xml.
     * <p>
     * 返回map说明：
     * xml=试卷qti的xml;
     * score=试卷总分;
     * exist=操作的数据是否存在;
     *
     * @param orginalXml 修改前的试卷xml
     * @param sectionId  要修改的大题id
     * @param questionId 要修改的试题id，如果修改大题所有试题分数，此字段为空即可
     * @param score      要修改的试题分数
     * @return 试卷返回数据map edit section score xml
     * @throws Exception the exception
     */
    @PostMapping(value = "/getEditSectionScoreXml")
    public static Map<String, Object> getEditSectionScoreXml(@RequestBody String orginalXml, @RequestParam("sectionId") String sectionId,
                                                             @RequestParam("questionId") String questionId, @RequestParam("score") double score) throws Exception {
        return PaperXmlMaker.getEditSectionScoreXml(orginalXml, sectionId, questionId, score);
    }

    /**
     * 得到移动大题顺序的试卷xml.
     * <p>
     * 返回map说明：
     * xml=试卷qti的xml;
     * score=试卷总分;
     * exist=操作的数据是否存在;
     *
     * @param orginalXml 修改前的试卷xml
     * @param sectionId  要移动的大题id
     * @param m          移动方式：上移/下移：t/f
     * @return 试卷返回数据map edit section xml
     * @throws Exception the exception
     */
    @PostMapping(value = "/getMoveSectionXml")
    public static Map<String, Object> getMoveSectionXml(@RequestBody String orginalXml, @RequestParam("sectionId") String sectionId,
                                                        @RequestParam("m") boolean m) throws Exception {
        return PaperXmlMaker.getMoveSectionXml(orginalXml, sectionId, m);
    }

    /**
     * 得到移动试题顺序的试卷xml.
     * <p>
     * 返回map说明：
     * xml=试卷qti的xml;
     * score=试卷总分;
     * exist=操作的数据是否存在;
     *
     * @param orginalXml 修改前的试卷xml
     * @param sectionId  要移动的大题id
     * @param questionId 要移动的试题id
     * @param m          移动方式：上移/下移：t/f
     * @return 试卷返回数据map edit section xml
     * @throws Exception the exception
     */
    @PostMapping(value = "/getMoveQuestionXml")
    public static Map<String, Object> getMoveQuestionXml(@RequestBody String orginalXml, @RequestParam("sectionId") String sectionId,
                                                         @RequestParam("questionId") String questionId, @RequestParam("m") boolean m) throws Exception {
        return PaperXmlMaker.getMoveQuestionXml(orginalXml, sectionId, questionId, m);
    }

    /**
     * 得到修改试题的试卷xml.
     * <p>
     * 输入参数说明：Object/String
     * Object/String
     * String/xml
     * PaperSection/section
     * String/questionId
     * String/newQuestionId
     * double/score
     * ItemType/itemType
     * <p>
     * 返回map说明：
     * xml=试卷qti的xml;
     * score=试卷总分;
     * exist=操作的数据是否存在;
     *
     * @param info 请求模型
     * @return 试卷返回数据map add question xml
     * @throws Exception the exception
     */
    @PostMapping(value = "/getEditQuestionXml")
    public static Map<String, Object> getEditQuestionXml(@RequestBody Map<String, Object> info) throws Exception {

        String orginalXml = info.get("xml").toString();
        String sectionId = info.get("sectionId").toString();
        String questionId = info.get("questionId").toString();
        String newQuestionId = info.get("newQuestionId").toString();
        double score = (double) info.get("score");
        ItemType itemType = ItemType.valueOf(info.get("itemType").toString());

        return PaperXmlMaker.getEditQuestionXml(orginalXml, sectionId, questionId, newQuestionId, score, itemType);
    }

    /**
     * 得到复制试卷xml.
     *
     * @param orginalXml     被复制的试卷xml
     * @param newTestPaperId 新的试卷id
     * @return the copy test paper xml
     * @throws Exception the exception
     */
    @PostMapping(value = "/getCopyTestPaperXml")
    public static Map<String, Object> getCopyTestPaperXml(@RequestBody String orginalXml, @RequestParam("newId") String newTestPaperId) throws Exception {
        return PaperXmlMaker.getCopyTestPaperXml(orginalXml, newTestPaperId);
    }

    /**
     * 从xml转换试卷模型实体.
     *
     * @param orginalXml 试卷xml
     * @return the test paper
     * @throws Exception the exception
     */
    @PostMapping(value = "/get")
    public TestPaper get(@RequestBody String orginalXml) throws Exception {
        TestPaper testPaper = new TestPaper(orginalXml);
        return testPaper;
    }
}
