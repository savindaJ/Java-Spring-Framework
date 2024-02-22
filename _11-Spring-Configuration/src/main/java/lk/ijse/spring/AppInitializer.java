package lk.ijse.spring;

import lk.ijse.spring.config.AppConfigRoot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : savindaJ
 * @date : 2024-02-22
 * @since : 0.1.0
 **/
public class AppInitializer {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfigRoot.class);
        ctx.refresh();
        ctx.registerShutdownHook();
    }
}
