package com.example.demo.ConfigDatabase;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Value("${cnd.ketnoi}")
    String myUrl;

    @Bean
    DatabaseConnector connector(){
        DatabaseConnector connector = new MySqlDatabase();
        connector.setUrl(myUrl);
        return connector;
    }
}
