package cnd.vn.demo;

import cnd.vn.demo.databaseconfig.DatabaseConnector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

        //Demo cho phần sử dụng @Value và config file
//        DatabaseConnector connector = context.getBean(DatabaseConnector.class);
//        connector.connect();
    }

}
