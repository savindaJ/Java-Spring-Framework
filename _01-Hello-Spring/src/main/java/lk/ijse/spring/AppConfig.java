package lk.ijse.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Logger;

/**
 * @author : savindaJ
 * @date : 2024-02-02
 * @since : 0.1.0
 **/

@Configuration
@ComponentScan // active component scanning process ! , direct '@Component' annotation !
public class AppConfig {
//    Logger print a terminal warnings and information
//    private static final Logger LOGGER = Logger.getLogger(
//            Thread.currentThread().getStackTrace()[0].getClassName());

    // bean definition and configuration in hear !
    // configuration to source

    public AppConfig() {
//        LOGGER.info("Configuration instance initialized !");
        System.out.println("Configuration instance initialized !");
    }
}
