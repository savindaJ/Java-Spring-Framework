package lk.ijse.spring.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : savindaJ
 * @date : 2024-02-22
 * @since : 0.1.0
 **/
@Configuration
@ComponentScan("lk.ijse.spring.bean")
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig Instantiated");
    }

    @Bean
    public String setString(){
        return "my String !";
    }

    @Bean
    public Integer setInteger(){
        return 10;
    }

    @Bean
    @Qualifier("myDouble")
    public Double setDouble(){
        return 10.0;
    }
}
