package lk.ijse.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : savindaJ
 * @date : 2024-02-22
 * @since : 0.1.0
 **/
@Configuration
@ComponentScan(basePackages = "lk.ijse.spring.bean")
public class AppRootConfig {
    public AppRootConfig() {
        System.out.println("AppRootConfig Instantiated");
    }

    @Bean
    public String name() {
        return "kamal";
    }
}
