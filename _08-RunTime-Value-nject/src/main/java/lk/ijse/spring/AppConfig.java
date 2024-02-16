package lk.ijse.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;

/**
 * @author : savindaJ
 * @date : 2024-02-16
 * @since : 0.1.0
 **/

@Configuration
@ComponentScan("lk.ijse.spring")
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig Created");
    }

    // inject using bean method
    // @Bean - inject value to the name
    @Order(3)
    @Bean
    public String getName() {
        return "Savinda";
    }

    @Order(2)
    @Bean
//    @Primary
    public String getNameTwo() {
        return "Jayasekara";
    }

    @Order(1)
    @Bean
    @Scope("prototype")
    @Qualifier("fullName")
    public String getNameThree() {
        return "Savinda Jayasekara";
    }
}
