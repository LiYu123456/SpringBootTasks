package com.tasks;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan(value = {"com.tasks.mapper"})
public class MybatisApplication {

    public static void main(String args[]){
        SpringApplication.run(MybatisApplication.class,args);
    }
}
