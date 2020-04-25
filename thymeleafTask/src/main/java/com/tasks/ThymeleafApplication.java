package com.tasks;

import com.task.Test;
import com.task.TestHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class ThymeleafApplication {

    public static void main(String args[]){
        TestHandler handler=new TestHandler();
        handler.getName(new Test());
//        SpringApplication.run(ThymeleafApplication.class,args);

    }
}
