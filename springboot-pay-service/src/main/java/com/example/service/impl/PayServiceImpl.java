package com.example.service.impl;

import com.example.service.pay.PayService;
import org.springframework.stereotype.Service;

/**
 * @author Yangyong
 * 2022-04-15 10:04
 */
@Service
@com.alibaba.dubbo.config.annotation.Service //暴露服务
public class PayServiceImpl implements PayService {
    @Override
    public String account(Integer uid) {
        return uid + "账户余额为 100";
    }
}
