package lk.ijse.spring.config;

import lk.ijse.spring.bean.BeanOne;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author : savindaJ
 * @date : 2024-02-09
 * @since : 0.1.0
 **/
@Configuration
@ComponentScan(basePackageClasses = BeanOne.class)
public class AppConfig {
    public AppConfig() {
        System.out.println("Configure init !!");
    }

    @Bean // this is bean definition !
    public BasicDataSource getConnection(){
        BasicDataSource bcp = new BasicDataSource();
        bcp.setDriverClassName("");
        bcp.setInitialSize(2);
        bcp.setMaxTotal(10);
        bcp.setPassword("");
        bcp.setUrl("");
        bcp.setUsername("");
        return bcp;
    }
}
