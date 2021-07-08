package cnd.vn.demo.springprofiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("local")
public class LocalDatasourceConfig {
    @Bean
    public LocalDatasource localDatasource(){
        return new LocalDatasource("Local object, chỉ khỏi tạo khi 'local' profile active");
    }
}
