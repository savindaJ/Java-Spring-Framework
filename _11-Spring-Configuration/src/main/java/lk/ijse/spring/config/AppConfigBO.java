package lk.ijse.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : savindaJ
 * @date : 2024-02-22
 * @since : 0.1.0
 **/
@Configuration
@ComponentScan("lk.ijse.spring.bo")
public class AppConfigBO {
    public AppConfigBO() {
        System.out.println("AppConfigThree Instantiated");
    }
}
