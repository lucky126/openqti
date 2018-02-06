package cn.com.open.openqti;

import cn.com.open.qti.OutcomeDeclarationType;

import java.util.Collection;

/**
 * Created by lucky on 2017/6/26.
 */
public class OpenOutcomeDeclarationFind {
    /**
     *
     */
    private double subItemScore;
    /**
     *
     */
    private Collection<OutcomeDeclarationType> outDeclarations;

    /**
     * Gets sub item score.
     *
     * @return the sub item score
     */
    public double getSubItemScore() {
        return subItemScore;
    }

    /**
     * Sets sub item score.
     *
     * @param subItemScore the sub item score
     */
    public void setSubItemScore(double subItemScore) {
        this.subItemScore = subItemScore;
    }

    /**
     * Gets out declarations.
     *
     * @return the out declarations
     */
    public Collection<OutcomeDeclarationType> getOutDeclarations() {
        return outDeclarations;
    }

    /**
     * Sets out declarations.
     *
     * @param outDeclarations the out declarations
     */
    public void setOutDeclarations(Collection<OutcomeDeclarationType> outDeclarations) {
        this.outDeclarations = outDeclarations;
    }
}
