package cn.com.open.questiontransfer;

/**
 * Created by lucky on 2017/7/7.
 */
public class GlobalConst {
    /**
     * 完形填空和阅读理解的分隔符
     */
    public static String PLACEHOLDER_TEXT = "##";
    /**
     * 标题截取题干的长度限定
     */
    public static int TITLE_MAX_LEN = 25;

    /**
     * 创建人
     */
    public static String Creater = "";

    /**
     * 默认难度系数
     */
    public static double DefaultDifficulty = 1;

    //region 错误码定义

    /**
     * 正常
     */
    public static int Success = 0;
    /**
     * 数据库操作错误
     */
    /// </summary>
    public static int DataBaseError = -100;
    /**
     * 其他错误
     */
    public static int OtherError = -199;
    /**
     * 系统不支持此操作
     */
    public static int NotSupport = -200;
    /**
     * 数据不完整
     */
    public static int IncompleteData = -201;
    /**
     * 数据格式错误
     */
    public static int DataFormatError = -202;
    /**
     * 数据获取失败
     */
    public static int DataGettingFail = -203;
    /**
     * 文件类型错误
     */
    public static int FileTypeError = -204;
    /**
     * 文件格式错误
     */
    public static int FileFormatError = -205;
    /**
     * 其他数据已存在
     */
    public static int DataExist = -209;
    /**
     * 试题ID存在
     */
/// <summary>
    /// 试题ID存在
    /// </summary>
    public static int QuestionExist = -210;
    /**
     * The constant PaperExist.
     */
    public static int PaperExist = -211;
    /**
     * 试题ID不存在
     */
    public static int QuestionNotExist = -212;
    /**
     * 大题不存在
     */
    public static int SectionNotExist = -213;
    /**
     * 试卷ID不存在
     */
    public static int PaperNotExist = -214;
    /**
     * 标识符不存在
     */
    public static int IdNotExist = -215;
    /**
     * 课程已经存在
     */
    public static int CourseExist = -216;
    /**
     * 课程（题库）不存在
     */
    public static int ItemBankNotExist = -217;
    /**
     * 试题试卷的课程ID不匹配
     */
    public static int PaperQuestionCourseNotCompare = -220;
    /**
     * 子试题缺失
     */
    public static int SubNotExist = -230;
    /**
     * 共享资源
     */
    public static int IsShared = -231;
    /**
     * 不支持的题型
     */
    public static int IsNotSupportedInnerType = -232;
    /**
     * 序列号已存在
     */
    public static int SerialNumberExist = -233;
    /**
     * 试题题干为空
     */
    public static int ItemTitleEmpty = -300;
    /**
     * 试题选项为空
     */
    public static int ItemChoiceEmpty = -310;
    /**
     * 选项答案个数不匹配
     */
    public static int ChoiceAnswerNotMatch = -311;
    /**
     * 答案分数不匹配
     */
    public static int AnswerScoreNotMatch = -312;
    /**
     * 单空答案分数不匹配
     */
    public static int AnswerScoreNotMatchInOnePlace = -313;
    /**
     * 题干个数和答案个数不匹配
     */
    public static int PromptAnswerNotMatch = -314;
    /**
     * 子试题个数不匹配
     */
    public static int SubCountNotMatch = -315;
    /**
     * 试题答案为空
     */
    public static int ItemAnswerEmpty = -320;
    /**
     * 试题答案不唯一
     */
    public static int ChoiceAnswerNotOnly = -321;
    /**
     * 正确答案无法转换为数字
     */
    public static int AnswerNotConvertToNumber = -322;
    /**
     * 正确答案标识超过答案数量
     */
    public static int AnswerIndexNotInChoices = -323;
    /**
     * 正确答案标识分值超出范围
     */
    public static int ScoreOutOfRange = -324;
    /**
     * 限制字符长度小于0
     */
    public static int LengthLessThenZero = -325;
    /**
     * 限制字符为空
     */
    public static int LengthEmpty = -326;
    /**
     * 选项标识重复
     */
    public static int OptionIDRepeat = -330;
    /**
     * 选项文字重复
     */
    public static int OptionContentRepeat = -331;
    /**
     * 正确答案选项为空
     */
    public static int OptionHasNoCorrect = -332;
    /**
     * 查无此选项
     */
    public static int OptionNotExist = -333;
    /**
     * 选项为唯一正确答案
     */
    public static int OptionIsOnlyAnswer = -334;
    /**
     * 子试题唯一
     */
    public static int SubIsOnly = -335;
    /**
     * 子试题分数不匹配
     */
    public static int SubItemScoreNotStandard = -336;
    /**
     * 媒体定义不在允许范围
     */
    public static int MediaDefinitionNotAllowed = -337;
    /**
     * 媒体时长不在允许范围
     */
    public static int MediaLengthNotAllowed = -338;
    /**
     * 课程不存在
     */
    public static int CourseNotExist = -401;
    /**
     * 试卷标题为空
     */
    public static int PaperNameEmpty = -402;
    /**
     * 没有选择文件
     */
    public static int NoSelectedFile = -403;
    /**
     * 资源不存在
     */
    public static int ResourceNotExist = -404;
    /**
     * 试题无题库
     */
    public static int NoItemBank = -405;
    /**
     * 试题与题库不匹配
     */
    public static int QuestionItemBankNotMatch = -406;
    /**
     * 试题非私有
     */
    public static int NoPrivate = -407;
    /**
     * 无权限
     */
    public static int NoPermission = -408;

    //endregion
}
