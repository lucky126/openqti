package cn.com.open.openqti;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucky on 2017/6/29.
 */
public class OpenLeftSimpleAssociableChoiceAtomicItem extends OpenSimpleAssociableChoiceAtomicItem {

    /**
     * 答案列表（答案为右匹配项标识）
     */
    private List<String> correctResponseValues;


    /**
     * Gets correct response values.
     *
     * @return the correct response values
     */
    public List<String> getCorrectResponseValues() {
        if (correctResponseValues == null) {
            correctResponseValues = new ArrayList<String>();
        }
        return correctResponseValues;
    }

    /**
     * Sets correct response values.
     *
     * @param correctResponseValues the correct response values
     */
    public void setCorrectResponseValues(List<String> correctResponseValues) {
        this.correctResponseValues = correctResponseValues;
    }

    /**
     * 左匹配题项构造函数
     *
     * @param identifier            标识
     * @param content               内容
     * @param correctResponseValues 答案（答案标识）
     */
    public OpenLeftSimpleAssociableChoiceAtomicItem(String identifier, String content, List<String> correctResponseValues) {
        super(identifier, content);
        setCorrectResponseValues(correctResponseValues);
    }
}
