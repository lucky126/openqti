package cn.com.open.testpapertransfer;

import cn.com.open.openqti.*;
import cn.com.open.qti.NavigationModeType;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by lucky on 2017/11/7.
 */
public class PaperXmlMaker {

    private PaperXmlMaker() {
    }

    //region 内部方法

    /**
     * 根据qtixml生成试题qti模型.
     *
     * @param orginalXml qtixml
     * @return 试卷qti模型
     * @throws Exception the exception
     */
    private static OpenAssessmentTest getModel(String orginalXml) throws Exception {
        OpenAssessmentTest test = new OpenAssessmentTest();
        test.LoadFromString(orginalXml);

        return test;
    }

    /**
     * 生成试卷返回数据map，包括qti和总分.
     *
     * @param test    试卷qti模型
     * @param isExist 是否存在数据
     * @return the return model
     */
    private static Map<String, Object> getReturnModel(OpenAssessmentTest test, boolean isExist) throws Exception {
        Map<String, Object> map = new HashedMap();
        map.put("xml", test.getXmlString());
        map.put("score", getSumScore(test));
        map.put("exist", isExist);
        return map;
    }

    /**
     * 生成试卷返回数据map，包括qti和总分和包含的试题id列表（用于删除大题返回影响试题id用）.
     *
     * @param test       试卷qti模型
     * @param isExist    是否存在数据
     * @param includeIds 所包含的试题id集合
     * @return the return model
     * @throws Exception the exception
     */
    private static Map<String, Object> getReturnModel(OpenAssessmentTest test, boolean isExist, List<String> includeIds) throws Exception {
        Map<String, Object> map = getReturnModel(test, isExist);
        map.put("ids", includeIds);
        return map;
    }

    /**
     * 计算试卷总分.
     *
     * @param test 试卷qti模型
     * @return the sum score
     */
    private static double getSumScore(OpenAssessmentTest test) {
        double score = 0;

        for (OpenTestPart part : test.getTestPartCollection()) {
            for (OpenAssessmentSection section : part.getAssessmentSectionCollection()) {
                for (OpenAssessmentItemRef itemRef : section.getAssessmentItemRefCollection()) {
                    score += itemRef.getWeight();
                }
            }
        }

        return score;
    }
    //endregion

    //region 根据试卷模型得到试卷xml

    /**
     * 根据试卷模型得到试卷xml.
     *
     * @param testPaper the test paper
     * @return the full paper xml
     * @throws Exception the exception
     */
    public static Map<String, Object> getFullPaperXml(TestPaper testPaper) throws Exception {
        String identifier = testPaper.getModel().getP1();
        String title = testPaper.getModel().getP2();
        int partIndex = 1;
        List<OpenTestPart> parts = new ArrayList<>();

        for (PaperPart paperPart : testPaper.getParts()) {
            List<OpenAssessmentSection> sections = new ArrayList<>();

            for (PaperSection paperSection : paperPart.getSections()) {
                List<OpenAssessmentItemRef> refs = new ArrayList<>();

                for (PaperItem paperItem : paperSection.getItems()) {
                    //形成试题ref
                    OpenAssessmentItemRef ref = new OpenAssessmentItemRef(paperItem.getItemId(), paperItem.isSubjective(),
                            ItemType.fromValue(paperItem.getQuestionTypeId()), paperItem.getScore());

                    if (paperItem.getScore() == 0d) {
                        //例题非听力题目
                        ref = new OpenAssessmentItemRef(paperItem.getItemId(), paperItem.isSubjective(), ItemType.fromValue(paperItem.getQuestionTypeId()));
                    }

                    refs.add(ref);
                }

                OpenAssessmentSection newSection = new OpenAssessmentSection(paperSection.getIdentifier(), paperSection.getTitle(),
                        paperSection.isShuf(), new OpenPrompt(""), refs, 0);

                sections.add(newSection);
            }

            OpenTestPart part = new OpenTestPart(String.format("P%02d", partIndex), new OpenPrompt(""), NavigationModeType.NONLINEAR, sections);

            parts.add(part);
            partIndex++;
        }

        OpenAssessmentTest test = new OpenAssessmentTest(identifier, title, parts);

        return getReturnModel(test, true);
    }
    //endregion

    //region 根据试卷模型得到空试卷xml

    /**
     * 根据试卷模型得到空试卷xml.
     *
     * @param paper 试卷模型
     * @return 试卷返回数据map new paper xml
     * @throws Exception the exception
     */
    public static Map<String, Object> getNewPaperXml(PaperModel paper) throws Exception {
        String identifier = paper.getP1();
        String title = paper.getP2();

        List<OpenAssessmentSection> sections = new ArrayList<>();
        List<OpenTestPart> parts = new ArrayList<>();

        OpenTestPart part = new OpenTestPart("P01", new OpenPrompt(""), NavigationModeType.NONLINEAR, sections);
        parts.add(part);

        OpenAssessmentTest test = new OpenAssessmentTest(identifier, title, parts);
        return getReturnModel(test, true);
    }
    //endregion

    //region 得到更新试卷标题xml

    /**
     * 得到更新试卷标题xml.
     *
     * @param orginalXml the orginal xml
     * @param title      the title
     * @return the edit title xml
     * @throws Exception the exception
     */
    public static Map<String, Object> getEditTitleXml(String orginalXml, String title) throws Exception {
        OpenAssessmentTest test = getModel(orginalXml);
        test.setTitle(title);
        return getReturnModel(test, true);
    }
    //endregion

    //region 得到新增试题的试卷xml

    /**
     * 得到新增试题的试卷xml.
     *
     * @param orginalXml   新增前的试卷xml
     * @param sectionid    大题id
     * @param sectionTitle 大题名称
     * @param isShuf       是否乱序
     * @param questionId   试题id
     * @param score        试题分数
     * @param itemType     试题内部题型
     * @return 试卷返回数据map add question xml
     * @throws Exception the exception
     */
    public static Map<String, Object> getAddQuestionXml(String orginalXml, String sectionid, String sectionTitle, boolean isShuf,
                                                        String questionId, double score, ItemType itemType) throws Exception {
        OpenAssessmentTest test = getModel(orginalXml);

        boolean isSectionExist = false;
        //形成试题ref
        OpenAssessmentItemRef ref = new OpenAssessmentItemRef(questionId, false, itemType, score);

        for (OpenTestPart part : test.getTestPartCollection()) {
            if (!part.getAssessmentSectionCollection().isEmpty()) {
                for (OpenAssessmentSection orginSection : part.getAssessmentSectionCollection()) {
                    //循环查找大题，如果存在则将当前题目加入大题，否则新增大题
                    if (orginSection.getIdentifier().equalsIgnoreCase(sectionid)) {
                        isSectionExist = true;
                        orginSection.getAssessmentItemRefCollection().add(ref);
                    }
                }
            }

            if (!isSectionExist) {
                List<OpenAssessmentItemRef> items = new ArrayList<>();
                items.add(ref);

                OpenAssessmentSection newSection = new OpenAssessmentSection(sectionid, sectionTitle, isShuf, new OpenPrompt(""), items, 0);
                part.getAssessmentSectionCollection().add(newSection);
            }
        }

        return getReturnModel(test, true);
    }
    //endregion

    //region 得到删除大题的试卷xml

    /**
     * 得到删除大题的试卷xml.
     *
     * @param orginalXml 删除前的试卷xml
     * @param sectionId  要删除的大题id
     * @return 试卷返回数据map remove section xml
     * @throws Exception the exception
     */
    public static Map<String, Object> getRemoveSectionXml(String orginalXml, String sectionId) throws Exception {
        OpenAssessmentTest test = getModel(orginalXml);
        List<String> ids = new ArrayList<>();
        boolean isExist = false;

        for (OpenTestPart part : test.getTestPartCollection()) {
            for (OpenAssessmentSection orginSection : part.getAssessmentSectionCollection()) {
                if (orginSection.getIdentifier().equalsIgnoreCase(sectionId)) {
                    //得到该大题下所有试题id集合
                    for (OpenAssessmentItemRef ref : orginSection.getAssessmentItemRefCollection()) {
                        ids.add(ref.getIdentifier());
                    }
                    isExist = true;
                    part.getAssessmentSectionCollection().remove(orginSection);
                    break;
                }
            }
        }

        return getReturnModel(test, isExist, ids);
    }
    //endregion

    //region 得到删除试题的试卷xml

    /**
     * 得到删除试题的试卷xml.
     *
     * @param orginalXml 删除前的试卷xml
     * @param questionId 要删除的试题id
     * @return 试卷返回数据map remove question xml
     * @throws Exception the exception
     */
    public static Map<String, Object> getRemoveQuestionXml(String orginalXml, String questionId) throws Exception {
        OpenAssessmentTest test = getModel(orginalXml);
        boolean isExist = false;

        for (OpenTestPart part : test.getTestPartCollection()) {
            for (OpenAssessmentSection section : part.getAssessmentSectionCollection()) {
                for (OpenAssessmentItemRef itemRef : section.getAssessmentItemRefCollection()) {
                    if (itemRef.getIdentifier().equalsIgnoreCase(questionId)) {
                        isExist = true;
                        section.getAssessmentItemRefCollection().remove(itemRef);
                        break;
                    }
                }
                if (section.getAssessmentItemRefCollection().isEmpty()) {
                    part.getAssessmentSectionCollection().remove(section);
                    break;
                }
            }
        }

        return getReturnModel(test, isExist);
    }
    //endregion

    //region 得到修改大题的试卷xml

    /**
     * 得到修改大题的试卷xml.
     *
     * @param orginalXml   修改前的试卷xml
     * @param sectionid    大题id
     * @param sectionTitle 大题名称
     * @param isShuf       是否乱序
     * @return 试卷返回数据map edit section xml
     * @throws Exception the exception
     */
    public static Map<String, Object> getEditSectionXml(String orginalXml, String sectionid, String sectionTitle, boolean isShuf) throws Exception {
        OpenAssessmentTest test = getModel(orginalXml);
        boolean isExist = false;

        for (OpenTestPart part : test.getTestPartCollection()) {
            for (OpenAssessmentSection orginSection : part.getAssessmentSectionCollection()) {
                if (orginSection.getIdentifier().equalsIgnoreCase(sectionid)) {
                    isExist = true;
                    orginSection.setTitle(sectionTitle);
                    orginSection.setShuffle(isShuf);
                    break;
                }
            }
        }

        return getReturnModel(test, isExist);
    }
    //endregion

    //region 得到修改大题试题分数的试卷xml

    /**
     * 得到修改大题试题分数的试卷xml.
     *
     * @param orginalXml 修改前的试卷xml
     * @param sectionId  要修改的大题id
     * @param questionId 要修改的试题id，如果修改大题所有试题分数，此字段为空即可
     * @param score      要修改的试题分数
     * @return 试卷返回数据map edit section score xml
     * @throws Exception the exception
     */
    public static Map<String, Object> getEditSectionScoreXml(String orginalXml, String sectionId, String questionId, double score) throws Exception {
        OpenAssessmentTest test = getModel(orginalXml);
        boolean isExist = false;

        for (OpenTestPart part : test.getTestPartCollection()) {
            for (OpenAssessmentSection orginSection : part.getAssessmentSectionCollection()) {
                if (orginSection.getIdentifier().equalsIgnoreCase(sectionId)) {
                    for (OpenAssessmentItemRef itemRef : orginSection.getAssessmentItemRefCollection()) {
                        if (StringUtils.isEmpty(questionId)) {
                            isExist = true;
                            //修改大题所有试题分数
                            itemRef.setWeight(score);
                        } else {
                            //修改指定试题分数
                            if (itemRef.getIdentifier().equalsIgnoreCase(questionId)) {
                                isExist = true;
                                itemRef.setWeight(score);
                            }
                        }
                    }
                    break;
                }
            }
        }

        return getReturnModel(test, isExist);
    }
    //endregion

    //region 得到移动大题顺序的试卷xml

    /**
     * 得到移动大题顺序的试卷xml.
     *
     * @param orginalXml 修改前的试卷xml
     * @param sectionId  要移动的大题id
     * @param m          移动方式：上移/下移：t/f
     * @return 试卷返回数据map edit section xml
     * @throws Exception the exception
     */
    public static Map<String, Object> getMoveSectionXml(String orginalXml, String sectionId, boolean m) throws Exception {
        OpenAssessmentTest test = getModel(orginalXml);
        boolean isExist = false;

        for (OpenTestPart part : test.getTestPartCollection()) {
            List<OpenAssessmentSection> sections = part.getAssessmentSectionCollection();

            for (int i = 0; i < sections.size(); i++) {

                if (sections.get(i).getIdentifier().equalsIgnoreCase(sectionId)) {
                    isExist = true;
                    OpenAssessmentSection current = new OpenAssessmentSection(sections.get(i).getIdentifier(), sections.get(i).getTitle(),
                            sections.get(i).isShuffle(), sections.get(i).getPrompt(), sections.get(i).getAssessmentItemRefCollection(),
                            sections.get(i).getMediaType());

                    if (m) {
                        //上移
                        //如果上移第一个，返回错误
                        if (i == 0) {
                            break;
                        }

                        OpenAssessmentSection prev = new OpenAssessmentSection(sections.get(i - 1).getIdentifier(), sections.get(i - 1).getTitle(),
                                sections.get(i - 1).isShuffle(), sections.get(i - 1).getPrompt(),
                                sections.get(i - 1).getAssessmentItemRefCollection(), sections.get(i - 1).getMediaType());

                        sections.set(i - 1, current);
                        sections.set(i, prev);
                    } else {
                        //下移
                        //如果下移最后一个，返回错误
                        if (i == sections.size() - 1) {
                            break;
                        }

                        OpenAssessmentSection next = new OpenAssessmentSection(sections.get(i + 1).getIdentifier(), sections.get(i + 1).getTitle(),
                                sections.get(i + 1).isShuffle(), sections.get(i + 1).getPrompt(),
                                sections.get(i + 1).getAssessmentItemRefCollection(), sections.get(i + 1).getMediaType());

                        sections.set(i + 1, current);
                        sections.set(i, next);
                    }

                    break;
                }
            }
        }

        return getReturnModel(test, isExist);
    }
    //endregion

    //region 得到移动试题顺序的试卷xml

    /**
     * 得到移动试题顺序的试卷xml.
     *
     * @param orginalXml 修改前的试卷xml
     * @param sectionId  要移动的大题id
     * @param questionId 要移动的试题id
     * @param m          移动方式：上移/下移：t/f
     * @return 试卷返回数据map edit section xml
     * @throws Exception the exception
     */
    public static Map<String, Object> getMoveQuestionXml(String orginalXml, String sectionId, String questionId, boolean m) throws Exception {
        OpenAssessmentTest test = getModel(orginalXml);
        boolean isExist = false;

        for (OpenTestPart part : test.getTestPartCollection()) {
            for (OpenAssessmentSection orginSection : part.getAssessmentSectionCollection()) {
                if (orginSection.getIdentifier().equalsIgnoreCase(sectionId)) {
                    isExist = true;
                    for (int i = 0; i < orginSection.getAssessmentItemRefCollection().size(); i++) {

                        List<OpenAssessmentItemRef> items = orginSection.getAssessmentItemRefCollection();

                        if (orginSection.getAssessmentItemRefCollection().get(i).getIdentifier().equalsIgnoreCase(questionId)) {
                            OpenAssessmentItemRef current = new OpenAssessmentItemRef(items.get(i).getIdentifier(), items.get(i).isSubjective(),
                                    items.get(i).getType(), items.get(i).getWeight());

                            if (m) {    //上移
                                //如果上移第一个，返回错误
                                if (i == 0) {
                                    break;
                                }

                                OpenAssessmentItemRef prev = new OpenAssessmentItemRef(items.get(i - 1).getIdentifier(),
                                        items.get(i - 1).isSubjective(), items.get(i - 1).getType(), items.get(i - 1).getWeight());

                                items.set(i - 1, current);
                                items.set(i, prev);
                            } else {   //下移
                                //如果下移最后一个，返回错误
                                if (i == items.size() - 1) {
                                    break;
                                }

                                OpenAssessmentItemRef next = new OpenAssessmentItemRef(items.get(i + 1).getIdentifier(),
                                        items.get(i + 1).isSubjective(), items.get(i + 1).getType(), items.get(i + 1).getWeight());

                                items.set(i + 1, current);
                                items.set(i, next);
                            }

                            break;
                        }
                    }
                }
            }
        }

        return getReturnModel(test, isExist);
    }
    //endregion

    //region 得到修改试题的试卷xml

    /**
     * 得到修改试题的试卷xml.
     *
     * @param orginalXml    修改前的试卷xml
     * @param sectionId     要修改的大题id
     * @param questionId    要修改的试题id
     * @param newQuestionId 新的试题id
     * @param score         试题分数
     * @param itemType      试题内部题型
     * @return 试卷返回数据map add question xml
     * @throws Exception the exception
     */
    public static Map<String, Object> getEditQuestionXml(String orginalXml, String sectionId, String questionId, String newQuestionId,
                                                         double score, ItemType itemType) throws Exception {
        OpenAssessmentTest test = getModel(orginalXml);
        boolean isExist = false;

        for (OpenTestPart part : test.getTestPartCollection()) {
            for (OpenAssessmentSection orginSection : part.getAssessmentSectionCollection()) {
                if (orginSection.getIdentifier().equalsIgnoreCase(sectionId)) {
                    for (int i = 0; i < orginSection.getAssessmentItemRefCollection().size(); i++) {
                        OpenAssessmentItemRef itemRef = orginSection.getAssessmentItemRefCollection().get(i);
                        if (itemRef.getIdentifier().equalsIgnoreCase(questionId)) {
                            isExist = true;
                            //形成试题ref
                            OpenAssessmentItemRef newItemRef = new OpenAssessmentItemRef(newQuestionId, false, itemType, score);

                            orginSection.getAssessmentItemRefCollection().set(i, newItemRef);
                            break;
                        }
                    }
                }
            }
        }

        return getReturnModel(test, isExist);
    }
    //endregion

    //region 得到复制试卷xml

    /**
     * 得到复制试卷xml.
     *
     * @param orginalXml     被复制的试卷xml
     * @param newTestPaperId 新的试卷id
     * @return the copy test paper xml
     * @throws Exception the exception
     */
    public static Map<String, Object> getCopyTestPaperXml(String orginalXml, String newTestPaperId) throws Exception {

        OpenAssessmentTest test = getModel(orginalXml);

        test.setIdentifier(newTestPaperId);

        return getReturnModel(test, true);
    }
    //endregion
}
