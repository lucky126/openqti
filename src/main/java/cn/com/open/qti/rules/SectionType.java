package cn.com.open.qti.rules;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucky on 2017/7/3.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "section.type", propOrder = {
        "instruction",
        "exampleItemGroup",
        "mandatoryItemGroup",
        "itemGroup"
})
public class SectionType {

    /**
     * The Instruction.
     */
    protected List<InstructionType> instruction;
    /**
     * The Example item group.
     */
    protected ExampleItemGroupType exampleItemGroup;
    /**
     * The Mandatory item group.
     */
    protected MandatoryItemGroupType mandatoryItemGroup;
    /**
     * The Item group.
     */
    protected List<ItemGroupType> itemGroup;

    /**
     * The Sequence index.
     */
    @XmlAttribute(name = "sequenceIndex", required = true)
    protected int sequenceIndex;
    /**
     * The Title.
     */
    @XmlAttribute(name = "title", required = true)
    protected String title;
    /**
     * The Shuffle.
     */
    @XmlAttribute(name = "shuffle", required = true)
    protected boolean shuffle;
    /**
     * The Item count.
     */
    @XmlAttribute(name = "itemCount", required = true)
    protected int itemCount;
    /**
     * The Section score.
     */
    @XmlAttribute(name = "sectionScore", required = true)
    protected float sectionScore;
    /**
     * The Optional item count.
     */
    @XmlAttribute(name = "optionalItemCount")
    protected Integer optionalItemCount;
    /**
     * The Optional item score.
     */
    @XmlAttribute(name = "optionalItemScore")
    protected Float optionalItemScore;
    /**
     * The Media type.
     */
    @XmlAttribute(name = "mediaType")
    protected Integer mediaType;
    /**
     * The Duration.
     */
    @XmlAttribute(name = "duration")
    protected Double duration;

    /**
     * Gets the value of the instruction property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instruction property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstruction().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstructionType }
     *
     * @return the instruction
     */
    public List<InstructionType> getInstruction() {
        if (instruction == null) {
            instruction = new ArrayList<InstructionType>();
        }
        return this.instruction;
    }

    /**
     * Gets the value of the itemGroup property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemGroup property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstruction().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemGroupType }
     *
     * @return the item group
     */
    public List<ItemGroupType> getItemGroup() {
        if (itemGroup == null) {
            itemGroup = new ArrayList<ItemGroupType>();
        }
        return this.itemGroup;
    }


    /**
     * Gets example item group.
     *
     * @return the example item group
     */
    public ExampleItemGroupType getExampleItemGroup() {
        return exampleItemGroup;
    }

    /**
     * Sets example item group.
     *
     * @param exampleItemGroupType the example item group
     */
    public void setExampleItemGroup(ExampleItemGroupType exampleItemGroupType) {
        this.exampleItemGroup = exampleItemGroupType;
    }

    /**
     * Gets mandatory item group.
     *
     * @return the mandatory item group
     */
    public MandatoryItemGroupType getMandatoryItemGroup() {
        return mandatoryItemGroup;
    }

    /**
     * Sets mandatory item group.
     *
     * @param mandatoryItemGroupType the mandatory item group
     */
    public void setMandatoryItemGroup(MandatoryItemGroupType mandatoryItemGroupType) {
        this.mandatoryItemGroup= mandatoryItemGroupType;
    }

    /**
     * Gets sequence index.
     *
     * @return the sequence index
     */
    public int getSequenceIndex() {
        return sequenceIndex;
    }

    /**
     * Sets sequence index.
     *
     * @param sequenceIndex the sequence index
     */
    public void setSequenceIndex(int sequenceIndex) {
        this.sequenceIndex = sequenceIndex;
    }

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
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
     * Gets item count.
     *
     * @return the item count
     */
    public int getItemCount() {
        return itemCount;
    }

    /**
     * Sets item count.
     *
     * @param itemCount the item count
     */
    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    /**
     * Gets section score.
     *
     * @return the section score
     */
    public float getSectionScore() {
        return sectionScore;
    }

    /**
     * Sets section score.
     *
     * @param sectionScore the section score
     */
    public void setSectionScore(float sectionScore) {
        this.sectionScore = sectionScore;
    }

    /**
     * Gets optional item count.
     *
     * @return the optional item count
     */
    public int getOptionalItemCount() {
        return optionalItemCount;
    }

    /**
     * Sets optional item count.
     *
     * @param optionalItemCount the optional item count
     */
    public void setOptionalItemCount(int optionalItemCount) {
        this.optionalItemCount = optionalItemCount;
    }

    /**
     * Gets optional item score.
     *
     * @return the optional item score
     */
    public float getOptionalItemScore() {
        return optionalItemScore;
    }

    /**
     * Sets optional item score.
     *
     * @param optionalItemScore the optional item score
     */
    public void setOptionalItemScore(float optionalItemScore) {
        this.optionalItemScore = optionalItemScore;
    }

    /**
     * Gets media type.
     *
     * @return the media type
     */
    public int getMediaType() {
        return mediaType;
    }

    /**
     * Sets media type.
     *
     * @param mediaType the media type
     */
    public void setMediaType(int mediaType) {
        this.mediaType = mediaType;
    }

    /**
     * Is duration boolean.
     *
     * @return the boolean
     */
    public double isDuration() {
        return duration;
    }

    /**
     * Sets duration.
     *
     * @param duration the duration
     */
    public void setDuration(double duration) {
        this.duration = duration;
    }
}
