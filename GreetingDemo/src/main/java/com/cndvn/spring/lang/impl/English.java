package com.cndvn.spring.lang.impl;

import com.cndvn.spring.lang.Language;

//English
public class English implements Language {
    @Override
    public String getGreeting() {
        return "Hello";
    }

    @Override
    public String getBye() {
        return "Bye bye";
    }
}
