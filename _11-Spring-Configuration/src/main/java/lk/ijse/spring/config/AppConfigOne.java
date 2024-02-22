package lk.ijse.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : savindaJ
 * @date : 2024-02-22
 * @since : 0.1.0
 **/
@Configuration
@ComponentScan("lk.ijse.spring.bean")
public class AppConfigOne {
    public AppConfigOne() {
        System.out.println("AppConfigOne Instantiated");
    }
}
