package cn.com.open.controller;

import cn.com.open.questiontransfer.Question;
import cn.com.open.questiontransfer.QuestionXmlMaker;
import org.springframework.web.bind.annotation.*;

/**
 * Created by lucky on 2017/9/13.
 */
@RestController
@RequestMapping(value = "/openqti/question")
public class QtiQuestionController {

    /**
     * 检查试题模型合法性.
     *
     * @param model the model
     * @return the int
     */
    @PostMapping(value = "/checkmodel")
    public int checkModel(@RequestBody Question model) {
        return model.checkModel();
    }

    /**
     * 从xml转换试题模型实体.
     *
     * @param i3         题型
     * @param needAnswer 是否需要答案，不需要答案时候不赋值
     * @param xml        the xml
     * @return the question
     * @throws Exception the exception
     */
    @PostMapping(value = "/get")
    public Question get(@RequestParam("i3") int i3, @RequestParam("needAnswer") boolean needAnswer, @RequestBody String xml) throws Exception {
        Question question = new Question(i3, needAnswer, xml);
        return question;
    }

    /**
     * 根据试题模型实体转换成xml.
     *
     * @param model the model
     * @return the xml
     */
    @PostMapping(value = "/getxml")
    public String getXml(@RequestBody Question model) throws Exception {
        return QuestionXmlMaker.getFullQtiXml(model);
    }

    /**
     * 根据试题模型得到试题标题.
     *
     * @param model the model
     * @return the xml
     */
    @PostMapping(value = "/gettitle")
    public String getTitle(@RequestBody Question model) throws Exception {
        return QuestionXmlMaker.getQuestionTitle(model);
    }
}
