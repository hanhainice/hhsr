package com.hhsr.christmas.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hanhai on 2017/1/4.
 */

@Slf4j
public class AdminController {

    // 只有角色为admin的才能访问
    @RequestMapping(value = "/admin/role")
    public String adminWithRole(){
        return "admin/withrole";
    }

    // 只用同时具有user:view和user:create权限才能访问
    @RequestMapping(value = "/admin/auth")
    public String adminWithAuth(){
        return "admin/withauth";
    }

}
