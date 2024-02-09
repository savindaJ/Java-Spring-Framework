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

    /*@Bean(name = "myBeanConnection") // this is bean definition ! full mode
    public BasicDataSource getConnection(){
        BasicDataSource dbpc = new BasicDataSource();
        dbpc.setUsername("root");
        dbpc.setUrl("jdbc:mysql://localhost:3306/web_test");
        dbpc.setPassword("80221474");
        dbpc.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dbpc.setInitialSize(2);
        dbpc.setMaxTotal(5);
        return dbpc;
    }*/
}
