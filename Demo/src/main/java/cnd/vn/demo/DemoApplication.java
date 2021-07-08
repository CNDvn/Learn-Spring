package cnd.vn.demo;

import cnd.vn.demo.springprofiles.LocalDatasource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.StandardEnvironment;

@SpringBootApplication
@EnableConfigurationProperties
public class DemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
//        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

        //Demo cho phần sử dụng @Value và config file
//        DatabaseConnector connector = context.getBean(DatabaseConnector.class);
//        connector.connect();

        //spring profiles
        SpringApplication application = new SpringApplication(DemoApplication.class);
        ConfigurableEnvironment environment = new StandardEnvironment();
        //thay đổi môi trường bằng cách comment và xem kết quả
//        environment.setActiveProfiles("local");
        environment.setActiveProfiles("aws");
        application.setEnvironment(environment);
        ApplicationContext context = application.run(args);
        LocalDatasource localDatasource = context.getBean(LocalDatasource.class);
        System.out.println(localDatasource);

    }

    @Autowired
    CndAppProperties cndAppProperties;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Global variable");
        System.out.println("\t email: " + cndAppProperties.getEmail());
        System.out.println("\t GA ID: " + cndAppProperties.getGoogleAnalyticsId());

    }
}
