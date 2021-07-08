package com.cnd.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping(value = {"/","/home"})
    public String homeapage(){
        return "home";
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
