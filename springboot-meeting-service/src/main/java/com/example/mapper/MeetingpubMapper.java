package com.example.mapper;

import com.example.pojo.Meetingpub;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface MeetingpubMapper {
    int deleteByPrimaryKey(Byte id);

    int insert(Meetingpub record);

    int insertSelective(Meetingpub record);

    Meetingpub selectByPrimaryKey(Byte id);

    int updateByPrimaryKeySelective(Meetingpub record);

    int updateByPrimaryKey(Meetingpub record);

    @Select("select * from meetingpub where pcode=#{pcode}")
    Meetingpub selectByPcode(String pcode);
}