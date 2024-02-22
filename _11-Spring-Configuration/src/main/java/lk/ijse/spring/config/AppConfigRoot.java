package lk.ijse.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @author : savindaJ
 * @date : 2024-02-22
 * @since : 0.1.0
 **/
@Configuration
@ComponentScan("lk.ijse.spring.bean")
@ImportResource("classpath:spring.xml")
@Import({AppConfigDAO.class , AppConfigBO.class}) // sey register my other config classes , AppConfigDAO and AppConfigBO
// this annotation can be used to import other config classes this config class is used to import other config classes
public class AppConfigRoot {
    public AppConfigRoot() {
        System.out.println("AppConfigTwo Instantiated");
    }
}
