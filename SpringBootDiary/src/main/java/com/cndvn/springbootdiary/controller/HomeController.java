package com.cndvn.springbootdiary.controller;

import com.cndvn.springbootdiary.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private Engine engine;

    @GetMapping("/")
    public String homePage(){
        engine.run();
        return "index";
    }
}
