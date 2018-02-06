package cn.com.open.openqti;

import cn.com.open.utils.FileUtil;
import junit.framework.Assert;
import org.junit.Test;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.Assert.assertNotNull;

/**
 * Created by lucky on 2017/6/29.
 */
public class UploadTest {

    /**
     * 测试生成一个上传题的QTI XML
     *
     * @throws Exception the exception
     */
    @Test
    public void makeUploadItem() throws Exception {
        String identifier = String.valueOf(UUID.randomUUID());
        String title = "Test upload";
        OpenPrompt prompt = new OpenPrompt(title);
        String QuestionAnalysis = "no analysis";

        OpenUploadAssessmentItem upload = new OpenUploadAssessmentItem(identifier, title, prompt,"correct", QuestionAnalysis);
        String result = upload.getXmlString();
        System.out.println(result);
        assertNotNull(null, result);
    }

    /**
     * 测试根据一个upload QTI XML得到一个对象
     *
     * @throws Exception the exception
     */
    @Test
    public void getUploadModelFromXML() throws Exception {
        URL url = getClass().getResource("upload.xml");
        String QuestionQTI = FileUtil.getFileContent(url);
        OpenAssessmentItem item = OpenAssessmentItem.createInstance(ItemType.UPLOAD);
        item.LoadFromString(QuestionQTI);
        Assert.assertEquals(item.getIdentifier(), "e339effb-a8e0-4b92-aa46-e17cad0a6433");

        OpenUploadAssessmentItem upload = (OpenUploadAssessmentItem) item;

        Assert.assertEquals(upload.getCorrentResponseValue(), "");
    }
}
