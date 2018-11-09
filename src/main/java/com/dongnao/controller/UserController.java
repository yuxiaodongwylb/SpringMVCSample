package com.dongnao.controller;

import com.dongnao.entity.User;
import com.dongnao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

/**
 * @description:
 * @author: YuXD
 * @create: 2018-11-09 20:51
 **/
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users/{id}")
    public ModelAndView getUser(@PathVariable("id") Integer id){
        // 获取用户信息
        User user = userService.getUserById(id);
        ModelAndView mv = new ModelAndView("userDetail");
        mv.addObject("user",user);
        return mv;
    }

}
