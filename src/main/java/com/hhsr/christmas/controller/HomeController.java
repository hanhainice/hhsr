package com.hhsr.christmas.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by hanhai on 2017/1/6.
 */

@Slf4j
@Controller
@RequestMapping(value = "/home")
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public String home(){
        log.info("进入home+++++++++++");
        return "home";
    }

}
