package cnd.vn.demo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@Component
@PropertySource("classpath:config.properties")
@ConfigurationProperties(prefix = "cnd")
public class CndAppProperties {
    private String email;
    private String googleAnalyticsId;
}
