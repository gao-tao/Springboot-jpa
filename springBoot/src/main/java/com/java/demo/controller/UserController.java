package com.java.demo.controller;

import com.java.demo.Service.UserService;
import com.java.demo.entry.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by GaoTao on 2017/12/19.
 */
@RestController
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("index")
    public ModelAndView index(){
        ModelAndView mav = new ModelAndView("html/login");
        return mav;
    }

    @GetMapping
    @RequestMapping("find")
    public ModelAndView find(){
        ModelAndView mav = new ModelAndView("html/index::userList");
        List<User> userList = userService.find();
        mav.addObject("list",userList);
        return mav;
    }
}
