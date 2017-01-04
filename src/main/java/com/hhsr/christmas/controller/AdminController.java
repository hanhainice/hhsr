package com.hhsr.christmas.controller;

import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hanhai on 2017/1/4.
 */
public class AdminController {

    // 只有角色为admin的才能访问
    @RequiresRoles("admin")
    @RequestMapping(value = "/admin/role")
    public String adminWithRole(){
        return "admin/withrole";
    }

    // 只用同时具有user:view和user:create权限才能访问
    @RequiresPermissions(value={"user:view","user:create"}, logical= Logical.AND)
    @RequestMapping(value = "/admin/auth")
    public String adminWithAuth(){
        return "admin/withauth";
    }

}
