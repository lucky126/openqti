package cn.com.open.qti;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucky on 2017/6/26.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "compositeInteraction.Type", propOrder = {
        "prompt",
        "subItem"
})
public class CompositeInteractionType {
    /**
     * The Id.
     */
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;
    /**
     * The Label.
     */
    @XmlAttribute(name = "label")
    protected String label;
    /**
     * The Shuffle.
     */
    @XmlAttribute(name = "shuffle", required = true)
    protected boolean shuffle;
    /**
     * The Prompt.
     */
    protected PromptType prompt;
    /**
     * The Sub item.
     */
    @XmlElement(required = true)
    protected List<SubItemType> subItem;

    /**
     * 获取prompt属性的值。
     *
     * @return possible object is {@link PromptType }
     */
    public PromptType getPrompt() {
        return prompt;
    }

    /**
     * 设置prompt属性的值。
     *
     * @param value allowed object is              {@link PromptType }
     */
    public void setPrompt(PromptType value) {
        this.prompt = value;
    }

    /**
     * Gets the value of the simpleChoice property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the simpleChoice property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubItem().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubItemType }
     *
     *
     */
    public List<SubItemType> getSubItem() {
        if (subItem == null) {
            subItem = new ArrayList<SubItemType>();
        }
        return this.subItem;
    }

    /**
     * 获取shuffle属性的值。
     *
     */
    public boolean isShuffle() {
        return shuffle;
    }

    /**
     * 设置shuffle属性的值。
     *
     */
    public void setShuffle(boolean value) {
        this.shuffle = value;
    }

    /**
     * 获取id属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * 获取label属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLabel() {
        return label;
    }

    /**
     * 设置label属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLabel(String value) {
        this.label = value;
    }

}
