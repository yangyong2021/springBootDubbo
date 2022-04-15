package com.example.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {
    /* 用户ID*/
    private Integer id;

    private String name;

    private String email;

    private String telephone;

    private String province;

    private String city;

    private String zone;

    private Integer rid;

    private Integer status;

    private Date createdate;
}