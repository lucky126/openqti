package cn.com.open.rulestransfer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucky on 2018/1/3.
 */
public class RulePartModel implements Serializable {

    /**
     * 是否听力
     */
    private boolean isListening;

    /**
     * 期望答题总时间
     */
    private int expectedTime;

    /**
     * 模块检查时间
     */
    private int checkTime;

    /**
     * 听力题说明信息
     */
    private List<InstructionModel> instruction;

    /**
     * 大题列表
     */
    private List<RuleSectionModel> sections;


    /**
     * Is listening boolean.
     *
     * @return the boolean
     */
    public boolean isListening() {
        return isListening;
    }

    /**
     * Sets listening.
     *
     * @param listening the listening
     */
    public void setListening(boolean listening) {
        isListening = listening;
    }

    /**
     * Gets instruction.
     *
     * @return the instruction
     */
    public List<InstructionModel> getInstruction() {
        if (instruction == null) {
            instruction = new ArrayList<>();
        }

        return instruction;
    }

    /**
     * Gets section list.
     *
     * @return the section list
     */
    public List<RuleSectionModel> getSections() {
        if (sections == null) {
            sections = new ArrayList<>();
        }

        return sections;
    }


    /**
     * Gets expected time.
     *
     * @return the expected time
     */
    public int getExpectedTime() {
        return expectedTime;
    }

    /**
     * Sets expected time.
     *
     * @param expectedTime the expected time
     */
    public void setExpectedTime(int expectedTime) {
        this.expectedTime = expectedTime;
    }

    /**
     * Gets check time.
     *
     * @return the check time
     */
    public int getCheckTime() {
        return checkTime;
    }

    /**
     * Sets check time.
     *
     * @param checkTime the check time
     */
    public void setCheckTime(int checkTime) {
        this.checkTime = checkTime;
    }

    /**
     * Instantiates a new Rule part model.
     */
    public RulePartModel() {
        isListening = false;
    }
}
