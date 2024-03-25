package lk.ijse.springapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author : savindaJ
 * @date : 2024-03-14
 * @since : 0.1.0
 **/
@Configuration
@ComponentScan(basePackages = {"lk.ijse.springapp.service", "lk.ijse.springapp"})
@Import(JpaConfig.class)
public class WebRootConfig {
}
