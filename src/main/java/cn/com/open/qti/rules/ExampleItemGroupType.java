package cn.com.open.qti.rules;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucky on 2017/7/3.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exampleItemGroup.type", propOrder = {
        "item"
})
public class ExampleItemGroupType {
    /**
     * The Item.
     */
    protected List<ItemType> item;
    /**
     * The Sequence index.
     */
    @XmlAttribute(name = "sequenceIndex", required = true)
    protected int sequenceIndex;


    /**
     * Gets the value of the item property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
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
     * {@link ItemType }
     *
     * @return the item group
     */
    public List<ItemType> getItemGroup() {
        if (item == null) {
            item = new ArrayList<ItemType>();
        }
        return this.item;
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

}
