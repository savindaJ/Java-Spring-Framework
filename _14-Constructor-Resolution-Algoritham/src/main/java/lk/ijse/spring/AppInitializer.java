package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : savindaJ
 * @date : 2024-02-22
 * @since : 0.1.0
 **/
public class AppInitializer {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        context.registerShutdownHook();
    }
}
