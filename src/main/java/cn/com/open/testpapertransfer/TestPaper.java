package cn.com.open.testpapertransfer;

import cn.com.open.openqti.OpenAssessmentItemRef;
import cn.com.open.openqti.OpenAssessmentSection;
import cn.com.open.openqti.OpenAssessmentTest;
import cn.com.open.openqti.OpenTestPart;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucky on 2017/11/7.
 */
public class TestPaper implements Serializable {

    //region property define
    /**
     * 试卷模型
     */
    private PaperModel model;
    /**
     * 部分列表
     */
    private List<PaperPart> parts;
    /**
     * 试题列表
     */
    private List<Object> Items;

    /**
     * Gets model.
     *
     * @return the model
     */
    public PaperModel getModel() {
        return model;
    }

    /**
     * Sets model.
     *
     * @param model the model
     */
    public void setModel(PaperModel model) {
        this.model = model;
    }

    /**
     * Gets parts.
     *
     * @return the parts
     */
    public List<PaperPart> getParts() {
        if (parts == null) {
            parts = new ArrayList<>();
        }
        return parts;
    }

    /**
     * Gets items.
     *
     * @return the items
     */
    public List<Object> getItems() {
        if (Items == null) {
            Items = new ArrayList<>();
        }
        return Items;
    }

    //endregion

    /**
     * 构造函数
     * 用于构建试卷实体后形成xml用
     */
    public TestPaper() {
        model = new PaperModel();
    }

    /**
     * 构造函数
     * 用于根据试题xml和试卷xml构建试卷实体
     *
     * @param paperXml 试卷xml
     * @throws Exception the exception
     */
    public TestPaper(String paperXml) throws Exception {
        this();
        OpenAssessmentTest test = new OpenAssessmentTest();
        test.LoadFromString(paperXml);
        FillContent(test);
    }

    /**
     * 填充QTI试卷内容部分
     *
     * @param test OpenAssessmentTest
     */
    private void FillContent(OpenAssessmentTest test) throws Exception {

        for (OpenTestPart part : test.getTestPartCollection()) {
            PaperPart paperPart = new PaperPart();

            for (OpenAssessmentSection section : part.getAssessmentSectionCollection()) {
                PaperSection paperSectionNew = new PaperSection();
                paperSectionNew.setIdentifier(section.getIdentifier());
                paperSectionNew.setTitle(section.getTitle());
                paperSectionNew.setScore(section.getScore());
                paperSectionNew.setShuf(section.isShuffle());

                //遍历大题
                for (OpenAssessmentItemRef itemRef : section.getAssessmentItemRefCollection()) {
                    PaperItem paperItem = new PaperItem();

                    paperItem.setItemId(itemRef.getIdentifier());
                    paperItem.setScore(itemRef.getWeight());
                    paperItem.setResponseDuration(itemRef.getResponseDuration());
                    paperItem.setSubjective(itemRef.isSubjective());
                    paperItem.setQuestionTypeId(itemRef.getType().getIndex());

                    paperSectionNew.getItems().add(paperItem);
                }

                paperPart.getSections().add(paperSectionNew);
            }

            this.getParts().add(paperPart);
        }
    }
}
