package com.example.web.controller;

import com.example.pojo.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Yangyong
 * 2022-04-13 19:53
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    //根据用户ID查信息
    @ResponseBody
    @RequestMapping(value = "{id}",method = RequestMethod.GET)
    public User selectById(@PathVariable("id") final Integer id){
        return userService.selectByPrimaryKey(id);
    }
}
