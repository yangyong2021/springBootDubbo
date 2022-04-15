package com.example.service;

import com.example.pojo.User;

/**
 * @author Yangyong
 * 2022-04-13 19:48
 */
public interface UserService {
    /*
    * TODO 根据用户ID查询用户信息
    * */
    User selectByPrimaryKey(Integer id);
}
