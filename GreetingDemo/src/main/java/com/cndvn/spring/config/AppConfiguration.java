package com.cndvn.spring.config;

import com.cndvn.spring.lang.Language;
import com.cndvn.spring.lang.impl.Vietnamese;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.cndvn.spring.bean")
public class AppConfiguration {
    @Bean(name="language")
    public Language getLanguage(){
        return new Vietnamese();
    }
}
