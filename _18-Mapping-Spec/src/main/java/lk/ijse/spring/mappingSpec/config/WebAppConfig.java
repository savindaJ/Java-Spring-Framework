package lk.ijse.spring.mappingSpec.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author : savindaJ
 * @date : 2024-03-07
 * @since : 0.1.0
 **/
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "lk.ijse.spring.mappingSpec.api")
public class WebAppConfig {
public WebAppConfig() {
        System.out.println("WebAppConfig Instantiated");
    }
}
