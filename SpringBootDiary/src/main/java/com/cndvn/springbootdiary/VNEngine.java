package com.cndvn.springbootdiary;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component()
public class VNEngine implements Engine {

    @Override
    public void run() {
        System.out.println("hello");
    }

    @PostConstruct
    public void init() {
        System.out.println("init data");
    }

    @PreDestroy
    public void stop() {
        System.out.println("stop data");
    }
}
