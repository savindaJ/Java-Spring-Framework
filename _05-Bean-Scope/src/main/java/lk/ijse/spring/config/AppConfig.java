package lk.ijse.spring.config;

import lk.ijse.spring.bean.BeanOne;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author : savindaJ
 * @date : 2024-02-09
 * @since : 0.1.0
 **/
@Configuration
@ComponentScan(basePackages = "lk.ijse.spring.bean")
public class AppConfig {
    public AppConfig() {
        System.out.println("App config init !!!");
    }

    @Scope(scopeName = "prototype")
    @Bean
    public BeanOne getBean(){
        return new BeanOne();
    }
}
