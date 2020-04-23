package com.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication
@MapperScan("com.springboot.mapper")
public class mySpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(mySpringBootApplication.class,args);
        System.out.println("mySpringBootApplication服务已经启动");
    }
}
