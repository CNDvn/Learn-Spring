package com.cndvn.springbootdiary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDiaryApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootDiaryApplication.class, args);
        Engine engine = context.getBean("VNEngine", Engine.class);
    }

}
