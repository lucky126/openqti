package cn.com.open.qti;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Created by lucky on 2017/6/30.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "prompt"
})
@XmlRootElement(name = "endBlock", namespace = "http://www.open.com.cn/schemas/exam/openqti_v1")
public class EndBlock {

    protected PromptType prompt;
    /**
     * Gets prompt.
     *
     * @return the prompt
     */
    public PromptType getPrompt() {
        return prompt;
    }

    /**
     * Sets prompt.
     *
     * @param prompt the prompt
     */
    public void setPrompt(PromptType prompt) {
        this.prompt = prompt;
    }
}
