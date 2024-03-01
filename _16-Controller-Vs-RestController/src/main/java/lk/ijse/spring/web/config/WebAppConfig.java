package lk.ijse.spring.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : savindaJ
 * @date : 2024-03-01
 * @since : 0.1.0
 **/
@Configuration
@ComponentScan(basePackages = {"lk.ijse.spring.web.api"})
public class WebAppConfig {
    public WebAppConfig() {
        System.out.println("WebAppConfig Created");
    }
}
