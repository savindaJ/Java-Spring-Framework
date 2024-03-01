package lk.ijse.spring.web.config;

import lk.ijse.spring.web.api.Controller;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author : savindaJ
 * @date : 2024-03-01
 * @since : 0.1.0
 **/
@Configuration
@ComponentScan(basePackages = {"lk.ijse.spring.web.api"})
@EnableWebMvc
public class WebAppConfig {
    public WebAppConfig() {
        System.out.println("WebAppConfig Created");
    }

    @Bean
    public Controller setController(){
        return new Controller();
    }
}
