package cn.com.open.openqti;

import cn.com.open.qti.*;
import org.springframework.util.StringUtils;

import javax.xml.datatype.XMLGregorianCalendar;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * Created by lucky on 2017/11/10.
 */
public class OpenItemResult {
    /**
     * ID
     */
    private String identifier;

    /**
     * 最后作答时间
     */
    private XMLGregorianCalendar datestamp;

    /**
     * 试题序号
     */
    private int sequenceIndex;

    /**
     * 会话状态
     */
    private SessionStatusType sessionStatus;

    /**
     * 作答次数
     */
    private int numAttempts;

    /**
     * 考生是否标记试题
     */
    private boolean isMarked;

    /**
     * 考生作答时长
     */
    private int candidateResponseDuration;

    /**
     * 试题完成状态
     */
    private CompletionStatus itemCompletionStatus;

    /**
     * 结果响应变量集合
     */
    private List<OpenResultResponseVariable> resultResponseVariables;

    /**
     * 成绩输出变量集合
     */
    private List<OpenScoreOutcomeVariable> scoreOutcomeVariables;

    /**
     * 评语输出变量集合
     */
    private List<OpenScorerCommentsOutcomeVariable> scorerCommentsOutcomeVariables;

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
     * Gets datestamp.
     *
     * @return the datestamp
     */
    public XMLGregorianCalendar getDatestamp() {
        return datestamp;
    }

    /**
     * Sets datestamp.
     *
     * @param datestamp the datestamp
     */
    public void setDatestamp(XMLGregorianCalendar datestamp) {
        this.datestamp = datestamp;
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
     * Gets session status.
     *
     * @return the session status
     */
    public SessionStatusType getSessionStatus() {
        return sessionStatus;
    }

    /**
     * Sets session status.
     *
     * @param sessionStatus the session status
     */
    public void setSessionStatus(SessionStatusType sessionStatus) {
        this.sessionStatus = sessionStatus;
    }

    /**
     * Gets num attempts.
     *
     * @return the num attempts
     */
    public int getNumAttempts() {
        return numAttempts;
    }

    /**
     * Sets num attempts.
     *
     * @param numAttempts the num attempts
     */
    public void setNumAttempts(int numAttempts) {
        this.numAttempts = numAttempts;
    }

    /**
     * Is marked boolean.
     *
     * @return the boolean
     */
    public boolean isMarked() {
        return isMarked;
    }

    /**
     * Sets marked.
     *
     * @param marked the marked
     */
    public void setMarked(boolean marked) {
        isMarked = marked;
    }

    /**
     * Gets candidate response duration.
     *
     * @return the candidate response duration
     */
    public int getCandidateResponseDuration() {
        return candidateResponseDuration;
    }

    /**
     * Sets candidate response duration.
     *
     * @param candidateResponseDuration the candidate response duration
     */
    public void setCandidateResponseDuration(int candidateResponseDuration) {
        this.candidateResponseDuration = candidateResponseDuration;
    }

    /**
     * Gets item completion status.
     *
     * @return the item completion status
     */
    public CompletionStatus getItemCompletionStatus() {
        return itemCompletionStatus;
    }

    /**
     * Sets item completion status.
     *
     * @param itemCompletionStatus the item completion status
     */
    public void setItemCompletionStatus(CompletionStatus itemCompletionStatus) {
        this.itemCompletionStatus = itemCompletionStatus;
    }

    /**
     * Gets result response variables.
     *
     * @return the result response variables
     */
    public List<OpenResultResponseVariable> getResultResponseVariables() {
        return resultResponseVariables;
    }

    /**
     * Sets result response variables.
     *
     * @param resultResponseVariables the result response variables
     */
    public void setResultResponseVariables(List<OpenResultResponseVariable> resultResponseVariables) {
        this.resultResponseVariables = resultResponseVariables;
    }

    /**
     * Gets score outcome variables.
     *
     * @return the score outcome variables
     */
    public List<OpenScoreOutcomeVariable> getScoreOutcomeVariables() {
        return scoreOutcomeVariables;
    }

    /**
     * Sets score outcome variables.
     *
     * @param scoreOutcomeVariables the score outcome variables
     */
    public void setScoreOutcomeVariables(List<OpenScoreOutcomeVariable> scoreOutcomeVariables) {
        this.scoreOutcomeVariables = scoreOutcomeVariables;
    }

    /**
     * Gets scorer comments outcome variables.
     *
     * @return the scorer comments outcome variables
     */
    public List<OpenScorerCommentsOutcomeVariable> getScorerCommentsOutcomeVariables() {
        return scorerCommentsOutcomeVariables;
    }

    /**
     * Sets scorer comments outcome variables.
     *
     * @param scorerCommentsOutcomeVariables the scorer comments outcome variables
     */
    public void setScorerCommentsOutcomeVariables(List<OpenScorerCommentsOutcomeVariable> scorerCommentsOutcomeVariables) {
        this.scorerCommentsOutcomeVariables = scorerCommentsOutcomeVariables;
    }

    /**
     * 试题作答结果构造函数.
     */
    public OpenItemResult() {
    }

    /**
     * 试题作答结果构造函数.
     *
     * @param identifier                     ID
     * @param datestamp                      最后作答时间
     * @param sequenceIndex                  试题序号
     * @param sessionStatus                  会话状态
     * @param numAttempts                    作答次数
     * @param isMarked                       考生是否标记试题
     * @param itemCompletionStatus           试题完成状态
     * @param resultResponseVariables        结果响应变量集合
     * @param scoreOutcomeVariables          成绩输出变量集合
     * @param scorerCommentsOutcomeVariables 评语输出变量集合
     * @param candidateResponseDuration      考生作答时长
     */
    public OpenItemResult(String identifier, XMLGregorianCalendar datestamp, int sequenceIndex, SessionStatusType sessionStatus,
                          int numAttempts, boolean isMarked, CompletionStatus itemCompletionStatus,
                          List<OpenResultResponseVariable> resultResponseVariables, List<OpenScoreOutcomeVariable> scoreOutcomeVariables,
                          List<OpenScorerCommentsOutcomeVariable> scorerCommentsOutcomeVariables, int candidateResponseDuration) {
        this.identifier = identifier;
        this.datestamp = datestamp;
        this.sequenceIndex = sequenceIndex;
        this.sessionStatus = sessionStatus;
        this.numAttempts = numAttempts;
        this.isMarked = isMarked;
        this.itemCompletionStatus = itemCompletionStatus;
        this.resultResponseVariables = resultResponseVariables;
        this.scoreOutcomeVariables = scoreOutcomeVariables;
        this.scorerCommentsOutcomeVariables = scorerCommentsOutcomeVariables;
        this.candidateResponseDuration = candidateResponseDuration;
    }

    /**
     * 试题作答结果构造函数.
     *
     * @param identifier              ID
     * @param datestamp               最后作答时间
     * @param sequenceIndex           试题序号
     * @param sessionStatus           会话状态
     * @param numAttempts             作答次数
     * @param isMarked                考生是否标记试题
     * @param itemCompletionStatus    试题完成状态
     * @param resultResponseVariables 结果响应变量集合
     * @param scoreOutcomeVariables   成绩输出变量集合
     */
    public OpenItemResult(String identifier, XMLGregorianCalendar datestamp, int sequenceIndex, SessionStatusType sessionStatus,
                          int numAttempts, boolean isMarked, CompletionStatus itemCompletionStatus,
                          List<OpenResultResponseVariable> resultResponseVariables, List<OpenScoreOutcomeVariable> scoreOutcomeVariables) {
        this(identifier, datestamp, sequenceIndex, sessionStatus, numAttempts, isMarked, itemCompletionStatus,
                resultResponseVariables, scoreOutcomeVariables, null);
    }

    /**
     * 试题作答结果构造函数.
     * 未标记试题
     *
     * @param identifier              ID
     * @param datestamp               最后作答时间
     * @param sequenceIndex           试题序号
     * @param sessionStatus           会话状态
     * @param numAttempts             作答次数
     * @param itemCompletionStatus    试题完成状态
     * @param resultResponseVariables 结果响应变量集合
     * @param scoreOutcomeVariables   成绩输出变量集合
     */
    public OpenItemResult(String identifier, XMLGregorianCalendar datestamp, int sequenceIndex, SessionStatusType sessionStatus,
                          int numAttempts, CompletionStatus itemCompletionStatus,
                          List<OpenResultResponseVariable> resultResponseVariables, List<OpenScoreOutcomeVariable> scoreOutcomeVariables) {
        this(identifier, datestamp, sequenceIndex, sessionStatus,
                numAttempts, false, itemCompletionStatus, resultResponseVariables, scoreOutcomeVariables);
    }

    /**
     * 试题作答结果构造函数.
     * 单一结果响应变量、单一成绩输出变量
     *
     * @param identifier             ID
     * @param datestamp              最后作答时间
     * @param sequenceIndex          试题序号
     * @param sessionStatus          会话状态
     * @param numAttempts            会话状态
     * @param isMarked               作答次数
     * @param itemCompletionStatus   考生是否标记试题
     * @param resultResponseVariable 响应变量集合
     * @param scoreOutcomeVariable   成绩输出变量
     */
    public OpenItemResult(String identifier, XMLGregorianCalendar datestamp, int sequenceIndex, SessionStatusType sessionStatus,
                          int numAttempts, boolean isMarked, CompletionStatus itemCompletionStatus,
                          OpenResultResponseVariable resultResponseVariable, OpenScoreOutcomeVariable scoreOutcomeVariable) {
        this(identifier, datestamp, sequenceIndex, sessionStatus,
                numAttempts, isMarked, itemCompletionStatus,
                TransToOpenResultResponseVariableList(resultResponseVariable), TransToOpenScoreOutcomeVariableList(scoreOutcomeVariable));
    }

    /**
     * 试题作答结果构造函数.
     * 未标记试题，单一结果响应变量、单一成绩输出变量
     *
     * @param identifier             ID
     * @param datestamp              最后作答时间
     * @param sequenceIndex          试题序号
     * @param sessionStatus          会话状态
     * @param numAttempts            作答次数
     * @param itemCompletionStatus   响应变量集合
     * @param resultResponseVariable 结果响应变量
     * @param scoreOutcomeVariable   成绩输出变量
     */
    public OpenItemResult(String identifier, XMLGregorianCalendar datestamp, int sequenceIndex, SessionStatusType sessionStatus,
                          int numAttempts, CompletionStatus itemCompletionStatus,
                          OpenResultResponseVariable resultResponseVariable, OpenScoreOutcomeVariable scoreOutcomeVariable) {
        this(identifier, datestamp, sequenceIndex, sessionStatus,
                numAttempts, false, itemCompletionStatus, resultResponseVariable, scoreOutcomeVariable);
    }

    /**
     * 试题作答结果构造函数.
     *
     * @param identifier                     ID
     * @param datestamp                      最后作答时间
     * @param sequenceIndex                  试题序号
     * @param sessionStatus                  会话状态
     * @param numAttempts                    作答次数
     * @param isMarked                       考生是否标记试题
     * @param itemCompletionStatus           试题完成状态
     * @param resultResponseVariables        结果响应变量集合
     * @param scoreOutcomeVariables          成绩输出变量集合
     * @param scorerCommentsOutcomeVariables 评语输出变量集合
     */
    public OpenItemResult(String identifier, XMLGregorianCalendar datestamp, int sequenceIndex, SessionStatusType sessionStatus,
                          int numAttempts, boolean isMarked, CompletionStatus itemCompletionStatus,
                          List<OpenResultResponseVariable> resultResponseVariables, List<OpenScoreOutcomeVariable> scoreOutcomeVariables,
                          List<OpenScorerCommentsOutcomeVariable> scorerCommentsOutcomeVariables) {
        this(identifier, datestamp, sequenceIndex, sessionStatus,
                numAttempts, isMarked, itemCompletionStatus, resultResponseVariables, scoreOutcomeVariables, scorerCommentsOutcomeVariables, 0);
    }

    /**
     * 将单一结果响应变量转换成结果响应变量.
     *
     * @param resultResponseVariable 单一结果响应变量
     * @return 结果响应变量
     */
    private static List<OpenResultResponseVariable> TransToOpenResultResponseVariableList(OpenResultResponseVariable resultResponseVariable) {
        List<OpenResultResponseVariable> resultResponseVariables = new ArrayList<>();
        resultResponseVariables.add(resultResponseVariable);
        return resultResponseVariables;
    }

    /**
     * 将单一成绩输出变量转换成成绩输出变量.
     *
     * @param scoreOutcomeVariable 单一成绩输出变量
     * @return 成绩输出变量
     */
    private static List<OpenScoreOutcomeVariable> TransToOpenScoreOutcomeVariableList(OpenScoreOutcomeVariable scoreOutcomeVariable) {
        List<OpenScoreOutcomeVariable> scoreOutcomeVariables = new ArrayList<>();
        scoreOutcomeVariables.add(scoreOutcomeVariable);

        return scoreOutcomeVariables;
    }

    /**
     * 试题作答结果构造函数.
     *
     * @param imsItemResult IMS试题作答结果
     */
    protected OpenItemResult(ItemResultType imsItemResult) {
        TranslateFromImsItemResult(imsItemResult);
    }

    /**
     * 从IMS试题作答结果转换.
     *
     * @param imsItemResult IMS试题作答结果
     */
    protected void TranslateFromImsItemResult(ItemResultType imsItemResult) {
        setIdentifier(imsItemResult.getIdentifier());
        setSequenceIndex(imsItemResult.getSequenceIndex());
        setDatestamp(imsItemResult.getDatestamp());
        setSessionStatus(imsItemResult.getSessionStatus());

        if (!imsItemResult.getContent().isEmpty()) {
            for (Object obj : imsItemResult.getContent()) {
                //region responseVariableCollection
                if (obj instanceof ResponseVariableType) {
                    ResponseVariableType respVar = (ResponseVariableType) obj;

                    if (respVar.getIdentifier().equalsIgnoreCase("numAttempts")) {
                        //作答次数
                        if (respVar.getCandidateResponse() != null && !respVar.getCandidateResponse().getValue().isEmpty() &&
                                respVar.getCandidateResponse().getValue().size() > 0) {
                            setNumAttempts(Integer.parseInt(respVar.getCandidateResponse().getValue().get(0).getValue()));
                        }
                    } else if (respVar.getIdentifier().equalsIgnoreCase("isMarked")) {
                        //标记
                        if (respVar.getCandidateResponse() != null && !respVar.getCandidateResponse().getValue().isEmpty() &&
                                respVar.getCandidateResponse().getValue().size() > 0) {
                            setMarked(respVar.getCandidateResponse().getValue().get(0).getValue().toLowerCase().equalsIgnoreCase("true"));
                        }
                    } else if (respVar.getIdentifier().indexOf(Consts._RESPONSEVARIABLE) >= 0) {
                        if (getResultResponseVariables() == null) {
                            setResultResponseVariables(new ArrayList<>());
                        }
                        //正确答案
                        List<String> correctResponses = new ArrayList<>();
                        if (respVar.getCorrectResponse() != null && !respVar.getCorrectResponse().getValue().isEmpty() &&
                                respVar.getCorrectResponse().getValue().size() > 0) {

                            for (ValueType correctResponseValue : respVar.getCorrectResponse().getValue()) {
                                correctResponses.add(correctResponseValue.getValue());
                            }
                        }
                        //考生作答
                        List<String> candidateResponses = new ArrayList<>();
                        if (respVar.getCandidateResponse() != null && !respVar.getCandidateResponse().getValue().isEmpty() &&
                                respVar.getCandidateResponse().getValue().size() > 0) {
                            for (ValueType candidateResponseValue : respVar.getCandidateResponse().getValue()) {
                                candidateResponses.add(candidateResponseValue.getValue());
                            }
                        }

                        OpenResultResponseVariable resultResponseVariable = new OpenResultResponseVariable(
                                respVar.getIdentifier(),
                                respVar.getCardinality(),
                                respVar.getBaseType(),
                                String.join(" ", respVar.getChoiceSequence()),
                                correctResponses,
                                candidateResponses);
                        getResultResponseVariables().add(resultResponseVariable);
                    } else if (respVar.getIdentifier().indexOf("duration") >= 0) {
                        if (respVar.getCandidateResponse() != null && !respVar.getCandidateResponse().getValue().isEmpty() &&
                                respVar.getCandidateResponse().getValue().size() > 0) {
                            setCandidateResponseDuration(Integer.getInteger(respVar.getCandidateResponse().getValue().get(0).getValue()));
                        }
                    }
                }
                //endregion

                //region outcomeVariableCollection
                if (obj instanceof OutcomeVariableType) {
                    OutcomeVariableType outVar = (OutcomeVariableType) obj;

                    if (outVar.getIdentifier().equalsIgnoreCase("completionStatus")) {
                        if (outVar.getValue() != null && outVar.getValue().size() > 0) {
                            setItemCompletionStatus(CompletionStatus.fromValue(outVar.getValue().get(0).getValue()));
                        }
                    } else if (outVar.getIdentifier().indexOf("scorerComments") >= 0) {
                        if (getScorerCommentsOutcomeVariables() == null) {
                            setScorerCommentsOutcomeVariables(new ArrayList<>());
                        }
                        String scorerComments = null;
                        if (outVar.getValue() != null &&
                                outVar.getValue().size() > 0 &&
                                outVar.getValue().get(0).getValue() != null
                                ) {
                            scorerComments = outVar.getValue().get(0).getValue();
                        }

                        OpenScorerCommentsOutcomeVariable scorerCommentsOutcomeVariable =
                                new OpenScorerCommentsOutcomeVariable(outVar.getIdentifier(), scorerComments, outVar.getCardinality(), outVar.getBaseType());
                        getScorerCommentsOutcomeVariables().add(scorerCommentsOutcomeVariable);
                    } else if (outVar.getIdentifier().indexOf("SCORE") >= 0) {
                        if (getScoreOutcomeVariables() == null) {
                            setScoreOutcomeVariables(new ArrayList<>());
                        }
                        double candidateScore = 0;

                        boolean abandonScore = false;
                        if (outVar.getInterpretation() != null && outVar.getInterpretation().equalsIgnoreCase("abandoned")) {
                            abandonScore = true;
                        }

                        if (outVar.getValue() != null &&
                                outVar.getValue().size() > 0 &&
                                outVar.getValue().get(0).getValue() != null
                                ) {
                            candidateScore = Double.valueOf(outVar.getValue().get(0).getValue());
                        }

                        OpenScoreOutcomeVariable scoreOutcomeVariable =
                                new OpenScoreOutcomeVariable(outVar.getIdentifier(), outVar.getCardinality(), outVar.getBaseType(),
                                        outVar.getNormalMaximum(), candidateScore, abandonScore);
                        getScoreOutcomeVariables().add(scoreOutcomeVariable);
                    }

                }
                //endregion
            }
        }
    }

    /**
     * 转换为IMS试题作答结果.
     *
     * @return IMS试题作答结果
     */
    protected ItemResultType TranslateToImsItemResult() {
        ItemResultType imsItemResult = new ItemResultType();

        imsItemResult.setIdentifier(getIdentifier());
        imsItemResult.setSequenceIndex(getSequenceIndex());
        imsItemResult.setDatestamp(getDatestamp());
        imsItemResult.setSessionStatus(getSessionStatus());

        //region responseVariable
        Collection<ResponseVariableType> responseVariableTypes = new ArrayList<>();

        //region numAttempts responseVariable
        ResponseVariableType numAttemptsVar = new ResponseVariableType();
        numAttemptsVar.setIdentifier("numAttempts");
        numAttemptsVar.setCardinality(CardinalityType.SINGLE);
        numAttemptsVar.setBaseType(BaseTypeType.INTEGER);

        CandidateResponseType numAttemptsCandidateResponse = new CandidateResponseType();
        ValueType numAttemptsValue = new ValueType();
        numAttemptsValue.setValue(String.valueOf(getNumAttempts()));
        numAttemptsCandidateResponse.getValue().add(numAttemptsValue);
        numAttemptsVar.setCandidateResponse(numAttemptsCandidateResponse);

        responseVariableTypes.add(numAttemptsVar);
        //endregion

        //region isMarked responseVariable
        if (isMarked()) {
            ResponseVariableType isMarkedVar = new ResponseVariableType();
            isMarkedVar.setIdentifier("isMarked");
            isMarkedVar.setCardinality(CardinalityType.SINGLE);
            isMarkedVar.setBaseType(BaseTypeType.BOOLEAN);

            CandidateResponseType isMarkedCandidateResponse = new CandidateResponseType();
            ValueType isMarkedValue = new ValueType();
            isMarkedValue.setValue(String.valueOf(isMarked()));
            isMarkedCandidateResponse.getValue().add(isMarkedValue);
            isMarkedVar.setCandidateResponse(isMarkedCandidateResponse);

            responseVariableTypes.add(isMarkedVar);
        }
        //endregion

        //region RESPONSE responseVariable
        if (getResultResponseVariables() != null) {
            for (OpenResultResponseVariable resultResponseVar : getResultResponseVariables()) {
                ResponseVariableType answerVar = new ResponseVariableType();
                answerVar.setIdentifier(resultResponseVar.getIdentifier());
                answerVar.setCardinality(resultResponseVar.getCardinalityType());
                answerVar.setBaseType(resultResponseVar.getBaseType());
                if (resultResponseVar.getChoiceSequence() != null && !resultResponseVar.getChoiceSequence().isEmpty()) {
                    for (String str : resultResponseVar.getChoiceSequence().split(" ")) {
                        answerVar.getChoiceSequence().add(str);
                    }
                }

                CorrectResponseType cortResponse = new CorrectResponseType();

                if (resultResponseVar.getCorrectResponses() != null) {
                    for (String cortValueStr : resultResponseVar.getCorrectResponses()) {
                        ValueType cortValue = new ValueType();
                        cortValue.setValue(cortValueStr);
                        cortResponse.getValue().add(cortValue);
                    }
                }

                answerVar.setCorrectResponse(cortResponse);

                CandidateResponseType candResponse = new CandidateResponseType();
                if (resultResponseVar.getCandidateResponses() != null) {
                    for (String candValueStr : resultResponseVar.getCandidateResponses()) {
                        ValueType candValue = new ValueType();
                        candValue.setValue(candValueStr);
                        candResponse.getValue().add(candValue);
                    }
                }

                answerVar.setCandidateResponse(candResponse);

                responseVariableTypes.add(answerVar);
            }
        }
        //endregion

        //region duration responseVariable
        if (getCandidateResponseDuration() != 0) {
            ResponseVariableType durationVar = new ResponseVariableType();
            durationVar.setIdentifier("duration");
            durationVar.setCardinality(CardinalityType.SINGLE);
            durationVar.setBaseType(BaseTypeType.DURATION);

            CandidateResponseType durationCandidateResponse = new CandidateResponseType();
            ValueType durationCandidateResponseValue = new ValueType();
            durationCandidateResponseValue.setValue(String.valueOf(getCandidateResponseDuration()));
            durationCandidateResponse.getValue().add(durationCandidateResponseValue);
            durationVar.setCandidateResponse(durationCandidateResponse);

            responseVariableTypes.add(durationVar);
        }
        //endregion

        imsItemResult.getContent().addAll(responseVariableTypes);

        //endregion

        //region outcomeVariable
        Collection<OutcomeVariableType> outcomeVariableTypes = new ArrayList<>();

        //region completionStatus outcomeVariable
        OutcomeVariableType completionStatusVar = new OutcomeVariableType();
        completionStatusVar.setIdentifier("completionStatus");
        completionStatusVar.setCardinality(CardinalityType.SINGLE);
        completionStatusVar.setBaseType(BaseTypeType.IDENTIFIER);

        ValueType completionStatusValue = new ValueType();
        completionStatusValue.setValue(getItemCompletionStatus().value());
        completionStatusVar.getValue().add(completionStatusValue);

        outcomeVariableTypes.add(completionStatusVar);
        //endregion

        //region SCORE outcomeVariable
        if (getScoreOutcomeVariables() != null) {
            for (OpenScoreOutcomeVariable scoreOutcomeVar : getScoreOutcomeVariables()) {
                OutcomeVariableType scoreVar = new OutcomeVariableType();
                scoreVar.setIdentifier(scoreOutcomeVar.getIdentifier());
                scoreVar.setCardinality(scoreOutcomeVar.getCardinalityType());
                scoreVar.setBaseType(scoreOutcomeVar.getBaseType());
                scoreVar.setNormalMaximum(scoreOutcomeVar.getItemScore());
                if (scoreOutcomeVar.isAbandonScore()) {
                    scoreVar.setInterpretation("abandoned");
                }

                ValueType candidateScoreValue = new ValueType();

                candidateScoreValue.setValue(String.valueOf(scoreOutcomeVar.getCandidateScore()));

                scoreVar.getValue().add(candidateScoreValue);

                outcomeVariableTypes.add(scoreVar);
            }
        }
        //endregion

        //region SCORERCOMMENTS outcomeVariable
        if (getScorerCommentsOutcomeVariables() != null) {
            for (OpenScorerCommentsOutcomeVariable scorerCommentsOutcomeOutcomeVar : getScorerCommentsOutcomeVariables()) {
                OutcomeVariableType scoreVar = new OutcomeVariableType();
                scoreVar.setIdentifier(scorerCommentsOutcomeOutcomeVar.getIdentifier());
                scoreVar.setCardinality(scorerCommentsOutcomeOutcomeVar.getCardinalityType());
                scoreVar.setBaseType(scorerCommentsOutcomeOutcomeVar.getBaseType());

                ValueType candidateScoreValue = new ValueType();
                candidateScoreValue.setValue(scorerCommentsOutcomeOutcomeVar.getScorerComments());
                scoreVar.getValue().add(candidateScoreValue);

                outcomeVariableTypes.add(scoreVar);
            }
        }
        //endregion

        imsItemResult.getContent().addAll(outcomeVariableTypes);
        //endregion

        return imsItemResult;
    }
}
