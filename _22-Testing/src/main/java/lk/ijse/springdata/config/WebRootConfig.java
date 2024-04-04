package lk.ijse.springdata.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @author : savindaJ
 * @date : 2024-03-27
 * @since : 0.1.0
 **/
@Configuration
@PropertySource("classpath:application.properties")
@Import(JPAConfig.class)
@ComponentScan(basePackages = "lk.ijse.springdata")
public class WebRootConfig {
}
