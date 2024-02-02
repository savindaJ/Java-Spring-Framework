package lk.ijse.spring;

import lk.ijse.spring.bean.BeanOne;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : savindaJ
 * @date : 2024-02-02
 * @since : 0.1.0
 **/
@Configuration
@ComponentScan(/*basePackages = "lk.ijse.spring.bean" ,*/ basePackageClasses = BeanOne.class) // search components in root but lk.ijse.spring.bean -> this path scan one this path
public class Config {
    public Config() {
        System.out.println("config");
    }
}
