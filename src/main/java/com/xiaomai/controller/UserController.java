package com.xiaomai.controller;

import com.xiaomai.pojo.Users;
import com.xiaomai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    @Qualifier("UserServiceImpl")
    private UserService userService;

    @RequestMapping("/allUser")
    public String allUser(Model model){
        List<Users> list = userService.userList();
        System.out.println(list);
        System.out.println("你好");
        return "test";
    }
}


