package cn.com.open.openqti;

import java.util.Collection;
import java.util.List;

/**
 * 选择交互项（子题）
 *
 * @author lucky
 */
public class OpenChoiceInteraction extends OpenInteraction {

    /**
     * 响应变量标识
     */
    private String responseIdentifier;
    /**
     * 题干
     */
    private OpenPrompt prompt;
    /**
     * 题项是否乱序
     */
    private boolean shuffle;
    /**
     * 题项列表
     */
    private Collection<OpenSimpleChoiceAtomicItem> atomicItems;


    /**
     * Gets response identifier.
     *
     * @return the response identifier
     */
    public String getResponseIdentifier() {
        return responseIdentifier;
    }

    /**
     * Sets response identifier.
     *
     * @param responseIdentifier the response identifier
     */
    public void setResponseIdentifier(String responseIdentifier) {
        this.responseIdentifier = responseIdentifier;
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
     * @param prompt the prompt
     */
    public void setPrompt(OpenPrompt prompt) {
        this.prompt = prompt;
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
     * Gets atomic items.
     *
     * @return the atomic items
     */
    public Collection<OpenSimpleChoiceAtomicItem> getAtomicItems() {
        return atomicItems;
    }

    /**
     * Sets atomic items.
     *
     * @param atomicItems the atomic items
     */
    public void setAtomicItems(Collection<OpenSimpleChoiceAtomicItem> atomicItems) {
        this.atomicItems = atomicItems;
    }

    /**
     * 选择交互项构造函数
     */
    public OpenChoiceInteraction() {
    }

    /**
     * 选择交互项构造函数.
     *
     * @param responseIdentifier 响应变量标识
     * @param prompt             题干
     * @param shuffle            题项是否乱序
     * @param atomicItems        题项列表
     */
    public OpenChoiceInteraction(String responseIdentifier, OpenPrompt prompt, boolean shuffle, Collection<OpenSimpleChoiceAtomicItem> atomicItems) {
        this.setResponseIdentifier(responseIdentifier);
        this.setPrompt(prompt);
        this.setShuffle(shuffle);
        this.setAtomicItems(atomicItems);
    }

    /**
     * 选择交互项（子题）构造函数
     *
     * @param responseIdentifier  响应变量标识
     * @param promptOriginalValue 题干
     * @param shuffle             题项是否乱序
     * @param atomicItems         题项列表
     * @throws Exception the exception
     */
    public OpenChoiceInteraction(String responseIdentifier, String promptOriginalValue, boolean shuffle, Collection<OpenSimpleChoiceAtomicItem> atomicItems) throws Exception {
        this(responseIdentifier, new OpenPrompt(promptOriginalValue), shuffle, atomicItems);
    }

    /**
     * 选择交互项（子题）构造函数
     *
     * @param promptOriginalValue 题干
     * @param shuffle             题项是否乱序
     * @param atomicItems         题项列表
     * @throws Exception the exception
     */
    public OpenChoiceInteraction(String promptOriginalValue, boolean shuffle, Collection<OpenSimpleChoiceAtomicItem> atomicItems) throws Exception {
        this(null, new OpenPrompt(promptOriginalValue), shuffle, atomicItems);
    }

    /**
     * 选择交互项（子题）构造函数
     * （未设定响应变量标识，无题干单选题）
     *
     * @param shuffle     题项是否乱序
     * @param atomicItems 题项列表
     * @throws Exception the exception
     */
    public OpenChoiceInteraction(boolean shuffle, Collection<OpenSimpleChoiceAtomicItem> atomicItems) throws Exception {
        this(null, (String) null, shuffle, atomicItems);
    }

    /**
     * 选择交互项（子题）构造函数
     * （无题干，题项乱序）
     *
     * @param responseIdentifier 响应变量标识
     * @param atomicItems        题项列表
     * @throws Exception the exception
     */
    public OpenChoiceInteraction(String responseIdentifier, Collection<OpenSimpleChoiceAtomicItem> atomicItems) throws Exception {
        this(responseIdentifier, true, atomicItems);
    }
}
