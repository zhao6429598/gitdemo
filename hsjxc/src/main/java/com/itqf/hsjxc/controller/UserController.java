package com.itqf.hsjxc.controller;

import com.itqf.hsjxc.bean.Result;
import com.itqf.hsjxc.bean.User;
import com.itqf.hsjxc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * projectName: hsjxc
 *
 * @author: 赵伟风
 * time: 2020/11/2 16:09
 * description:处理用户模块的请求的controller
 * 我们controller返回json数据
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("login")
    public Result login(User user){

        //调用用户的登录方法
        Result result = userService.login(user);

        return result;
    }

}
