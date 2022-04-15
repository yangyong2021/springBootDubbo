package com.example.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.mapper.MeetingpubMapper;
import com.example.pojo.Meetingpub;
import com.example.pojo.User;
import com.example.service.MeetingPubService;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Yangyong
 * 2022-04-14 9:22
 */
@Service
public class MeetingPubServiceImpl implements MeetingPubService {
    @Autowired
    private MeetingpubMapper meetingpubMapper;
    @Reference //注册中心中引用
    private UserService userService;
    @Override
    public Meetingpub selectByPcode(String pcode) {

        Meetingpub meetingpub = meetingpubMapper.selectByPcode(pcode);

        User user = userService.selectByPrimaryKey(meetingpub.getUid());

        meetingpub.setUser(user);

        return meetingpub;
    }
}
