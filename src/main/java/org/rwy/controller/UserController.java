package org.rwy.controller;

import org.rwy.entity.User;
import org.rwy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import java.util.List;
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/queryAll")
    public String queryAll(Model model) {
        System.out.println("controller查询全部数据");
        // 调用注入的 userService 调用 queryAll 方法
        List<User> users = userService.queryAll();
        // 将 users 放入 users
        model.addAttribute("users",users);
        return "success";
    }
    @RequestMapping("/insert")
    public String insert(User user) {
        System.out.println("controller插入数据");
        // 调用注入的 userService 调用 insert 方法
        userService.insertUser(user);
        return "success";
    }
}



