package cn.com.open.openqti;

import cn.com.open.qti.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by lucky on 2017/6/14.
 */
public class OpenUploadAssessmentItem extends OpenAssessmentItem {
    /**
     * 题型
     */
    @Override
    public ItemType getAssessmentItemType() {
        return ItemType.UPLOAD;
    }

    /**
     * 题干
     */
    private OpenPrompt prompt;
    /**
     * 正确答案
     */
    private String correntResponseValue;

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
     * @param prompt the prompt
     */
    public void setPrompt(OpenPrompt prompt) {
        this.prompt = prompt;
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
     * 上传附件题构造函数
     */
    public OpenUploadAssessmentItem() {
    }

    /**
     * 上传附件题构造函数
     *
     * @param identifier           试题ID
     * @param title                标题
     * @param prompt               段落内容（题干）
     * @param correctResponseValue 正确答案（文件/文本）
     * @param questionAnalysis     试题解析
     */
    public OpenUploadAssessmentItem(String identifier, String title, OpenPrompt prompt, String correctResponseValue, String questionAnalysis) {
        super(identifier, title, questionAnalysis);
        setPrompt(prompt);
        setCorrentResponseValue(correctResponseValue);
    }

    /**
     * 上传附件题构造函数
     *
     * @param identifier           试题ID
     * @param title                标题
     * @param promptOriginalValue  段落内容（题干）
     * @param correctResponseValue 正确答案（文件/文本）
     * @param questionAnalysis     试题解析
     * @throws Exception the exception
     */
    private OpenUploadAssessmentItem(String identifier, String title, String promptOriginalValue, String correctResponseValue, String questionAnalysis) throws Exception {
        this(identifier, title, new OpenPrompt(promptOriginalValue), correctResponseValue, questionAnalysis);
    }

    /**
     * 上传附件题构造函数(没有提供参考答案)
     *
     * @param identifier       试题ID
     * @param title            标题
     * @param prompt           段落内容（题干）
     * @param questionAnalysis 试题解析
     */
    public OpenUploadAssessmentItem(String identifier, String title, OpenPrompt prompt, String questionAnalysis) {
        this(identifier, title, prompt, null, questionAnalysis);
    }

    /**
     * 上传附件题构造函数(没有提供参考答案)
     *
     * @param identifier          试题ID
     * @param title               标题
     * @param promptOriginalValue 段落内容（题干）
     * @param questionAnalysis    试题解析
     */
    private OpenUploadAssessmentItem(String identifier, String title, String promptOriginalValue, String questionAnalysis) throws Exception {
        this(identifier, title, promptOriginalValue, null, questionAnalysis);
    }

    /**
     * 上传附件题构造函数
     *
     * @param respDeclarations 响应变量集合
     * @param outDeclarations  分数结果变量集合
     * @param upldInteraction  上传
     * @throws Exception the exception
     */
    public OpenUploadAssessmentItem(Collection<ResponseDeclarationType> respDeclarations, Collection<OutcomeDeclarationType> outDeclarations, UploadInteractionType upldInteraction) throws Exception {
        ItemBodyType body = new ItemBodyType();
        body.getBlockElementGroup().add(upldInteraction);

        setResponseDeclarations(respDeclarations);
        setOutcomeDeclarations(outDeclarations);
        setItemBody(body);
        setResponseProcessing(null);

        handleAfterTranslateFromImsItem();
    }

    //region Translate Between IMS & OPEN

    /**
     * 从IMS试题转换后处理
     * 从ResponseDeclarations、OutcomeDeclarations、ItemBody、ResponseProcessing反向得到本题项内容
     */
    @Override
    protected void handleAfterTranslateFromImsItem() throws Exception {
        super.handleAfterTranslateFromImsItem();

        if (getResponseDeclarations() != null && getResponseDeclarations().size() > 0) {
            for (Object obj : getItemBody().getBlockElementGroup()) {
                if (obj instanceof UploadInteractionType) {
                    UploadInteractionType upload = (UploadInteractionType) obj;
                    if (upload.getPrompt() != null) {
                        setPrompt(new OpenPrompt(upload.getPrompt().getContent().get(0).toString()));
                    }
                }
            }

            List<ResponseDeclarationType> responseDeclarationCollection = (List) getResponseDeclarations();
            if (responseDeclarationCollection.get(0).getCorrectResponse() != null &&
                    responseDeclarationCollection.get(0).getCorrectResponse().getValue() != null &&
                    responseDeclarationCollection.get(0).getCorrectResponse().getValue().size() > 0) {
                setCorrentResponseValue(responseDeclarationCollection.get(0).getCorrectResponse().getValue().get(0).getValue());
            }
        }
    }

    /**
     * 转换为IMS试题前处理
     * 构建ResponseDeclarations、OutcomeDeclarations、ItemBody、ResponseProcessing
     */
    @Override
    protected void handleBeforeTranslateToImsItem() throws Exception {
        setResponseDeclarations(BuildResponseDeclarationCollection(CardinalityType.SINGLE, BaseTypeType.STRING, this.getCorrentResponseValue()));

        setOutcomeDeclarations(BuildScoreOutcomeDeclarationCollection());
        setItemBody(BuildUploadInteractionItemBody(getPrompt()));
        setResponseProcessing(null);//主观题，无判分规则

        super.handleBeforeTranslateToImsItem();
    }
    //endregion

    /**
     * 创建上传附件题试题体
     *
     * @param prompt 段落内容（题干）
     * @return the item body type
     */
    private ItemBodyType BuildUploadInteractionItemBody(OpenPrompt prompt) {
        ItemBodyType body = new ItemBodyType();

        UploadInteractionType upldInteraction = new UploadInteractionType();


        PromptType uploadPrompt = new PromptType();
        uploadPrompt = prompt.ConvertToImsPrompt();

        upldInteraction.setPrompt(uploadPrompt);
        upldInteraction.setResponseIdentifier("RESPONSE");

        body.getBlockElementGroup().add(upldInteraction);
        return body;
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
