package lk.ijse.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : savindaJ
 * @date : 2024-02-02
 * @since : 0.1.0
 **/
public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext acx = new AnnotationConfigApplicationContext();
        acx.register(AppConfig.class);
        acx.refresh();
        acx.registerShutdownHook();
    }
}
