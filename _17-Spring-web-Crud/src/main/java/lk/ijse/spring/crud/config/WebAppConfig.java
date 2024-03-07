package lk.ijse.spring.crud.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author : savindaJ
 * @date : 2024-03-06
 * @since : 0.1.0
 **/
@Configuration
@PropertySource("classpath:application.properties")
@EnableWebMvc
@ComponentScan(basePackages = "lk.ijse.spring.crud.controller")
public class WebAppConfig {
    @Bean
    public Connection connection(
            @Value("${spring.web.user}") String user,
            @Value("${spring.web.password}") String password,
            @Value("${spring.web.url}") String url,
            @Value("${spring.web.driver}") String driver
    ) throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, user, password);
        return connection;
    }
}
