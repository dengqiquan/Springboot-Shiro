package com.study.shiro.controller;

import com.study.common.response.Response;
import com.study.shiro.domain.HrDto;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description: 登录
 * @author: dqq
 * @date: 2020/9/30 10:50
 */
@Controller
public class LoginController extends BaseController{

    /**
     * 登录
     * @param
     * @return
     */
    @RequestMapping("login")
    public String login(String username,String password,Model model) {
        // 添加用户认证信息
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(username, password);
        // 进行验证，这里可以捕获异常，然后返回对应信息
        try {
            SecurityUtils.getSubject().login(usernamePasswordToken);
            return "redirect:/test";
        } catch (UnknownAccountException e) {
            model.addAttribute("msg", "用户名不存在");
            return "login";
        }catch (IncorrectCredentialsException e ){
            model.addAttribute("msg","用户密码错误");
            return "login";
        }
    }

    /**
     *
     * @param model
     * @return
     */
    @RequestMapping("test")
    public String thymeleafTest(Model model) {
        model.addAttribute("name", "小学生");
        return "test";
    }

    /**
     * 登录跳转
     * @param
     * @return
     */
    @RequestMapping("toLogin")
    public String toLogin() {
        // 添加用户认证信息
        return "login";
    }

    /**
     * 登录跳转
     * @param
     * @return
     */
    @RequestMapping("add")
    public String add() {
        // 添加用户认证信息
        System.out.println("进入add 方法了 ");
        return "add";
    }
    /**
     * 登录跳转
     * @param
     * @return
     */
    @RequestMapping("update")
    public String update() {
        // 添加用户认证信息
        return "update";
    }/**
     * 登录跳转
     * @param
     * @return
     */
    @RequestMapping("noAuth")
    public String noAuth() {
        // 添加用户认证信息
        return "noAuth";
    }
}
