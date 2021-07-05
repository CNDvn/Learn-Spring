package com.cndvn.spring.lang.impl;

import com.cndvn.spring.lang.Language;

public class Vietnamese implements Language {

    @Override
    public String getGreeting() {
        return "Xin chao";
    }

    @Override
    public String getBye() {
        return "Tam Biet";
    }
}
