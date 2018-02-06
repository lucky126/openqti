package cn.com.open.openqti;

import cn.com.open.qti.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by lucky on 2017/6/14.
 */
public class OpenExtendedTextAssessmentItem extends OpenAssessmentItem {
    /**
     * 题型
     */
    @Override
    public ItemType getAssessmentItemType() {
        return ItemType.EXTENDEDTEXT;
    }

    /**
     * 题干
     */
    private OpenPrompt prompt;
    /**
     * 内容长度
     */
    private int expectedLength;
    /**
     * 正确答案
     */
    private String correntResponseValue;

    /**
     * Gets expected length.
     *
     * @return the expected length
     */
    public int getExpectedLength() {
        return expectedLength;
    }

    /**
     * Sets expected length.
     *
     * @param expectedLength the expected length
     */
    public void setExpectedLength(int expectedLength) {
        this.expectedLength = expectedLength;
    }

    /**
     * Gets corrent response value.
     *
     * @return the corrent response value
     */
    public String getCorrentResponseValue() {
        return correntResponseValue;
    }

    /**
     * Sets corrent response value.
     *
     * @param correntResponseValue the corrent response value
     */
    public void setCorrentResponseValue(String correntResponseValue) {
        this.correntResponseValue = correntResponseValue;
    }

    /**
     * Gets prompt.
     *
     * @return the prompt
     */
    public OpenPrompt getPrompt() {
        return prompt;
    }

    /**
     * Sets prompt.
     *
     * @param _Prompt the prompt
     */
    public void setPrompt(OpenPrompt _Prompt) {
        this.prompt = _Prompt;
    }

    /**
     * 问答题构造函数
     */
    public OpenExtendedTextAssessmentItem() {
    }

    /**
     * 问答题构造函数
     *
     * @param identifier           试题ID
     * @param title                标题
     * @param prompt               题干
     * @param expectedLength       内容长度
     * @param correctResponseValue 正确答案
     * @param questionAnalysis     试题解析
     */
    public OpenExtendedTextAssessmentItem(String identifier, String title, OpenPrompt prompt, int expectedLength, String correctResponseValue, String questionAnalysis) {
        super(identifier, title, questionAnalysis);
        setPrompt(prompt);
        setExpectedLength(expectedLength);
        setCorrentResponseValue(correctResponseValue);
    }

    /**
     * 问答题构造函数
     *
     * @param identifier           试题ID
     * @param title                标题
     * @param promptOriginalValue  段落内容（题干）
     * @param expectedLength       内容长度
     * @param correctResponseValue 正确答案
     * @param questionAnalysis     试题解析
     * @throws Exception the exception
     */
    private OpenExtendedTextAssessmentItem(String identifier, String title, String promptOriginalValue, int expectedLength, String correctResponseValue, String questionAnalysis) throws Exception {
        this(identifier, title, new OpenPrompt(promptOriginalValue), expectedLength, correctResponseValue, questionAnalysis);
    }

    /**
     * 问答题构造函数（无答题长度限制）
     *
     * @param identifier           试题ID
     * @param title                标题
     * @param prompt               段落内容（题干）
     * @param correctResponseValue 正确答案
     * @param questionAnalysis     试题解析
     */
    public OpenExtendedTextAssessmentItem(String identifier, String title, OpenPrompt prompt, String correctResponseValue, String questionAnalysis) {
        this(identifier, title, prompt, 0, correctResponseValue, questionAnalysis);
    }

    /**
     * 问答题构造函数（无答题长度限制）
     *
     * @param identifier           试题ID
     * @param title                标题
     * @param promptOriginalValue  段落内容（题干）
     * @param correctResponseValue 正确答案
     * @param questionAnalysis     试题解析
     */
    private OpenExtendedTextAssessmentItem(String identifier, String title, String promptOriginalValue, String correctResponseValue, String questionAnalysis) throws Exception {
        this(identifier, title, promptOriginalValue, 0, correctResponseValue, questionAnalysis);
    }

    /**
     * 问答题构造函数（无正确答案）
     *
     * @param identifier       试题ID
     * @param title            标题
     * @param prompt           段落内容（题干）
     * @param expectedLength   内容长度
     * @param questionAnalysis 试题解析
     */
    public OpenExtendedTextAssessmentItem(String identifier, String title, OpenPrompt prompt, int expectedLength, String questionAnalysis) {
        this(identifier, title, prompt, expectedLength, null, questionAnalysis);
    }

    /**
     * 问答题构造函数（无正确答案）
     *
     * @param identifier          试题ID
     * @param title               标题
     * @param promptOriginalValue 段落内容（题干）
     * @param expectedLength      内容长度
     * @param questionAnalysis    试题解析
     * @throws Exception the exception
     */
    protected OpenExtendedTextAssessmentItem(String identifier, String title, String promptOriginalValue, int expectedLength, String questionAnalysis) throws Exception {
        this(identifier, title, promptOriginalValue, expectedLength, null, questionAnalysis);
    }

    /**
     * 问答题构造函数（无答题长度限制，无正确答案）
     *
     * @param identifier       试题ID
     * @param title            标题
     * @param prompt           段落内容（题干）
     * @param questionAnalysis 试题解析
     */
    public OpenExtendedTextAssessmentItem(String identifier, String title, OpenPrompt prompt, String questionAnalysis) {
        this(identifier, title, prompt, 0, questionAnalysis);
    }

    /**
     * 问答题构造函数（无答题长度限制，无正确答案）
     *
     * @param identifier          试题ID
     * @param title               标题
     * @param promptOriginalValue 段落内容（题干）
     * @param questionAnalysis    试题解析
     * @throws Exception the exception
     */
    protected OpenExtendedTextAssessmentItem(String identifier, String title, String promptOriginalValue, String questionAnalysis) throws Exception {
        this(identifier, title, promptOriginalValue, 0, null, questionAnalysis);
    }

    /**
     * 问答题构造函数
     *
     * @param respDeclarations   the resp declarations
     * @param outDeclarations    the out declarations
     * @param extTextInteraction the ext text interaction
     * @param questionAnalysis   the question analysis
     */
    public OpenExtendedTextAssessmentItem(Collection<ResponseDeclarationType> respDeclarations, Collection<OutcomeDeclarationType> outDeclarations,
                                          ExtendedTextInteractionType extTextInteraction, String questionAnalysis) throws Exception {
        ItemBodyType body = new ItemBodyType();
        body.getBlockElementGroup().add(extTextInteraction);

        setResponseDeclarations(respDeclarations);
        setOutcomeDeclarations(outDeclarations);
        setItemBody(body);
        setResponseProcessing(null);
        setQuestionAnalysis(questionAnalysis);

        handleAfterTranslateFromImsItem();
    }

    /**
     * 创建问答题试题体
     *
     * @param prompt         the prompt
     * @param expectedLength the expected length
     * @return the item body type
     */
    private ItemBodyType BuildExtendedTextInteractionItemBody(OpenPrompt prompt, int expectedLength) {
        ItemBodyType body = new ItemBodyType();


        ExtendedTextInteractionType extTextInteraction = new ExtendedTextInteractionType();
        PromptType extendedTextPrompt = prompt.ConvertToImsPrompt();

        extTextInteraction.setPrompt(extendedTextPrompt);
        extTextInteraction.setResponseIdentifier("RESPONSE");
        extTextInteraction.setExpectedLength(expectedLength);

        body.getBlockElementGroup().add(extTextInteraction);

        return body;
    }

    /**
     * 从IMS试题转换后处理
     * 从ResponseDeclarations、OutcomeDeclarations、ItemBody、ResponseProcessing反向得到本题项内容
     */
    @Override
    protected void handleAfterTranslateFromImsItem() throws Exception {
        super.handleAfterTranslateFromImsItem();

        if (getItemBody().getBlockElementGroup() != null && getItemBody().getBlockElementGroup().size() > 0) {
            for (Object obj : getItemBody().getBlockElementGroup()) {
                if (obj instanceof ExtendedTextInteractionType) {
                    ExtendedTextInteractionType extendedText = (ExtendedTextInteractionType) obj;
                    setExpectedLength(extendedText.getExpectedLength());
                    if (extendedText.getPrompt() != null) {
                        setPrompt(new OpenPrompt(extendedText.getPrompt().getContent().get(0).toString()));
                    }
                }
            }
        }

        if (getResponseDeclarations() != null && getResponseDeclarations().size() > 0) {
            ResponseDeclarationType responseDeclaration = (ResponseDeclarationType) ((List) getResponseDeclarations()).get(0);
            if (responseDeclaration.getCorrectResponse() != null &&
                    responseDeclaration.getCorrectResponse().getValue() != null &&
                    responseDeclaration.getCorrectResponse().getValue().size() > 0) {
                setCorrentResponseValue(responseDeclaration.getCorrectResponse().getValue().get(0).getValue());
            }
        }
    }

    /**
     * 转换为IMS试题前处理
     * 构建ResponseDeclarations、OutcomeDeclarations、ItemBody、ResponseProcessing
     */
    @Override
    protected void handleBeforeTranslateToImsItem() throws Exception {
        setResponseDeclarations(BuildResponseDeclarationCollection(CardinalityType.SINGLE, BaseTypeType.STRING, getCorrentResponseValue()));
        setOutcomeDeclarations(BuildScoreOutcomeDeclarationCollection());
        setItemBody(BuildExtendedTextInteractionItemBody(getPrompt(), getExpectedLength()));
        setResponseProcessing(null);//主观题，无判分规则
        super.handleBeforeTranslateToImsItem();
    }

    /**
     * 获取媒体资源列表
     *
     * @return media对象
     */
    @Override
    public List<Media> GetMediaList() {
        List<Media> mediaList = new ArrayList<Media>();
        if (getPrompt().getMedia() != null) {
            mediaList.add(getPrompt().getMedia());
        }
        return mediaList;
    }
}
