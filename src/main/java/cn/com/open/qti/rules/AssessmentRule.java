package cn.com.open.qti.rules;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucky on 2017/7/3.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assessmentRule", propOrder = {
        "part"
})
public class AssessmentRule {
    protected List<PartType> part;
    @XmlAttribute(name = "identifier", required = true)
    protected String identifier;
    @XmlAttribute(name = "totalScore")
    protected float totalScore;
    @XmlAttribute(name = "itemApplicationTypeIDList")
    protected String itemApplicationTypeIDList;


    /**
     * Gets the value of the part property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the part property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPart().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartType }
     */
    public List<PartType> getPart() {
        if (part == null) {
            part = new ArrayList<PartType>();
        }
        return this.part;
    }

    /**
     * 获取identifier属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * 设置identifier属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }


    /**
     * 获取totalScore属性的值。
     *
     * @return possible object is
     * {@link Float }
     */
    public float getTotalScore() {
        return totalScore;
    }

    /**
     * 设置totalScore属性的值。
     *
     * @param value allowed object is
     *              {@link Float }
     */
    public void setTotalScore(float value) {
        this.totalScore = value;
    }

    /**
     * 获取itemApplicationTypeIDList属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getItemApplicationTypeIDList() {
        return itemApplicationTypeIDList;
    }

    /**
     * 设置itemApplicationTypeIDList属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setItemApplicationTypeIDList(String value) {
        this.itemApplicationTypeIDList = value;
    }

}
