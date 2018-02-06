package cn.com.open.questiontransfer;

import cn.com.open.openqti.*;
import cn.com.open.utils.GuidUtil;
import cn.com.open.utils.PatternUtil;

import java.io.Serializable;
import java.util.*;

/**
 * Created by lucky on 2017/7/4.
 */
public class Question implements Serializable {

    //region property define
    /**
     * 试题标识
     */
    private String I1;
    /**
     * 试题标题
     */
    private String I2;
    /**
     * 试题题型
     * 单选 = 1,多选 = 2,判断 = 3,填空= 4,阅读理解 = 5,问答（简答） = 6,完型填空 = 7,匹配 = 8,上传附件 = 9,组合= 10,组合单选=11,组合多选=12,排序题=13,
     */
    private int I3;
    /**
     * 所属题库
     */
    private String I4;
    /**
     * 所属章节
     */
    private String I5;
    /**
     * 选项列表
     */
    private List<String> I6;
    /**
     * 正确答案
     */
    private List<String> I7;
    /**
     * 试题类别
     */
    private List<String> I8;
    /**
     * 试题分数
     */
    private double I9;
    /**
     * 试题解析
     */
    private String I10;
    /**
     * 选项是否乱序
     * 不乱序=0,乱序=1
     */
    private int I11;
    /**
     * 关键字
     */
    private String I12;
    /**
     * 难度系数
     */
    private double I13;
    /**
     * 所属机构
     */
    private String I14;
    /**
     * 学生作答结果
     */
    private List<String> I15;
    /**
     * 学生作答得分
     */
    private double I16;
    /**
     * 子试题个数
     */
    private int I17;
    /**
     * 所属APP
     */
    private String I18;
    /**
     * 媒体定义
     * 无=0,音频=1,视频=2
     */
    private int I19;
    /**
     * 媒体时长
     */
    private String I20;
    /**
     * 用户自定义
     */
    private String I21;
    /**
     * 创建者标识
     */
    private String I22;
    /**
     * 添加时间
     */
    private Date I23;
    /**
     * 最后更新时间
     */
    private Date I24;
    /**
     * 是否审核
     * 0未审核,1已审核
     */
    private int I25;
    /**
     * 掌握程度
     * 1了解,2掌握,3重点掌握
     */
    private int I26;
    /**
     * 认知分类
     * 1识记,2能力,3应用
     */
    private int I27;
    /**
     * 试题编号
     */
    private int I28;
    /**
     * 曝光时间
     */
    private Date I29;
    /**
     * 外部大题标识，大题试题新增接口时为大题标识
     */
    private String I30;
    /**
     * 建议答题时间（分钟）
     */
    private int I31;
    /**
     * 是否主观题
     * 客观题0，主观题1
     */
    private int I32;
    /**
     * 试题标题(短)（获取试题列表显示时用）
     */
    private String I33;
    /**
     * 引用数量
     */
    private int I34;
    /**
     * 停/启用状态 启用0，停用1
     */
    private int I35;
    /**
     * 子试题集合
     */
    private List<Question> Sub;
    /**
     * 选项列表（只读），用于绑定试题信息用
     */
    private List<Choice> Choices;

    /**
     * Gets 试题标识.
     *
     * @return 试题标识 i 1
     */
    public String getI1() {
        return I1;
    }

    /**
     * Sets 试题标识.
     *
     * @param i1 试题标识
     */
    public void setI1(String i1) {
        I1 = i1;
    }

    /**
     * Gets 试题标题.
     *
     * @return 试题标题 i 2
     */
    public String getI2() {
        if (I2 == null) {
            I2 = "";
        }
        return I2;
    }

    /**
     * Sets 试题标题.
     *
     * @param i2 试题标题
     */
    public void setI2(String i2) {
        I2 = i2;
    }

    /**
     * Gets 试题题型.
     *
     * @return 试题题型 i 3
     */
    public int getI3() {
        return I3;
    }

    /**
     * Sets 试题题型.
     *
     * @param i3 试题题型
     */
    public void setI3(int i3) {
        I3 = i3;
    }

    /**
     * Gets 所属题库.
     *
     * @return 所属题库 i 4
     */
    public String getI4() {
        return I4;
    }

    /**
     * Sets 所属题库.
     *
     * @param i4 所属题库
     */
    public void setI4(String i4) {
        I4 = i4;
    }

    /**
     * Gets 所属章节.
     *
     * @return 所属章节 i 5
     */
    public String getI5() {
        return I5;
    }

    /**
     * Sets 所属章节.
     *
     * @param i5 所属章节
     */
    public void setI5(String i5) {
        I5 = i5;
    }

    /**
     * Gets 选项列表.
     *
     * @return 选项列表 i 6
     */
    public List<String> getI6() {
        return I6;
    }

    /**
     * Sets 选项列表.
     *
     * @param i6 选项列表
     */
    public void setI6(List<String> i6) {
        I6 = i6;
    }

    /**
     * Gets 正确答案.
     *
     * @return 正确答案 i 7
     */
    public List<String> getI7() {
        return I7;
    }

    /**
     * Sets 正确答案.
     *
     * @param i7 正确答案
     */
    public void setI7(List<String> i7) {
        I7 = i7;
    }

    /**
     * Gets 试题类别.
     *
     * @return 试题类别 i 8
     */
    public List<String> getI8() {
        return I8;
    }

    /**
     * Sets 试题类别.
     *
     * @param i8 试题类别
     */
    public void setI8(List<String> i8) {
        I8 = i8;
    }

    /**
     * Gets 试题分数.
     *
     * @return 试题分数 i 9
     */
    public double getI9() {
        return I9;
    }

    /**
     * Sets 试题分数.
     *
     * @param i9 试题分数
     */
    public void setI9(double i9) {
        I9 = i9;
    }

    /**
     * Gets 试题解析.
     *
     * @return 试题解析 i 10
     */
    public String getI10() {
        return I10;
    }

    /**
     * Sets 试题解析.
     *
     * @param i10 试题解析
     */
    public void setI10(String i10) {
        I10 = i10;
    }

    /**
     * Gets 选项是否乱序.
     *
     * @return 选项是否乱序 i 11
     */
    public int getI11() {
        return I11;
    }

    /**
     * Sets 选项是否乱序.
     *
     * @param i11 选项是否乱序
     */
    public void setI11(int i11) {
        I11 = i11;
    }

    /**
     * Gets 关键字.
     *
     * @return 关键字 i 12
     */
    public String getI12() {
        return I12;
    }

    /**
     * Sets 关键字.
     *
     * @param i12 关键字
     */
    public void setI12(String i12) {
        I12 = i12;
    }

    /**
     * Gets 难度系数.
     *
     * @return 难度系数 i 13
     */
    public double getI13() {
        return I13;
    }

    /**
     * Sets 难度系数.
     *
     * @param i13 难度系数
     */
    public void setI13(double i13) {
        I13 = i13;
    }

    /**
     * Gets 所属机构.
     *
     * @return 所属机构 i 14
     */
    public String getI14() {
        return I14;
    }

    /**
     * Sets 所属机构.
     *
     * @param i14 所属机构
     */
    public void setI14(String i14) {
        I14 = i14;
    }

    /**
     * Gets 学生作答结果.
     *
     * @return 学生作答结果 i 15
     */
    public List<String> getI15() {
        return I15;
    }

    /**
     * Sets 学生作答结果.
     *
     * @param i15 学生作答结果
     */
    public void setI15(List<String> i15) {
        I15 = i15;
    }

    /**
     * Gets 学生作答得分.
     *
     * @return 学生作答得分 i 16
     */
    public double getI16() {
        return I16;
    }

    /**
     * Sets 学生作答得分.
     *
     * @param i16 学生作答得分
     */
    public void setI16(double i16) {
        I16 = i16;
    }

    /**
     * Gets 子试题个数.
     *
     * @return 子试题个数 i 17
     */
    public int getI17() {
        return I17;
    }

    /**
     * Sets 子试题个数.
     *
     * @param i17 子试题个数
     */
    public void setI17(int i17) {
        I17 = i17;
    }

    /**
     * Gets 所属APP.
     *
     * @return the 所属APP
     */
    public String getI18() {
        return I18;
    }

    /**
     * Sets 所属APP.
     *
     * @param i18 所属APP
     */
    public void setI18(String i18) {
        I18 = i18;
    }

    /**
     * Gets 媒体定义.
     *
     * @return 媒体定义 i 19
     */
    public int getI19() {
        return I19;
    }

    /**
     * Sets 媒体定义.
     *
     * @param i19 媒体定义
     */
    public void setI19(int i19) {
        I19 = i19;
    }

    /**
     * Gets 媒体时长.
     *
     * @return 媒体时长 i 20
     */
    public String getI20() {
        return I20;
    }

    /**
     * Sets 媒体时长.
     *
     * @param i20 媒体时长
     */
    public void setI20(String i20) {
        I20 = i20;
    }

    /**
     * Gets 用户自定义.
     *
     * @return the 用户自定义
     */
    public String getI21() {
        return I21;
    }

    /**
     * Sets 用户自定义.
     *
     * @param i21 用户自定义
     */
    public void setI21(String i21) {
        I21 = i21;
    }

    /**
     * Gets 创建者标识
     *
     * @return 创建者标识 i 22
     */
    public String getI22() {
        return I22;
    }

    /**
     * Sets 创建者标识.
     *
     * @param i22 创建者标识
     */
    public void setI22(String i22) {
        I22 = i22;
    }

    /**
     * Gets 添加时间.
     *
     * @return 添加时间 i 23
     */
    public Date getI23() {
        return I23;
    }

    /**
     * Sets 添加时间.
     *
     * @param i23 添加时间
     */
    public void setI23(Date i23) {
        I23 = i23;
    }

    /**
     * Gets 最后更新时间.
     *
     * @return 最后更新时间 i 24
     */
    public Date getI24() {
        return I24;
    }

    /**
     * Sets 最后更新时间.
     *
     * @param i24 最后更新时间
     */
    public void setI24(Date i24) {
        I24 = i24;
    }

    /**
     * Gets 是否审核.
     *
     * @return 是否审核 i 25
     */
    public int getI25() {
        return I25;
    }

    /**
     * Sets 是否审核.
     *
     * @param i25 是否审核
     */
    public void setI25(int i25) {
        I25 = i25;
    }

    /**
     * Gets 掌握程度.
     *
     * @return 掌握程度 i 26
     */
    public int getI26() {
        return I26;
    }

    /**
     * Sets 掌握程度.
     *
     * @param i26 掌握程度
     */
    public void setI26(int i26) {
        I26 = i26;
    }

    /**
     * Gets 认知分类.
     *
     * @return 认知分类 i 27
     */
    public int getI27() {
        return I27;
    }

    /**
     * Sets 认知分类.
     *
     * @param i27 认知分类
     */
    public void setI27(int i27) {
        I27 = i27;
    }

    /**
     * Gets 试题编号.
     *
     * @return 试题编号 i 28
     */
    public int getI28() {
        return I28;
    }

    /**
     * Sets 试题编号.
     *
     * @param i28 试题编号
     */
    public void setI28(int i28) {
        I28 = i28;
    }

    /**
     * Gets 曝光时间.
     *
     * @return 曝光时间 i 29
     */
    public Date getI29() {
        return I29;
    }

    /**
     * Sets 曝光时间.
     *
     * @param i29 曝光时间
     */
    public void setI29(Date i29) {
        I29 = i29;
    }

    /**
     * Gets 外部大题标识.
     *
     * @return 外部大题标识 i 30
     */
    public String getI30() {
        return I30;
    }

    /**
     * Sets 外部大题标识.
     *
     * @param i30 外部大题标识
     */
    public void setI30(String i30) {
        I30 = i30;
    }

    /**
     * Gets 建议答题时间.
     *
     * @return 建议答题时间 i 31
     */
    public int getI31() {
        return I31;
    }

    /**
     * Sets 建议答题时间.
     *
     * @param i31 建议答题时间
     */
    public void setI31(int i31) {
        I31 = i31;
    }

    /**
     * Gets 是否主观题.
     *
     * @return 是否主观题 i 32
     */
    public int getI32() {
        return I32;
    }

    /**
     * Sets 是否主观题.
     *
     * @param i32 是否主观题
     */
    public void setI32(int i32) {
        I32 = i32;
    }

    /**
     * Gets 试题标题(短).
     *
     * @return 试题标题(短) i 33
     */
    public String getI33() {
        return I33;
    }

    /**
     * Sets 试题标题(短).
     *
     * @param i33 试题标题(短)
     */
    public void setI33(String i33) {
        I33 = i33;
    }

    /**
     * Gets 引用数量.
     *
     * @return 引用数量 i 34
     */
    public int getI34() {
        return I34;
    }

    /**
     * Sets 引用数量.
     *
     * @param i34 引用数量
     */
    public void setI34(int i34) {
        I34 = i34;
    }

    /**
     * Gets 停/启用状态.
     *
     * @return 停 /启用状态
     */
    public int getI35() {
        return I35;
    }

    /**
     * Sets 停/启用状态.
     *
     * @param i35 停/启用状态
     */
    public void setI35(int i35) {
        I35 = i35;
    }

    /**
     * Gets 子试题集合.
     *
     * @return 子试题集合 sub
     */
    public List<Question> getSub() {
        return Sub;
    }

    /**
     * 子试题集合b.
     *
     * @param sub 子试题集合
     */
    public void setSub(List<Question> sub) {
        Sub = sub;
    }

    /**
     * Gets choices.
     *
     * @return the choices
     */
    public List<Choice> getChoices() {
        return Choices;
    }
    //endregion

    /**
     * 构造函数
     * 用于构建试题实体后形成xml用
     */
    public Question() {
        I1 = "";
        I2 = "";
        I4 = "";
        I5 = "";
        Choices = new ArrayList<>();
        I6 = new ArrayList<>();
        I7 = new ArrayList<>();
        I8 = new ArrayList<>();
        I10 = "";
        I12 = "";
        I13 = 1;
        I14 = "";
        I15 = new ArrayList<>();
        I18 = "";
        I23 = new Date();
        I22 = "";
        I24 = null;
        I26 = 1;
        I27 = 1;
        I29 = null;
        I30 = "";
        I33 = "";
        Sub = null;
    }

    /**
     * 构造函数
     * 用于根据I3和xml构建试题实体
     *
     * @param i3         题型
     * @param needAnswer 是否需要答案
     * @param xml        qti xml
     * @throws Exception the exception
     */
    public Question(int i3, boolean needAnswer, String xml) throws Exception {
        this();
        this.I3 = i3;
        OpenAssessmentItem item = OpenAssessmentItem.createInstance(ItemType.fromValue(I3));
        item.LoadFromString(xml);
        FillContent(item, needAnswer);
    }


    //region 新增选项

    /**
     * 新增选项
     *
     * @param identity  the identity
     * @param content   the content
     * @param isCorrect the is correct
     */
    private void AddChoice(String identity, String content, boolean isCorrect) {
        Choice choice = new Choice();
        choice.setI1(identity);
        choice.setI2(content);
        choice.setCorrect(isCorrect);
        Choices.add(choice);
    }
    //endregion

    //region 填充子试题信息

    /**
     * 填充子试题信息
     *
     * @param sub        子试题集合
     * @param needAnswer 是否包含答案，不需要答案时候不赋值
     * @return the sub model
     */
    private List<Question> setSubModel(List<OpenSingleChoiceAssessmentItem> sub, boolean needAnswer) {
        List<Question> list = new ArrayList<Question>();
        for (OpenSingleChoiceAssessmentItem subItem : sub) {
            Question subModel = new Question();
            subModel.setI1(GuidUtil.formatGuid(subItem.getIdentifier()));
            subModel.setI3(subItem.getAssessmentItemType().ordinal());

            List<String> subChoiceContent = new ArrayList<String>();
            List<String> subCorrectChoice = new ArrayList<String>();
            //匹配正确答案和答案列表
            for (int i = 0; i < subItem.getChoices().size(); i++) {
                OpenSimpleChoiceAtomicItem choice = (OpenSimpleChoiceAtomicItem) ((List) subItem.getChoices()).get(i);
                subChoiceContent.add(choice.getContent());
                if (choice.isCorrectResponse()) {
                    subCorrectChoice.add(String.valueOf(i));
                }
                if (needAnswer) {
                    subModel.AddChoice(choice.getIdentifier(), choice.getContent(), choice.isCorrectResponse());
                }
            }

            subModel.setI2(subItem.getPrompt().getOriginalValue());
            subModel.setI6(subChoiceContent);
            subModel.setI11(subItem.isShuffle() ? 1 : 0);
            if (needAnswer) {
                subModel.setI7(subCorrectChoice);
                subModel.setI10(subItem.getQuestionAnalysis());
            }

            list.add(subModel);
        }

        return list;
    }

    /**
     * 填充子试题信息(匹配题)
     *
     * @param leftItems  子试题集合
     * @param rightItems 选项集合
     * @param needAnswer 是否包含答案
     * @return the match sub model
     */
    private List<Question> setMatchSubModel(List<OpenLeftSimpleAssociableChoiceAtomicItem> leftItems, List<OpenRightSimpleAssociableChoiceAtomicItem> rightItems,
                                            boolean needAnswer) {
        List<Question> list = new ArrayList<Question>();
        for (OpenLeftSimpleAssociableChoiceAtomicItem leftItem : leftItems) {
            Question subModel = new Question();

            subModel.setI1(GuidUtil.formatGuid(leftItem.getIdentifier()));
            subModel.setI2(leftItem.getContent());

            if (needAnswer) {
                List<String> correctIndexList = new ArrayList<String>();
                for (String correctItem : leftItem.getCorrectResponseValues()) {
                    OpenRightSimpleAssociableChoiceAtomicItem rightObj = null;
                    for (OpenRightSimpleAssociableChoiceAtomicItem right : rightItems) {
                        if (right.getIdentifier().equals(correctItem)) {
                            rightObj = right;
                        }
                    }
                    if (rightObj != null) {
                        correctIndexList.add(String.valueOf(rightItems.indexOf(rightObj)));
                    }
                }
                subModel.setI7(correctIndexList);
            }

            list.add(subModel);
        }

        return list;
    }

    /**
     * 填充子试题信息(组合匹配题)
     *
     * @param sub        子试题集合
     * @param needAnswer 是否包含答案
     * @return the composite sub model
     */
    private List<Question> setCompositeSubModel(List<OpenCompositeSubItem> sub, boolean needAnswer) {
        List<Question> list = new ArrayList<Question>();
        for (OpenCompositeSubItem subItem : sub) {
            Question subModel = new Question();

            OpenMatchAssessmentItem match = (OpenMatchAssessmentItem) subItem.getSubOpenAssessmentItem();
            subModel.setI1(GuidUtil.formatGuid(match.getIdentifier()));
            subModel.setI2(match.getPrompt().getOriginalValue());
            subModel.setI3(subItem.getItemType().ordinal());

            List<String> answerContents = new ArrayList<String>();
            for (OpenRightSimpleAssociableChoiceAtomicItem right : match.getRightAssociableChoices()) {
                answerContents.add(right.getContent());
            }
            subModel.setI6(answerContents);

            subModel.setI9(subItem.getSubItemScore());
            if (needAnswer) {
                subModel.setI10(subItem.getQuestionAnalysis());
            }
            subModel.setI11(match.isShuffle() ? 1 : 0);

            List<Question> subSubItem = new ArrayList<Question>();
            for (OpenLeftSimpleAssociableChoiceAtomicItem leftItem : match.getLeftAssociableChoices()) {
                Question left = new Question();

                left.setI1(leftItem.getIdentifier());
                left.setI2(leftItem.getContent());

                List<String> correctIndexList = new ArrayList<String>();
                for (String correctItem : leftItem.getCorrectResponseValues()) {

                    OpenRightSimpleAssociableChoiceAtomicItem rightObj = null;
                    for (OpenRightSimpleAssociableChoiceAtomicItem right : match.getRightAssociableChoices()) {
                        if (right.getIdentifier() == correctItem) {
                            rightObj = right;
                        }
                    }
                    if (rightObj != null) {
                        correctIndexList.add(String.valueOf(match.getRightAssociableChoices().indexOf(rightObj)));
                    }
                }

                if (needAnswer) {
                    left.setI7(correctIndexList);
                }

                subSubItem.add(left);

            }
            subModel.setSub(subSubItem);

            list.add(subModel);
        }

        return list;
    }
    //endregion

    //region 填充QTI试题内容部分

    /**
     * 填充QTI试题内容部分
     *
     * @param item       OpenAssessmentItem
     * @param needAnswer 是否需要答案
     */
    private void FillContent(OpenAssessmentItem item, boolean needAnswer) {
        List<String> choiceContent = new ArrayList<String>();
        List<String> correctChoice = new ArrayList<String>();

        if (needAnswer) {
            I10 = item.getQuestionAnalysis();
        }

        I33 = item.getTitle();
        //赋值QTI属性
        switch (ItemType.fromValue(I3)) {
            case SINGLECHOICE:
                OpenSingleChoiceAssessmentItem single = (OpenSingleChoiceAssessmentItem) item;
                choiceContent.clear();
                correctChoice.clear();
                //匹配正确答案和答案列表
                for (int i = 0; i < single.getChoices().size(); i++) {
                    OpenSimpleChoiceAtomicItem choice = (OpenSimpleChoiceAtomicItem) ((List) single.getChoices()).get(i);
                    choiceContent.add(choice.getContent());
                    if (choice.isCorrectResponse()) {
                        correctChoice.add(String.valueOf(i));
                    }
                    AddChoice(choice.getIdentifier(), choice.getContent(), choice.isCorrectResponse());
                }
                I1 = single.getIdentifier();
                I2 = single.getPrompt().getOriginalValue();
                I6 = choiceContent;
                I11 = single.isShuffle() ? 1 : 0;
                if (needAnswer) {
                    I7 = correctChoice;
                }
                break;
            case MULTIPLECHOICE:
                OpenMultipleChoiceAssessmentItem multi = (OpenMultipleChoiceAssessmentItem) item;
                choiceContent.clear();
                correctChoice.clear();
                //匹配正确答案和答案列表
                for (int i = 0; i < multi.getChoices().size(); i++) {
                    OpenSimpleChoiceAtomicItem choice = (OpenSimpleChoiceAtomicItem) ((List) multi.getChoices()).get(i);
                    choiceContent.add(choice.getContent());
                    if (choice.isCorrectResponse()) {
                        correctChoice.add(String.valueOf(i));
                    }
                    AddChoice(choice.getIdentifier(), choice.getContent(), choice.isCorrectResponse());
                }
                I1 = multi.getIdentifier();
                I2 = multi.getPrompt().getOriginalValue();
                I6 = choiceContent;
                I11 = multi.isShuffle() ? 1 : 0;
                if (needAnswer) {
                    I7 = correctChoice;
                }
                break;
            case JUDGEMENT:
                OpenJudgementAssessmentItem judge = (OpenJudgementAssessmentItem) item;
                choiceContent.clear();
                correctChoice.clear();
                // 匹配正确答案和答案列表
                for (int i = 0; i < judge.getChoices().size(); i++) {
                    OpenSimpleChoiceAtomicItem choice = (OpenSimpleChoiceAtomicItem) ((List) judge.getChoices()).get(i);
                    choiceContent.add(choice.getContent());
                    if (choice.isCorrectResponse()) {
                        correctChoice.add(String.valueOf(i));
                    }
                    AddChoice(choice.getIdentifier(), choice.getContent(), choice.isCorrectResponse());
                }
                I1 = judge.getIdentifier();
                I2 = judge.getPrompt().getOriginalValue();
                I6 = choiceContent;
                I11 = judge.isShuffle() ? 1 : 0;
                if (needAnswer) {
                    I7 = correctChoice;
                }
                break;
            case TEXTENTRY:
                OpenTextEntryAssessmentItem text = (OpenTextEntryAssessmentItem) item;
                I1 = text.getIdentifier();
                I2 = text.getItemBodyContent().replaceAll("<textEntryInteraction.*?/>", GlobalConst.PLACEHOLDER_TEXT);

                choiceContent.clear();
                correctChoice.clear();
                //填空题答案是有多组存在，只有一个是完全得分的
                for (int i = 0; i < text.getTextEntryInteractions().size(); i++) {
                    OpenTextEntryInteraction answerEntry = text.getTextEntryInteractions().get(i);
                    String answerValue = "";
                    String answerScore = "";
                    for (Map.Entry<String, Double> kv : answerEntry.getCorrectResponseValues().entrySet()) {
                        answerValue += String.format("%s%s", kv.getKey(), GlobalConst.PLACEHOLDER_TEXT);
                        answerScore += String.format("%s%s", kv.getValue(), GlobalConst.PLACEHOLDER_TEXT);
                    }
                    if (answerValue.length() > 0) {
                        answerValue = answerValue.substring(0, answerValue.length() - GlobalConst.PLACEHOLDER_TEXT.length());
                        answerScore = answerScore.substring(0, answerScore.length() - GlobalConst.PLACEHOLDER_TEXT.length());
                    }

                    choiceContent.add(answerValue);
                    correctChoice.add(answerScore);
                }

                if (needAnswer) {
                    I6 = choiceContent;
                    I7 = correctChoice;
                }
                break;
            case EXTENDEDTEXT:
                OpenExtendedTextAssessmentItem extendedText = (OpenExtendedTextAssessmentItem) item;
                I1 = extendedText.getIdentifier();
                I2 = extendedText.getPrompt().getOriginalValue();

                choiceContent.clear();
                correctChoice.clear();
                choiceContent.add(extendedText.getCorrentResponseValue());
                correctChoice.add(String.valueOf(extendedText.getExpectedLength()));

                I7 = correctChoice;
                if (needAnswer) {
                    I6 = choiceContent;
                }
                break;
            case READINGCOMPREHENSION:
                OpenReadingComprehensionAssessmentItem reading = (OpenReadingComprehensionAssessmentItem) item;
                I1 = reading.getIdentifier();
                I2 = reading.getPrompt().getOriginalValue();
                I11 = reading.isShuffle() ? 1 : 0;
                I17 = reading.getSubItems().size();

                Sub = setSubModel(reading.getSubItems(), needAnswer);
                break;
            case CLOZE:
                OpenClozeAssessmentItem cloze = (OpenClozeAssessmentItem) item;
                I1 = cloze.getIdentifier();
                I2 = cloze.getPrompt().getOriginalValue().replaceAll("<clozeGap.*?/>", GlobalConst.PLACEHOLDER_TEXT);
                I11 = cloze.isShuffle() ? 1 : 0;
                I17 = cloze.getSubItems().size();

                Sub = setSubModel(cloze.getSubItems(), needAnswer);
                break;
            case MATCH:
                OpenMatchAssessmentItem match = (OpenMatchAssessmentItem) item;
                I1 = match.getIdentifier();
                //I2 = match.getPrompt().getOriginalValue();

                List<String> rightList = new ArrayList<String>();
                for (OpenRightSimpleAssociableChoiceAtomicItem right : match.getRightAssociableChoices()) {
                    rightList.add(right.getContent());
                }
                I6 = rightList;

                I11 = match.isShuffle() ? 1 : 0;
                I17 = match.getLeftAssociableChoices().size();

                Sub = setMatchSubModel(match.getLeftAssociableChoices(), match.getRightAssociableChoices(), needAnswer);
                break;
            // 仅仅支持组合匹配题
            case COMPOSITE:
                OpenCompositeAssessmentItem composite = (OpenCompositeAssessmentItem) item;
                I1 = composite.getIdentifier();
                I2 = composite.getPrompt().getOriginalValue();
                I11 = composite.isShuffle() ? 1 : 0;
                I17 = composite.getBaseSubItems().size();

                Sub = setCompositeSubModel(composite.getBaseSubItems(), needAnswer);
                break;
            case ORDER:
                OpenOrderAssessmentItem order = (OpenOrderAssessmentItem) item;
                I1 = order.getIdentifier();
                I2 = order.getPrompt().getOriginalValue();
                List<String> orderChoices = new ArrayList<String>();
                List<String> orderAnswer = new ArrayList<String>();
                for (OpenOrderSimpleChoiceAtomicItem choice : order.getChoices()) {
                    orderChoices.add(choice.getContent());
                    orderAnswer.add(String.valueOf(choice.getCorrectSequence() - 1));
                }
                I6 = orderChoices;
                if (needAnswer) {
                    I7 = orderAnswer;
                }
                break;
            case UPLOAD:
                OpenUploadAssessmentItem upload = (OpenUploadAssessmentItem) item;
                I1 = upload.getIdentifier();
                I2 = upload.getPrompt().getOriginalValue();

                choiceContent.clear();
                correctChoice.clear();

                choiceContent.add(upload.getCorrentResponseValue());

                if (needAnswer) {
                    I7 = choiceContent;
                }
                break;
            default:
                break;
        }
    }
    //endregion

    //region 试题模型检查

    /**
     * 试题模型检查(与.net版本不同的是，这里只是翻译QTI部分，所以也只检查QTI部分)
     *
     * @return the int
     */
    public int checkModel() {
        if (I3 < 0 || I9 <= 0) {
            return GlobalConst.IncompleteData;
        }

        // 完整性检查
        if (ItemType.fromValue(I3) != ItemType.MATCH) {
            if (I2 == null || I2.length() == 0) {
                return GlobalConst.ItemTitleEmpty;
            }
        }

        int check;
        switch (ItemType.fromValue(I3)) {
            case SINGLECHOICE:
            case MULTIPLECHOICE:
            case JUDGEMENT:
            case TEXTENTRY:
                check = checkSingleChoiceCompleteness(this);
                if (check != GlobalConst.Success) {
                    return check;
                }
                break;
            case EXTENDEDTEXT:
                if (I6 == null || I6.size() != 1) {
                    return GlobalConst.ItemAnswerEmpty;
                }
                if (I7 == null || I7.size() != 1) {
                    return GlobalConst.LengthEmpty;
                }
                break;
            case READINGCOMPREHENSION:
            case CLOZE:
                if (Sub == null || Sub.size() == 0) {
                    return GlobalConst.SubNotExist;
                }
                if (Sub.size() != I17) {
                    return GlobalConst.SubCountNotMatch;
                }
                if (ItemType.fromValue(I3) == ItemType.CLOZE && PatternUtil.getPatternSplit(I2, GlobalConst.PLACEHOLDER_TEXT).size() - 1 != I17) {
                    return GlobalConst.SubCountNotMatch;
                }
                for (Question sub : Sub) {
                    check = checkSingleChoiceCompleteness(sub);
                    if (check != GlobalConst.Success) {
                        return check;
                    }
                }
                break;
            case MATCH:
                if (Sub == null || Sub.size() <= 0) {
                    return GlobalConst.SubNotExist;
                }
                if (Sub.size() != I17) {
                    return GlobalConst.SubCountNotMatch;
                }
                check = checkMatchCompleteness(this);
                if (check != GlobalConst.Success) {
                    return check;
                }
                break;
            // 仅支持组合匹配题
            case COMPOSITE:
                if (Sub == null || Sub.size() <= 0) {
                    return GlobalConst.SubNotExist;
                }
                int subCount = 0;
                for (Question item : Sub) {
                    if (item.Sub == null || item.Sub.size() <= 0) {
                        return GlobalConst.SubNotExist;
                    } else {
                        subCount += item.Sub.size();
                    }
                }
                if (subCount != I17) {
                    return GlobalConst.SubCountNotMatch;
                }
                for (Question sub : Sub) {
                    check = checkMatchCompleteness(sub);
                    if (check != GlobalConst.Success) {
                        return check;
                    }
                }
                break;
            case ORDER:
                if (I6 == null || I6.size() <= 0) {
                    return GlobalConst.ItemChoiceEmpty;
                }
                if (I7 == null || I7.size() <= 0) {
                    return GlobalConst.ItemAnswerEmpty;
                }
                if (I6.size() != I7.size()) {
                    return GlobalConst.ChoiceAnswerNotMatch;
                }
                break;
            case UPLOAD:
                if (I6 == null || I6.size() != 1) {
                    return GlobalConst.ItemAnswerEmpty;
                }
                if (I7 == null || I7.size() != 1) {
                    return GlobalConst.LengthLessThenZero;
                }
                break;
            default:
                // 其他类型暂不支持
                return GlobalConst.NotSupport;
        }

        // 合法性检查
        switch (ItemType.fromValue(I3)) {
            case SINGLECHOICE:
                check = checkSingleChoiceValidity(this);
                if (check != GlobalConst.Success) {
                    return check;
                }
                break;
            case MULTIPLECHOICE:
                check = checkI7Value(this);
                if (check != GlobalConst.Success) {
                    return check;
                }
                break;
            case JUDGEMENT:
                if (I6.size() != 2 || I7.size() != 1) {
                    // 判断题正确答案只能是一个，选项只能有2个
                    return GlobalConst.ChoiceAnswerNotMatch;
                }
                check = checkI7Value(this);
                if (check != GlobalConst.Success) {
                    return check;
                }
                break;
            case TEXTENTRY:
                // 填空题答案和得分必须匹配
                if (I6.size() != I7.size()) {
                    return GlobalConst.AnswerScoreNotMatch;
                }
                for (int i = 0; i < I6.size(); i++) {
                    List<String> response = PatternUtil.getPatternSplit(I6.get(i), GlobalConst.PLACEHOLDER_TEXT);
                    List<String> scores = PatternUtil.getPatternSplit(I7.get(i), GlobalConst.PLACEHOLDER_TEXT);
                    if (response.size() != scores.size()) {
                        return GlobalConst.AnswerScoreNotMatchInOnePlace;
                    }
                    for (String score : scores) {
                        try {
                            double s = Double.valueOf(score);
                            if (s > 1 || s < 0) {
                                // 如果正确答案标识超过100%或者小于0
                                return GlobalConst.ScoreOutOfRange;
                            }
                        } catch (Exception e) {
                            return GlobalConst.AnswerNotConvertToNumber;
                        }
                    }
                }
                // 题干空的个数和答案个数必须匹配
                int textCount = PatternUtil.getPatternSplit(I2, GlobalConst.PLACEHOLDER_TEXT).size();
                if (textCount - 1 != I6.size()) {
                    return GlobalConst.PromptAnswerNotMatch;
                }
                break;
            case EXTENDEDTEXT:
                check = checkI7MustMoreThanZero(this);
                if (check != GlobalConst.Success) {
                    return check;
                }
                break;
            case READINGCOMPREHENSION:
            case CLOZE:
                if (I9 / Sub.size() < 1) {
                    // 子试题分数不匹配
                    return GlobalConst.SubItemScoreNotStandard;
                }
                for (Question sub : Sub) {
                    check = checkSingleChoiceValidity(sub);
                    if (check != GlobalConst.Success) {
                        return check;
                    }
                }
                break;
            case MATCH:
                if (I9 / Sub.size() < 1) {
                    // 子试题分数不匹配
                    return GlobalConst.SubItemScoreNotStandard;
                }
                check = checkI7Value(this);
                if (check != GlobalConst.Success) {
                    return check;
                }
                break;
            // 仅支持组合匹配题
            case COMPOSITE:
                int subCount = 0;
                for (Question item : Sub) {
                    if (item.Sub == null || item.Sub.size() <= 0) {
                        return GlobalConst.SubNotExist;
                    } else {
                        subCount += item.Sub.size();
                    }
                }
                if (I9 / subCount < 1) {
                    // 子试题分数不匹配
                    return GlobalConst.SubItemScoreNotStandard;
                }
                for (Question sub : Sub) {
                    check = checkI7Value(sub);
                    if (check != GlobalConst.Success) {
                        return check;
                    }
                }
                break;
            case ORDER:
                check = checkI7Value(this);
                if (check != GlobalConst.Success) {
                    return check;
                }
                break;
            case UPLOAD:
                check = checkI7MustMoreThanZero(this);
                if (check != GlobalConst.Success) {
                    return check;
                }
                break;
            default:
                break;
        }

        return GlobalConst.Success;
    }

    /**
     * 检查i7设置的长度必须大于0的完整性
     *
     * @param model 试题模型
     * @return 返回0表示通过，其余均为存在问题
     */
    private int checkI7MustMoreThanZero(Question model) {
        try {
            int uploadFileLength = Integer.valueOf(model.getI7().get(0));
            if (uploadFileLength < 0) {
                // 如果限制字数长度小于等于0
                return GlobalConst.LengthLessThenZero;
            }
        } catch (Exception e) {
            return GlobalConst.AnswerNotConvertToNumber;
        }
        return GlobalConst.Success;
    }

    /**
     * 检查单选题的完整性
     *
     * @param model 试题模型
     * @return 返回0表示通过，其余均为存在问题
     */
    private int checkSingleChoiceCompleteness(Question model) {
        if (ItemType.fromValue(model.getI3()) == ItemType.TEXTENTRY) {
            if (model.getI6() == null || model.getI6().size() <= 0) {
                return GlobalConst.ItemChoiceEmpty;
            }
        } else {
            if (model.getI6() == null || model.getI6().size() <= 1) {
                return GlobalConst.ItemChoiceEmpty;
            }
        }
        if (model.getI7() == null || model.getI7().size() <= 0) {
            return GlobalConst.ItemAnswerEmpty;
        }

        // 验证子试题的I6和I7内容都不能为空
        if (isListHaveEmptyString(model.getI6()) || isListHaveEmptyString(model.getI7())) {
            return GlobalConst.IncompleteData;
        }
        return GlobalConst.Success;
    }

    /**
     * 检查匹配题的完整性
     *
     * @param model 试题模型
     * @return 返回0表示通过，其余均为存在问题
     */
    private int checkMatchCompleteness(Question model) {
        if (model.getI6() == null || model.getI6().size() <= 1) {
            return GlobalConst.ItemChoiceEmpty;
        }
        // 验证子试题的I6和I7内容都不能为空
        if (isListHaveEmptyString(model.getI6())) {
            return GlobalConst.IncompleteData;
        }
        for (Question item : model.getSub()) {
            if (item.getI2() == null || item.getI2().length() == 0) {
                return GlobalConst.ItemTitleEmpty;
            }
            if (item.getI7() == null || item.getI7().size() <= 0) {
                return GlobalConst.ItemAnswerEmpty;
            }
            if (isListHaveEmptyString(item.getI7())) {
                return GlobalConst.IncompleteData;
            }
        }
        return GlobalConst.Success;
    }

    /**
     * 检测字符串集合中是否含有空字符串
     *
     * @param lst 被检测的字符串集合
     * @return 是否含有空字符串
     */
    private boolean isListHaveEmptyString(List<String> lst) {
        for (String str : lst) {
            if (str.length() == 0) {
                return true;
            }
        }

        return false;
    }

    /**
     * 检查I7和I6的匹配关系
     *
     * @param model 试题模型
     * @return 返回0表示通过，其余均为存在问题
     */
    private int checkI7Value(Question model) {
        for (String correct : model.getI7()) {
            try {
                int index = Integer.valueOf(correct);
                if (index >= model.getI6().size() || index < 0) {
                    // 如果正确答案标识超过答案数量
                    return GlobalConst.AnswerIndexNotInChoices;
                }
            } catch (Exception e) {
                return GlobalConst.AnswerNotConvertToNumber;
            }
        }

        return GlobalConst.Success;
    }

    /**
     * 检查单选题的合法性
     *
     * @param model 试题模型
     * @return 返回0表示通过，其余均为存在问题
     */
    private int checkSingleChoiceValidity(Question model) {
        if (model.getI7().size() != 1) {
            // 单选题正确答案只能是一个
            return GlobalConst.ChoiceAnswerNotOnly;
        }

        return checkI7Value(model);
    }

    //endregion
}
