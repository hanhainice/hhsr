package com.hhsr.christmas.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hanhai on 2017/1/6.
 */

@Slf4j
@Controller
@RequestMapping(value = "/home")
public class HomeController {

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public String home(){
        return "home";
    }

}
