package cn.com.open.qti;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucky on 2017/6/26.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subItem.Type")
public class SubItemType {
    /**
     * The Identifier.
     */
    @XmlAttribute(name = "Identifier", required = true)
    protected String identifier;
    /**
     * The Question analysis.
     */
    @XmlAttribute(name = "QuestionAnalysis", required = true)
    protected String questionAnalysis;
    /**
     * The Sequence index.
     */
    @XmlAttribute(name = "sequenceIndex", required = true)
    protected Integer sequenceIndex;
    /**
     * The Item type.
     */
    @XmlAttribute(name = "itemType", required = true)
    protected String itemType;

    /**
     * The Subjective.
     */
    @XmlAttribute(name = "subjective", required = true)
    protected boolean subjective;

    @XmlElements({
            @XmlElement(name = "p", type = PType.class),
            @XmlElement(name = "div", type = DivType.class),
            @XmlElement(name = "textEntryInteraction", type = TextEntryInteractionType.class),
            @XmlElement(name = "matchInteraction", type = MatchInteractionType.class),
            @XmlElement(name = "choiceInteraction", type = ChoiceInteractionType.class),
            @XmlElement(name = "orderInteraction", type = OrderInteractionType.class),
            @XmlElement(name = "uploadInteraction", type = UploadInteractionType.class),
            @XmlElement(name = "extendedTextInteraction", type = ExtendedTextInteractionType.class),
            @XmlElement(name = "compositeInteractionType", type = CompositeInteractionType.class)
    })
    protected List<Object> blockElementGroup;

    /**
     * /**
     * 获取identifier属性的值。
     *
     * @return possible object is {@link String }
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * 设置identifier属性的值。
     *
     * @param value allowed object is              {@link String }
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * 获取questionAnalysis属性的值。
     *
     * @return possible object is {@link String }
     */
    public String getQuestionAnalysis() {
        return questionAnalysis;
    }

    /**
     * 设置questionAnalysis属性的值。
     *
     * @param value allowed object is              {@link String }
     */
    public void setQuestionAnalysis(String value) {
        this.questionAnalysis = value;
    }

    /**
     * 获取sequenceIndex属性的值。
     *
     * @return possible object is {@link Integer }
     */
    public Integer getSequenceIndex() {
        return sequenceIndex;
    }

    /**
     * 设置sequenceIndex属性的值。
     *
     * @param value allowed object is              {@link Integer }
     */
    public void setSequenceIndex(Integer value) {
        this.sequenceIndex = value;
    }

    /**
     * 获取 itemType 属性的值.
     *
     * @return the item type
     */
    public String getItemType() {
        return itemType;
    }

    /**
     * 设置 itemType 属性的值.
     *
     * @param itemType the item type
     */
    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    /**
     * 获取 subjective 属性的值.
     *
     * @return the boolean
     */
    public boolean isSubjective() {
        return subjective;
    }

    /**
     * 设置 subjective 属性的值.
     *
     * @param subjective the subjective
     */
    public void setSubjective(boolean subjective) {
        this.subjective = subjective;
    }

    /**
     * Gets the value of the blockElementGroup property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the blockElementGroup property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlockElementGroup().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PType }
     * {@link DivType }
     * {@link TextEntryInteractionType}
     * {@link MatchInteractionType }
     * {@link ChoiceInteractionType }
     * {@link OrderInteractionType }
     * {@link UploadInteractionType }
     * {@link ExtendedTextInteractionType }
     * {@link CompositeInteractionType }
     *
     */
    public List<Object> getBlockElementGroup() {
        if (blockElementGroup == null) {
            blockElementGroup = new ArrayList<Object>();
        }
        return this.blockElementGroup;
    }
}
