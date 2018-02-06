//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.06.15 时间 10:58:25 AM CST 
//


package cn.com.open.qti;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cn.com.open.qti package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Table_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "table");
    private final static QName _OrderInteraction_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "orderInteraction");
    private final static QName _Power_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "power");
    private final static QName _GapText_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "gapText");
    private final static QName _OutcomeProcessingFragment_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "outcomeProcessingFragment");
    private final static QName _Member_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "member");
    private final static QName _NumberResponded_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "numberResponded");
    private final static QName _IntegerToFloat_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "integerToFloat");
    private final static QName _FieldValue_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "fieldValue");
    private final static QName _MapEntry_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "mapEntry");
    private final static QName _ExtActivity_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "ext_activity");
    private final static QName _Regexp_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "regexp");
    private final static QName _Span_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "span");
    private final static QName _ExtDisability_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "ext_disability");
    private final static QName _FeedbackType_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "feedbackType");
    private final static QName _Li_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "li");
    private final static QName _ResponseIf_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "responseIf");
    private final static QName _Id_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "id");
    private final static QName _Affiliationid_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "affiliationid");
    private final static QName _DurationLT_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "durationLT");
    private final static QName _InlineChoiceInteraction_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "inlineChoiceInteraction");
    private final static QName _Cite_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "cite");
    private final static QName _PrintedVariables_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "printedVariables");
    private final static QName _Evaluationid_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "evaluationid");
    private final static QName _RubricBlock_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "rubricBlock");
    private final static QName _UsageDataVocabulary_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "usageDataVocabulary");
    private final static QName _ItemBody_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "itemBody");
    private final static QName _ExtProduct_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "ext_product");
    private final static QName _Hottext_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "hottext");
    private final static QName _GraphicOrderInteraction_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "graphicOrderInteraction");
    private final static QName _Acronym_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "acronym");
    private final static QName _CorrectResponse_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "correctResponse");
    private final static QName _DurationGTE_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "durationGTE");
    private final static QName _Product_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "product");
    private final static QName _RpTemplate_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "rpTemplate");
    private final static QName _BankProfile_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "bankProfile");
    private final static QName _SelectPointInteraction_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "selectPointInteraction");
    private final static QName _ToolName_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "toolName");
    private final static QName _ContainerSize_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "containerSize");
    private final static QName _TemplateElse_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "templateElse");
    private final static QName _TestFeedback_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "testFeedback");
    private final static QName _PreCondition_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "preCondition");
    private final static QName _ModalFeedback_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "modalFeedback");
    private final static QName _SimpleAssociableChoice_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "simpleAssociableChoice");
    private final static QName _Gte_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "gte");
    private final static QName _ResponseProcessingFragment_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "responseProcessingFragment");
    private final static QName _ExtInterest_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "ext_interest");
    private final static QName _BranchRule_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "branchRule");
    private final static QName _Context_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "context");
    private final static QName _MathElement_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "mathElement");
    private final static QName _ExtLanguage_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "ext_language");
    private final static QName _ExtRelationship_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "ext_relationship");
    private final static QName _InterpolationTable_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "interpolationTable");
    private final static QName _Truncate_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "truncate");
    private final static QName _MapResponse_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "mapResponse");
    private final static QName _Hr_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "hr");
    private final static QName _Rubric_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "rubric");
    private final static QName _Caption_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "caption");
    private final static QName _ResponseDeclaration_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "responseDeclaration");
    private final static QName _ExtGoal_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "ext_goal");
    private final static QName _TemplateProcessing_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "templateProcessing");
    private final static QName _DefaultValue_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "defaultValue");
    private final static QName _Big_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "big");
    private final static QName _MediaInteraction_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "mediaInteraction");
    private final static QName _ExtCompetency_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "ext_competency");
    private final static QName _TestResult_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "testResult");
    private final static QName _ExitTemplate_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "exitTemplate");
    private final static QName _CategorizedStatistic_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "categorizedStatistic");
    private final static QName _PatternMatch_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "patternMatch");
    private final static QName _InterpolationTableEntry_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "interpolationTableEntry");
    private final static QName _Web_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "web");
    private final static QName _ExtQcl_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "ext_qcl");
    private final static QName _Lon_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "lon");
    private final static QName _Areacode_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "areacode");
    private final static QName _Index_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "index");
    private final static QName _OutcomeProcessing_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "outcomeProcessing");
    private final static QName _TextEntryInteraction_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "textEntryInteraction");
    private final static QName _OutcomeIf_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "outcomeIf");
    private final static QName _Templates_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "templates");
    private final static QName _OutcomeMinimum_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "outcomeMinimum");
    private final static QName _SetTemplateValue_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "setTemplateValue");
    private final static QName _Var_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "var");
    private final static QName _Mapping_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "mapping");
    private final static QName _PrintedVariable_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "printedVariable");
    private final static QName _CustomOperator_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "customOperator");
    private final static QName _Stylesheet_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "stylesheet");
    private final static QName _Ol_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "ol");
    private final static QName _Value_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "value");
    private final static QName _Lte_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "lte");
    private final static QName _FeedbackInline_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "feedbackInline");
    private final static QName _TemplateDeclaration_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "templateDeclaration");
    private final static QName _And_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "and");
    private final static QName _CustomInteraction_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "customInteraction");
    private final static QName _AnyN_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "anyN");
    private final static QName _Substring_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "substring");
    private final static QName _Delete_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "delete");
    private final static QName _IntegerDivide_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "integerDivide");
    private final static QName _MatchTableEntry_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "matchTableEntry");
    private final static QName _Code_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "code");
    private final static QName _Img_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "img");
    private final static QName _TargetObject_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "targetObject");
    private final static QName _AssessmentResult_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "assessmentResult");
    private final static QName _TemplateElseIf_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "templateElseIf");
    private final static QName _ResponseVariable_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "responseVariable");
    private final static QName _HotspotInteraction_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "hotspotInteraction");
    private final static QName _TimeLimits_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "timeLimits");
    private final static QName _Lat_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "lat");
    private final static QName _Variable_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "variable");
    private final static QName _Datetime_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "datetime");
    private final static QName _Extnumber_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "extnumber");
    private final static QName _Round_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "round");
    private final static QName _EndAttemptInteraction_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "endAttemptInteraction");
    private final static QName _Kbd_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "kbd");
    private final static QName _SliderInteraction_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "sliderInteraction");
    private final static QName _Match_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "match");
    private final static QName _Or_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "or");
    private final static QName _TemplateBlock_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "templateBlock");
    private final static QName _ExtPreference_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "ext_preference");
    private final static QName _ChoiceInteraction_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "choiceInteraction");
    private final static QName _GraphicGapMatchInteraction_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "graphicGapMatchInteraction");
    private final static QName _ExtAffiliation_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "ext_affiliation");
    private final static QName _Lt_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "lt");
    private final static QName _NumberCorrect_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "numberCorrect");
    private final static QName _TemplateDefault_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "templateDefault");
    private final static QName _ExitResponse_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "exitResponse");
    private final static QName _Col_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "col");
    private final static QName _MatchTable_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "matchTable");
    private final static QName _Small_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "small");
    private final static QName _ItemSessionControl_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "itemSessionControl");
    private final static QName _HypertextElement_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "hypertextElement");
    private final static QName _ExtObjectives_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "ext_objectives");
    private final static QName _Null_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "null");
    private final static QName _SetOutcomeValue_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "setOutcomeValue");
    private final static QName _VariableMapping_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "variableMapping");
    private final static QName _OutcomeVariable_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "outcomeVariable");
    private final static QName _RandomFloat_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "randomFloat");
    private final static QName _ListElements_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "listElements");
    private final static QName _ImageElement_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "imageElement");
    private final static QName _ExitTest_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "exitTest");
    private final static QName _OutcomeDeclaration_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "outcomeDeclaration");
    private final static QName _Blockquote_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "blockquote");
    private final static QName _ItemResult_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "itemResult");
    private final static QName _ExtEligibility_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "ext_eligibility");
    private final static QName _Imsmd_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "imsmd");
    private final static QName _ExtLearnerinfo_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "ext_learnerinfo");
    private final static QName _PresentationElements_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "presentationElements");
    private final static QName _HotspotChoice_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "hotspotChoice");
    private final static QName _TimeDependent_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "timeDependent");
    private final static QName _OrdinaryStatistic_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "ordinaryStatistic");
    private final static QName _AreaMapping_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "areaMapping");
    private final static QName _AssociateInteraction_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "associateInteraction");
    private final static QName _Default_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "default");
    private final static QName _Adaptive_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "adaptive");
    private final static QName _ExtSecuritykey_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "ext_securitykey");
    private final static QName _Br_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "br");
    private final static QName _Sup_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "sup");
    private final static QName _ContentProfile_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "contentProfile");
    private final static QName _Sum_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "sum");
    private final static QName _Ordering_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "ordering");
    private final static QName _Agentid_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "agentid");
    private final static QName _Samp_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "samp");
    private final static QName _GapImg_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "gapImg");
    private final static QName _Strong_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "strong");
    private final static QName _Sub_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "sub");
    private final static QName _Imsqtimd_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "imsqtimd");
    private final static QName _Tr_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "tr");
    private final static QName _IsNull_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "isNull");
    private final static QName _ExtendedTextInteraction_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "extendedTextInteraction");
    private final static QName _ExtDate_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "ext_date");
    private final static QName _TableElements_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "tableElements");
    private final static QName _Th_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "th");
    private final static QName _SolutionAvailable_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "solutionAvailable");
    private final static QName _Q_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "q");
    private final static QName _ToolVersion_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "toolVersion");
    private final static QName _Registrationno_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "registrationno");
    private final static QName _P_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "p");
    private final static QName _Td_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "td");
    private final static QName _Tfoot_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "tfoot");
    private final static QName _AssessmentItem_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "assessmentItem");
    private final static QName _I_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "i");
    private final static QName _Rounding_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "rounding");
    private final static QName _IntegerModulus_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "integerModulus");
    private final static QName _OutcomeElseIf_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "outcomeElseIf");
    private final static QName _CandidateResponse_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "candidateResponse");
    private final static QName _Address_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "address");
    private final static QName _B_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "b");
    private final static QName _A_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "a");
    private final static QName _Ordered_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "ordered");
    private final static QName _PositionObjectInteraction_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "positionObjectInteraction");
    private final static QName _Abbr_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "abbr");
    private final static QName _ExtIdentification_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "ext_identification");
    private final static QName _MathVariable_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "mathVariable");
    private final static QName _ResponseCondition_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "responseCondition");
    private final static QName _ExtTestimonial_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "ext_testimonial");
    private final static QName _Composite_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "composite");
    private final static QName _SimpleChoice_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "simpleChoice");
    private final static QName _BaseValue_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "baseValue");
    private final static QName _FeedbackIntegrated_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "feedbackIntegrated");
    private final static QName _OutcomeMaximum_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "outcomeMaximum");
    private final static QName _Noofattempts_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "noofattempts");
    private final static QName _ResponseRules_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "responseRules");
    private final static QName _ExtEvaluation_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "ext_evaluation");
    private final static QName _AreaMapEntry_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "areaMapEntry");
    private final static QName _TestPart_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "testPart");
    private final static QName _TestVariables_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "testVariables");
    private final static QName _ItemTemplate_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "itemTemplate");
    private final static QName _PositionObjectStage_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "positionObjectStage");
    private final static QName _LookupOutcomeValue_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "lookupOutcomeValue");
    private final static QName _Object_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "object");
    private final static QName _ToolVendor_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "toolVendor");
    private final static QName _Email_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "email");
    private final static QName _Uid_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "uid");
    private final static QName _Selection_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "selection");
    private final static QName _Contains_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "contains");
    private final static QName _Dfn_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "dfn");
    private final static QName _Subtract_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "subtract");
    private final static QName _FeedbackBlock_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "feedbackBlock");
    private final static QName _Include_QNAME = new QName("http://www.w3.org/2001/XInclude", "include");
    private final static QName _Indexid_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "indexid");
    private final static QName _ExtTranscript_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "ext_transcript");
    private final static QName _UploadInteraction_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "uploadInteraction");
    private final static QName _Divide_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "divide");
    private final static QName _ResponseElse_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "responseElse");
    private final static QName _Contentref_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "contentref");
    private final static QName _Gap_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "gap");
    private final static QName _Param_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "param");
    private final static QName _AssessmentSection_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "assessmentSection");
    private final static QName _MapResponsePoint_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "mapResponsePoint");
    private final static QName _Not_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "not");
    private final static QName _GapMatchInteraction_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "gapMatchInteraction");
    private final static QName _Random_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "random");
    private final static QName _ResponseProcessing_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "responseProcessing");
    private final static QName _TemplateInline_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "templateInline");
    private final static QName _H6_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "h6");
    private final static QName _NumberIncorrect_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "numberIncorrect");
    private final static QName _H5_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "h5");
    private final static QName _H4_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "h4");
    private final static QName _H3_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "h3");
    private final static QName _H2_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "h2");
    private final static QName _H1_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "h1");
    private final static QName _StringMatch_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "stringMatch");
    private final static QName _TextElements_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "textElements");
    private final static QName _Thead_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "thead");
    private final static QName _AssociableHotspot_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "associableHotspot");
    private final static QName _OutcomeCondition_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "outcomeCondition");
    private final static QName _SetDefaultValue_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "setDefaultValue");
    private final static QName _OutcomeElse_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "outcomeElse");
    private final static QName _Prompt_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "prompt");
    private final static QName _Fallback_QNAME = new QName("http://www.w3.org/2001/XInclude", "fallback");
    private final static QName _UsageData_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "usageData");
    private final static QName _Equal_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "equal");
    private final static QName _SetCorrectResponse_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "setCorrectResponse");
    private final static QName _Gt_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "gt");
    private final static QName _RandomInteger_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "randomInteger");
    private final static QName _Source_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "source");
    private final static QName _Colgroup_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "colgroup");
    private final static QName _AssessmentTest_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "assessmentTest");
    private final static QName _Multiple_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "multiple");
    private final static QName _LomMetadata_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "lomMetadata");
    private final static QName _MatchInteraction_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "matchInteraction");
    private final static QName _DrawingInteraction_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "drawingInteraction");
    private final static QName _FeedbackModal_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "feedbackModal");
    private final static QName _Countrycode_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "countrycode");
    private final static QName _AssessmentItemRef_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "assessmentItemRef");
    private final static QName _ImageType_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "imageType");
    private final static QName _InlineChoice_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "inlineChoice");
    private final static QName _MetadataProfile_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "metadataProfile");
    private final static QName _ExtContentype_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "ext_contentype");
    private final static QName _ExtExrefrecord_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "ext_exrefrecord");
    private final static QName _Ul_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "ul");
    private final static QName _ExtRole_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "ext_role");
    private final static QName _HottextInteraction_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "hottextInteraction");
    private final static QName _InteractionType_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "interactionType");
    private final static QName _Indnumber_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "indnumber");
    private final static QName _Div_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "div");
    private final static QName _Dt_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "dt");
    private final static QName _ObjectType_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "objectType");
    private final static QName _GraphicAssociateInteraction_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "graphicAssociateInteraction");
    private final static QName _TemplateIf_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "templateIf");
    private final static QName _EqualRounded_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "equalRounded");
    private final static QName _Inside_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "inside");
    private final static QName _NumberPresented_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "numberPresented");
    private final static QName _Dl_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "dl");
    private final static QName _TemplateCondition_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "templateCondition");
    private final static QName _Tbody_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "tbody");
    private final static QName _Correct_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "correct");
    private final static QName _ExtDefinition_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "ext_definition");
    private final static QName _Dd_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "dd");
    private final static QName _Tt_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "tt");
    private final static QName _ExtAccessibility_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "ext_accessibility");
    private final static QName _TemplateVariable_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "templateVariable");
    private final static QName _ObjectElements_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "objectElements");
    private final static QName _SimpleMatchSet_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "simpleMatchSet");
    private final static QName _NumberSelected_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "numberSelected");
    private final static QName _Fielddata_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "fielddata");
    private final static QName _SessionIdentifier_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "sessionIdentifier");
    private final static QName _Weight_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "weight");
    private final static QName _Em_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "em");
    private final static QName _QtiMetadata_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "qtiMetadata");
    private final static QName _ResponseElseIf_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "responseElseIf");
    private final static QName _Pre_QNAME = new QName("http://www.open.com.cn/schemas/exam/openqti_v1", "pre");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cn.com.open.qti
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LookupOutcomeValueType }
     * 
     */
    public LookupOutcomeValueType createLookupOutcomeValueType() {
        return new LookupOutcomeValueType();
    }

    /**
     * Create an instance of {@link PositionObjectStageType }
     * 
     */
    public PositionObjectStageType createPositionObjectStageType() {
        return new PositionObjectStageType();
    }

    /**
     * Create an instance of {@link TestVariablesType }
     * 
     */
    public TestVariablesType createTestVariablesType() {
        return new TestVariablesType();
    }

    /**
     * Create an instance of {@link TestPartType }
     * 
     */
    public TestPartType createTestPartType() {
        return new TestPartType();
    }

    /**
     * Create an instance of {@link AreaMapEntryType }
     * 
     */
    public AreaMapEntryType createAreaMapEntryType() {
        return new AreaMapEntryType();
    }

    /**
     * Create an instance of {@link OutcomeMaximumType }
     * 
     */
    public OutcomeMaximumType createOutcomeMaximumType() {
        return new OutcomeMaximumType();
    }

    /**
     * Create an instance of {@link BaseValueType }
     * 
     */
    public BaseValueType createBaseValueType() {
        return new BaseValueType();
    }

    /**
     * Create an instance of {@link SimpleChoiceType }
     * 
     */
    public SimpleChoiceType createSimpleChoiceType() {
        return new SimpleChoiceType();
    }

    /**
     * Create an instance of {@link ResponseConditionType }
     * 
     */
    public ResponseConditionType createResponseConditionType() {
        return new ResponseConditionType();
    }

    /**
     * Create an instance of {@link AbbrType }
     * 
     */
    public AbbrType createAbbrType() {
        return new AbbrType();
    }

    /**
     * Create an instance of {@link FeedbackBlockType }
     * 
     */
    public FeedbackBlockType createFeedbackBlockType() {
        return new FeedbackBlockType();
    }

    /**
     * Create an instance of {@link SubtractType }
     * 
     */
    public SubtractType createSubtractType() {
        return new SubtractType();
    }

    /**
     * Create an instance of {@link DfnType }
     * 
     */
    public DfnType createDfnType() {
        return new DfnType();
    }

    /**
     * Create an instance of {@link ContainsType }
     * 
     */
    public ContainsType createContainsType() {
        return new ContainsType();
    }

    /**
     * Create an instance of {@link SelectionType }
     * 
     */
    public SelectionType createSelectionType() {
        return new SelectionType();
    }

    /**
     * Create an instance of {@link ObjectType }
     * 
     */
    public ObjectType createObjectType() {
        return new ObjectType();
    }

    /**
     * Create an instance of {@link SubType }
     * 
     */
    public SubType createSubType() {
        return new SubType();
    }

    /**
     * Create an instance of {@link StrongType }
     * 
     */
    public StrongType createStrongType() {
        return new StrongType();
    }

    /**
     * Create an instance of {@link GapImgType }
     * 
     */
    public GapImgType createGapImgType() {
        return new GapImgType();
    }

    /**
     * Create an instance of {@link SampType }
     * 
     */
    public SampType createSampType() {
        return new SampType();
    }

    /**
     * Create an instance of {@link OrderingType }
     * 
     */
    public OrderingType createOrderingType() {
        return new OrderingType();
    }

    /**
     * Create an instance of {@link SumType }
     * 
     */
    public SumType createSumType() {
        return new SumType();
    }

    /**
     * Create an instance of {@link ContentProfileType }
     * 
     */
    public ContentProfileType createContentProfileType() {
        return new ContentProfileType();
    }

    /**
     * Create an instance of {@link SupType }
     * 
     */
    public SupType createSupType() {
        return new SupType();
    }

    /**
     * Create an instance of {@link BrType }
     * 
     */
    public BrType createBrType() {
        return new BrType();
    }

    /**
     * Create an instance of {@link AssociateInteractionType }
     * 
     */
    public AssociateInteractionType createAssociateInteractionType() {
        return new AssociateInteractionType();
    }

    /**
     * Create an instance of {@link DefaultType }
     * 
     */
    public DefaultType createDefaultType() {
        return new DefaultType();
    }

    /**
     * Create an instance of {@link AreaMappingType }
     * 
     */
    public AreaMappingType createAreaMappingType() {
        return new AreaMappingType();
    }

    /**
     * Create an instance of {@link OrdinaryStatisticType }
     * 
     */
    public OrdinaryStatisticType createOrdinaryStatisticType() {
        return new OrdinaryStatisticType();
    }

    /**
     * Create an instance of {@link HotspotChoiceType }
     * 
     */
    public HotspotChoiceType createHotspotChoiceType() {
        return new HotspotChoiceType();
    }

    /**
     * Create an instance of {@link AType }
     * 
     */
    public AType createAType() {
        return new AType();
    }

    /**
     * Create an instance of {@link OrderedType }
     * 
     */
    public OrderedType createOrderedType() {
        return new OrderedType();
    }

    /**
     * Create an instance of {@link PositionObjectInteractionType }
     * 
     */
    public PositionObjectInteractionType createPositionObjectInteractionType() {
        return new PositionObjectInteractionType();
    }

    /**
     * Create an instance of {@link BType }
     * 
     */
    public BType createBType() {
        return new BType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link CandidateResponseType }
     * 
     */
    public CandidateResponseType createCandidateResponseType() {
        return new CandidateResponseType();
    }

    /**
     * Create an instance of {@link OutcomeElseIfType }
     * 
     */
    public OutcomeElseIfType createOutcomeElseIfType() {
        return new OutcomeElseIfType();
    }

    /**
     * Create an instance of {@link IntegerModulusType }
     * 
     */
    public IntegerModulusType createIntegerModulusType() {
        return new IntegerModulusType();
    }

    /**
     * Create an instance of {@link IType }
     * 
     */
    public IType createIType() {
        return new IType();
    }

    /**
     * Create an instance of {@link AssessmentItem }
     * 
     */
    public AssessmentItem createAssessmentItemType() {
        return new AssessmentItem();
    }

    /**
     * Create an instance of {@link PType }
     * 
     */
    public PType createPType() {
        return new PType();
    }

    /**
     * Create an instance of {@link TdType }
     * 
     */
    public TdType createTdType() {
        return new TdType();
    }

    /**
     * Create an instance of {@link TfootType }
     * 
     */
    public TfootType createTfootType() {
        return new TfootType();
    }

    /**
     * Create an instance of {@link QType }
     * 
     */
    public QType createQType() {
        return new QType();
    }

    /**
     * Create an instance of {@link ThType }
     * 
     */
    public ThType createThType() {
        return new ThType();
    }

    /**
     * Create an instance of {@link ExtendedTextInteractionType }
     * 
     */
    public ExtendedTextInteractionType createExtendedTextInteractionType() {
        return new ExtendedTextInteractionType();
    }

    /**
     * Create an instance of {@link IsNullType }
     * 
     */
    public IsNullType createIsNullType() {
        return new IsNullType();
    }

    /**
     * Create an instance of {@link TrType }
     * 
     */
    public TrType createTrType() {
        return new TrType();
    }

    /**
     * Create an instance of {@link DdType }
     * 
     */
    public DdType createDdType() {
        return new DdType();
    }

    /**
     * Create an instance of {@link TtType }
     * 
     */
    public TtType createTtType() {
        return new TtType();
    }

    /**
     * Create an instance of {@link CorrectType }
     * 
     */
    public CorrectType createCorrectType() {
        return new CorrectType();
    }

    /**
     * Create an instance of {@link TbodyType }
     * 
     */
    public TbodyType createTbodyType() {
        return new TbodyType();
    }

    /**
     * Create an instance of {@link TemplateConditionType }
     * 
     */
    public TemplateConditionType createTemplateConditionType() {
        return new TemplateConditionType();
    }

    /**
     * Create an instance of {@link DlType }
     * 
     */
    public DlType createDlType() {
        return new DlType();
    }

    /**
     * Create an instance of {@link InsideType }
     * 
     */
    public InsideType createInsideType() {
        return new InsideType();
    }

    /**
     * Create an instance of {@link NumberPresentedType }
     * 
     */
    public NumberPresentedType createNumberPresentedType() {
        return new NumberPresentedType();
    }

    /**
     * Create an instance of {@link EqualRoundedType }
     * 
     */
    public EqualRoundedType createEqualRoundedType() {
        return new EqualRoundedType();
    }

    /**
     * Create an instance of {@link GraphicAssociateInteractionType }
     * 
     */
    public GraphicAssociateInteractionType createGraphicAssociateInteractionType() {
        return new GraphicAssociateInteractionType();
    }

    /**
     * Create an instance of {@link TemplateIfType }
     * 
     */
    public TemplateIfType createTemplateIfType() {
        return new TemplateIfType();
    }

    /**
     * Create an instance of {@link DivType }
     * 
     */
    public DivType createDivType() {
        return new DivType();
    }

    /**
     * Create an instance of {@link DtType }
     * 
     */
    public DtType createDtType() {
        return new DtType();
    }

    /**
     * Create an instance of {@link HottextInteractionType }
     * 
     */
    public HottextInteractionType createHottextInteractionType() {
        return new HottextInteractionType();
    }

    /**
     * Create an instance of {@link UlType }
     * 
     */
    public UlType createUlType() {
        return new UlType();
    }

    /**
     * Create an instance of {@link MetadataProfileType }
     * 
     */
    public MetadataProfileType createMetadataProfileType() {
        return new MetadataProfileType();
    }

    /**
     * Create an instance of {@link AssessmentItemRefType }
     * 
     */
    public AssessmentItemRefType createAssessmentItemRefType() {
        return new AssessmentItemRefType();
    }

    /**
     * Create an instance of {@link InlineChoiceType }
     * 
     */
    public InlineChoiceType createInlineChoiceType() {
        return new InlineChoiceType();
    }

    /**
     * Create an instance of {@link PreType }
     * 
     */
    public PreType createPreType() {
        return new PreType();
    }

    /**
     * Create an instance of {@link ResponseElseIfType }
     * 
     */
    public ResponseElseIfType createResponseElseIfType() {
        return new ResponseElseIfType();
    }

    /**
     * Create an instance of {@link QtiMetadataType }
     * 
     */
    public QtiMetadataType createQtiMetadataType() {
        return new QtiMetadataType();
    }

    /**
     * Create an instance of {@link EmType }
     * 
     */
    public EmType createEmType() {
        return new EmType();
    }

    /**
     * Create an instance of {@link WeightType }
     * 
     */
    public WeightType createWeightType() {
        return new WeightType();
    }

    /**
     * Create an instance of {@link SessionIdentifierType }
     * 
     */
    public SessionIdentifierType createSessionIdentifierType() {
        return new SessionIdentifierType();
    }

    /**
     * Create an instance of {@link NumberSelectedType }
     * 
     */
    public NumberSelectedType createNumberSelectedType() {
        return new NumberSelectedType();
    }

    /**
     * Create an instance of {@link SimpleMatchSetType }
     * 
     */
    public SimpleMatchSetType createSimpleMatchSetType() {
        return new SimpleMatchSetType();
    }

    /**
     * Create an instance of {@link TemplateVariableType }
     * 
     */
    public TemplateVariableType createTemplateVariableType() {
        return new TemplateVariableType();
    }

    /**
     * Create an instance of {@link SetDefaultValueType }
     * 
     */
    public SetDefaultValueType createSetDefaultValueType() {
        return new SetDefaultValueType();
    }

    /**
     * Create an instance of {@link AssociableHotspotType }
     * 
     */
    public AssociableHotspotType createAssociableHotspotType() {
        return new AssociableHotspotType();
    }

    /**
     * Create an instance of {@link OutcomeConditionType }
     * 
     */
    public OutcomeConditionType createOutcomeConditionType() {
        return new OutcomeConditionType();
    }

    /**
     * Create an instance of {@link StringMatchType }
     * 
     */
    public StringMatchType createStringMatchType() {
        return new StringMatchType();
    }

    /**
     * Create an instance of {@link TheadType }
     * 
     */
    public TheadType createTheadType() {
        return new TheadType();
    }

    /**
     * Create an instance of {@link H1Type }
     * 
     */
    public H1Type createH1Type() {
        return new H1Type();
    }

    /**
     * Create an instance of {@link H2Type }
     * 
     */
    public H2Type createH2Type() {
        return new H2Type();
    }

    /**
     * Create an instance of {@link H3Type }
     * 
     */
    public H3Type createH3Type() {
        return new H3Type();
    }

    /**
     * Create an instance of {@link H4Type }
     * 
     */
    public H4Type createH4Type() {
        return new H4Type();
    }

    /**
     * Create an instance of {@link H5Type }
     * 
     */
    public H5Type createH5Type() {
        return new H5Type();
    }

    /**
     * Create an instance of {@link H6Type }
     * 
     */
    public H6Type createH6Type() {
        return new H6Type();
    }

    /**
     * Create an instance of {@link NumberIncorrectType }
     * 
     */
    public NumberIncorrectType createNumberIncorrectType() {
        return new NumberIncorrectType();
    }

    /**
     * Create an instance of {@link ResponseProcessingType }
     * 
     */
    public ResponseProcessingType createResponseProcessingType() {
        return new ResponseProcessingType();
    }

    /**
     * Create an instance of {@link TemplateInlineType }
     * 
     */
    public TemplateInlineType createTemplateInlineType() {
        return new TemplateInlineType();
    }

    /**
     * Create an instance of {@link GapMatchInteractionType }
     * 
     */
    public GapMatchInteractionType createGapMatchInteractionType() {
        return new GapMatchInteractionType();
    }

    /**
     * Create an instance of {@link RandomType }
     * 
     */
    public RandomType createRandomType() {
        return new RandomType();
    }

    /**
     * Create an instance of {@link MapResponsePointType }
     * 
     */
    public MapResponsePointType createMapResponsePointType() {
        return new MapResponsePointType();
    }

    /**
     * Create an instance of {@link NotType }
     * 
     */
    public NotType createNotType() {
        return new NotType();
    }

    /**
     * Create an instance of {@link AssessmentSectionType }
     * 
     */
    public AssessmentSectionType createAssessmentSectionType() {
        return new AssessmentSectionType();
    }

    /**
     * Create an instance of {@link ParamType }
     * 
     */
    public ParamType createParamType() {
        return new ParamType();
    }

    /**
     * Create an instance of {@link GapType }
     * 
     */
    public GapType createGapType() {
        return new GapType();
    }

    /**
     * Create an instance of {@link ResponseElseType }
     * 
     */
    public ResponseElseType createResponseElseType() {
        return new ResponseElseType();
    }

    /**
     * Create an instance of {@link DivideType }
     * 
     */
    public DivideType createDivideType() {
        return new DivideType();
    }

    /**
     * Create an instance of {@link UploadInteractionType }
     * 
     */
    public UploadInteractionType createUploadInteractionType() {
        return new UploadInteractionType();
    }

    /**
     * Create an instance of {@link DrawingInteractionType }
     * 
     */
    public DrawingInteractionType createDrawingInteractionType() {
        return new DrawingInteractionType();
    }

    /**
     * Create an instance of {@link MatchInteractionType }
     * 
     */
    public MatchInteractionType createMatchInteractionType() {
        return new MatchInteractionType();
    }

    /**
     * Create an instance of {@link MultipleType }
     * 
     */
    public MultipleType createMultipleType() {
        return new MultipleType();
    }

    /**
     * Create an instance of {@link AssessmentTest }
     * 
     */
    public AssessmentTest createAssessmentTestType() {
        return new AssessmentTest();
    }

    /**
     * Create an instance of {@link ColgroupType }
     * 
     */
    public ColgroupType createColgroupType() {
        return new ColgroupType();
    }

    /**
     * Create an instance of {@link RandomIntegerType }
     * 
     */
    public RandomIntegerType createRandomIntegerType() {
        return new RandomIntegerType();
    }

    /**
     * Create an instance of {@link GtType }
     * 
     */
    public GtType createGtType() {
        return new GtType();
    }

    /**
     * Create an instance of {@link SetCorrectResponseType }
     * 
     */
    public SetCorrectResponseType createSetCorrectResponseType() {
        return new SetCorrectResponseType();
    }

    /**
     * Create an instance of {@link EqualType }
     * 
     */
    public EqualType createEqualType() {
        return new EqualType();
    }

    /**
     * Create an instance of {@link UsageDataType }
     * 
     */
    public UsageDataType createUsageDataType() {
        return new UsageDataType();
    }

    /**
     * Create an instance of {@link PromptType }
     * 
     */
    public PromptType createPromptType() {
        return new PromptType();
    }

    /**
     * Create an instance of {@link OutcomeElseType }
     * 
     */
    public OutcomeElseType createOutcomeElseType() {
        return new OutcomeElseType();
    }

    /**
     * Create an instance of {@link BigType }
     * 
     */
    public BigType createBigType() {
        return new BigType();
    }

    /**
     * Create an instance of {@link DefaultValueType }
     * 
     */
    public DefaultValueType createDefaultValueType() {
        return new DefaultValueType();
    }

    /**
     * Create an instance of {@link TemplateProcessingType }
     * 
     */
    public TemplateProcessingType createTemplateProcessingType() {
        return new TemplateProcessingType();
    }

    /**
     * Create an instance of {@link CaptionType }
     * 
     */
    public CaptionType createCaptionType() {
        return new CaptionType();
    }

    /**
     * Create an instance of {@link ResponseDeclarationType }
     * 
     */
    public ResponseDeclarationType createResponseDeclarationType() {
        return new ResponseDeclarationType();
    }

    /**
     * Create an instance of {@link HrType }
     * 
     */
    public HrType createHrType() {
        return new HrType();
    }

    /**
     * Create an instance of {@link MapResponseType }
     * 
     */
    public MapResponseType createMapResponseType() {
        return new MapResponseType();
    }

    /**
     * Create an instance of {@link TruncateType }
     * 
     */
    public TruncateType createTruncateType() {
        return new TruncateType();
    }

    /**
     * Create an instance of {@link InterpolationTableType }
     * 
     */
    public InterpolationTableType createInterpolationTableType() {
        return new InterpolationTableType();
    }

    /**
     * Create an instance of {@link BranchRuleType }
     * 
     */
    public BranchRuleType createBranchRuleType() {
        return new BranchRuleType();
    }

    /**
     * Create an instance of {@link ContextType }
     * 
     */
    public ContextType createContextType() {
        return new ContextType();
    }

    /**
     * Create an instance of {@link GteType }
     * 
     */
    public GteType createGteType() {
        return new GteType();
    }

    /**
     * Create an instance of {@link ResponseProcessingFragmentType }
     * 
     */
    public ResponseProcessingFragmentType createResponseProcessingFragmentType() {
        return new ResponseProcessingFragmentType();
    }

    /**
     * Create an instance of {@link SimpleAssociableChoiceType }
     * 
     */
    public SimpleAssociableChoiceType createSimpleAssociableChoiceType() {
        return new SimpleAssociableChoiceType();
    }

    /**
     * Create an instance of {@link ModalFeedbackType }
     * 
     */
    public ModalFeedbackType createModalFeedbackType() {
        return new ModalFeedbackType();
    }

    /**
     * Create an instance of {@link PreConditionType }
     * 
     */
    public PreConditionType createPreConditionType() {
        return new PreConditionType();
    }

    /**
     * Create an instance of {@link ContainerSizeType }
     * 
     */
    public ContainerSizeType createContainerSizeType() {
        return new ContainerSizeType();
    }

    /**
     * Create an instance of {@link TemplateElseType }
     * 
     */
    public TemplateElseType createTemplateElseType() {
        return new TemplateElseType();
    }

    /**
     * Create an instance of {@link TestFeedbackType }
     * 
     */
    public TestFeedbackType createTestFeedbackType() {
        return new TestFeedbackType();
    }

    /**
     * Create an instance of {@link CustomOperatorType }
     * 
     */
    public CustomOperatorType createCustomOperatorType() {
        return new CustomOperatorType();
    }

    /**
     * Create an instance of {@link StylesheetType }
     * 
     */
    public StylesheetType createStylesheetType() {
        return new StylesheetType();
    }

    /**
     * Create an instance of {@link MappingType }
     * 
     */
    public MappingType createMappingType() {
        return new MappingType();
    }

    /**
     * Create an instance of {@link PrintedVariableType }
     * 
     */
    public PrintedVariableType createPrintedVariableType() {
        return new PrintedVariableType();
    }

    /**
     * Create an instance of {@link OutcomeMinimumType }
     * 
     */
    public OutcomeMinimumType createOutcomeMinimumType() {
        return new OutcomeMinimumType();
    }

    /**
     * Create an instance of {@link SetTemplateValueType }
     * 
     */
    public SetTemplateValueType createSetTemplateValueType() {
        return new SetTemplateValueType();
    }

    /**
     * Create an instance of {@link VarType }
     * 
     */
    public VarType createVarType() {
        return new VarType();
    }

    /**
     * Create an instance of {@link OutcomeIfType }
     * 
     */
    public OutcomeIfType createOutcomeIfType() {
        return new OutcomeIfType();
    }

    /**
     * Create an instance of {@link IndexType }
     * 
     */
    public IndexType createIndexType() {
        return new IndexType();
    }

    /**
     * Create an instance of {@link OutcomeProcessingType }
     * 
     */
    public OutcomeProcessingType createOutcomeProcessingType() {
        return new OutcomeProcessingType();
    }

    /**
     * Create an instance of {@link TextEntryInteractionType }
     * 
     */
    public TextEntryInteractionType createTextEntryInteractionType() {
        return new TextEntryInteractionType();
    }

    /**
     * Create an instance of {@link InterpolationTableEntryType }
     * 
     */
    public InterpolationTableEntryType createInterpolationTableEntryType() {
        return new InterpolationTableEntryType();
    }

    /**
     * Create an instance of {@link PatternMatchType }
     * 
     */
    public PatternMatchType createPatternMatchType() {
        return new PatternMatchType();
    }

    /**
     * Create an instance of {@link CategorizedStatisticType }
     * 
     */
    public CategorizedStatisticType createCategorizedStatisticType() {
        return new CategorizedStatisticType();
    }

    /**
     * Create an instance of {@link ExitTemplateType }
     * 
     */
    public ExitTemplateType createExitTemplateType() {
        return new ExitTemplateType();
    }

    /**
     * Create an instance of {@link TestResultType }
     * 
     */
    public TestResultType createTestResultType() {
        return new TestResultType();
    }

    /**
     * Create an instance of {@link MediaInteractionType }
     * 
     */
    public MediaInteractionType createMediaInteractionType() {
        return new MediaInteractionType();
    }

    /**
     * Create an instance of {@link FieldValueType }
     * 
     */
    public FieldValueType createFieldValueType() {
        return new FieldValueType();
    }

    /**
     * Create an instance of {@link MapEntryType }
     * 
     */
    public MapEntryType createMapEntryType() {
        return new MapEntryType();
    }

    /**
     * Create an instance of {@link IntegerToFloatType }
     * 
     */
    public IntegerToFloatType createIntegerToFloatType() {
        return new IntegerToFloatType();
    }

    /**
     * Create an instance of {@link NumberRespondedType }
     * 
     */
    public NumberRespondedType createNumberRespondedType() {
        return new NumberRespondedType();
    }

    /**
     * Create an instance of {@link MemberType }
     * 
     */
    public MemberType createMemberType() {
        return new MemberType();
    }

    /**
     * Create an instance of {@link OutcomeProcessingFragmentType }
     * 
     */
    public OutcomeProcessingFragmentType createOutcomeProcessingFragmentType() {
        return new OutcomeProcessingFragmentType();
    }

    /**
     * Create an instance of {@link GapTextType }
     * 
     */
    public GapTextType createGapTextType() {
        return new GapTextType();
    }

    /**
     * Create an instance of {@link PowerType }
     * 
     */
    public PowerType createPowerType() {
        return new PowerType();
    }

    /**
     * Create an instance of {@link OrderInteractionType }
     * 
     */
    public OrderInteractionType createOrderInteractionType() {
        return new OrderInteractionType();
    }

    /**
     * Create an instance of {@link TableType }
     * 
     */
    public TableType createTableType() {
        return new TableType();
    }

    /**
     * Create an instance of {@link SelectPointInteractionType }
     * 
     */
    public SelectPointInteractionType createSelectPointInteractionType() {
        return new SelectPointInteractionType();
    }

    /**
     * Create an instance of {@link BankProfileType }
     * 
     */
    public BankProfileType createBankProfileType() {
        return new BankProfileType();
    }

    /**
     * Create an instance of {@link ProductType }
     * 
     */
    public ProductType createProductType() {
        return new ProductType();
    }

    /**
     * Create an instance of {@link DurationGTEType }
     * 
     */
    public DurationGTEType createDurationGTEType() {
        return new DurationGTEType();
    }

    /**
     * Create an instance of {@link AcronymType }
     * 
     */
    public AcronymType createAcronymType() {
        return new AcronymType();
    }

    /**
     * Create an instance of {@link CorrectResponseType }
     * 
     */
    public CorrectResponseType createCorrectResponseType() {
        return new CorrectResponseType();
    }

    /**
     * Create an instance of {@link GraphicOrderInteractionType }
     * 
     */
    public GraphicOrderInteractionType createGraphicOrderInteractionType() {
        return new GraphicOrderInteractionType();
    }

    /**
     * Create an instance of {@link HottextType }
     * 
     */
    public HottextType createHottextType() {
        return new HottextType();
    }

    /**
     * Create an instance of {@link ItemBodyType }
     * 
     */
    public ItemBodyType createItemBodyType() {
        return new ItemBodyType();
    }

    /**
     * Create an instance of {@link RubricBlockType }
     * 
     */
    public RubricBlockType createRubricBlockType() {
        return new RubricBlockType();
    }

    /**
     * Create an instance of {@link CiteType }
     * 
     */
    public CiteType createCiteType() {
        return new CiteType();
    }

    /**
     * Create an instance of {@link InlineChoiceInteractionType }
     * 
     */
    public InlineChoiceInteractionType createInlineChoiceInteractionType() {
        return new InlineChoiceInteractionType();
    }

    /**
     * Create an instance of {@link DurationLTType }
     * 
     */
    public DurationLTType createDurationLTType() {
        return new DurationLTType();
    }

    /**
     * Create an instance of {@link LiType }
     * 
     */
    public LiType createLiType() {
        return new LiType();
    }

    /**
     * Create an instance of {@link ResponseIfType }
     * 
     */
    public ResponseIfType createResponseIfType() {
        return new ResponseIfType();
    }

    /**
     * Create an instance of {@link SpanType }
     * 
     */
    public SpanType createSpanType() {
        return new SpanType();
    }

    /**
     * Create an instance of {@link MatchTableType }
     * 
     */
    public MatchTableType createMatchTableType() {
        return new MatchTableType();
    }

    /**
     * Create an instance of {@link SmallType }
     * 
     */
    public SmallType createSmallType() {
        return new SmallType();
    }

    /**
     * Create an instance of {@link ColType }
     * 
     */
    public ColType createColType() {
        return new ColType();
    }

    /**
     * Create an instance of {@link ExitResponseType }
     * 
     */
    public ExitResponseType createExitResponseType() {
        return new ExitResponseType();
    }

    /**
     * Create an instance of {@link TemplateDefaultType }
     * 
     */
    public TemplateDefaultType createTemplateDefaultType() {
        return new TemplateDefaultType();
    }

    /**
     * Create an instance of {@link NumberCorrectType }
     * 
     */
    public NumberCorrectType createNumberCorrectType() {
        return new NumberCorrectType();
    }

    /**
     * Create an instance of {@link LtType }
     * 
     */
    public LtType createLtType() {
        return new LtType();
    }

    /**
     * Create an instance of {@link ChoiceInteractionType }
     * 
     */
    public ChoiceInteractionType createChoiceInteractionType() {
        return new ChoiceInteractionType();
    }

    /**
     * Create an instance of {@link GraphicGapMatchInteractionType }
     * 
     */
    public GraphicGapMatchInteractionType createGraphicGapMatchInteractionType() {
        return new GraphicGapMatchInteractionType();
    }

    /**
     * Create an instance of {@link TemplateBlockType }
     * 
     */
    public TemplateBlockType createTemplateBlockType() {
        return new TemplateBlockType();
    }

    /**
     * Create an instance of {@link BlockquoteType }
     * 
     */
    public BlockquoteType createBlockquoteType() {
        return new BlockquoteType();
    }

    /**
     * Create an instance of {@link ItemResultType }
     * 
     */
    public ItemResultType createItemResultType() {
        return new ItemResultType();
    }

    /**
     * Create an instance of {@link ExitTestType }
     * 
     */
    public ExitTestType createExitTestType() {
        return new ExitTestType();
    }

    /**
     * Create an instance of {@link OutcomeDeclarationType }
     * 
     */
    public OutcomeDeclarationType createOutcomeDeclarationType() {
        return new OutcomeDeclarationType();
    }

    /**
     * Create an instance of {@link RandomFloatType }
     * 
     */
    public RandomFloatType createRandomFloatType() {
        return new RandomFloatType();
    }

    /**
     * Create an instance of {@link OutcomeVariableType }
     * 
     */
    public OutcomeVariableType createOutcomeVariableType() {
        return new OutcomeVariableType();
    }

    /**
     * Create an instance of {@link SetOutcomeValueType }
     * 
     */
    public SetOutcomeValueType createSetOutcomeValueType() {
        return new SetOutcomeValueType();
    }

    /**
     * Create an instance of {@link VariableMappingType }
     * 
     */
    public VariableMappingType createVariableMappingType() {
        return new VariableMappingType();
    }

    /**
     * Create an instance of {@link NullType }
     * 
     */
    public NullType createNullType() {
        return new NullType();
    }

    /**
     * Create an instance of {@link ItemSessionControlType }
     * 
     */
    public ItemSessionControlType createItemSessionControlType() {
        return new ItemSessionControlType();
    }

    /**
     * Create an instance of {@link TemplateElseIfType }
     * 
     */
    public TemplateElseIfType createTemplateElseIfType() {
        return new TemplateElseIfType();
    }

    /**
     * Create an instance of {@link AssessmentResult }
     * 
     */
    public AssessmentResult createAssessmentResultType() {
        return new AssessmentResult();
    }

    /**
     * Create an instance of {@link ImgType }
     * 
     */
    public ImgType createImgType() {
        return new ImgType();
    }

    /**
     * Create an instance of {@link TargetObjectType }
     * 
     */
    public TargetObjectType createTargetObjectType() {
        return new TargetObjectType();
    }

    /**
     * Create an instance of {@link CodeType }
     * 
     */
    public CodeType createCodeType() {
        return new CodeType();
    }

    /**
     * Create an instance of {@link IntegerDivideType }
     * 
     */
    public IntegerDivideType createIntegerDivideType() {
        return new IntegerDivideType();
    }

    /**
     * Create an instance of {@link MatchTableEntryType }
     * 
     */
    public MatchTableEntryType createMatchTableEntryType() {
        return new MatchTableEntryType();
    }

    /**
     * Create an instance of {@link DeleteType }
     * 
     */
    public DeleteType createDeleteType() {
        return new DeleteType();
    }

    /**
     * Create an instance of {@link SubstringType }
     * 
     */
    public SubstringType createSubstringType() {
        return new SubstringType();
    }

    /**
     * Create an instance of {@link AnyNType }
     * 
     */
    public AnyNType createAnyNType() {
        return new AnyNType();
    }

    /**
     * Create an instance of {@link CustomInteractionType }
     * 
     */
    public CustomInteractionType createCustomInteractionType() {
        return new CustomInteractionType();
    }

    /**
     * Create an instance of {@link AndType }
     * 
     */
    public AndType createAndType() {
        return new AndType();
    }

    /**
     * Create an instance of {@link FeedbackInlineType }
     * 
     */
    public FeedbackInlineType createFeedbackInlineType() {
        return new FeedbackInlineType();
    }

    /**
     * Create an instance of {@link TemplateDeclarationType }
     * 
     */
    public TemplateDeclarationType createTemplateDeclarationType() {
        return new TemplateDeclarationType();
    }

    /**
     * Create an instance of {@link LteType }
     * 
     */
    public LteType createLteType() {
        return new LteType();
    }

    /**
     * Create an instance of {@link OlType }
     * 
     */
    public OlType createOlType() {
        return new OlType();
    }

    /**
     * Create an instance of {@link ValueType }
     * 
     */
    public ValueType createValueType() {
        return new ValueType();
    }

    /**
     * Create an instance of {@link OrType }
     * 
     */
    public OrType createOrType() {
        return new OrType();
    }

    /**
     * Create an instance of {@link MatchType }
     * 
     */
    public MatchType createMatchType() {
        return new MatchType();
    }

    /**
     * Create an instance of {@link SliderInteractionType }
     * 
     */
    public SliderInteractionType createSliderInteractionType() {
        return new SliderInteractionType();
    }

    /**
     * Create an instance of {@link KbdType }
     * 
     */
    public KbdType createKbdType() {
        return new KbdType();
    }

    /**
     * Create an instance of {@link EndAttemptInteractionType }
     * 
     */
    public EndAttemptInteractionType createEndAttemptInteractionType() {
        return new EndAttemptInteractionType();
    }

    /**
     * Create an instance of {@link RoundType }
     * 
     */
    public RoundType createRoundType() {
        return new RoundType();
    }

    /**
     * Create an instance of {@link VariableType }
     * 
     */
    public VariableType createVariableType() {
        return new VariableType();
    }

    /**
     * Create an instance of {@link HotspotInteractionType }
     * 
     */
    public HotspotInteractionType createHotspotInteractionType() {
        return new HotspotInteractionType();
    }

    /**
     * Create an instance of {@link TimeLimitsType }
     * 
     */
    public TimeLimitsType createTimeLimitsType() {
        return new TimeLimitsType();
    }

    /**
     * Create an instance of {@link ResponseVariableType }
     * 
     */
    public ResponseVariableType createResponseVariableType() {
        return new ResponseVariableType();
    }

    /**
     * Create an instance of {@link IncludeType }
     * 
     */
    public IncludeType createIncludeType() {
        return new IncludeType();
    }

    /**
     * Create an instance of {@link FallbackType }
     * 
     */
    public FallbackType createFallbackType() {
        return new FallbackType();
    }

    /**
     * Create an instance of {@link Streetname }
     * 
     */
    public Streetname createStreetname() {
        return new Streetname();
    }

    /**
     * Create an instance of {@link Accessibility }
     * 
     */
    public Accessibility createAccessibility() {
        return new Accessibility();
    }

    /**
     * Create an instance of {@link Comment }
     * 
     */
    public Comment createComment() {
        return new Comment();
    }

    /**
     * Create an instance of {@link Contentype }
     * 
     */
    public Contentype createContentype() {
        return new Contentype();
    }

    /**
     * Create an instance of {@link Referential }
     * 
     */
    public Referential createReferential() {
        return new Referential();
    }

    /**
     * Create an instance of {@link Sourcedid }
     * 
     */
    public Sourcedid createSourcedid() {
        return new Sourcedid();
    }

    /**
     * Create an instance of {@link Temporal }
     * 
     */
    public Temporal createTemporal() {
        return new Temporal();
    }

    /**
     * Create an instance of {@link Typename }
     * 
     */
    public Typename createTypename() {
        return new Typename();
    }

    /**
     * Create an instance of {@link Tysource }
     * 
     */
    public Tysource createTysource() {
        return new Tysource();
    }

    /**
     * Create an instance of {@link Tyvalue }
     * 
     */
    public Tyvalue createTyvalue() {
        return new Tyvalue();
    }

    /**
     * Create an instance of {@link Temporalfield }
     * 
     */
    public Temporalfield createTemporalfield() {
        return new Temporalfield();
    }

    /**
     * Create an instance of {@link Fieldlabel }
     * 
     */
    public Fieldlabel createFieldlabel() {
        return new Fieldlabel();
    }

    /**
     * Create an instance of {@link Privacy }
     * 
     */
    public Privacy createPrivacy() {
        return new Privacy();
    }

    /**
     * Create an instance of {@link Privacyfield }
     * 
     */
    public Privacyfield createPrivacyfield() {
        return new Privacyfield();
    }

    /**
     * Create an instance of {@link Date }
     * 
     */
    public Date createDate() {
        return new Date();
    }

    /**
     * Create an instance of {@link Description }
     * 
     */
    public Description createDescription() {
        return new Description();
    }

    /**
     * Create an instance of {@link Short }
     * 
     */
    public Short createShort() {
        return new Short();
    }

    /**
     * Create an instance of {@link Long }
     * 
     */
    public Long createLong() {
        return new Long();
    }

    /**
     * Create an instance of {@link Full }
     * 
     */
    public Full createFull() {
        return new Full();
    }

    /**
     * Create an instance of {@link Media }
     * 
     */
    public Media createMedia() {
        return new Media();
    }

    /**
     * Create an instance of {@link Language }
     * 
     */
    public Language createLanguage() {
        return new Language();
    }

    /**
     * Create an instance of {@link Proficiency }
     * 
     */
    public Proficiency createProficiency() {
        return new Proficiency();
    }

    /**
     * Create an instance of {@link Eligibility }
     * 
     */
    public Eligibility createEligibility() {
        return new Eligibility();
    }

    /**
     * Create an instance of {@link Preference }
     * 
     */
    public Preference createPreference() {
        return new Preference();
    }

    /**
     * Create an instance of {@link Prefcode }
     * 
     */
    public Prefcode createPrefcode() {
        return new Prefcode();
    }

    /**
     * Create an instance of {@link Disability }
     * 
     */
    public Disability createDisability() {
        return new Disability();
    }

    /**
     * Create an instance of {@link Formname }
     * 
     */
    public Formname createFormname() {
        return new Formname();
    }

    /**
     * Create an instance of {@link Text }
     * 
     */
    public Text createText() {
        return new Text();
    }

    /**
     * Create an instance of {@link Aptnumsuffix }
     * 
     */
    public Aptnumsuffix createAptnumsuffix() {
        return new Aptnumsuffix();
    }

    /**
     * Create an instance of {@link Evaluation }
     * 
     */
    public Evaluation createEvaluation() {
        return new Evaluation();
    }

    /**
     * Create an instance of {@link Evalmetadata }
     * 
     */
    public Evalmetadata createEvalmetadata() {
        return new Evalmetadata();
    }

    /**
     * Create an instance of {@link Evalmetadatafield }
     * 
     */
    public Evalmetadatafield createEvalmetadatafield() {
        return new Evalmetadatafield();
    }

    /**
     * Create an instance of {@link Objectives }
     * 
     */
    public Objectives createObjectives() {
        return new Objectives();
    }

    /**
     * Create an instance of {@link Status }
     * 
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link Duration }
     * 
     */
    public Duration createDuration() {
        return new Duration();
    }

    /**
     * Create an instance of {@link Result }
     * 
     */
    public Result createResult() {
        return new Result();
    }

    /**
     * Create an instance of {@link Interpretscore }
     * 
     */
    public Interpretscore createInterpretscore() {
        return new Interpretscore();
    }

    /**
     * Create an instance of {@link Score }
     * 
     */
    public Score createScore() {
        return new Score();
    }

    /**
     * Create an instance of {@link Identification }
     * 
     */
    public Identification createIdentification() {
        return new Identification();
    }

    /**
     * Create an instance of {@link Name }
     * 
     */
    public Name createName() {
        return new Name();
    }

    /**
     * Create an instance of {@link Partname }
     * 
     */
    public Partname createPartname() {
        return new Partname();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Pobox }
     * 
     */
    public Pobox createPobox() {
        return new Pobox();
    }

    /**
     * Create an instance of {@link Street }
     * 
     */
    public Street createStreet() {
        return new Street();
    }

    /**
     * Create an instance of {@link Nonfieldedstreetaddress }
     * 
     */
    public Nonfieldedstreetaddress createNonfieldedstreetaddress() {
        return new Nonfieldedstreetaddress();
    }

    /**
     * Create an instance of {@link Complex }
     * 
     */
    public Complex createComplex() {
        return new Complex();
    }

    /**
     * Create an instance of {@link Streetnumber }
     * 
     */
    public Streetnumber createStreetnumber() {
        return new Streetnumber();
    }

    /**
     * Create an instance of {@link Streetprefix }
     * 
     */
    public Streetprefix createStreetprefix() {
        return new Streetprefix();
    }

    /**
     * Create an instance of {@link Streetype }
     * 
     */
    public Streetype createStreetype() {
        return new Streetype();
    }

    /**
     * Create an instance of {@link Streetsuffix }
     * 
     */
    public Streetsuffix createStreetsuffix() {
        return new Streetsuffix();
    }

    /**
     * Create an instance of {@link Apttype }
     * 
     */
    public Apttype createApttype() {
        return new Apttype();
    }

    /**
     * Create an instance of {@link Aptnumprefix }
     * 
     */
    public Aptnumprefix createAptnumprefix() {
        return new Aptnumprefix();
    }

    /**
     * Create an instance of {@link Aptnumber }
     * 
     */
    public Aptnumber createAptnumber() {
        return new Aptnumber();
    }

    /**
     * Create an instance of {@link Locality }
     * 
     */
    public Locality createLocality() {
        return new Locality();
    }

    /**
     * Create an instance of {@link City }
     * 
     */
    public City createCity() {
        return new City();
    }

    /**
     * Create an instance of {@link Statepr }
     * 
     */
    public Statepr createStatepr() {
        return new Statepr();
    }

    /**
     * Create an instance of {@link Region }
     * 
     */
    public Region createRegion() {
        return new Region();
    }

    /**
     * Create an instance of {@link Country }
     * 
     */
    public Country createCountry() {
        return new Country();
    }

    /**
     * Create an instance of {@link Postcode }
     * 
     */
    public Postcode createPostcode() {
        return new Postcode();
    }

    /**
     * Create an instance of {@link Timezone }
     * 
     */
    public Timezone createTimezone() {
        return new Timezone();
    }

    /**
     * Create an instance of {@link Geo }
     * 
     */
    public Geo createGeo() {
        return new Geo();
    }

    /**
     * Create an instance of {@link Contactinfo }
     * 
     */
    public Contactinfo createContactinfo() {
        return new Contactinfo();
    }

    /**
     * Create an instance of {@link Telephone }
     * 
     */
    public Telephone createTelephone() {
        return new Telephone();
    }

    /**
     * Create an instance of {@link Facsimile }
     * 
     */
    public Facsimile createFacsimile() {
        return new Facsimile();
    }

    /**
     * Create an instance of {@link Mobile }
     * 
     */
    public Mobile createMobile() {
        return new Mobile();
    }

    /**
     * Create an instance of {@link Pager }
     * 
     */
    public Pager createPager() {
        return new Pager();
    }

    /**
     * Create an instance of {@link Demographics }
     * 
     */
    public Demographics createDemographics() {
        return new Demographics();
    }

    /**
     * Create an instance of {@link Representation }
     * 
     */
    public Representation createRepresentation() {
        return new Representation();
    }

    /**
     * Create an instance of {@link Gender }
     * 
     */
    public Gender createGender() {
        return new Gender();
    }

    /**
     * Create an instance of {@link Placeofbirth }
     * 
     */
    public Placeofbirth createPlaceofbirth() {
        return new Placeofbirth();
    }

    /**
     * Create an instance of {@link Agent }
     * 
     */
    public Agent createAgent() {
        return new Agent();
    }

    /**
     * Create an instance of {@link Agentdomain }
     * 
     */
    public Agentdomain createAgentdomain() {
        return new Agentdomain();
    }

    /**
     * Create an instance of {@link Goal }
     * 
     */
    public Goal createGoal() {
        return new Goal();
    }

    /**
     * Create an instance of {@link Priority }
     * 
     */
    public Priority createPriority() {
        return new Priority();
    }

    /**
     * Create an instance of {@link Classification }
     * 
     */
    public Classification createClassification() {
        return new Classification();
    }

    /**
     * Create an instance of {@link Recformat }
     * 
     */
    public Recformat createRecformat() {
        return new Recformat();
    }

    /**
     * Create an instance of {@link Role }
     * 
     */
    public Role createRole() {
        return new Role();
    }

    /**
     * Create an instance of {@link Activity }
     * 
     */
    public Activity createActivity() {
        return new Activity();
    }

    /**
     * Create an instance of {@link Units }
     * 
     */
    public Units createUnits() {
        return new Units();
    }

    /**
     * Create an instance of {@link Unitsfield }
     * 
     */
    public Unitsfield createUnitsfield() {
        return new Unitsfield();
    }

    /**
     * Create an instance of {@link Learningactivityref }
     * 
     */
    public Learningactivityref createLearningactivityref() {
        return new Learningactivityref();
    }

    /**
     * Create an instance of {@link Definition }
     * 
     */
    public Definition createDefinition() {
        return new Definition();
    }

    /**
     * Create an instance of {@link Definitionfield }
     * 
     */
    public Definitionfield createDefinitionfield() {
        return new Definitionfield();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link Testimonial }
     * 
     */
    public Testimonial createTestimonial() {
        return new Testimonial();
    }

    /**
     * Create an instance of {@link Competency }
     * 
     */
    public Competency createCompetency() {
        return new Competency();
    }

    /**
     * Create an instance of {@link Exrefrecord }
     * 
     */
    public Exrefrecord createExrefrecord() {
        return new Exrefrecord();
    }

    /**
     * Create an instance of {@link Recdata }
     * 
     */
    public Recdata createRecdata() {
        return new Recdata();
    }

    /**
     * Create an instance of {@link Tuplerelation }
     * 
     */
    public Tuplerelation createTuplerelation() {
        return new Tuplerelation();
    }

    /**
     * Create an instance of {@link Tuple }
     * 
     */
    public Tuple createTuple() {
        return new Tuple();
    }

    /**
     * Create an instance of {@link Tuplesource }
     * 
     */
    public Tuplesource createTuplesource() {
        return new Tuplesource();
    }

    /**
     * Create an instance of {@link Tupledest }
     * 
     */
    public Tupledest createTupledest() {
        return new Tupledest();
    }

    /**
     * Create an instance of {@link Transcript }
     * 
     */
    public Transcript createTranscript() {
        return new Transcript();
    }

    /**
     * Create an instance of {@link Relationship }
     * 
     */
    public Relationship createRelationship() {
        return new Relationship();
    }

    /**
     * Create an instance of {@link Learnerinformation }
     * 
     */
    public Learnerinformation createLearnerinformation() {
        return new Learnerinformation();
    }

    /**
     * Create an instance of {@link Qcl }
     * 
     */
    public Qcl createQcl() {
        return new Qcl();
    }

    /**
     * Create an instance of {@link Title }
     * 
     */
    public Title createTitle() {
        return new Title();
    }

    /**
     * Create an instance of {@link Organization }
     * 
     */
    public Organization createOrganization() {
        return new Organization();
    }

    /**
     * Create an instance of {@link Level }
     * 
     */
    public Level createLevel() {
        return new Level();
    }

    /**
     * Create an instance of {@link Interest }
     * 
     */
    public Interest createInterest() {
        return new Interest();
    }

    /**
     * Create an instance of {@link Affiliation }
     * 
     */
    public Affiliation createAffiliation() {
        return new Affiliation();
    }

    /**
     * Create an instance of {@link Securitykey }
     * 
     */
    public Securitykey createSecuritykey() {
        return new Securitykey();
    }

    /**
     * Create an instance of {@link Keyfields }
     * 
     */
    public Keyfields createKeyfields() {
        return new Keyfields();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TableType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "table")
    public JAXBElement<TableType> createTable(TableType value) {
        return new JAXBElement<TableType>(_Table_QNAME, TableType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderInteractionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "orderInteraction")
    public JAXBElement<OrderInteractionType> createOrderInteraction(OrderInteractionType value) {
        return new JAXBElement<OrderInteractionType>(_OrderInteraction_QNAME, OrderInteractionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "power")
    public JAXBElement<PowerType> createPower(PowerType value) {
        return new JAXBElement<PowerType>(_Power_QNAME, PowerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GapTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "gapText")
    public JAXBElement<GapTextType> createGapText(GapTextType value) {
        return new JAXBElement<GapTextType>(_GapText_QNAME, GapTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutcomeProcessingFragmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "outcomeProcessingFragment")
    public JAXBElement<OutcomeProcessingFragmentType> createOutcomeProcessingFragment(OutcomeProcessingFragmentType value) {
        return new JAXBElement<OutcomeProcessingFragmentType>(_OutcomeProcessingFragment_QNAME, OutcomeProcessingFragmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MemberType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "member")
    public JAXBElement<MemberType> createMember(MemberType value) {
        return new JAXBElement<MemberType>(_Member_QNAME, MemberType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumberRespondedType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "numberResponded")
    public JAXBElement<NumberRespondedType> createNumberResponded(NumberRespondedType value) {
        return new JAXBElement<NumberRespondedType>(_NumberResponded_QNAME, NumberRespondedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntegerToFloatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "integerToFloat")
    public JAXBElement<IntegerToFloatType> createIntegerToFloat(IntegerToFloatType value) {
        return new JAXBElement<IntegerToFloatType>(_IntegerToFloat_QNAME, IntegerToFloatType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "fieldValue")
    public JAXBElement<FieldValueType> createFieldValue(FieldValueType value) {
        return new JAXBElement<FieldValueType>(_FieldValue_QNAME, FieldValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapEntryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "mapEntry")
    public JAXBElement<MapEntryType> createMapEntry(MapEntryType value) {
        return new JAXBElement<MapEntryType>(_MapEntry_QNAME, MapEntryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "ext_activity")
    public JAXBElement<Object> createExtActivity(Object value) {
        return new JAXBElement<Object>(_ExtActivity_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "regexp")
    public JAXBElement<Boolean> createRegexp(Boolean value) {
        return new JAXBElement<Boolean>(_Regexp_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpanType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "span")
    public JAXBElement<SpanType> createSpan(SpanType value) {
        return new JAXBElement<SpanType>(_Span_QNAME, SpanType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "ext_disability")
    public JAXBElement<Object> createExtDisability(Object value) {
        return new JAXBElement<Object>(_ExtDisability_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeedbackTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "feedbackType")
    public JAXBElement<FeedbackTypeType> createFeedbackType(FeedbackTypeType value) {
        return new JAXBElement<FeedbackTypeType>(_FeedbackType_QNAME, FeedbackTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LiType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "li")
    public JAXBElement<LiType> createLi(LiType value) {
        return new JAXBElement<LiType>(_Li_QNAME, LiType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseIfType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "responseIf")
    public JAXBElement<ResponseIfType> createResponseIf(ResponseIfType value) {
        return new JAXBElement<ResponseIfType>(_ResponseIf_QNAME, ResponseIfType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "id")
    public JAXBElement<String> createId(String value) {
        return new JAXBElement<String>(_Id_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "affiliationid")
    public JAXBElement<String> createAffiliationid(String value) {
        return new JAXBElement<String>(_Affiliationid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DurationLTType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "durationLT")
    public JAXBElement<DurationLTType> createDurationLT(DurationLTType value) {
        return new JAXBElement<DurationLTType>(_DurationLT_QNAME, DurationLTType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InlineChoiceInteractionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "inlineChoiceInteraction")
    public JAXBElement<InlineChoiceInteractionType> createInlineChoiceInteraction(InlineChoiceInteractionType value) {
        return new JAXBElement<InlineChoiceInteractionType>(_InlineChoiceInteraction_QNAME, InlineChoiceInteractionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CiteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "cite")
    public JAXBElement<CiteType> createCite(CiteType value) {
        return new JAXBElement<CiteType>(_Cite_QNAME, CiteType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "printedVariables")
    public JAXBElement<Boolean> createPrintedVariables(Boolean value) {
        return new JAXBElement<Boolean>(_PrintedVariables_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "evaluationid")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createEvaluationid(String value) {
        return new JAXBElement<String>(_Evaluationid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RubricBlockType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "rubricBlock")
    public JAXBElement<RubricBlockType> createRubricBlock(RubricBlockType value) {
        return new JAXBElement<RubricBlockType>(_RubricBlock_QNAME, RubricBlockType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "usageDataVocabulary")
    public JAXBElement<String> createUsageDataVocabulary(String value) {
        return new JAXBElement<String>(_UsageDataVocabulary_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "itemBody")
    public JAXBElement<ItemBodyType> createItemBody(ItemBodyType value) {
        return new JAXBElement<ItemBodyType>(_ItemBody_QNAME, ItemBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "ext_product")
    public JAXBElement<Object> createExtProduct(Object value) {
        return new JAXBElement<Object>(_ExtProduct_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HottextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "hottext")
    public JAXBElement<HottextType> createHottext(HottextType value) {
        return new JAXBElement<HottextType>(_Hottext_QNAME, HottextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GraphicOrderInteractionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "graphicOrderInteraction")
    public JAXBElement<GraphicOrderInteractionType> createGraphicOrderInteraction(GraphicOrderInteractionType value) {
        return new JAXBElement<GraphicOrderInteractionType>(_GraphicOrderInteraction_QNAME, GraphicOrderInteractionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcronymType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "acronym")
    public JAXBElement<AcronymType> createAcronym(AcronymType value) {
        return new JAXBElement<AcronymType>(_Acronym_QNAME, AcronymType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CorrectResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "correctResponse")
    public JAXBElement<CorrectResponseType> createCorrectResponse(CorrectResponseType value) {
        return new JAXBElement<CorrectResponseType>(_CorrectResponse_QNAME, CorrectResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DurationGTEType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "durationGTE")
    public JAXBElement<DurationGTEType> createDurationGTE(DurationGTEType value) {
        return new JAXBElement<DurationGTEType>(_DurationGTE_QNAME, DurationGTEType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "product")
    public JAXBElement<ProductType> createProduct(ProductType value) {
        return new JAXBElement<ProductType>(_Product_QNAME, ProductType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "rpTemplate")
    public JAXBElement<String> createRpTemplate(String value) {
        return new JAXBElement<String>(_RpTemplate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankProfileType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "bankProfile")
    public JAXBElement<BankProfileType> createBankProfile(BankProfileType value) {
        return new JAXBElement<BankProfileType>(_BankProfile_QNAME, BankProfileType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectPointInteractionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "selectPointInteraction")
    public JAXBElement<SelectPointInteractionType> createSelectPointInteraction(SelectPointInteractionType value) {
        return new JAXBElement<SelectPointInteractionType>(_SelectPointInteraction_QNAME, SelectPointInteractionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "toolName")
    public JAXBElement<String> createToolName(String value) {
        return new JAXBElement<String>(_ToolName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContainerSizeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "containerSize")
    public JAXBElement<ContainerSizeType> createContainerSize(ContainerSizeType value) {
        return new JAXBElement<ContainerSizeType>(_ContainerSize_QNAME, ContainerSizeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemplateElseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "templateElse")
    public JAXBElement<TemplateElseType> createTemplateElse(TemplateElseType value) {
        return new JAXBElement<TemplateElseType>(_TemplateElse_QNAME, TemplateElseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestFeedbackType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "testFeedback")
    public JAXBElement<TestFeedbackType> createTestFeedback(TestFeedbackType value) {
        return new JAXBElement<TestFeedbackType>(_TestFeedback_QNAME, TestFeedbackType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreConditionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "preCondition")
    public JAXBElement<PreConditionType> createPreCondition(PreConditionType value) {
        return new JAXBElement<PreConditionType>(_PreCondition_QNAME, PreConditionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModalFeedbackType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "modalFeedback")
    public JAXBElement<ModalFeedbackType> createModalFeedback(ModalFeedbackType value) {
        return new JAXBElement<ModalFeedbackType>(_ModalFeedback_QNAME, ModalFeedbackType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleAssociableChoiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "simpleAssociableChoice")
    public JAXBElement<SimpleAssociableChoiceType> createSimpleAssociableChoice(SimpleAssociableChoiceType value) {
        return new JAXBElement<SimpleAssociableChoiceType>(_SimpleAssociableChoice_QNAME, SimpleAssociableChoiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "gte")
    public JAXBElement<GteType> createGte(GteType value) {
        return new JAXBElement<GteType>(_Gte_QNAME, GteType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseProcessingFragmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "responseProcessingFragment")
    public JAXBElement<ResponseProcessingFragmentType> createResponseProcessingFragment(ResponseProcessingFragmentType value) {
        return new JAXBElement<ResponseProcessingFragmentType>(_ResponseProcessingFragment_QNAME, ResponseProcessingFragmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "ext_interest")
    public JAXBElement<Object> createExtInterest(Object value) {
        return new JAXBElement<Object>(_ExtInterest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BranchRuleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "branchRule")
    public JAXBElement<BranchRuleType> createBranchRule(BranchRuleType value) {
        return new JAXBElement<BranchRuleType>(_BranchRule_QNAME, BranchRuleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "context")
    public JAXBElement<ContextType> createContext(ContextType value) {
        return new JAXBElement<ContextType>(_Context_QNAME, ContextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "mathElement")
    public JAXBElement<Boolean> createMathElement(Boolean value) {
        return new JAXBElement<Boolean>(_MathElement_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "ext_language")
    public JAXBElement<Object> createExtLanguage(Object value) {
        return new JAXBElement<Object>(_ExtLanguage_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "ext_relationship")
    public JAXBElement<Object> createExtRelationship(Object value) {
        return new JAXBElement<Object>(_ExtRelationship_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterpolationTableType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "interpolationTable")
    public JAXBElement<InterpolationTableType> createInterpolationTable(InterpolationTableType value) {
        return new JAXBElement<InterpolationTableType>(_InterpolationTable_QNAME, InterpolationTableType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TruncateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "truncate")
    public JAXBElement<TruncateType> createTruncate(TruncateType value) {
        return new JAXBElement<TruncateType>(_Truncate_QNAME, TruncateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "mapResponse")
    public JAXBElement<MapResponseType> createMapResponse(MapResponseType value) {
        return new JAXBElement<MapResponseType>(_MapResponse_QNAME, MapResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "hr")
    public JAXBElement<HrType> createHr(HrType value) {
        return new JAXBElement<HrType>(_Hr_QNAME, HrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "rubric")
    public JAXBElement<Boolean> createRubric(Boolean value) {
        return new JAXBElement<Boolean>(_Rubric_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CaptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "caption")
    public JAXBElement<CaptionType> createCaption(CaptionType value) {
        return new JAXBElement<CaptionType>(_Caption_QNAME, CaptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseDeclarationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "responseDeclaration")
    public JAXBElement<ResponseDeclarationType> createResponseDeclaration(ResponseDeclarationType value) {
        return new JAXBElement<ResponseDeclarationType>(_ResponseDeclaration_QNAME, ResponseDeclarationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "ext_goal")
    public JAXBElement<Object> createExtGoal(Object value) {
        return new JAXBElement<Object>(_ExtGoal_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemplateProcessingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "templateProcessing")
    public JAXBElement<TemplateProcessingType> createTemplateProcessing(TemplateProcessingType value) {
        return new JAXBElement<TemplateProcessingType>(_TemplateProcessing_QNAME, TemplateProcessingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DefaultValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "defaultValue")
    public JAXBElement<DefaultValueType> createDefaultValue(DefaultValueType value) {
        return new JAXBElement<DefaultValueType>(_DefaultValue_QNAME, DefaultValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "big")
    public JAXBElement<BigType> createBig(BigType value) {
        return new JAXBElement<BigType>(_Big_QNAME, BigType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaInteractionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "mediaInteraction")
    public JAXBElement<MediaInteractionType> createMediaInteraction(MediaInteractionType value) {
        return new JAXBElement<MediaInteractionType>(_MediaInteraction_QNAME, MediaInteractionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "ext_competency")
    public JAXBElement<Object> createExtCompetency(Object value) {
        return new JAXBElement<Object>(_ExtCompetency_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "testResult")
    public JAXBElement<TestResultType> createTestResult(TestResultType value) {
        return new JAXBElement<TestResultType>(_TestResult_QNAME, TestResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExitTemplateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "exitTemplate")
    public JAXBElement<ExitTemplateType> createExitTemplate(ExitTemplateType value) {
        return new JAXBElement<ExitTemplateType>(_ExitTemplate_QNAME, ExitTemplateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategorizedStatisticType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "categorizedStatistic")
    public JAXBElement<CategorizedStatisticType> createCategorizedStatistic(CategorizedStatisticType value) {
        return new JAXBElement<CategorizedStatisticType>(_CategorizedStatistic_QNAME, CategorizedStatisticType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PatternMatchType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "patternMatch")
    public JAXBElement<PatternMatchType> createPatternMatch(PatternMatchType value) {
        return new JAXBElement<PatternMatchType>(_PatternMatch_QNAME, PatternMatchType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterpolationTableEntryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "interpolationTableEntry")
    public JAXBElement<InterpolationTableEntryType> createInterpolationTableEntry(InterpolationTableEntryType value) {
        return new JAXBElement<InterpolationTableEntryType>(_InterpolationTableEntry_QNAME, InterpolationTableEntryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "web")
    public JAXBElement<String> createWeb(String value) {
        return new JAXBElement<String>(_Web_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "ext_qcl")
    public JAXBElement<Object> createExtQcl(Object value) {
        return new JAXBElement<Object>(_ExtQcl_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "lon")
    public JAXBElement<String> createLon(String value) {
        return new JAXBElement<String>(_Lon_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "areacode")
    public JAXBElement<String> createAreacode(String value) {
        return new JAXBElement<String>(_Areacode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndexType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "index")
    public JAXBElement<IndexType> createIndex(IndexType value) {
        return new JAXBElement<IndexType>(_Index_QNAME, IndexType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutcomeProcessingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "outcomeProcessing")
    public JAXBElement<OutcomeProcessingType> createOutcomeProcessing(OutcomeProcessingType value) {
        return new JAXBElement<OutcomeProcessingType>(_OutcomeProcessing_QNAME, OutcomeProcessingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextEntryInteractionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "textEntryInteraction")
    public JAXBElement<TextEntryInteractionType> createTextEntryInteraction(TextEntryInteractionType value) {
        return new JAXBElement<TextEntryInteractionType>(_TextEntryInteraction_QNAME, TextEntryInteractionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutcomeIfType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "outcomeIf")
    public JAXBElement<OutcomeIfType> createOutcomeIf(OutcomeIfType value) {
        return new JAXBElement<OutcomeIfType>(_OutcomeIf_QNAME, OutcomeIfType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "templates")
    public JAXBElement<Boolean> createTemplates(Boolean value) {
        return new JAXBElement<Boolean>(_Templates_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutcomeMinimumType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "outcomeMinimum")
    public JAXBElement<OutcomeMinimumType> createOutcomeMinimum(OutcomeMinimumType value) {
        return new JAXBElement<OutcomeMinimumType>(_OutcomeMinimum_QNAME, OutcomeMinimumType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetTemplateValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "setTemplateValue")
    public JAXBElement<SetTemplateValueType> createSetTemplateValue(SetTemplateValueType value) {
        return new JAXBElement<SetTemplateValueType>(_SetTemplateValue_QNAME, SetTemplateValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VarType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "var")
    public JAXBElement<VarType> createVar(VarType value) {
        return new JAXBElement<VarType>(_Var_QNAME, VarType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MappingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "mapping")
    public JAXBElement<MappingType> createMapping(MappingType value) {
        return new JAXBElement<MappingType>(_Mapping_QNAME, MappingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintedVariableType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "printedVariable")
    public JAXBElement<PrintedVariableType> createPrintedVariable(PrintedVariableType value) {
        return new JAXBElement<PrintedVariableType>(_PrintedVariable_QNAME, PrintedVariableType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomOperatorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "customOperator")
    public JAXBElement<CustomOperatorType> createCustomOperator(CustomOperatorType value) {
        return new JAXBElement<CustomOperatorType>(_CustomOperator_QNAME, CustomOperatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StylesheetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "stylesheet")
    public JAXBElement<StylesheetType> createStylesheet(StylesheetType value) {
        return new JAXBElement<StylesheetType>(_Stylesheet_QNAME, StylesheetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "ol")
    public JAXBElement<OlType> createOl(OlType value) {
        return new JAXBElement<OlType>(_Ol_QNAME, OlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "value")
    public JAXBElement<ValueType> createValue(ValueType value) {
        return new JAXBElement<ValueType>(_Value_QNAME, ValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "lte")
    public JAXBElement<LteType> createLte(LteType value) {
        return new JAXBElement<LteType>(_Lte_QNAME, LteType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeedbackInlineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "feedbackInline")
    public JAXBElement<FeedbackInlineType> createFeedbackInline(FeedbackInlineType value) {
        return new JAXBElement<FeedbackInlineType>(_FeedbackInline_QNAME, FeedbackInlineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemplateDeclarationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "templateDeclaration")
    public JAXBElement<TemplateDeclarationType> createTemplateDeclaration(TemplateDeclarationType value) {
        return new JAXBElement<TemplateDeclarationType>(_TemplateDeclaration_QNAME, TemplateDeclarationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AndType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "and")
    public JAXBElement<AndType> createAnd(AndType value) {
        return new JAXBElement<AndType>(_And_QNAME, AndType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomInteractionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "customInteraction")
    public JAXBElement<CustomInteractionType> createCustomInteraction(CustomInteractionType value) {
        return new JAXBElement<CustomInteractionType>(_CustomInteraction_QNAME, CustomInteractionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnyNType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "anyN")
    public JAXBElement<AnyNType> createAnyN(AnyNType value) {
        return new JAXBElement<AnyNType>(_AnyN_QNAME, AnyNType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubstringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "substring")
    public JAXBElement<SubstringType> createSubstring(SubstringType value) {
        return new JAXBElement<SubstringType>(_Substring_QNAME, SubstringType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "delete")
    public JAXBElement<DeleteType> createDelete(DeleteType value) {
        return new JAXBElement<DeleteType>(_Delete_QNAME, DeleteType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntegerDivideType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "integerDivide")
    public JAXBElement<IntegerDivideType> createIntegerDivide(IntegerDivideType value) {
        return new JAXBElement<IntegerDivideType>(_IntegerDivide_QNAME, IntegerDivideType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MatchTableEntryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "matchTableEntry")
    public JAXBElement<MatchTableEntryType> createMatchTableEntry(MatchTableEntryType value) {
        return new JAXBElement<MatchTableEntryType>(_MatchTableEntry_QNAME, MatchTableEntryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "code")
    public JAXBElement<CodeType> createCode(CodeType value) {
        return new JAXBElement<CodeType>(_Code_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImgType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "img")
    public JAXBElement<ImgType> createImg(ImgType value) {
        return new JAXBElement<ImgType>(_Img_QNAME, ImgType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TargetObjectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "targetObject")
    public JAXBElement<TargetObjectType> createTargetObject(TargetObjectType value) {
        return new JAXBElement<TargetObjectType>(_TargetObject_QNAME, TargetObjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "assessmentResult")
    public JAXBElement<AssessmentResult> createAssessmentResult(AssessmentResult value) {
        return new JAXBElement<AssessmentResult>(_AssessmentResult_QNAME, AssessmentResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemplateElseIfType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "templateElseIf")
    public JAXBElement<TemplateElseIfType> createTemplateElseIf(TemplateElseIfType value) {
        return new JAXBElement<TemplateElseIfType>(_TemplateElseIf_QNAME, TemplateElseIfType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseVariableType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "responseVariable")
    public JAXBElement<ResponseVariableType> createResponseVariable(ResponseVariableType value) {
        return new JAXBElement<ResponseVariableType>(_ResponseVariable_QNAME, ResponseVariableType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotspotInteractionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "hotspotInteraction")
    public JAXBElement<HotspotInteractionType> createHotspotInteraction(HotspotInteractionType value) {
        return new JAXBElement<HotspotInteractionType>(_HotspotInteraction_QNAME, HotspotInteractionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeLimitsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "timeLimits")
    public JAXBElement<TimeLimitsType> createTimeLimits(TimeLimitsType value) {
        return new JAXBElement<TimeLimitsType>(_TimeLimits_QNAME, TimeLimitsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "lat")
    public JAXBElement<String> createLat(String value) {
        return new JAXBElement<String>(_Lat_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VariableType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "variable")
    public JAXBElement<VariableType> createVariable(VariableType value) {
        return new JAXBElement<VariableType>(_Variable_QNAME, VariableType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "datetime")
    public JAXBElement<XMLGregorianCalendar> createDatetime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_Datetime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "extnumber")
    public JAXBElement<String> createExtnumber(String value) {
        return new JAXBElement<String>(_Extnumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoundType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "round")
    public JAXBElement<RoundType> createRound(RoundType value) {
        return new JAXBElement<RoundType>(_Round_QNAME, RoundType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndAttemptInteractionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "endAttemptInteraction")
    public JAXBElement<EndAttemptInteractionType> createEndAttemptInteraction(EndAttemptInteractionType value) {
        return new JAXBElement<EndAttemptInteractionType>(_EndAttemptInteraction_QNAME, EndAttemptInteractionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KbdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "kbd")
    public JAXBElement<KbdType> createKbd(KbdType value) {
        return new JAXBElement<KbdType>(_Kbd_QNAME, KbdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SliderInteractionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "sliderInteraction")
    public JAXBElement<SliderInteractionType> createSliderInteraction(SliderInteractionType value) {
        return new JAXBElement<SliderInteractionType>(_SliderInteraction_QNAME, SliderInteractionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MatchType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "match")
    public JAXBElement<MatchType> createMatch(MatchType value) {
        return new JAXBElement<MatchType>(_Match_QNAME, MatchType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "or")
    public JAXBElement<OrType> createOr(OrType value) {
        return new JAXBElement<OrType>(_Or_QNAME, OrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemplateBlockType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "templateBlock")
    public JAXBElement<TemplateBlockType> createTemplateBlock(TemplateBlockType value) {
        return new JAXBElement<TemplateBlockType>(_TemplateBlock_QNAME, TemplateBlockType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "ext_preference")
    public JAXBElement<Object> createExtPreference(Object value) {
        return new JAXBElement<Object>(_ExtPreference_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChoiceInteractionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "choiceInteraction")
    public JAXBElement<ChoiceInteractionType> createChoiceInteraction(ChoiceInteractionType value) {
        return new JAXBElement<ChoiceInteractionType>(_ChoiceInteraction_QNAME, ChoiceInteractionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GraphicGapMatchInteractionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "graphicGapMatchInteraction")
    public JAXBElement<GraphicGapMatchInteractionType> createGraphicGapMatchInteraction(GraphicGapMatchInteractionType value) {
        return new JAXBElement<GraphicGapMatchInteractionType>(_GraphicGapMatchInteraction_QNAME, GraphicGapMatchInteractionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "ext_affiliation")
    public JAXBElement<Object> createExtAffiliation(Object value) {
        return new JAXBElement<Object>(_ExtAffiliation_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "lt")
    public JAXBElement<LtType> createLt(LtType value) {
        return new JAXBElement<LtType>(_Lt_QNAME, LtType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumberCorrectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "numberCorrect")
    public JAXBElement<NumberCorrectType> createNumberCorrect(NumberCorrectType value) {
        return new JAXBElement<NumberCorrectType>(_NumberCorrect_QNAME, NumberCorrectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemplateDefaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "templateDefault")
    public JAXBElement<TemplateDefaultType> createTemplateDefault(TemplateDefaultType value) {
        return new JAXBElement<TemplateDefaultType>(_TemplateDefault_QNAME, TemplateDefaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExitResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "exitResponse")
    public JAXBElement<ExitResponseType> createExitResponse(ExitResponseType value) {
        return new JAXBElement<ExitResponseType>(_ExitResponse_QNAME, ExitResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ColType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "col")
    public JAXBElement<ColType> createCol(ColType value) {
        return new JAXBElement<ColType>(_Col_QNAME, ColType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MatchTableType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "matchTable")
    public JAXBElement<MatchTableType> createMatchTable(MatchTableType value) {
        return new JAXBElement<MatchTableType>(_MatchTable_QNAME, MatchTableType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmallType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "small")
    public JAXBElement<SmallType> createSmall(SmallType value) {
        return new JAXBElement<SmallType>(_Small_QNAME, SmallType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemSessionControlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "itemSessionControl")
    public JAXBElement<ItemSessionControlType> createItemSessionControl(ItemSessionControlType value) {
        return new JAXBElement<ItemSessionControlType>(_ItemSessionControl_QNAME, ItemSessionControlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "hypertextElement")
    public JAXBElement<Boolean> createHypertextElement(Boolean value) {
        return new JAXBElement<Boolean>(_HypertextElement_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "ext_objectives")
    public JAXBElement<Object> createExtObjectives(Object value) {
        return new JAXBElement<Object>(_ExtObjectives_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NullType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "null")
    public JAXBElement<NullType> createNull(NullType value) {
        return new JAXBElement<NullType>(_Null_QNAME, NullType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetOutcomeValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "setOutcomeValue")
    public JAXBElement<SetOutcomeValueType> createSetOutcomeValue(SetOutcomeValueType value) {
        return new JAXBElement<SetOutcomeValueType>(_SetOutcomeValue_QNAME, SetOutcomeValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VariableMappingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "variableMapping")
    public JAXBElement<VariableMappingType> createVariableMapping(VariableMappingType value) {
        return new JAXBElement<VariableMappingType>(_VariableMapping_QNAME, VariableMappingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutcomeVariableType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "outcomeVariable")
    public JAXBElement<OutcomeVariableType> createOutcomeVariable(OutcomeVariableType value) {
        return new JAXBElement<OutcomeVariableType>(_OutcomeVariable_QNAME, OutcomeVariableType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RandomFloatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "randomFloat")
    public JAXBElement<RandomFloatType> createRandomFloat(RandomFloatType value) {
        return new JAXBElement<RandomFloatType>(_RandomFloat_QNAME, RandomFloatType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "listElements")
    public JAXBElement<Boolean> createListElements(Boolean value) {
        return new JAXBElement<Boolean>(_ListElements_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "imageElement")
    public JAXBElement<Boolean> createImageElement(Boolean value) {
        return new JAXBElement<Boolean>(_ImageElement_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExitTestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "exitTest")
    public JAXBElement<ExitTestType> createExitTest(ExitTestType value) {
        return new JAXBElement<ExitTestType>(_ExitTest_QNAME, ExitTestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutcomeDeclarationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "outcomeDeclaration")
    public JAXBElement<OutcomeDeclarationType> createOutcomeDeclaration(OutcomeDeclarationType value) {
        return new JAXBElement<OutcomeDeclarationType>(_OutcomeDeclaration_QNAME, OutcomeDeclarationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BlockquoteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "blockquote")
    public JAXBElement<BlockquoteType> createBlockquote(BlockquoteType value) {
        return new JAXBElement<BlockquoteType>(_Blockquote_QNAME, BlockquoteType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "itemResult")
    public JAXBElement<ItemResultType> createItemResult(ItemResultType value) {
        return new JAXBElement<ItemResultType>(_ItemResult_QNAME, ItemResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "ext_eligibility")
    public JAXBElement<Object> createExtEligibility(Object value) {
        return new JAXBElement<Object>(_ExtEligibility_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "imsmd")
    public JAXBElement<Boolean> createImsmd(Boolean value) {
        return new JAXBElement<Boolean>(_Imsmd_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "ext_learnerinfo")
    public JAXBElement<Object> createExtLearnerinfo(Object value) {
        return new JAXBElement<Object>(_ExtLearnerinfo_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "presentationElements")
    public JAXBElement<Boolean> createPresentationElements(Boolean value) {
        return new JAXBElement<Boolean>(_PresentationElements_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotspotChoiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "hotspotChoice")
    public JAXBElement<HotspotChoiceType> createHotspotChoice(HotspotChoiceType value) {
        return new JAXBElement<HotspotChoiceType>(_HotspotChoice_QNAME, HotspotChoiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "timeDependent")
    public JAXBElement<Boolean> createTimeDependent(Boolean value) {
        return new JAXBElement<Boolean>(_TimeDependent_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrdinaryStatisticType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "ordinaryStatistic")
    public JAXBElement<OrdinaryStatisticType> createOrdinaryStatistic(OrdinaryStatisticType value) {
        return new JAXBElement<OrdinaryStatisticType>(_OrdinaryStatistic_QNAME, OrdinaryStatisticType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AreaMappingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "areaMapping")
    public JAXBElement<AreaMappingType> createAreaMapping(AreaMappingType value) {
        return new JAXBElement<AreaMappingType>(_AreaMapping_QNAME, AreaMappingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssociateInteractionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "associateInteraction")
    public JAXBElement<AssociateInteractionType> createAssociateInteraction(AssociateInteractionType value) {
        return new JAXBElement<AssociateInteractionType>(_AssociateInteraction_QNAME, AssociateInteractionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DefaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "default")
    public JAXBElement<DefaultType> createDefault(DefaultType value) {
        return new JAXBElement<DefaultType>(_Default_QNAME, DefaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "adaptive")
    public JAXBElement<Boolean> createAdaptive(Boolean value) {
        return new JAXBElement<Boolean>(_Adaptive_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "ext_securitykey")
    public JAXBElement<Object> createExtSecuritykey(Object value) {
        return new JAXBElement<Object>(_ExtSecuritykey_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "br")
    public JAXBElement<BrType> createBr(BrType value) {
        return new JAXBElement<BrType>(_Br_QNAME, BrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "sup")
    public JAXBElement<SupType> createSup(SupType value) {
        return new JAXBElement<SupType>(_Sup_QNAME, SupType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentProfileType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "contentProfile")
    public JAXBElement<ContentProfileType> createContentProfile(ContentProfileType value) {
        return new JAXBElement<ContentProfileType>(_ContentProfile_QNAME, ContentProfileType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "sum")
    public JAXBElement<SumType> createSum(SumType value) {
        return new JAXBElement<SumType>(_Sum_QNAME, SumType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "ordering")
    public JAXBElement<OrderingType> createOrdering(OrderingType value) {
        return new JAXBElement<OrderingType>(_Ordering_QNAME, OrderingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "agentid")
    public JAXBElement<String> createAgentid(String value) {
        return new JAXBElement<String>(_Agentid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SampType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "samp")
    public JAXBElement<SampType> createSamp(SampType value) {
        return new JAXBElement<SampType>(_Samp_QNAME, SampType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GapImgType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "gapImg")
    public JAXBElement<GapImgType> createGapImg(GapImgType value) {
        return new JAXBElement<GapImgType>(_GapImg_QNAME, GapImgType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrongType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "strong")
    public JAXBElement<StrongType> createStrong(StrongType value) {
        return new JAXBElement<StrongType>(_Strong_QNAME, StrongType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "sub")
    public JAXBElement<SubType> createSub(SubType value) {
        return new JAXBElement<SubType>(_Sub_QNAME, SubType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "imsqtimd")
    public JAXBElement<Boolean> createImsqtimd(Boolean value) {
        return new JAXBElement<Boolean>(_Imsqtimd_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "tr")
    public JAXBElement<TrType> createTr(TrType value) {
        return new JAXBElement<TrType>(_Tr_QNAME, TrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsNullType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "isNull")
    public JAXBElement<IsNullType> createIsNull(IsNullType value) {
        return new JAXBElement<IsNullType>(_IsNull_QNAME, IsNullType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedTextInteractionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "extendedTextInteraction")
    public JAXBElement<ExtendedTextInteractionType> createExtendedTextInteraction(ExtendedTextInteractionType value) {
        return new JAXBElement<ExtendedTextInteractionType>(_ExtendedTextInteraction_QNAME, ExtendedTextInteractionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "ext_date")
    public JAXBElement<Object> createExtDate(Object value) {
        return new JAXBElement<Object>(_ExtDate_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "tableElements")
    public JAXBElement<Boolean> createTableElements(Boolean value) {
        return new JAXBElement<Boolean>(_TableElements_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "th")
    public JAXBElement<ThType> createTh(ThType value) {
        return new JAXBElement<ThType>(_Th_QNAME, ThType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "solutionAvailable")
    public JAXBElement<Boolean> createSolutionAvailable(Boolean value) {
        return new JAXBElement<Boolean>(_SolutionAvailable_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "q")
    public JAXBElement<QType> createQ(QType value) {
        return new JAXBElement<QType>(_Q_QNAME, QType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "toolVersion")
    public JAXBElement<String> createToolVersion(String value) {
        return new JAXBElement<String>(_ToolVersion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "registrationno")
    public JAXBElement<String> createRegistrationno(String value) {
        return new JAXBElement<String>(_Registrationno_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "p")
    public JAXBElement<PType> createP(PType value) {
        return new JAXBElement<PType>(_P_QNAME, PType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "td")
    public JAXBElement<TdType> createTd(TdType value) {
        return new JAXBElement<TdType>(_Td_QNAME, TdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TfootType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "tfoot")
    public JAXBElement<TfootType> createTfoot(TfootType value) {
        return new JAXBElement<TfootType>(_Tfoot_QNAME, TfootType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "assessmentItem")
    public JAXBElement<AssessmentItem> createAssessmentItem(AssessmentItem value) {
        return new JAXBElement<AssessmentItem>(_AssessmentItem_QNAME, AssessmentItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "i")
    public JAXBElement<IType> createI(IType value) {
        return new JAXBElement<IType>(_I_QNAME, IType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "rounding")
    public JAXBElement<Boolean> createRounding(Boolean value) {
        return new JAXBElement<Boolean>(_Rounding_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntegerModulusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "integerModulus")
    public JAXBElement<IntegerModulusType> createIntegerModulus(IntegerModulusType value) {
        return new JAXBElement<IntegerModulusType>(_IntegerModulus_QNAME, IntegerModulusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutcomeElseIfType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "outcomeElseIf")
    public JAXBElement<OutcomeElseIfType> createOutcomeElseIf(OutcomeElseIfType value) {
        return new JAXBElement<OutcomeElseIfType>(_OutcomeElseIf_QNAME, OutcomeElseIfType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CandidateResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "candidateResponse")
    public JAXBElement<CandidateResponseType> createCandidateResponse(CandidateResponseType value) {
        return new JAXBElement<CandidateResponseType>(_CandidateResponse_QNAME, CandidateResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "address")
    public JAXBElement<AddressType> createAddress(AddressType value) {
        return new JAXBElement<AddressType>(_Address_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "b")
    public JAXBElement<BType> createB(BType value) {
        return new JAXBElement<BType>(_B_QNAME, BType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "a")
    public JAXBElement<AType> createA(AType value) {
        return new JAXBElement<AType>(_A_QNAME, AType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderedType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "ordered")
    public JAXBElement<OrderedType> createOrdered(OrderedType value) {
        return new JAXBElement<OrderedType>(_Ordered_QNAME, OrderedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PositionObjectInteractionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "positionObjectInteraction")
    public JAXBElement<PositionObjectInteractionType> createPositionObjectInteraction(PositionObjectInteractionType value) {
        return new JAXBElement<PositionObjectInteractionType>(_PositionObjectInteraction_QNAME, PositionObjectInteractionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbbrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "abbr")
    public JAXBElement<AbbrType> createAbbr(AbbrType value) {
        return new JAXBElement<AbbrType>(_Abbr_QNAME, AbbrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "ext_identification")
    public JAXBElement<Object> createExtIdentification(Object value) {
        return new JAXBElement<Object>(_ExtIdentification_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "mathVariable")
    public JAXBElement<Boolean> createMathVariable(Boolean value) {
        return new JAXBElement<Boolean>(_MathVariable_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseConditionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "responseCondition")
    public JAXBElement<ResponseConditionType> createResponseCondition(ResponseConditionType value) {
        return new JAXBElement<ResponseConditionType>(_ResponseCondition_QNAME, ResponseConditionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "ext_testimonial")
    public JAXBElement<Object> createExtTestimonial(Object value) {
        return new JAXBElement<Object>(_ExtTestimonial_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "composite")
    public JAXBElement<Boolean> createComposite(Boolean value) {
        return new JAXBElement<Boolean>(_Composite_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleChoiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "simpleChoice")
    public JAXBElement<SimpleChoiceType> createSimpleChoice(SimpleChoiceType value) {
        return new JAXBElement<SimpleChoiceType>(_SimpleChoice_QNAME, SimpleChoiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "baseValue")
    public JAXBElement<BaseValueType> createBaseValue(BaseValueType value) {
        return new JAXBElement<BaseValueType>(_BaseValue_QNAME, BaseValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "feedbackIntegrated")
    public JAXBElement<Boolean> createFeedbackIntegrated(Boolean value) {
        return new JAXBElement<Boolean>(_FeedbackIntegrated_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutcomeMaximumType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "outcomeMaximum")
    public JAXBElement<OutcomeMaximumType> createOutcomeMaximum(OutcomeMaximumType value) {
        return new JAXBElement<OutcomeMaximumType>(_OutcomeMaximum_QNAME, OutcomeMaximumType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "noofattempts")
    public JAXBElement<BigInteger> createNoofattempts(BigInteger value) {
        return new JAXBElement<BigInteger>(_Noofattempts_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "responseRules")
    public JAXBElement<Boolean> createResponseRules(Boolean value) {
        return new JAXBElement<Boolean>(_ResponseRules_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "ext_evaluation")
    public JAXBElement<Object> createExtEvaluation(Object value) {
        return new JAXBElement<Object>(_ExtEvaluation_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AreaMapEntryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "areaMapEntry")
    public JAXBElement<AreaMapEntryType> createAreaMapEntry(AreaMapEntryType value) {
        return new JAXBElement<AreaMapEntryType>(_AreaMapEntry_QNAME, AreaMapEntryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestPartType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "testPart")
    public JAXBElement<TestPartType> createTestPart(TestPartType value) {
        return new JAXBElement<TestPartType>(_TestPart_QNAME, TestPartType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestVariablesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "testVariables")
    public JAXBElement<TestVariablesType> createTestVariables(TestVariablesType value) {
        return new JAXBElement<TestVariablesType>(_TestVariables_QNAME, TestVariablesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "itemTemplate")
    public JAXBElement<Boolean> createItemTemplate(Boolean value) {
        return new JAXBElement<Boolean>(_ItemTemplate_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PositionObjectStageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "positionObjectStage")
    public JAXBElement<PositionObjectStageType> createPositionObjectStage(PositionObjectStageType value) {
        return new JAXBElement<PositionObjectStageType>(_PositionObjectStage_QNAME, PositionObjectStageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LookupOutcomeValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "lookupOutcomeValue")
    public JAXBElement<LookupOutcomeValueType> createLookupOutcomeValue(LookupOutcomeValueType value) {
        return new JAXBElement<LookupOutcomeValueType>(_LookupOutcomeValue_QNAME, LookupOutcomeValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "object")
    public JAXBElement<ObjectType> createObject(ObjectType value) {
        return new JAXBElement<ObjectType>(_Object_QNAME, ObjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "toolVendor")
    public JAXBElement<String> createToolVendor(String value) {
        return new JAXBElement<String>(_ToolVendor_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "email")
    public JAXBElement<String> createEmail(String value) {
        return new JAXBElement<String>(_Email_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "uid")
    public JAXBElement<String> createUid(String value) {
        return new JAXBElement<String>(_Uid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "selection")
    public JAXBElement<SelectionType> createSelection(SelectionType value) {
        return new JAXBElement<SelectionType>(_Selection_QNAME, SelectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContainsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "contains")
    public JAXBElement<ContainsType> createContains(ContainsType value) {
        return new JAXBElement<ContainsType>(_Contains_QNAME, ContainsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DfnType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "dfn")
    public JAXBElement<DfnType> createDfn(DfnType value) {
        return new JAXBElement<DfnType>(_Dfn_QNAME, DfnType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubtractType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "subtract")
    public JAXBElement<SubtractType> createSubtract(SubtractType value) {
        return new JAXBElement<SubtractType>(_Subtract_QNAME, SubtractType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeedbackBlockType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "feedbackBlock")
    public JAXBElement<FeedbackBlockType> createFeedbackBlock(FeedbackBlockType value) {
        return new JAXBElement<FeedbackBlockType>(_FeedbackBlock_QNAME, FeedbackBlockType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncludeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XInclude", name = "include")
    public JAXBElement<IncludeType> createInclude(IncludeType value) {
        return new JAXBElement<IncludeType>(_Include_QNAME, IncludeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "indexid")
    public JAXBElement<String> createIndexid(String value) {
        return new JAXBElement<String>(_Indexid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "ext_transcript")
    public JAXBElement<Object> createExtTranscript(Object value) {
        return new JAXBElement<Object>(_ExtTranscript_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadInteractionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "uploadInteraction")
    public JAXBElement<UploadInteractionType> createUploadInteraction(UploadInteractionType value) {
        return new JAXBElement<UploadInteractionType>(_UploadInteraction_QNAME, UploadInteractionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivideType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "divide")
    public JAXBElement<DivideType> createDivide(DivideType value) {
        return new JAXBElement<DivideType>(_Divide_QNAME, DivideType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseElseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "responseElse")
    public JAXBElement<ResponseElseType> createResponseElse(ResponseElseType value) {
        return new JAXBElement<ResponseElseType>(_ResponseElse_QNAME, ResponseElseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "contentref")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createContentref(String value) {
        return new JAXBElement<String>(_Contentref_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GapType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "gap")
    public JAXBElement<GapType> createGap(GapType value) {
        return new JAXBElement<GapType>(_Gap_QNAME, GapType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParamType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "param")
    public JAXBElement<ParamType> createParam(ParamType value) {
        return new JAXBElement<ParamType>(_Param_QNAME, ParamType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentSectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "assessmentSection")
    public JAXBElement<AssessmentSectionType> createAssessmentSection(AssessmentSectionType value) {
        return new JAXBElement<AssessmentSectionType>(_AssessmentSection_QNAME, AssessmentSectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapResponsePointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "mapResponsePoint")
    public JAXBElement<MapResponsePointType> createMapResponsePoint(MapResponsePointType value) {
        return new JAXBElement<MapResponsePointType>(_MapResponsePoint_QNAME, MapResponsePointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "not")
    public JAXBElement<NotType> createNot(NotType value) {
        return new JAXBElement<NotType>(_Not_QNAME, NotType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GapMatchInteractionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "gapMatchInteraction")
    public JAXBElement<GapMatchInteractionType> createGapMatchInteraction(GapMatchInteractionType value) {
        return new JAXBElement<GapMatchInteractionType>(_GapMatchInteraction_QNAME, GapMatchInteractionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RandomType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "random")
    public JAXBElement<RandomType> createRandom(RandomType value) {
        return new JAXBElement<RandomType>(_Random_QNAME, RandomType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseProcessingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "responseProcessing")
    public JAXBElement<ResponseProcessingType> createResponseProcessing(ResponseProcessingType value) {
        return new JAXBElement<ResponseProcessingType>(_ResponseProcessing_QNAME, ResponseProcessingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemplateInlineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "templateInline")
    public JAXBElement<TemplateInlineType> createTemplateInline(TemplateInlineType value) {
        return new JAXBElement<TemplateInlineType>(_TemplateInline_QNAME, TemplateInlineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link H6Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "h6")
    public JAXBElement<H6Type> createH6(H6Type value) {
        return new JAXBElement<H6Type>(_H6_QNAME, H6Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumberIncorrectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "numberIncorrect")
    public JAXBElement<NumberIncorrectType> createNumberIncorrect(NumberIncorrectType value) {
        return new JAXBElement<NumberIncorrectType>(_NumberIncorrect_QNAME, NumberIncorrectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link H5Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "h5")
    public JAXBElement<H5Type> createH5(H5Type value) {
        return new JAXBElement<H5Type>(_H5_QNAME, H5Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link H4Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "h4")
    public JAXBElement<H4Type> createH4(H4Type value) {
        return new JAXBElement<H4Type>(_H4_QNAME, H4Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link H3Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "h3")
    public JAXBElement<H3Type> createH3(H3Type value) {
        return new JAXBElement<H3Type>(_H3_QNAME, H3Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link H2Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "h2")
    public JAXBElement<H2Type> createH2(H2Type value) {
        return new JAXBElement<H2Type>(_H2_QNAME, H2Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link H1Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "h1")
    public JAXBElement<H1Type> createH1(H1Type value) {
        return new JAXBElement<H1Type>(_H1_QNAME, H1Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringMatchType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "stringMatch")
    public JAXBElement<StringMatchType> createStringMatch(StringMatchType value) {
        return new JAXBElement<StringMatchType>(_StringMatch_QNAME, StringMatchType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "textElements")
    public JAXBElement<Boolean> createTextElements(Boolean value) {
        return new JAXBElement<Boolean>(_TextElements_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TheadType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "thead")
    public JAXBElement<TheadType> createThead(TheadType value) {
        return new JAXBElement<TheadType>(_Thead_QNAME, TheadType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssociableHotspotType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "associableHotspot")
    public JAXBElement<AssociableHotspotType> createAssociableHotspot(AssociableHotspotType value) {
        return new JAXBElement<AssociableHotspotType>(_AssociableHotspot_QNAME, AssociableHotspotType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutcomeConditionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "outcomeCondition")
    public JAXBElement<OutcomeConditionType> createOutcomeCondition(OutcomeConditionType value) {
        return new JAXBElement<OutcomeConditionType>(_OutcomeCondition_QNAME, OutcomeConditionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDefaultValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "setDefaultValue")
    public JAXBElement<SetDefaultValueType> createSetDefaultValue(SetDefaultValueType value) {
        return new JAXBElement<SetDefaultValueType>(_SetDefaultValue_QNAME, SetDefaultValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutcomeElseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "outcomeElse")
    public JAXBElement<OutcomeElseType> createOutcomeElse(OutcomeElseType value) {
        return new JAXBElement<OutcomeElseType>(_OutcomeElse_QNAME, OutcomeElseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PromptType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "prompt")
    public JAXBElement<PromptType> createPrompt(PromptType value) {
        return new JAXBElement<PromptType>(_Prompt_QNAME, PromptType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FallbackType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XInclude", name = "fallback")
    public JAXBElement<FallbackType> createFallback(FallbackType value) {
        return new JAXBElement<FallbackType>(_Fallback_QNAME, FallbackType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsageDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "usageData")
    public JAXBElement<UsageDataType> createUsageData(UsageDataType value) {
        return new JAXBElement<UsageDataType>(_UsageData_QNAME, UsageDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EqualType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "equal")
    public JAXBElement<EqualType> createEqual(EqualType value) {
        return new JAXBElement<EqualType>(_Equal_QNAME, EqualType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCorrectResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "setCorrectResponse")
    public JAXBElement<SetCorrectResponseType> createSetCorrectResponse(SetCorrectResponseType value) {
        return new JAXBElement<SetCorrectResponseType>(_SetCorrectResponse_QNAME, SetCorrectResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "gt")
    public JAXBElement<GtType> createGt(GtType value) {
        return new JAXBElement<GtType>(_Gt_QNAME, GtType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RandomIntegerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "randomInteger")
    public JAXBElement<RandomIntegerType> createRandomInteger(RandomIntegerType value) {
        return new JAXBElement<RandomIntegerType>(_RandomInteger_QNAME, RandomIntegerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "source")
    public JAXBElement<String> createSource(String value) {
        return new JAXBElement<String>(_Source_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ColgroupType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "colgroup")
    public JAXBElement<ColgroupType> createColgroup(ColgroupType value) {
        return new JAXBElement<ColgroupType>(_Colgroup_QNAME, ColgroupType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "assessmentTest")
    public JAXBElement<AssessmentTest> createAssessmentTest(AssessmentTest value) {
        return new JAXBElement<AssessmentTest>(_AssessmentTest_QNAME, AssessmentTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultipleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "multiple")
    public JAXBElement<MultipleType> createMultiple(MultipleType value) {
        return new JAXBElement<MultipleType>(_Multiple_QNAME, MultipleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "lomMetadata")
    public JAXBElement<Boolean> createLomMetadata(Boolean value) {
        return new JAXBElement<Boolean>(_LomMetadata_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MatchInteractionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "matchInteraction")
    public JAXBElement<MatchInteractionType> createMatchInteraction(MatchInteractionType value) {
        return new JAXBElement<MatchInteractionType>(_MatchInteraction_QNAME, MatchInteractionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DrawingInteractionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "drawingInteraction")
    public JAXBElement<DrawingInteractionType> createDrawingInteraction(DrawingInteractionType value) {
        return new JAXBElement<DrawingInteractionType>(_DrawingInteraction_QNAME, DrawingInteractionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "feedbackModal")
    public JAXBElement<Boolean> createFeedbackModal(Boolean value) {
        return new JAXBElement<Boolean>(_FeedbackModal_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "countrycode")
    public JAXBElement<String> createCountrycode(String value) {
        return new JAXBElement<String>(_Countrycode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessmentItemRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "assessmentItemRef")
    public JAXBElement<AssessmentItemRefType> createAssessmentItemRef(AssessmentItemRefType value) {
        return new JAXBElement<AssessmentItemRefType>(_AssessmentItemRef_QNAME, AssessmentItemRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "imageType")
    public JAXBElement<String> createImageType(String value) {
        return new JAXBElement<String>(_ImageType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InlineChoiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "inlineChoice")
    public JAXBElement<InlineChoiceType> createInlineChoice(InlineChoiceType value) {
        return new JAXBElement<InlineChoiceType>(_InlineChoice_QNAME, InlineChoiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetadataProfileType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "metadataProfile")
    public JAXBElement<MetadataProfileType> createMetadataProfile(MetadataProfileType value) {
        return new JAXBElement<MetadataProfileType>(_MetadataProfile_QNAME, MetadataProfileType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "ext_contentype")
    public JAXBElement<Object> createExtContentype(Object value) {
        return new JAXBElement<Object>(_ExtContentype_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "ext_exrefrecord")
    public JAXBElement<Object> createExtExrefrecord(Object value) {
        return new JAXBElement<Object>(_ExtExrefrecord_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "ul")
    public JAXBElement<UlType> createUl(UlType value) {
        return new JAXBElement<UlType>(_Ul_QNAME, UlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "ext_role")
    public JAXBElement<Object> createExtRole(Object value) {
        return new JAXBElement<Object>(_ExtRole_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HottextInteractionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "hottextInteraction")
    public JAXBElement<HottextInteractionType> createHottextInteraction(HottextInteractionType value) {
        return new JAXBElement<HottextInteractionType>(_HottextInteraction_QNAME, HottextInteractionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InteractionTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "interactionType")
    public JAXBElement<InteractionTypeType> createInteractionType(InteractionTypeType value) {
        return new JAXBElement<InteractionTypeType>(_InteractionType_QNAME, InteractionTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "indnumber")
    public JAXBElement<String> createIndnumber(String value) {
        return new JAXBElement<String>(_Indnumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "div")
    public JAXBElement<DivType> createDiv(DivType value) {
        return new JAXBElement<DivType>(_Div_QNAME, DivType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "dt")
    public JAXBElement<DtType> createDt(DtType value) {
        return new JAXBElement<DtType>(_Dt_QNAME, DtType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "objectType")
    public JAXBElement<String> createObjectType(String value) {
        return new JAXBElement<String>(_ObjectType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GraphicAssociateInteractionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "graphicAssociateInteraction")
    public JAXBElement<GraphicAssociateInteractionType> createGraphicAssociateInteraction(GraphicAssociateInteractionType value) {
        return new JAXBElement<GraphicAssociateInteractionType>(_GraphicAssociateInteraction_QNAME, GraphicAssociateInteractionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemplateIfType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "templateIf")
    public JAXBElement<TemplateIfType> createTemplateIf(TemplateIfType value) {
        return new JAXBElement<TemplateIfType>(_TemplateIf_QNAME, TemplateIfType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EqualRoundedType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "equalRounded")
    public JAXBElement<EqualRoundedType> createEqualRounded(EqualRoundedType value) {
        return new JAXBElement<EqualRoundedType>(_EqualRounded_QNAME, EqualRoundedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsideType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "inside")
    public JAXBElement<InsideType> createInside(InsideType value) {
        return new JAXBElement<InsideType>(_Inside_QNAME, InsideType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumberPresentedType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "numberPresented")
    public JAXBElement<NumberPresentedType> createNumberPresented(NumberPresentedType value) {
        return new JAXBElement<NumberPresentedType>(_NumberPresented_QNAME, NumberPresentedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "dl")
    public JAXBElement<DlType> createDl(DlType value) {
        return new JAXBElement<DlType>(_Dl_QNAME, DlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemplateConditionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "templateCondition")
    public JAXBElement<TemplateConditionType> createTemplateCondition(TemplateConditionType value) {
        return new JAXBElement<TemplateConditionType>(_TemplateCondition_QNAME, TemplateConditionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TbodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "tbody")
    public JAXBElement<TbodyType> createTbody(TbodyType value) {
        return new JAXBElement<TbodyType>(_Tbody_QNAME, TbodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CorrectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "correct")
    public JAXBElement<CorrectType> createCorrect(CorrectType value) {
        return new JAXBElement<CorrectType>(_Correct_QNAME, CorrectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "ext_definition")
    public JAXBElement<Object> createExtDefinition(Object value) {
        return new JAXBElement<Object>(_ExtDefinition_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "dd")
    public JAXBElement<DdType> createDd(DdType value) {
        return new JAXBElement<DdType>(_Dd_QNAME, DdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "tt")
    public JAXBElement<TtType> createTt(TtType value) {
        return new JAXBElement<TtType>(_Tt_QNAME, TtType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "ext_accessibility")
    public JAXBElement<Object> createExtAccessibility(Object value) {
        return new JAXBElement<Object>(_ExtAccessibility_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemplateVariableType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "templateVariable")
    public JAXBElement<TemplateVariableType> createTemplateVariable(TemplateVariableType value) {
        return new JAXBElement<TemplateVariableType>(_TemplateVariable_QNAME, TemplateVariableType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "objectElements")
    public JAXBElement<Boolean> createObjectElements(Boolean value) {
        return new JAXBElement<Boolean>(_ObjectElements_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleMatchSetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "simpleMatchSet")
    public JAXBElement<SimpleMatchSetType> createSimpleMatchSet(SimpleMatchSetType value) {
        return new JAXBElement<SimpleMatchSetType>(_SimpleMatchSet_QNAME, SimpleMatchSetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumberSelectedType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "numberSelected")
    public JAXBElement<NumberSelectedType> createNumberSelected(NumberSelectedType value) {
        return new JAXBElement<NumberSelectedType>(_NumberSelected_QNAME, NumberSelectedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "fielddata")
    public JAXBElement<String> createFielddata(String value) {
        return new JAXBElement<String>(_Fielddata_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SessionIdentifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "sessionIdentifier")
    public JAXBElement<SessionIdentifierType> createSessionIdentifier(SessionIdentifierType value) {
        return new JAXBElement<SessionIdentifierType>(_SessionIdentifier_QNAME, SessionIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WeightType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "weight")
    public JAXBElement<WeightType> createWeight(WeightType value) {
        return new JAXBElement<WeightType>(_Weight_QNAME, WeightType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "em")
    public JAXBElement<EmType> createEm(EmType value) {
        return new JAXBElement<EmType>(_Em_QNAME, EmType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QtiMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "qtiMetadata")
    public JAXBElement<QtiMetadataType> createQtiMetadata(QtiMetadataType value) {
        return new JAXBElement<QtiMetadataType>(_QtiMetadata_QNAME, QtiMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseElseIfType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "responseElseIf")
    public JAXBElement<ResponseElseIfType> createResponseElseIf(ResponseElseIfType value) {
        return new JAXBElement<ResponseElseIfType>(_ResponseElseIf_QNAME, ResponseElseIfType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.open.com.cn/schemas/exam/openqti_v1", name = "pre")
    public JAXBElement<PreType> createPre(PreType value) {
        return new JAXBElement<PreType>(_Pre_QNAME, PreType.class, null, value);
    }

}
