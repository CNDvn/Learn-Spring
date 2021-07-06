package com.example.demo;

import com.example.demo.ConfigDatabase.DatabaseConnector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext conext = SpringApplication.run(DemoApplication.class, args);
        DatabaseConnector connector = conext.getBean(DatabaseConnector.class);
        connector.connect();
    }
}
