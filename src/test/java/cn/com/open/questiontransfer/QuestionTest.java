package cn.com.open.questiontransfer;

import cn.com.open.openqti.ItemType;
import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by lucky on 2017/7/6.
 */
public class QuestionTest {
    /**
     * 格式化选项测试.
     */
/*@Test
    public void formatChoicesTest() {
        List<String> orginalChoices = new ArrayList<String>();
        orginalChoices.add("A1");
        orginalChoices.add("B2");
        orginalChoices.add("C3");
        orginalChoices.add("D4");
        Question question = new Question();
        question.setI6(orginalChoices);

        List<String> correctAnswerList = new ArrayList<String>();
        correctAnswerList.add("1");
        question.setI7(correctAnswerList);

        List<OpenSimpleChoiceAtomicItem> result = question.formatChoices();

        Assert.assertEquals(result.get(0).getIdentifier(), "A");
        Assert.assertEquals(result.get(1).getIdentifier(), "B");
        Assert.assertEquals(result.get(2).getIdentifier(), "C");
        Assert.assertEquals(result.get(3).getIdentifier(), "D");

        Assert.assertEquals(result.get(1).isCorrectResponse(), true);
        Assert.assertEquals(result.get(2).isCorrectResponse(), false);
    }*/
   /* @Test
    public void getTitleLessThan25Test() {
        String content = "normal test";
        Question question = new Question();
        String result = question.getTitle(content);

        Assert.assertEquals(result, "normal test");
    }

    *//**
     * Gets title more than 25 test.
     *//*
    @Test
    public void getTitleMoreThan25Test() {
        String content = "this is a string that length more than 25 characters";
        Question question = new Question();
        String result = question.getTitle(content);

        Assert.assertEquals(result, content.substring(0, 25));
    }

    *//**
     * Gets title less than 25 but have html test.
     *//*
    @Test
    public void getTitleLessThan25butHaveHTMLTest() {
        String content = "this is <b>a</b> string .";
        Question question = new Question();
        String result = question.getTitle(content);

        Assert.assertEquals(result, "this is ");
    }

    *//**
     * Gets title more than 25 and have html test.
     *//*
    @Test
    public void getTitleMoreThan25AndHaveHTMLTest() {
        String content = "this is a string that length more <b>than</b> 25 characters.";
        Question question = new Question();
        String result = question.getTitle(content);

        Assert.assertEquals(result, content.substring(0, 25));
    }*/

    /**
     * Check model incomplete data test.
     */
    @Test
    public void checkModel_IncompleteData_test() {
        Question question = new Question();
        question.setI3(ItemType.SINGLECHOICE.getIndex());
        int check = question.checkModel();
        Assert.assertEquals(check, GlobalConst.IncompleteData);
    }

    /**
     * Check model not match i 2 cannot empty test.
     */
    @Test
    public void checkModel_not_match_I2_cannot_empty_test() {
        Question question = new Question();
        question.setI3(ItemType.SINGLECHOICE.getIndex());
        question.setI9(1);
        int check = question.checkModel();
        Assert.assertEquals(check, GlobalConst.ItemTitleEmpty);
    }

    /**
     * Check model choice i 6 is empty test.
     */
    @Test
    public void checkModel_choice_I6_is_empty_test() {
        Question question = new Question();
        question.setI3(ItemType.SINGLECHOICE.getIndex());
        question.setI2("title");
        question.setI9(1);
        List<String> i6 = new ArrayList<String>();
        question.setI6(i6);
        i6.add("this is a");
        int check = question.checkModel();
        Assert.assertEquals(check, GlobalConst.ItemChoiceEmpty);
    }

    /**
     * Check model choice i 7 is empty test.
     */
    @Test
    public void checkModel_choice_I7_is_empty_test() {
        Question question = new Question();
        question.setI3(ItemType.SINGLECHOICE.getIndex());
        question.setI2("title");
        question.setI9(1);
        List<String> i6 = new ArrayList<String>();
        i6.add("this is a");
        i6.add("this is b");
        question.setI6(i6);

        List<String> i7 = new ArrayList<String>();
        question.setI7(i7);
        int check = question.checkModel();
        Assert.assertEquals(check, GlobalConst.ItemAnswerEmpty);
    }

    /**
     * Check model choice i 6 i 7 has empty item test.
     */
    @Test
    public void checkModel_choice_I6I7_has_empty_item_test() {
        Question question = new Question();
        question.setI3(ItemType.SINGLECHOICE.getIndex());
        question.setI2("title");
        question.setI9(1);
        List<String> i6 = new ArrayList<String>();
        i6.add("this is a");
        i6.add("");
        i6.add("this is b");
        question.setI6(i6);

        List<String> i7 = new ArrayList<String>();
        i7.add("");
        question.setI7(i7);
        int check = question.checkModel();
        Assert.assertEquals(check, GlobalConst.IncompleteData);
    }

    /**
     * Check model single has mulitanswer test.
     */
    @Test
    public void checkModel_single_has_mulitanswer_test() {
        Question question = new Question();
        question.setI3(ItemType.SINGLECHOICE.getIndex());
        question.setI2("title");
        question.setI9(1);
        List<String> i6 = new ArrayList<String>();
        i6.add("this is a");
        i6.add("this is b");
        question.setI6(i6);

        List<String> i7 = new ArrayList<String>();
        i7.add("0");
        i7.add("1");
        question.setI7(i7);
        int check = question.checkModel();
        Assert.assertEquals(check, GlobalConst.ChoiceAnswerNotOnly);
    }

    /**
     * Check model choice answer not convert to number test.
     */
    @Test
    public void checkModel_choice_AnswerNotConvertToNumber_test() {
        Question question = new Question();
        question.setI3(ItemType.SINGLECHOICE.getIndex());
        question.setI2("title");
        question.setI9(1);
        List<String> i6 = new ArrayList<String>();
        i6.add("this is a");
        i6.add("this is b");
        question.setI6(i6);

        List<String> i7 = new ArrayList<String>();
        i7.add("A");
        question.setI7(i7);
        int check = question.checkModel();
        Assert.assertEquals(check, GlobalConst.AnswerNotConvertToNumber);
    }

    /**
     * Check model choice answer index not in choices test.
     */
    @Test
    public void checkModel_choice_AnswerIndexNotInChoices_test() {
        Question question = new Question();
        question.setI3(ItemType.SINGLECHOICE.getIndex());
        question.setI2("title");
        question.setI9(1);
        List<String> i6 = new ArrayList<String>();
        i6.add("this is a");
        i6.add("this is b");
        question.setI6(i6);

        List<String> i7 = new ArrayList<String>();
        i7.add("3");
        question.setI7(i7);
        int check = question.checkModel();
        Assert.assertEquals(check, GlobalConst.AnswerIndexNotInChoices);
    }

    /**
     * Check model single sucess test.
     */
    @Test
    public void checkModel_single_sucess_test() {
        Question question = new Question();
        question.setI3(ItemType.SINGLECHOICE.getIndex());
        question.setI2("title");
        question.setI9(1);
        List<String> i6 = new ArrayList<String>();
        i6.add("this is a");
        i6.add("this is b");
        question.setI6(i6);

        List<String> i7 = new ArrayList<String>();
        i7.add("0");
        question.setI7(i7);
        int check = question.checkModel();
        Assert.assertEquals(check, GlobalConst.Success);
    }

    /**
     * Check model judge choice answer not match test.
     */
    @Test
    public void checkModel_judge_ChoiceAnswerNotMatch_test() {
        Question question = new Question();
        question.setI3(ItemType.JUDGEMENT.getIndex());
        question.setI2("title");
        question.setI9(1);
        List<String> i6 = new ArrayList<String>();
        i6.add("this is a");
        i6.add("this is b");
        //i6.add("this is C");
        question.setI6(i6);

        List<String> i7 = new ArrayList<String>();
        i7.add("0");
        i7.add("1");
        question.setI7(i7);
        int check = question.checkModel();
        Assert.assertEquals(check, GlobalConst.ChoiceAnswerNotMatch);
    }

    /**
     * Check model textentry answer score not match test.
     */
    @Test
    public void checkModel_textentry_AnswerScoreNotMatch_test() {
        Question question = new Question();
        question.setI3(ItemType.TEXTENTRY.getIndex());
        question.setI2("title");
        question.setI9(1);
        List<String> i6 = new ArrayList<String>();
        i6.add("a");
        i6.add("b");
        question.setI6(i6);

        List<String> i7 = new ArrayList<String>();
        i7.add("1");
        question.setI7(i7);
        int check = question.checkModel();
        Assert.assertEquals(check, GlobalConst.AnswerScoreNotMatch);
    }

    /**
     * Check model textentry answer score not match in one place test.
     */
    @Test
    public void checkModel_textentry_AnswerScoreNotMatchInOnePlace_test() {
        Question question = new Question();
        question.setI3(ItemType.TEXTENTRY.getIndex());
        question.setI2("title");
        question.setI9(1);
        List<String> i6 = new ArrayList<String>();
        i6.add("A##a");
        question.setI6(i6);

        List<String> i7 = new ArrayList<String>();
        i7.add("1");
        question.setI7(i7);
        int check = question.checkModel();
        Assert.assertEquals(check, GlobalConst.AnswerScoreNotMatchInOnePlace);
    }

    /**
     * Check model textentry answer not convert to number test.
     */
    @Test
    public void checkModel_textentry_AnswerNotConvertToNumber_test() {
        Question question = new Question();
        question.setI3(ItemType.TEXTENTRY.getIndex());
        question.setI2("title");
        question.setI9(1);
        List<String> i6 = new ArrayList<String>();
        i6.add("A");
        question.setI6(i6);

        List<String> i7 = new ArrayList<String>();
        i7.add("A");
        question.setI7(i7);
        int check = question.checkModel();
        Assert.assertEquals(check, GlobalConst.AnswerNotConvertToNumber);
    }

    /**
     * Check model textentry score out of range test.
     */
    @Test
    public void checkModel_textentry_ScoreOutOfRange_test() {
        Question question = new Question();
        question.setI3(ItemType.TEXTENTRY.getIndex());
        question.setI2("title");
        question.setI9(1);
        List<String> i6 = new ArrayList<String>();
        i6.add("A");
        question.setI6(i6);

        List<String> i7 = new ArrayList<String>();
        i7.add("2");
        question.setI7(i7);
        int check = question.checkModel();
        Assert.assertEquals(check, GlobalConst.ScoreOutOfRange);
    }

    /**
     * Check model textentry prompt answer not match test.
     */
    @Test
    public void checkModel_textentry_PromptAnswerNotMatch_test() {
        Question question = new Question();
        question.setI3(ItemType.TEXTENTRY.getIndex());
        question.setI2("title");
        question.setI9(1);
        List<String> i6 = new ArrayList<String>();
        i6.add("A");
        question.setI6(i6);

        List<String> i7 = new ArrayList<String>();
        i7.add("1");
        question.setI7(i7);
        int check = question.checkModel();
        Assert.assertEquals(check, GlobalConst.PromptAnswerNotMatch);
    }

    /**
     * Check model textentry success test.
     */
    @Test
    public void checkModel_textentry_Success_test() {
        Question question = new Question();
        question.setI3(ItemType.TEXTENTRY.getIndex());
        question.setI2("title##second");
        question.setI9(1);
        List<String> i6 = new ArrayList<String>();
        i6.add("A");
        question.setI6(i6);

        List<String> i7 = new ArrayList<String>();
        i7.add("1");
        question.setI7(i7);
        int check = question.checkModel();
        Assert.assertEquals(check, GlobalConst.Success);
    }

    /**
     * Check model extendedtext item answer empty test.
     */
    @Test
    public void checkModel_extendedtext_ItemAnswerEmpty_test() {
        Question question = new Question();
        question.setI3(ItemType.EXTENDEDTEXT.getIndex());
        question.setI2("title");
        question.setI9(1);
        List<String> i6 = new ArrayList<String>();
        i6.add("A");
        i6.add("B");
        question.setI6(i6);

        List<String> i7 = new ArrayList<String>();
        i7.add("1");
        question.setI7(i7);
        int check = question.checkModel();
        Assert.assertEquals(check, GlobalConst.ItemAnswerEmpty);
    }

    /**
     * Check model extendedtext length empty test.
     */
    @Test
    public void checkModel_extendedtext_LengthEmpty_test() {
        Question question = new Question();
        question.setI3(ItemType.EXTENDEDTEXT.getIndex());
        question.setI2("title");
        question.setI9(1);
        List<String> i6 = new ArrayList<String>();
        i6.add("A");
        question.setI6(i6);

        List<String> i7 = new ArrayList<String>();
        i7.add("1");
        i7.add("1");
        question.setI7(i7);
        int check = question.checkModel();
        Assert.assertEquals(check, GlobalConst.LengthEmpty);
    }

    /**
     * Check model extendedtext length less then zero test.
     */
    @Test
    public void checkModel_extendedtext_LengthLessThenZero_test() {
        Question question = new Question();
        question.setI3(ItemType.EXTENDEDTEXT.getIndex());
        question.setI2("title");
        question.setI9(1);
        List<String> i6 = new ArrayList<String>();
        i6.add("correct answer");
        question.setI6(i6);

        List<String> i7 = new ArrayList<String>();
        i7.add("-1");
        question.setI7(i7);
        int check = question.checkModel();
        Assert.assertEquals(check, GlobalConst.LengthLessThenZero);
    }

    /**
     * Check model extendedtext answer not convert to number test.
     */
    @Test
    public void checkModel_extendedtext_AnswerNotConvertToNumber_test() {
        Question question = new Question();
        question.setI3(ItemType.EXTENDEDTEXT.getIndex());
        question.setI2("title");
        question.setI9(1);
        List<String> i6 = new ArrayList<String>();
        i6.add("correct answer");
        question.setI6(i6);

        List<String> i7 = new ArrayList<String>();
        i7.add("A");
        question.setI7(i7);
        int check = question.checkModel();
        Assert.assertEquals(check, GlobalConst.AnswerNotConvertToNumber);
    }

    /**
     * Check model reading sub not exist test.
     */
    @Test
    public void checkModel_reading_SubNotExist_test() {
        Question question = new Question();
        question.setI3(ItemType.READINGCOMPREHENSION.getIndex());
        question.setI2("title");
        question.setI9(1);
        List<String> i6 = new ArrayList<String>();
        i6.add("correct answer");
        question.setI6(i6);

        List<String> i7 = new ArrayList<String>();
        i7.add("A");
        question.setI7(i7);
        int check = question.checkModel();
        Assert.assertEquals(check, GlobalConst.SubNotExist);
    }

    /**
     * Check model reading sub count not match test.
     */
    @Test
    public void checkModel_reading_SubCountNotMatch_test() {
        Question question = new Question();
        question.setI3(ItemType.READINGCOMPREHENSION.getIndex());
        question.setI2("title");
        question.setI9(1);
        List<String> i6 = new ArrayList<String>();
        i6.add("correct answer");
        question.setI6(i6);

        List<String> i7 = new ArrayList<String>();
        i7.add("A");
        question.setI7(i7);

        question.setI17(2);

        List<Question> sub = new ArrayList<Question>();
        Question subQuestion = new Question();
        sub.add(subQuestion);
        question.setSub(sub);

        int check = question.checkModel();
        Assert.assertEquals(check, GlobalConst.SubCountNotMatch);
    }

    /**
     * Check model cloze sub count not match i 2 test.
     */
    @Test
    public void checkModel_cloze_SubCountNotMatch_I2_test() {
        Question question = new Question();
        question.setI3(ItemType.CLOZE.getIndex());
        question.setI2("title##second##third");
        question.setI9(1);
        List<String> i6 = new ArrayList<String>();
        i6.add("correct answer");
        question.setI6(i6);

        List<String> i7 = new ArrayList<String>();
        i7.add("A");
        question.setI7(i7);

        question.setI17(1);

        List<Question> sub = new ArrayList<Question>();
        Question subQuestion = new Question();
        sub.add(subQuestion);
        question.setSub(sub);

        int check = question.checkModel();
        Assert.assertEquals(check, GlobalConst.SubCountNotMatch);
    }

    /**
     * Check model reading sub item score not standard test.
     */
    @Test
    public void checkModel_reading_SubItemScoreNotStandard_test() {
        Question question = new Question();
        question.setI3(ItemType.READINGCOMPREHENSION.getIndex());
        question.setI2("title");
        question.setI9(1);
        question.setI17(2);

        List<Question> sub = new ArrayList<Question>();
        Question subQuestion = new Question();
        List<String> i6 = new ArrayList<String>();
        i6.add("A");
        i6.add("B");
        subQuestion.setI6(i6);
        List<String> i7 = new ArrayList<String>();
        i7.add("0");
        subQuestion.setI7(i7);
        sub.add(subQuestion);

        subQuestion = new Question();
        i6 = new ArrayList<String>();
        i6.add("A");
        i6.add("B");
        subQuestion.setI6(i6);
        i7 = new ArrayList<String>();
        i7.add("1");
        subQuestion.setI7(i7);
        sub.add(subQuestion);
        question.setSub(sub);

        int check = question.checkModel();
        Assert.assertEquals(check, GlobalConst.SubItemScoreNotStandard);
    }

    /**
     * Check model reading choice answer not only test.
     */
    @Test
    public void checkModel_reading_ChoiceAnswerNotOnly_test() {
        Question question = new Question();
        question.setI3(ItemType.READINGCOMPREHENSION.getIndex());
        question.setI2("title");
        question.setI9(2);
        question.setI17(2);

        List<Question> sub = new ArrayList<Question>();
        Question subQuestion = new Question();
        List<String> i6 = new ArrayList<String>();
        i6.add("A");
        i6.add("B");
        subQuestion.setI6(i6);
        List<String> i7 = new ArrayList<String>();
        i7.add("0");
        subQuestion.setI7(i7);
        sub.add(subQuestion);

        subQuestion = new Question();
        i6 = new ArrayList<String>();
        i6.add("A");
        i6.add("B");
        subQuestion.setI6(i6);
        i7 = new ArrayList<String>();
        i7.add("1");
        i7.add("2");
        subQuestion.setI7(i7);
        sub.add(subQuestion);
        question.setSub(sub);

        int check = question.checkModel();
        Assert.assertEquals(check, GlobalConst.ChoiceAnswerNotOnly);
    }

    /**
     * Check model reading answer not convert to number test.
     */
    @Test
    public void checkModel_reading_AnswerNotConvertToNumber_test() {
        Question question = new Question();
        question.setI3(ItemType.READINGCOMPREHENSION.getIndex());
        question.setI2("title");
        question.setI9(2);
        question.setI17(2);

        List<Question> sub = new ArrayList<Question>();
        Question subQuestion = new Question();
        List<String> i6 = new ArrayList<String>();
        i6.add("A");
        i6.add("B");
        subQuestion.setI6(i6);
        List<String> i7 = new ArrayList<String>();
        i7.add("0");
        subQuestion.setI7(i7);
        sub.add(subQuestion);

        subQuestion = new Question();
        i6 = new ArrayList<String>();
        i6.add("A");
        i6.add("B");
        subQuestion.setI6(i6);
        i7 = new ArrayList<String>();
        i7.add("A");
        subQuestion.setI7(i7);
        sub.add(subQuestion);
        question.setSub(sub);

        int check = question.checkModel();
        Assert.assertEquals(check, GlobalConst.AnswerNotConvertToNumber);
    }

    /**
     * Check model reading answer index not in choices test.
     */
    @Test
    public void checkModel_reading_AnswerIndexNotInChoices_test() {
        Question question = new Question();
        question.setI3(ItemType.READINGCOMPREHENSION.getIndex());
        question.setI2("title");
        question.setI9(2);
        question.setI17(2);

        List<Question> sub = new ArrayList<Question>();
        Question subQuestion = new Question();
        List<String> i6 = new ArrayList<String>();
        i6.add("A");
        i6.add("B");
        subQuestion.setI6(i6);
        List<String> i7 = new ArrayList<String>();
        i7.add("0");
        subQuestion.setI7(i7);
        sub.add(subQuestion);

        subQuestion = new Question();
        i6 = new ArrayList<String>();
        i6.add("A");
        i6.add("B");
        subQuestion.setI6(i6);
        i7 = new ArrayList<String>();
        i7.add("2");
        subQuestion.setI7(i7);
        sub.add(subQuestion);
        question.setSub(sub);

        int check = question.checkModel();
        Assert.assertEquals(check, GlobalConst.AnswerIndexNotInChoices);
    }

    /**
     * Check model match item choice empty test.
     */
    @Test
    public void checkModel_match_ItemChoiceEmpty_test() {
        Question question = new Question();
        question.setI3(ItemType.MATCH.getIndex());
        question.setI2("title");
        question.setI9(2);
        question.setI17(2);

        List<String> i6 = new ArrayList<String>();
        question.setI6(i6);

        List<Question> sub = new ArrayList<Question>();
        Question subQuestion = new Question();
        List<String> i7 = new ArrayList<String>();
        i7.add("0");
        subQuestion.setI7(i7);
        sub.add(subQuestion);

        subQuestion = new Question();
        i7 = new ArrayList<String>();
        i7.add("1");
        subQuestion.setI7(i7);
        sub.add(subQuestion);
        question.setSub(sub);

        int check = question.checkModel();
        Assert.assertEquals(check, GlobalConst.ItemChoiceEmpty);
    }

    /**
     * Check model match incomplete data test.
     */
    @Test
    public void checkModel_match_IncompleteData_test() {
        Question question = new Question();
        question.setI3(ItemType.MATCH.getIndex());
        question.setI2("title");
        question.setI9(2);
        question.setI17(2);

        List<String> i6 = new ArrayList<String>();
        i6.add("A");
        i6.add("");
        question.setI6(i6);

        List<Question> sub = new ArrayList<Question>();
        Question subQuestion = new Question();
        List<String> i7 = new ArrayList<String>();
        i7.add("0");
        subQuestion.setI7(i7);
        sub.add(subQuestion);

        subQuestion = new Question();
        i7 = new ArrayList<String>();
        i7.add("1");
        subQuestion.setI7(i7);
        sub.add(subQuestion);
        question.setSub(sub);

        int check = question.checkModel();
        Assert.assertEquals(check, GlobalConst.IncompleteData);
    }

    /**
     * Check model match item title empty test.
     */
    @Test
    public void checkModel_match_ItemTitleEmpty_test() {
        Question question = new Question();
        question.setI3(ItemType.MATCH.getIndex());
        question.setI2("title");
        question.setI9(2);
        question.setI17(2);

        List<String> i6 = new ArrayList<String>();
        i6.add("A");
        i6.add("B");
        question.setI6(i6);

        List<Question> sub = new ArrayList<Question>();
        Question subQuestion = new Question();
        List<String> i7 = new ArrayList<String>();
        i7.add("0");
        subQuestion.setI7(i7);
        sub.add(subQuestion);

        subQuestion = new Question();
        i7 = new ArrayList<String>();
        i7.add("1");
        subQuestion.setI7(i7);
        sub.add(subQuestion);
        question.setSub(sub);

        int check = question.checkModel();
        Assert.assertEquals(check, GlobalConst.ItemTitleEmpty);
    }

    /**
     * Check model match item answer empty test.
     */
    @Test
    public void checkModel_match_ItemAnswerEmpty_test() {
        Question question = new Question();
        question.setI3(ItemType.MATCH.getIndex());
        question.setI2("title");
        question.setI9(2);
        question.setI17(2);

        List<String> i6 = new ArrayList<String>();
        i6.add("A");
        i6.add("B");
        question.setI6(i6);

        List<Question> sub = new ArrayList<Question>();
        Question subQuestion = new Question();
        List<String> i7 = new ArrayList<String>();
        i7.add("0");
        subQuestion.setI7(i7);
        subQuestion.setI2("1");
        sub.add(subQuestion);

        subQuestion = new Question();
        i7 = new ArrayList<String>();
        subQuestion.setI7(i7);
        subQuestion.setI2("1");
        sub.add(subQuestion);
        question.setSub(sub);

        int check = question.checkModel();
        Assert.assertEquals(check, GlobalConst.ItemAnswerEmpty);
    }

    /**
     * Check model match incomplete data i 7 test.
     */
    @Test
    public void checkModel_match_IncompleteData_i7_test() {
        Question question = new Question();
        question.setI3(ItemType.MATCH.getIndex());
        question.setI2("title");
        question.setI9(2);
        question.setI17(2);

        List<String> i6 = new ArrayList<String>();
        i6.add("A");
        i6.add("B");
        question.setI6(i6);

        List<Question> sub = new ArrayList<Question>();
        Question subQuestion = new Question();
        List<String> i7 = new ArrayList<String>();
        i7.add("0");
        subQuestion.setI7(i7);
        subQuestion.setI2("1");
        sub.add(subQuestion);

        subQuestion = new Question();
        i7 = new ArrayList<String>();
        i7.add("");
        subQuestion.setI7(i7);
        subQuestion.setI2("1");
        sub.add(subQuestion);
        question.setSub(sub);

        int check = question.checkModel();
        Assert.assertEquals(check, GlobalConst.IncompleteData);
    }

    /**
     * Check model composite sub not exist test.
     */
    @Test
    public void checkModel_composite_SubNotExist_test() {
        Question question = new Question();
        question.setI3(ItemType.COMPOSITE.getIndex());
        question.setI2("title");
        question.setI9(2);
        question.setI17(2);

        List<String> i6 = new ArrayList<String>();
        i6.add("A");
        i6.add("B");
        question.setI6(i6);

        List<Question> sub = new ArrayList<Question>();
        question.setSub(sub);

        int check = question.checkModel();
        Assert.assertEquals(check, GlobalConst.SubNotExist);
    }

    /**
     * Check model composite sub not exist 2 test.
     */
    @Test
    public void checkModel_composite_SubNotExist2_test() {
        Question question = new Question();
        question.setI3(ItemType.COMPOSITE.getIndex());
        question.setI2("title");
        question.setI9(2);
        question.setI17(2);

        List<String> i6 = new ArrayList<String>();
        i6.add("A");
        i6.add("B");
        question.setI6(i6);

        List<Question> sub = new ArrayList<Question>();
        Question subQuestion = new Question();
        List<String> i7 = new ArrayList<String>();
        i7.add("0");
        subQuestion.setI7(i7);
        subQuestion.setI2("1");
        sub.add(subQuestion);

        subQuestion = new Question();
        i7 = new ArrayList<String>();
        i7.add("");
        subQuestion.setI7(i7);
        subQuestion.setI2("1");
        sub.add(subQuestion);
        question.setSub(sub);

        int check = question.checkModel();
        Assert.assertEquals(check, GlobalConst.SubNotExist);
    }

    /**
     * Check model composite sub count not match test.
     */
    @Test
    public void checkModel_composite_SubCountNotMatch_test() {
        Question question = new Question();
        question.setI3(ItemType.COMPOSITE.getIndex());
        question.setI2("title");
        question.setI9(1);
        question.setI17(1);

        List<Question> sub = new ArrayList<Question>();
        Question subQuestion = new Question();
        List<String> i6 = new ArrayList<String>();
        i6.add("A");
        i6.add("B");
        subQuestion.setI6(i6);
        List<String> i7 = new ArrayList<String>();
        i7.add("0");
        subQuestion.setI7(i7);
        subQuestion.setI2("1");
        List<Question> subSub = new ArrayList<Question>();
        Question subSubQuestion = new Question();
        subSub.add(subSubQuestion);
        subQuestion.setSub(subSub);
        sub.add(subQuestion);

        subQuestion = new Question();
        i6 = new ArrayList<String>();
        i6.add("A");
        i6.add("B");
        subQuestion.setI6(i6);
        i7 = new ArrayList<String>();
        i7.add("");
        subQuestion.setI7(i7);
        subQuestion.setI2("1");
        subSub = new ArrayList<Question>();
        subSubQuestion = new Question();
        subSub.add(subSubQuestion);
        subQuestion.setSub(subSub);
        sub.add(subQuestion);
        question.setSub(sub);

        int check = question.checkModel();
        Assert.assertEquals(check, GlobalConst.SubCountNotMatch);
    }

    /**
     * Check model composite sub item score not standard test.
     */
    @Test
    public void checkModel_composite_SubItemScoreNotStandard_test() {
        Question question = new Question();
        question.setI3(ItemType.COMPOSITE.getIndex());
        question.setI2("title");
        question.setI9(1);
        question.setI17(2);

        List<Question> sub = new ArrayList<Question>();
        Question subQuestion = new Question();
        List<String> i6 = new ArrayList<String>();
        i6.add("A");
        i6.add("B");
        subQuestion.setI6(i6);
        List<String> i7 = new ArrayList<String>();
        i7.add("0");
        subQuestion.setI7(i7);
        subQuestion.setI2("1");
        List<Question> subSub = new ArrayList<Question>();
        Question subSubQuestion = new Question();
        subSubQuestion.setI2("i2");
        subSubQuestion.setI6(i6);
        subSubQuestion.setI7(i7);
        subSub.add(subSubQuestion);
        subQuestion.setSub(subSub);
        sub.add(subQuestion);

        subQuestion = new Question();
        subQuestion.setI6(i6);
        subQuestion.setI7(i7);
        subQuestion.setI2("1");
        subSub = new ArrayList<Question>();
        subSub.add(subSubQuestion);
        subQuestion.setSub(subSub);
        sub.add(subQuestion);
        question.setSub(sub);

        int check = question.checkModel();
        Assert.assertEquals(check, GlobalConst.SubItemScoreNotStandard);
    }

    /**
     * Check model order item choice empty test.
     */
    @Test
    public void checkModel_order_ItemChoiceEmpty_test() {
        Question question = new Question();
        question.setI3(ItemType.ORDER.getIndex());
        question.setI2("title");
        question.setI9(2);
        question.setI17(2);

        List<String> i6 = new ArrayList<String>();
        question.setI6(i6);

        int check = question.checkModel();
        Assert.assertEquals(check, GlobalConst.ItemChoiceEmpty);
    }

    /**
     * Check model order item answer empty test.
     */
    @Test
    public void checkModel_order_ItemAnswerEmpty_test() {
        Question question = new Question();
        question.setI3(ItemType.ORDER.getIndex());
        question.setI2("title");
        question.setI9(2);
        question.setI17(2);

        List<String> i6 = new ArrayList<String>();
        i6.add("A");
        i6.add("B");
        question.setI6(i6);

        int check = question.checkModel();
        Assert.assertEquals(check, GlobalConst.ItemAnswerEmpty);
    }

    /**
     * Check model order choice answer not match test.
     */
    @Test
    public void checkModel_order_ChoiceAnswerNotMatch_test() {
        Question question = new Question();
        question.setI3(ItemType.ORDER.getIndex());
        question.setI2("title");
        question.setI9(2);
        question.setI17(2);

        List<String> i6 = new ArrayList<String>();
        i6.add("A");
        i6.add("B");
        question.setI6(i6);

        List<String> i7 = new ArrayList<String>();
        i7.add("1");
        question.setI7(i7);

        int check = question.checkModel();
        Assert.assertEquals(check, GlobalConst.ChoiceAnswerNotMatch);
    }

    /**
     * Gets full qti xml single choice test.
     *
     * @throws Exception the exception
     */
    @Test
    public void getFullQtiXml_SingleChoice_test() throws Exception {
        Question question = new Question();
        question.setI1(UUID.randomUUID().toString());
        question.setI3(ItemType.SINGLECHOICE.getIndex());
        question.setI2("title");
        question.setI9(1);
        List<String> i6 = new ArrayList<String>();
        i6.add("this is a");
        i6.add("this is b");
        question.setI6(i6);

        List<String> i7 = new ArrayList<String>();
        i7.add("0");
        question.setI7(i7);
        int check = question.checkModel();
        String xml = "";
        if (check == GlobalConst.Success) {
            xml = QuestionXmlMaker.getFullQtiXml(question);
        }
        System.out.println(xml);
        Assert.assertTrue(xml.length() > 0);
    }

    @Test
    public void getFullQtiXml_multipleChoice_test() throws Exception {
        Question question = new Question();
        question.setI1(UUID.randomUUID().toString());
        question.setI3(ItemType.MULTIPLECHOICE.getIndex());
        question.setI2("this is a long title for the item,that's length more than title");
        question.setI33("title");
        question.setI9(1);
        List<String> i6 = new ArrayList<String>();
        i6.add("this is a");
        i6.add("this is b");
        i6.add("this is c");
        question.setI6(i6);

        List<String> i7 = new ArrayList<String>();
        i7.add("0");
        i7.add("1");
        question.setI7(i7);
        int check = question.checkModel();
        String xml = "";
        if (check == GlobalConst.Success) {
            xml = QuestionXmlMaker.getFullQtiXml(question);
        }
        System.out.println(xml);
        Assert.assertTrue(xml.length() > 0);
    }

    @Test
    public void getFullQtiXml_judge_test() throws Exception {
        Question question = new Question();
        question.setI1(UUID.randomUUID().toString());
        question.setI3(ItemType.JUDGEMENT.getIndex());
        question.setI2("this is a long title for the item,that's length more than title");
        question.setI33("title");
        question.setI9(1);
        List<String> i6 = new ArrayList<String>();
        i6.add("this is a");
        i6.add("this is b");
        question.setI6(i6);

        List<String> i7 = new ArrayList<String>();
        i7.add("0");
        question.setI7(i7);
        int check = question.checkModel();
        String xml = "";
        if (check == GlobalConst.Success) {
            xml = QuestionXmlMaker.getFullQtiXml(question);
        }
        System.out.println(xml);
        Assert.assertTrue(xml.length() > 0);
    }

    @Test
    public void getFullQtiXml_textentry_test() throws Exception {
        Question question = new Question();
        question.setI1(UUID.randomUUID().toString());
        question.setI3(ItemType.TEXTENTRY.getIndex());
        question.setI2("this is a long title for the item,##that's length more than title##.");
        question.setI9(2);
        List<String> i6 = new ArrayList<String>();
        i6.add("this is a");
        i6.add("this is b");
        question.setI6(i6);

        List<String> i7 = new ArrayList<String>();
        i7.add("1");
        i7.add("1");
        question.setI7(i7);
        int check = question.checkModel();
        String xml = "";
        if (check == GlobalConst.Success) {
            xml = QuestionXmlMaker.getFullQtiXml(question);
            System.out.println(xml);
        }
        Assert.assertTrue(xml.length() > 0);
    }

    @Test
    public void getFullQtiXml_extendedtext_test() throws Exception {
        Question question = new Question();
        question.setI1(UUID.randomUUID().toString());
        question.setI3(ItemType.EXTENDEDTEXT.getIndex());
        question.setI2("this is a long title for the item,that's length more than title.");
        question.setI9(2);
        List<String> i6 = new ArrayList<String>();
        i6.add("this is a");
        question.setI6(i6);

        List<String> i7 = new ArrayList<String>();
        i7.add("100");
        question.setI7(i7);
        int check = question.checkModel();
        String xml = "";
        if (check == GlobalConst.Success) {
            xml = QuestionXmlMaker.getFullQtiXml(question);
            System.out.println(xml);
        }
        Assert.assertTrue(xml.length() > 0);
    }

    @Test
    public void getFullQtiXml_reading_test() throws Exception {
        Question question = new Question();
        question.setI1(UUID.randomUUID().toString());
        question.setI3(ItemType.READINGCOMPREHENSION.getIndex());
        question.setI2("title");
        question.setI9(2);
        question.setI17(2);

        List<Question> sub = new ArrayList<Question>();
        Question subQuestion = new Question();
        List<String> i6 = new ArrayList<String>();
        i6.add("A");
        i6.add("B");
        subQuestion.setI6(i6);
        List<String> i7 = new ArrayList<String>();
        i7.add("0");
        subQuestion.setI7(i7);
        subQuestion.setI2("1");
        sub.add(subQuestion);

        subQuestion = new Question();
        i6 = new ArrayList<String>();
        i6.add("A");
        i6.add("B");
        subQuestion.setI6(i6);
        i7 = new ArrayList<String>();
        i7.add("0");
        subQuestion.setI7(i7);
        subQuestion.setI2("2");
        sub.add(subQuestion);
        question.setSub(sub);

        int check = question.checkModel();
        String xml = "";
        if (check == GlobalConst.Success) {
            xml = QuestionXmlMaker.getFullQtiXml(question);
            System.out.println(xml);
        }
        Assert.assertTrue(xml.length() > 0);
    }

    @Test
    public void getFullQtiXml_cloze_test() throws Exception {
        Question question = new Question();
        question.setI1(UUID.randomUUID().toString());
        question.setI3(ItemType.CLOZE.getIndex());
        question.setI2("title##second##third.");
        question.setI9(2);
        question.setI17(2);

        List<Question> sub = new ArrayList<Question>();
        Question subQuestion = new Question();
        List<String> i6 = new ArrayList<String>();
        i6.add("A");
        i6.add("B");
        subQuestion.setI6(i6);
        List<String> i7 = new ArrayList<String>();
        i7.add("0");
        subQuestion.setI7(i7);
        sub.add(subQuestion);

        subQuestion = new Question();
        i6 = new ArrayList<String>();
        i6.add("A");
        i6.add("B");
        subQuestion.setI6(i6);
        i7 = new ArrayList<String>();
        i7.add("1");
        subQuestion.setI7(i7);
        sub.add(subQuestion);
        question.setSub(sub);

        int check = question.checkModel();
        String xml = "";
        if (check == GlobalConst.Success) {
            xml = QuestionXmlMaker.getFullQtiXml(question);
            System.out.println(xml);
        }
        Assert.assertTrue(xml.length() > 0);
    }

    @Test
    public void getFullQtiXml_match_test() throws Exception {
        Question question = new Question();
        question.setI1(UUID.randomUUID().toString());
        question.setI3(ItemType.MATCH.getIndex());
        question.setI2("title.");
        question.setI9(2);
        question.setI17(2);

        List<String> i6 = new ArrayList<String>();
        i6.add("A");
        i6.add("B");
        question.setI6(i6);

        List<Question> sub = new ArrayList<Question>();
        Question subQuestion = new Question();
        List<String> i7 = new ArrayList<String>();
        i7.add("0");
        subQuestion.setI7(i7);
        subQuestion.setI2("1");
        sub.add(subQuestion);

        subQuestion = new Question();
        i7 = new ArrayList<String>();
        i7.add("1");
        subQuestion.setI7(i7);
        subQuestion.setI2("2");
        sub.add(subQuestion);
        question.setSub(sub);

        int check = question.checkModel();
        String xml = "";
        if (check == GlobalConst.Success) {
            xml = QuestionXmlMaker.getFullQtiXml(question);
            System.out.println(xml);
        }
        Assert.assertTrue(xml.length() > 0);
    }
}
