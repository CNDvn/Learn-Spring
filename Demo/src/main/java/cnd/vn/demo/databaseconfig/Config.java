package cnd.vn.demo.databaseconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Value("${cnd.mysql.url:default}")
    String myUrl;

    @Bean
    DatabaseConnector connector(){
        DatabaseConnector connector = new MySqlConnector();
        connector.setUrl(myUrl);
        return connector;
    }
}
