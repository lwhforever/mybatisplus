package com.lwh.mybaitsplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//扫描mapper接口所在的包
@MapperScan("com.lwh.mybaitsplus.mapper")
public class MybaitsplusApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybaitsplusApplication.class, args);
    }

}
