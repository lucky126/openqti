package cn.com.open.openqti;

import cn.com.open.openqti.Exception.OpenTextEntryInteractionCountInvalidException;
import cn.com.open.openqti.Exception.OpenTextEntryInteractionScoreInvalidException;
import cn.com.open.qti.*;
import cn.com.open.utils.DoubleUtil;
import cn.com.open.utils.PatternUtil;

import java.util.*;

/**
 * Created by lucky on 2017/6/14.
 */
public class OpenTextEntryAssessmentItem extends OpenAssessmentItem {
    /**
     * 题型
     */
    @Override
    public ItemType getAssessmentItemType() {
        return ItemType.TEXTENTRY;
    }

    /**
     * 段落内容（题干）不含expectedLength、responseIdentifier
     */
    private String itemBodyContent;

    /**
     * 试题答案
     */
    private List<OpenTextEntryInteraction> textEntryInteractions;

    /**
     * Gets item body content.
     *
     * @return the item body content
     */
    public String getItemBodyContent() {
        return itemBodyContent;
    }

    /**
     * Sets item body content.
     *
     * @param itemBodyContent the item body content
     */
    public void setItemBodyContent(String itemBodyContent) {
        this.itemBodyContent = itemBodyContent;
    }

    /**
     * Gets text entry interactions.
     *
     * @return the text entry interactions
     */
    public List<OpenTextEntryInteraction> getTextEntryInteractions() {
        return textEntryInteractions;
    }

    /**
     * Sets text entry interactions.
     *
     * @param textEntryInteractions the text entry interactions
     */
    public void setTextEntryInteractions(List<OpenTextEntryInteraction> textEntryInteractions) {
        this.textEntryInteractions = textEntryInteractions;
    }

    /**
     * 各填空项的分数（分数平均分配）
     *
     * @return the child item score
     */
    public double getChildItemScore() {
        return DoubleUtil.round(1.0 / getTextEntryInteractions().size(), 4);
    }

    /**
     * 填空题构造函数
     */
    public OpenTextEntryAssessmentItem() {
    }

    /**
     * 填空题构造函数
     * 试题内容中各填空项不带expectedLength
     *
     * @param identifier            试题ID
     * @param title                 标题
     * @param itemBodyContent       试题内容（题干、填空）不含expectedLength、responseIdentifier
     * @param textEntryInteractions 填空项集合
     * @param questionAnalysis      解析
     * @throws OpenTextEntryInteractionScoreInvalidException the open text entry interaction score invalid exception
     */
    public OpenTextEntryAssessmentItem(String identifier, String title, String itemBodyContent,
                                       List<OpenTextEntryInteraction> textEntryInteractions, String questionAnalysis) throws OpenTextEntryInteractionScoreInvalidException {
        super(identifier, title, questionAnalysis);
        //各填空项分数检验
        boolean singleInteraction = textEntryInteractions.size() == 1;

        for (int i = 0; i < textEntryInteractions.size(); i++) {
            OpenTextEntryInteraction textEntryInteraction = textEntryInteractions.get(i);
            textEntryInteraction.setResponseIdentifier(singleInteraction ? "RESPONSE" : String.format("RESPONSE_%d", i + 1));
            double itemScore = 0;
            if (textEntryInteraction.getCorrectResponseValues() != null && textEntryInteraction.getCorrectResponseValues().values() != null) {
                for (double score : textEntryInteraction.getCorrectResponseValues().values()) {
                    itemScore = Math.max(itemScore, score);//单项分数为各正确答案最大分
                }
            }
            if (itemScore != 1) {
                throw new OpenTextEntryInteractionScoreInvalidException(identifier, title, i);
            }
        }

        setItemBodyContent(itemBodyContent);
        setTextEntryInteractions(textEntryInteractions);
    }

    /**
     * 填空题构造函数
     *
     * @param respDeclarations         响应变量集合
     * @param outDeclarations          分数结果变量集合
     * @param itemBodyContentInsideDiv 试题体内容（div内的内容，含expectedLength、responseIdentifier）
     * @param setOutcomeValues         判分规则内容集合
     */
    public OpenTextEntryAssessmentItem(Collection<ResponseDeclarationType> respDeclarations, Collection<OutcomeDeclarationType> outDeclarations,
                                       String itemBodyContentInsideDiv, Collection<SetOutcomeValueType> setOutcomeValues) throws Exception {
        ResponseProcessingType processing = new ResponseProcessingType();
        processing.getResponseRuleElementGroup().add(setOutcomeValues);

        setResponseDeclarations(respDeclarations);
        setOutcomeDeclarations(outDeclarations);
        setItemBody(BuildItemBody(itemBodyContentInsideDiv));
        setResponseProcessing(processing);

        handleAfterTranslateFromImsItem();
    }

    /**
     * 创建试题体
     *
     * @param itemBodyContentInsideDiv 试题体内容（div内的内容，含expectedLength、responseIdentifier）
     * @return 试题体
     */
    private ItemBodyType BuildItemBody(String itemBodyContentInsideDiv) {
        ItemBodyType body = new ItemBodyType();

        if (itemBodyContentInsideDiv.length() > 0)//所有内容包括在DIV内
        {
            DivType paragraphDiv = new DivType();
            paragraphDiv.getContent().add(itemBodyContentInsideDiv);
            body.getBlockElementGroup().add(paragraphDiv);
        }

        return body;
    }

    /**
     * 从IMS试题转换后处理
     * 从ResponseDeclarations、OutcomeDeclarations、ItemBody、ResponseProcessing反向得到本题项内容
     */
    @Override
    protected void handleAfterTranslateFromImsItem() throws Exception {
        super.handleAfterTranslateFromImsItem();

        //region 从ResponseDeclarations反向得到OpenTextEntryInteractions列表
        List<OpenTextEntryInteraction> Interactions = new ArrayList<OpenTextEntryInteraction>();

        if (getResponseDeclarations() != null) {
            for (ResponseDeclarationType respDeclaration : getResponseDeclarations()) {
                Map<String, Double> correctResponseValues = new HashMap<String, Double>();
                if (respDeclaration.getMapping() != null && respDeclaration.getMapping().getMapEntry() != null) {
                    for (MapEntryType entry : respDeclaration.getMapping().getMapEntry()) {
                        correctResponseValues.put(entry.getMapKey(), entry.getMappedValue());
                    }
                }
                OpenTextEntryInteraction interaction = new OpenTextEntryInteraction(correctResponseValues);
                Interactions.add(interaction);
            }
        }
        //endregion

        //region 得到ItemBodyContent（含填空）
        if (getItemBody().getBlockElementGroup() != null && getItemBody().getBlockElementGroup().size() > 0) {
            for (Object obj : getItemBody().getBlockElementGroup()) {
                if (obj instanceof DivType) {
                    DivType div = (DivType) obj;
                    setItemBodyContent(div.getContent().get(0).toString());
                }
            }
        }
        //endregion

        //region 从段落内容（题干）将expectedLength取出赋给OpenTextEntryInteraction的ExpectedLength、再从内容中去掉expectedLength
        //正则表达式：(&lt;textEntryInteraction\sresponseIdentifier='RESPONSE_\d+'\sexpectedLength='\d+'/&gt;)
        List<String> splittedItemBodyContents = PatternUtil.getPatternSplitList(getItemBodyContent(), "(<textEntryInteraction\\s.*?\\sexpectedLength=\"\\d+\"/>)");

        if (splittedItemBodyContents.size() != Interactions.size() * 2 + 1) {
            throw new OpenTextEntryInteractionCountInvalidException(getIdentifier(), getTitle());
        }

        StringBuilder resettedItemBodyContent = new StringBuilder();
        for (int i = 0; i < splittedItemBodyContents.size(); i++) {
            if (i % 2 != 0) {
                //取出expectedLength值，赋值给对应的OpenTextEntryInteraction
                int startPos = splittedItemBodyContents.get(i).indexOf("expectedLength=\"");
                int endPos = splittedItemBodyContents.get(i).indexOf("\"", startPos + 16);
                int expLength = Integer.valueOf(splittedItemBodyContents.get(i).substring(startPos + 16, endPos));

                //取出responseIdentifier值，赋值给对应的OpenTextEntryInteraction
                startPos = splittedItemBodyContents.get(i).indexOf("responseIdentifier=\"");
                endPos = splittedItemBodyContents.get(i).indexOf("\"", startPos + 20);
                String resIdentifier = splittedItemBodyContents.get(i).substring(startPos + 20, endPos);

                Interactions.get((i - 1) / 2).setExpectedLength(expLength);
                Interactions.get((i - 1) / 2).setResponseIdentifier(resIdentifier);

                splittedItemBodyContents.set(i, "<textEntryInteraction/>");
                resettedItemBodyContent.append(splittedItemBodyContents.get(i));

            } else {
                resettedItemBodyContent.append(splittedItemBodyContents.get(i));
            }
        }

        setItemBodyContent(resettedItemBodyContent.toString());
        setTextEntryInteractions(Interactions);
        //endregion
    }

    /**
     * 转换为IMS试题前处理
     * 构建ResponseDeclarations、OutcomeDeclarations、ItemBody、ResponseProcessing
     */
    @Override
    protected void handleBeforeTranslateToImsItem() throws Exception {

        boolean singleInteraction = getTextEntryInteractions().size() == 1;

        //region 从OpenTextEntryInteraction中取出ExpectedLength，ResponseIdentifier设置段落内容（题干）的expectedLength、responseIdentifier

        //正则表达式：(&lt;textEntryInteraction\sresponseIdentifier='RESPONSE_\d+'\sexpectedLength='\d+'/&gt;)
        List<String> splittedItemBodyContents = PatternUtil.getPatternSplitList(getItemBodyContent(), "(<textEntryInteraction/>)");

        if (splittedItemBodyContents.size() != this.getTextEntryInteractions().size() * 2 + 1) {
            throw new OpenTextEntryInteractionCountInvalidException(getIdentifier(), getTitle());
        }

        StringBuilder resettedItemBodyContent = new StringBuilder();
        for (int i = 0; i < splittedItemBodyContents.size(); i++) {
            if (i % 2 != 0) {
                //重置的内容增加expectedLength
                int startPos = splittedItemBodyContents.get(i).indexOf("/>");
                resettedItemBodyContent.append(splittedItemBodyContents.get(i).substring(0, startPos));
                getTextEntryInteractions().get((i - 1) / 2).setResponseIdentifier(singleInteraction ? "RESPONSE" : String.format("RESPONSE_%d", (i - 1) / 2 + 1));
                resettedItemBodyContent.append(String.format(" responseIdentifier=\"%s\"", getTextEntryInteractions().get((i - 1) / 2).getResponseIdentifier()));
                resettedItemBodyContent.append(String.format(" expectedLength=\"%d\"", getTextEntryInteractions().get((i - 1) / 2).getExpectedLength()));
                resettedItemBodyContent.append(splittedItemBodyContents.get(i).substring(startPos));
            } else {
                resettedItemBodyContent.append(splittedItemBodyContents.get(i));
            }
        }
        //endregion

        List<Map<String, Double>> mapEntrysList = null;
        mapEntrysList = new ArrayList<Map<String, Double>>();
        for (int i = 0; i < getTextEntryInteractions().size(); i++) {
            mapEntrysList.add(getTextEntryInteractions().get(i).getCorrectResponseValues());
        }
        setResponseDeclarations(BuildResponseDeclarationCollection(CardinalityType.SINGLE, BaseTypeType.IDENTIFIER, mapEntrysList));
        setOutcomeDeclarations(BuildScoreOutcomeDeclarationCollection(getTextEntryInteractions().size()));
        setItemBody(BuildItemBody(resettedItemBodyContent.toString()));
        setResponseProcessing(BuildMapResponseResponseProcessing(getTextEntryInteractions().size()));

        super.handleBeforeTranslateToImsItem();
    }

    /**
     * 获取媒体资源列表
     *
     * @return media对象
     */
    @Override
    public List<Media> GetMediaList() {
        return null;
    }
}
