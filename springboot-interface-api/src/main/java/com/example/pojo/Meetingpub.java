package com.example.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Meetingpub implements Serializable {
    //主键ID
    private Integer id;
    //会议编号
    private String pcode;
    //会议召开时间
    private Date ptime;
    //会议类别
    private String tname;
    //会议标题
    private String ptitle;

    private String zone;

    private String remark;

    private Date createdate;

    private Integer status;
    //关联的用户ID
    private Integer uid;
    //关联的用户对象
    private User user;
}