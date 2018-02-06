package cn.com.open.openqti;

import cn.com.open.openqti.Exception.OpenReadingComprehensionAssessmentItemNotSupportGapException;

import java.util.List;

/**
 * Created by lucky on 2017/6/14.
 */
public class OpenReadingComprehensionAssessmentItem extends OpenCompositeAssessmentItem {
    /**
     * 题型
     */
    @Override
    public ItemType getAssessmentItemType() {
        return ItemType.READINGCOMPREHENSION;
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
     * @throws Exception the exception
     */
    public void setSubItems(List<OpenSingleChoiceAssessmentItem> subItems) throws Exception {
        super.setBaseSubItems(ConvertSingleChioceItemsToCompositeSubItems(subItems));
    }

    /**
     * 阅读理解构造函数
     */
    public OpenReadingComprehensionAssessmentItem() {
    }

    /**
     * 阅读理解构造函数
     *
     * @param identifier        ID
     * @param title             标题
     * @param shuffle           是否乱序
     * @param prompt            题干
     * @param singleChoiceItems 子题
     * @param questionAnalysis  大题解析
     * @throws Exception the exception
     */
    public OpenReadingComprehensionAssessmentItem(String identifier, String title, boolean shuffle, OpenPrompt prompt, List<OpenSingleChoiceAssessmentItem> singleChoiceItems,
                                                  String questionAnalysis) throws Exception {
        super(identifier, title, shuffle, prompt, ConvertSingleChioceItemsToCompositeSubItems(singleChoiceItems), questionAnalysis);
        if (!((prompt.getClozeGapCollection() == null) || (prompt.getClozeGapCollection().size() == 0))) {
            throw new OpenReadingComprehensionAssessmentItemNotSupportGapException(identifier, title);
        }
    }

    //region Translate Between IMS & OPEN

    /**
     * 转换为IMS试题前处理
     * 构建ResponseDeclarations、OutcomeDeclarations、ItemBody、ResponseProcessing
     */
    @Override
    protected void handleBeforeTranslateToImsItem() throws Exception {
        this.setSubItems(this.getSubItems());//防止子题属性修改后无法更新到xml问题
        super.handleBeforeTranslateToImsItem();
    }

    /**
     * 从IMS试题转换后处理
     * 从ResponseDeclarations、OutcomeDeclarations、ItemBody、ResponseProcessing反向得到本题项内容
     */
    @Override
    protected void handleAfterTranslateFromImsItem() throws Exception {
        super.handleAfterTranslateFromImsItem();
    }

    //endregion
}
