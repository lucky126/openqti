package cn.com.open.openqti;

import cn.com.open.qti.*;
import junit.framework.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

import static org.junit.Assert.assertNotNull;

/**
 * Created by lucky on 2017/6/13.
 */
public class BuildXMLTest {

    /**
     * 测试最普通的构成QTI XML的方法
     *
     * @throws Exception the exception
     */
    @Test
    public void makeGeneralItem() throws Exception {

        //make choiceInteraction
        ChoiceInteractionType choices = new ChoiceInteractionType();
        choices.setResponseIdentifier("RESPONSE");
        //make prompt as sub node of choiceInteraction
        PromptType prompt = new PromptType();
        String str = "AA";
        prompt.getContent().add(str);
        choices.setPrompt(prompt);
        //make simplechoice as sub node of choiceInteraction
        SimpleChoiceType simpleChoice = new SimpleChoiceType();
        simpleChoice.setIdentifier("A");
        String cpStr = "AA";
        simpleChoice.getContent().add(cpStr);
        choices.getSimpleChoice().add(simpleChoice);

        //make BODY
        ItemBodyType body = new ItemBodyType();
        body.getBlockElementGroup().add(choices);

        //make response decalaration
        Collection<ResponseDeclarationType> responseDeclarationTypes = new ArrayList<ResponseDeclarationType>();
        ResponseDeclarationType response = new ResponseDeclarationType();
        response.setIdentifier("RESPONSE");
        response.setCardinality(CardinalityType.SINGLE);
        response.setBaseType(BaseTypeType.IDENTIFIER);
        CorrectResponseType correct = new CorrectResponseType();
        ValueType crValue = new ValueType();
        crValue.setValue("D");
        correct.getValue().add(crValue);
        response.setCorrectResponse(correct);
        responseDeclarationTypes.add(response);

        //make outcome declaration
        Collection<OutcomeDeclarationType> outcomeDeclarationTypes = new ArrayList<OutcomeDeclarationType>();
        OutcomeDeclarationType outcome = new OutcomeDeclarationType();
        outcome.setIdentifier("SCORE");
        outcome.setCardinality(CardinalityType.SINGLE);
        outcome.setBaseType(BaseTypeType.FLOAT);
        outcome.setNormalMaximum(1d);
        DefaultValueType defaultValue = new DefaultValueType();
        ValueType dvValue = new ValueType();
        dvValue.setValue("0");
        defaultValue.getValue().add(crValue);
        outcome.setDefaultValue(defaultValue);
        outcomeDeclarationTypes.add(outcome);

        //make responseprocessing
        ResponseProcessingType processing = new ResponseProcessingType();
        ResponseConditionType condition = new ResponseConditionType();
        ResponseIfType responseif = new ResponseIfType();
        MatchType match = new MatchType();

        CorrectType correctMatch = new CorrectType();
        correctMatch.setIdentifier("RESPONSE");
        match.getExpressionElementGroup().add(correctMatch);

        VariableType variableMatch = new VariableType();
        variableMatch.setIdentifier("RESPONSE");
        match.getExpressionElementGroup().add(variableMatch);

        responseif.setMatch(match);

        SetOutcomeValueType outcomeValue = new SetOutcomeValueType();
        outcomeValue.setIdentifier("SCORE");
        BaseValueType baseValueType = new BaseValueType();
        baseValueType.setBaseType(BaseTypeType.FLOAT);
        baseValueType.setValue("1");
        outcomeValue.setBaseValue(baseValueType);
        responseif.getResponseRuleElementGroup().add(outcomeValue);

        condition.setResponseIf(responseif);

        processing.getResponseRuleElementGroup().add(condition);

        OpenAssessmentItem item = new OpenAssessmentItem("111", responseDeclarationTypes, outcomeDeclarationTypes, body, processing, "analysis");
        item.setTitle("112");

        String result = item.getXmlString();
        assertNotNull(null, result);
    }
}
