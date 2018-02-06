package cn.com.open.rulestransfer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucky on 2017/12/7.
 */
public class RuleSectionModel implements Serializable {
    /**
     * 外部题型id.
     */
    private String questionTypeId;

    /**
     * 大题名称.
     */
    private String sectionTitle;

    /**
     * 难度数量分数设定（难→易）.
     */
    private List<RuleDifficultyModel> difficultyList;

    /**
     * 是否乱序.
     */
    private boolean shuffle;

    /**
     * 例题列表.
     */
    private List<String> exampleQuestion;

    /**
     * 必选题列表.
     */
    private List<String> mustQuestion;

    /**
     * 听力题说明信息
     */
    private List<InstructionModel> instruction;

    /**
     * Gets question type id.
     *
     * @return the question type id
     */
    public String getQuestionTypeId() {
        return questionTypeId;
    }

    /**
     * Sets question type id.
     *
     * @param questionTypeId the question type id
     */
    public void setQuestionTypeId(String questionTypeId) {
        this.questionTypeId = questionTypeId;
    }

    /**
     * Gets section title.
     *
     * @return the section title
     */
    public String getSectionTitle() {
        return sectionTitle;
    }

    /**
     * Sets section title.
     *
     * @param sectionTitle the section title
     */
    public void setSectionTitle(String sectionTitle) {
        this.sectionTitle = sectionTitle;
    }

    /**
     * Gets difficulty list.
     *
     * @return the difficulty list
     */
    public List<RuleDifficultyModel> getDifficultyList() {
        if (difficultyList == null) {
            difficultyList = new ArrayList<>();
        }
        return difficultyList;
    }

    /**
     * Is shuffle boolean.
     *
     * @return the boolean
     */
    public boolean isShuffle() {
        return shuffle;
    }

    /**
     * Sets shuffle.
     *
     * @param shuffle the shuffle
     */
    public void setShuffle(boolean shuffle) {
        this.shuffle = shuffle;
    }

    /**
     * Gets example question.
     *
     * @return the example question
     */
    public List<String> getExampleQuestion() {
        if (exampleQuestion == null) {
            exampleQuestion = new ArrayList<>();
        }
        return exampleQuestion;
    }

    /**
     * Gets must question.
     *
     * @return the must question
     */
    public List<String> getMustQuestion() {
        if (mustQuestion == null) {
            mustQuestion = new ArrayList<>();
        }
        return mustQuestion;
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

}
