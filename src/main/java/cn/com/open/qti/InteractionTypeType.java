//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.06.15 时间 10:58:25 AM CST 
//


package cn.com.open.qti;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>interactionType.Type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="interactionType.Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="associateInteraction"/>
 *     &lt;enumeration value="choiceInteraction"/>
 *     &lt;enumeration value="customInteraction"/>
 *     &lt;enumeration value="drawingInteraction"/>
 *     &lt;enumeration value="endAttemptInteraction"/>
 *     &lt;enumeration value="extendedTextInteraction"/>
 *     &lt;enumeration value="gapMatchInteraction"/>
 *     &lt;enumeration value="graphicAssociateInteraction"/>
 *     &lt;enumeration value="graphicGapMatchInteraction"/>
 *     &lt;enumeration value="graphicOrderInteraction"/>
 *     &lt;enumeration value="hotspotInteraction"/>
 *     &lt;enumeration value="hottextInteraction"/>
 *     &lt;enumeration value="inlineChoiceInteraction"/>
 *     &lt;enumeration value="matchInteraction"/>
 *     &lt;enumeration value="orderInteraction"/>
 *     &lt;enumeration value="positionObjectInteraction"/>
 *     &lt;enumeration value="selectPointInteraction"/>
 *     &lt;enumeration value="sliderInteraction"/>
 *     &lt;enumeration value="textEntryInteraction"/>
 *     &lt;enumeration value="uploadInteraction"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "interactionType.Type")
@XmlEnum
public enum InteractionTypeType {

    @XmlEnumValue("associateInteraction")
    ASSOCIATE_INTERACTION("associateInteraction"),
    @XmlEnumValue("choiceInteraction")
    CHOICE_INTERACTION("choiceInteraction"),
    @XmlEnumValue("customInteraction")
    CUSTOM_INTERACTION("customInteraction"),
    @XmlEnumValue("drawingInteraction")
    DRAWING_INTERACTION("drawingInteraction"),
    @XmlEnumValue("endAttemptInteraction")
    END_ATTEMPT_INTERACTION("endAttemptInteraction"),
    @XmlEnumValue("extendedTextInteraction")
    EXTENDED_TEXT_INTERACTION("extendedTextInteraction"),
    @XmlEnumValue("gapMatchInteraction")
    GAP_MATCH_INTERACTION("gapMatchInteraction"),
    @XmlEnumValue("graphicAssociateInteraction")
    GRAPHIC_ASSOCIATE_INTERACTION("graphicAssociateInteraction"),
    @XmlEnumValue("graphicGapMatchInteraction")
    GRAPHIC_GAP_MATCH_INTERACTION("graphicGapMatchInteraction"),
    @XmlEnumValue("graphicOrderInteraction")
    GRAPHIC_ORDER_INTERACTION("graphicOrderInteraction"),
    @XmlEnumValue("hotspotInteraction")
    HOTSPOT_INTERACTION("hotspotInteraction"),
    @XmlEnumValue("hottextInteraction")
    HOTTEXT_INTERACTION("hottextInteraction"),
    @XmlEnumValue("inlineChoiceInteraction")
    INLINE_CHOICE_INTERACTION("inlineChoiceInteraction"),
    @XmlEnumValue("matchInteraction")
    MATCH_INTERACTION("matchInteraction"),
    @XmlEnumValue("orderInteraction")
    ORDER_INTERACTION("orderInteraction"),
    @XmlEnumValue("positionObjectInteraction")
    POSITION_OBJECT_INTERACTION("positionObjectInteraction"),
    @XmlEnumValue("selectPointInteraction")
    SELECT_POINT_INTERACTION("selectPointInteraction"),
    @XmlEnumValue("sliderInteraction")
    SLIDER_INTERACTION("sliderInteraction"),
    @XmlEnumValue("textEntryInteraction")
    TEXT_ENTRY_INTERACTION("textEntryInteraction"),
    @XmlEnumValue("uploadInteraction")
    UPLOAD_INTERACTION("uploadInteraction");
    private final String value;

    InteractionTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InteractionTypeType fromValue(String v) {
        for (InteractionTypeType c: InteractionTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
