package cn.com.open.openqti;

import cn.com.open.qti.OrientationType;
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
public class OrderTest {

    /**
     * 测试生成一个排序题的QTI XML
     *
     * @throws Exception the exception
     */
    @Test
    public void makeOrderItem() throws Exception {
        String identifier = String.valueOf(UUID.randomUUID());
        String title = "Test order";
        OpenPrompt prompt = new OpenPrompt(title);
        String QuestionAnalysis = "no analysis";
        boolean shuffle = false;

        List<OpenOrderSimpleChoiceAtomicItem> choice = new ArrayList<OpenOrderSimpleChoiceAtomicItem>();
        OpenOrderSimpleChoiceAtomicItem orderChoice = new OpenOrderSimpleChoiceAtomicItem("1", "1", 1);
        choice.add(orderChoice);
        orderChoice = new OpenOrderSimpleChoiceAtomicItem("2", "2", 3);
        choice.add(orderChoice);
        orderChoice = new OpenOrderSimpleChoiceAtomicItem("3", "3", 2);
        choice.add(orderChoice);

        OpenOrderAssessmentItem order = new OpenOrderAssessmentItem(identifier, title, prompt, shuffle, OrientationType.HORIZONTAL, choice, QuestionAnalysis);
        String result = order.getXmlString();
        System.out.println(result);
        assertNotNull(null, result);
    }

    /**
     * 测试根据一个order QTI XML得到一个对象
     *
     * @throws Exception the exception
     */
    @Test
    public void getOrderModelFromXML() throws Exception {
        URL url = getClass().getResource("order.xml");
        String QuestionQTI = FileUtil.getFileContent(url);
        OpenAssessmentItem item = OpenAssessmentItem.createInstance(ItemType.ORDER);
        item.LoadFromString(QuestionQTI);
        Assert.assertEquals(item.getIdentifier(), "8e72099c-8258-4c53-b1a2-036a226122f6");

        OpenOrderAssessmentItem order = (OpenOrderAssessmentItem) item;

        Assert.assertEquals(order.getChoices().size(), 4);
    }
}
