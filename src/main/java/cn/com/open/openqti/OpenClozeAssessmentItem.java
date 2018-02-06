package cn.com.open.openqti;

import cn.com.open.openqti.Exception.*;

import java.util.List;

/**
 * Created by lucky on 2017/6/14.
 */
public class OpenClozeAssessmentItem extends OpenCompositeAssessmentItem {
    /**
     * 题型
     */
    @Override
    public ItemType getAssessmentItemType() {
        return ItemType.CLOZE;
    }

    /**
     * 获取子题列表（无法实现C#的new覆盖父类方法，故采用改名方式实现）
     *
     * @return the sub items
     */
    public List<OpenSingleChoiceAssessmentItem> getSubItems() {
        return ConvertCompositeSubItemsToSingleChioceItems(super.getBaseSubItems());
    }

    /**
     * 设置子题列表（无法实现C#的new覆盖父类方法，故采用改名方式实现）
     *
     * @param subItems the sub items
     */
    public void setSubItems(List<OpenSingleChoiceAssessmentItem> subItems) throws Exception {
        super.setBaseSubItems(ConvertSingleChioceItemsToCompositeSubItems(subItems));
    }

    /**
     * 完形填空构造函数
     */
    public OpenClozeAssessmentItem() {
    }

    /**
     * 完形填空题构造函数
     *
     * @param identifier        ID
     * @param title             标题
     * @param prompt            题干
     * @param singleChoiceItems 子题
     * @param questionAnalysis  大题解析
     */
    public OpenClozeAssessmentItem(String identifier, String title, OpenPrompt prompt, List<OpenSingleChoiceAssessmentItem> singleChoiceItems, String questionAnalysis) throws Exception {
        super(identifier, title, false, prompt, ConvertSingleChioceItemsToCompositeSubItems(singleChoiceItems), questionAnalysis);
        if (prompt.getClozeGapCollection() == null || prompt.getClozeGapCollection().size() == 0) {
            throw new OpenClozeAssessmentItemHaveNoGapException();
        }

        if (prompt.getClozeGapCollection().size() != singleChoiceItems.size()) {
            throw new OpenClozeAssessmentItemSubItemNumNotMatchGapNumException(identifier, title);
        }
    }
}
