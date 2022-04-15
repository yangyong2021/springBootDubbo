package com.example;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class SpringbootPayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootPayServiceApplication.class, args);
    }

}
