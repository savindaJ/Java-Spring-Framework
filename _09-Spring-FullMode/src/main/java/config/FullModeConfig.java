package config;

import bean.BeanOne;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author : savindaJ
 * @date : 2024-02-22
 * @since : 0.1.0
 **/
/*Full mode*/
//@Configuration
//@ComponentScan("bean")
public class FullModeConfig {

    public FullModeConfig() {
        System.out.println("FullModeConfig Instantiated");
    }

    @Bean
    public BeanOne beanOne() {
        return new BeanOne();
    }


    @Bean
    public BasicDataSource dataSource() {
        System.out.println("Basic Datasource Instantiated");
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/web_test");
        dataSource.setUsername("root");
        dataSource.setPassword("80221474");
        return dataSource;
    }
}
