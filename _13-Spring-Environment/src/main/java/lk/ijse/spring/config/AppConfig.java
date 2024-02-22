package lk.ijse.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author : savindaJ
 * @date : 2024-02-22
 * @since : 0.1.0
 **/
@Configuration
@ComponentScan("lk.ijse.spring.bean")
@PropertySource("classpath:application.properties") // load properties file resource bundle from classpath
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig Instantiated");
    }
}
