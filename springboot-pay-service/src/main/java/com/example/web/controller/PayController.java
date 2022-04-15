package com.example.web.controller;

import com.example.service.pay.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Yangyong
 * 2022-04-15 10:08
 */
@Controller
@RequestMapping("/pay")
public class PayController {
    @Autowired
    private PayService payService;
    @ResponseBody
    @RequestMapping("account/{uid}")
    public String account(@PathVariable("uid") Integer uid){
        return payService.account(uid);
    }
}
