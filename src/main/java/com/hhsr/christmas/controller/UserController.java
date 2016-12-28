package com.hhsr.christmas.controller;

import com.hhsr.christmas.entity.CrsUser;
import com.hhsr.christmas.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


/**
 * @author liuzh_3nofxnp
 * @since 2015-09-19 17:15
 */
@Controller
public class UserController {

    private static Logger log = LogManager.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.GET)
    String view(CrsUser user) {
        log.info("进入首页,user={}", user);

        ModelAndView result = new ModelAndView();
        if (user.getId() != null) {
            user = userService.selectByKey(user.getId());
            log.info("查询结果,user={}", user);
        }
        result.addObject("user", user);
        String abc = "abc";
        result.addObject("user", user);
        return "hello world";
    }

    @ResponseBody
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    String index(Integer index) {
        log.info("进入index,user={}", index);
        String str = "str123";
        return "hello world";
    }

    @ApiOperation(value = "保存用户信息", notes = "保存用户信息", response = Object.class, position = 2)
    @ResponseBody
    @RequestMapping(value = "/save/{peopleNum}", method = RequestMethod.GET)
    Object save(@PathVariable String peopleNum) {
        log.info("进入save,peopleNum={}", peopleNum);

        Map<String, String> resultMap = new HashMap();

        CrsUser user = new CrsUser();
        user.setCreateTime(new Date());
        user.setPeopleNum(peopleNum);
        try{
            userService.save(user);
        }catch (Exception e){
            log.error("保存用户异常,peopleNum={}, e={}", peopleNum, e);
            resultMap.put("9999", "保存失败");
            return resultMap;
        }
        resultMap.put("1000", "保存成功");
        return resultMap;
    }

}
