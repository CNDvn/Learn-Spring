package com.cndvn.springbootdiary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component()
@Primary
public class ChinaEngine implements Engine{
    @Override
    public void run() {
        System.out.println("china");
    }
}
