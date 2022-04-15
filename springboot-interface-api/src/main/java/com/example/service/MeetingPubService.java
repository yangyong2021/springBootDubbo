package com.example.service;

import com.example.pojo.Meetingpub;

/**
 * @author Yangyong
 * 2022-04-14 9:15
 */
public interface MeetingPubService {
    // TODO 根据会议编号查询会议信息
    public Meetingpub selectByPcode(String pcode);

}
