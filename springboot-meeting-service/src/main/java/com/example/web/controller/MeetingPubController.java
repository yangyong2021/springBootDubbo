package com.example.web.controller;

import com.example.pojo.Meetingpub;
import com.example.service.MeetingPubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Yangyong
 * 2022-04-14 9:56
 */
@Controller
@RequestMapping("/meetingpub")
public class MeetingPubController {
    @Autowired
    private MeetingPubService meetingPubService;
    //根据会议编号查询会议信息
    @ResponseBody
    @RequestMapping(value = "{pcode}",method = RequestMethod.GET)
    public Meetingpub selectByPcode(@PathVariable("pcode") final String pcode){
        return meetingPubService.selectByPcode(pcode);
    }
}
