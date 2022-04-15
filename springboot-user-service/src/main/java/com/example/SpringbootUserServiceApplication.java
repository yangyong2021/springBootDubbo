package com.example;


import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.example.mapper"})
@EnableDubbo //扫描dubbo
public class SpringbootUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootUserServiceApplication.class, args);
    }

}
