package cn.com.open.openqti;

import cn.com.open.qti.BaseTypeType;
import cn.com.open.qti.CardinalityType;

/**
 * 响应变量
 */
/**
 * Created by lucky on 2017/11/10.
 */
public class OpenVariable {
    /**
     * ID
     */
    private String identifier;

    /**
     * 基数
     */
    private CardinalityType cardinalityType;

    /**
     * 基本类型
     */
    private BaseTypeType baseType;

    /**
     * Gets identifier.
     *
     * @return the identifier
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets identifier.
     *
     * @param identifier the identifier
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * Gets cardinality type.
     *
     * @return the cardinality type
     */
    public CardinalityType getCardinalityType() {
        return cardinalityType;
    }

    /**
     * Sets cardinality type.
     *
     * @param cardinalityType the cardinality type
     */
    public void setCardinalityType(CardinalityType cardinalityType) {
        this.cardinalityType = cardinalityType;
    }

    /**
     * Gets base type.
     *
     * @return the base type
     */
    public BaseTypeType getBaseType() {
        return baseType;
    }

    /**
     * Sets base type.
     *
     * @param baseType the base type
     */
    public void setBaseType(BaseTypeType baseType) {
        this.baseType = baseType;
    }

    /**
     * Instantiates a new Open variable.
     *
     * @param identifier  the identifier
     * @param cardinality the cardinality
     * @param baseType    the base type
     */
    public OpenVariable(String identifier, CardinalityType cardinality, BaseTypeType baseType) {
        this.identifier = identifier;
        cardinalityType = cardinality;
        this.baseType = baseType;
    }
}
