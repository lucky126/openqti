package cn.com.open.openqti.Exception;


/**
 * The type Exception message.
 */
public class ExceptionMessage {
    /**
     * 试题未初始化异常消息
     */
    public static String openAssessmentItemNotInitiatedMessage = "试题未初始化，请构造试题或从文件加载试题内容！";
    /**
     * 单选类试题设置MappingResponse异常消息
     */
    public static String openSingleChoiceBaseAssessmentItemSetMappingResponseMessage = "单选类试题禁止设置MappingResponse！";
    /**
     * 阅读并单选类试题设置MappingResponse异常消息
     */
    public static String openReadingSingleChoiceAssessmentItemSetMappingResponseMessage = "阅读并单选类试题禁止设置MappingResponse！";
    /**
     * 判断题错误题项数异常消息
     */
    public static String openJudgementAssessmentItemInvalidAtomicItemCountMessage = "判断题的题项应该是2个（正确/错误）！试题ID：%s，试题标题：%s。";
    /**
     * 单选类试题有多个正确答案异常消息
     */
    public static String openSingleChoiceBaseAssessmentItemHasMultipleCorrectResponseMessage = "单选类试题有多个正确答案！试题ID：%s，试题标题：%s。";
    /**
     * 选择类试题缺少正确答案异常消息
     */
    public static String openChoiceAssessmentItemHasNoCorrectResponseValueMessage = "试题没有正确答案！试题ID：%s，试题标题：%s。";
    /**
     * 选择类试题缺少交互项异常消息
     */
    public static String openChoiceBaseAssessmentItemHasNoChoiceInteractionMessage = "选择类试题缺少交互项！试题ID：%s，试题标题：%s。";
    /**
     * 单项选择交互项（子题）缺少正确答案异常消息
     */
    public static String openSingleChoiceInteractionNeedCorrectResponseValueMessage = "试题的子题没有正确答案！试题ID：%s，试题标题：%s，子题序号：%s。";

    /**
     * 选择类试题缺少正确答案异常消息
     */
    public static String openSimpleChoiceAtomicItemNeedScoreMessage = "正确答案缺少得分！试题ID：%s，试题标题：%s，题项ID：%s。";

    /**
     * 题项总分无效异常消息（限映射匹配给分模式）
     */
    public static String openAtomicItemTotalScoreInvalidMessage = "试题各题项得分之和应该是100%！试题ID：%s，试题标题：%s。";

    /**
     * 填空项分数无效异常消息
     */
    public static String openTextEntryInteractionScoreInvalidMessage = "填空题的填空项应该有标准答案，标准答案得分必须是100%！试题ID：%s，试题标题：%s，填空项序号：%s。";

    /**
     * 填空题试题体内容中的填空项数无效异常消息
     */
    public static String openTextEntryInteractionCountInvalidMessage = "填空题试题体内容中的填空项数不正确！试题ID：%s，试题标题：%s。";

    /**
     * 单项匹配题左右匹配项数需一致异常消息
     */
    public static String openSingleMatchAssessmentItemMustHasSameChildItemCountMessage = "单项匹配题左右匹配项数需一致！试题ID：%s，试题标题：%s。";

    /**
     * 单项匹配题不能有多个正确答案异常消息
     */
    public static String openSingleMatchAssessmentItemCanNotHasMultipleCorrectResponseValueMessage = "单项匹配题不能有多个正确答案！试题ID：%s，试题标题：%s，子题序号：%s。";

    /**
     * 复合题子题总分无效异常消息
     */
    public static String openCompositeSubItemTotalScoreInvalidMessage = "复合题的下级子题得分之和应该是100%！试题ID：%s，试题标题：%s。";

    /**
     * 复合题子题类别无效异常消息
     */
    public static String openCompositeSubItemTypeInvalidMessage = "复合题子题类别无法识别！试题ID：%s，试题标题：%s，子题序号：%s，子题类别：%s。";

    /**
     * 复合题子题类别无效异常消息
     */
    public static String openCompositeSubItemTypeCanNotBeUnknownMessage = "题型未知的试题不能用于构建复合题！试题ID：%s，试题标题：%s，子题序号：%s。";

    /**
     * 复合题不能用于构建复合题异常消息
     */
    public static String openCompositeSubItemTypeCanNotBeCompositeItemMessage = "复合题不能用于构建复合题！试题ID：%s，试题标题：%s，子题序号：%s。";

    /**
     * 复合题子题类别未实现反向功能异常消息
     */
    public static String openCompositeSubItemTypeCanNotReverseMessage = "复合题子题类别未实现反向功能！试题ID：%s，试题标题：%s，子题序号：%s，子题类别：%s。";

    /**
     * 复合题子题内容标识不能为空异常消息
     */
    public static String openCompositeSubItemContentNeedIdMessage = "复合题子题内容标识不能为空！试题ID：%s，试题标题：%s，子题序号：%s。";

    /**
     * 复合题的问答子题缺少输入框异常消息
     */
    public static String openCompositeExtendedTextSubItemNeedInteractionMessage = "复合题的问答子题缺少输入框！试题ID：%s，试题标题：%s，子题序号：%s。";
    /**
     * OpenPrompt元素暂不支持多个media元素
     */
    public static String openPromptIncludeMultipleMedia = "OpenPrompt元素暂不支持多个media元素！";
    /**
     * OpenPrompt元素缺少必选属性src
     */
    public static String openPromptRequireSrc = "Media元素缺少必选属性src！";
    /**
     * OpenPrompt元素缺少必选属性MimeType
     */
    public static String openPromptRequireMimeType = "Media元素缺少必选属性MimeType！";
    /**
     * OpenPrompt元素中ConvertValue中media元素个数与media元素不一致
     */
    public static String openPromptConvertValueNotMatchMedia = "OpenPrompt元素中ConvertValue中media元素个数与media元素不一致！";
    /**
     * 只有问答题支持题干显示时长
     */
    public static String onlyExtendedTextSupportPromptShowDuration = "只有问答题支持题干显示时长！";
    /**
     * 例题分值必须为0
     */
    public static String exampleItemWeightMustBeZero = "例题分值必须为0！";
    /**
     * 例题不支持题目准备时长
     */
    public static String exampleItemNotSupportPrepareDuration = "例题不支持题目准备时长！";
    /**
     * 例题不支持题目答题时长
     */
    public static String exampleItemNotSupportResponseDuration = "例题不支持题目答题时长！";
    /**
     * 例题不支持题干显示时长
     */
    public static String exampleItemNotSupportPromptShowDuration = "例题不支持题干显示时长！";
    /**
     * clozeGap元素缺少必选属性responseIdentifier
     */
    public static String clozeGapRequireResponseIdentifier = "clozeGap元素缺少必选属性responseIdentifier！";
    /**
     * OpenPrompt元素中ConvertValue中clozeGap元素个数与clozeGap元素不一致
     */
    public static String openPromptConvertValueNotMatchClozeGap = "OpenPrompt元素中ConvertValue中clozeGap元素个数与clozeGap元素不一致";
    /**
     * 完形填空空数和子题数不相符
     */
    public static String openClozeAssessmentItemSubItemNumNotMatchGapNum = "完形填空空数和子题数不相符！试题ID：%s，试题标题：%s。";
    /**
     * 复合题不含子题
     */
    public static String openCompositeAssessmentItemHaveNoSubItem = "复合题不含子题！试题ID：%s，试题标题：%s。";
    /**
     * 完形填空不含空
     */
    public static String openClozeAssessmentItemHaveNoGap = "完形填空不含空！试题ID：%s，试题标题：%s。";
    /**
     * 阅读理解不允许含空
     */
    public static String openReadingComprehensionAssessmentItemNotSupportGap = "阅读理解不允许含空！试题ID：%s，试题标题：%s。";

}
