package lk.ijse.spring.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author : savindaJ
 * @date : 2024-03-01
 * @since : 0.1.0
 **/
@Configuration // mark as a configuration class
@ComponentScan("lk.ijse.spring.web.bean") // scan the web package
@EnableWebMvc // enable spring mvc
public class WebAppConfig {
    public WebAppConfig() {
        System.out.println("WebAppConfig Instantiated");
    }
}
