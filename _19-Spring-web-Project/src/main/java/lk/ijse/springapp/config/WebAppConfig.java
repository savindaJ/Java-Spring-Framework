package lk.ijse.springapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author : savindaJ
 * @date : 2024-03-14
 * @since : 0.1.0
 **/
@Configuration
@EnableWebMvc
@ComponentScan("lk.ijse.springapp")
public class WebAppConfig {
}
