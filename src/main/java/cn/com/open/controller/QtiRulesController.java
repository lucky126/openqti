package cn.com.open.controller;

import cn.com.open.rulestransfer.Rules;
import cn.com.open.rulestransfer.RulesXmlMaker;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lucky on 2017/12/8.
 */
@RestController
@RequestMapping(value = "/openqti/rules")
public class QtiRulesController {

    /**
     * 根据策略模型得到xml.
     *
     * @param rules the rules
     * @return the full qti xml
     * @throws Exception the exception
     */
    @PostMapping(value = "/getFullQtiXml")
    public String getFullQtiXml(@RequestBody Rules rules) throws Exception {
        return RulesXmlMaker.getFullQtiXml(rules);
    }

    /**
     * 根据xml构造策略模型实体.
     *
     * @param orginalXml the orginal xml
     * @return the rules
     * @throws Exception the exception
     */
    @PostMapping(value = "/get")
    public Rules get(@RequestBody String orginalXml) throws Exception {
        Rules rules = new Rules(orginalXml);
        return rules;
    }
}
