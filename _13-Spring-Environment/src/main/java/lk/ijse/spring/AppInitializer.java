package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Properties;

/**
 * @author : savindaJ
 * @date : 2024-02-22
 * @since : 0.1.0
 **/
public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

        System.getenv().forEach((k, v) -> System.out.println("Key -> " + k + " : Value ->" + v)); // get os environment variables
        System.out.println("=====================================");
        System.out.println("=====================================");
        System.out.println("=====================================");
        System.out.println("=====================================");
        System.out.println("=====================================");
        System.out.println("=====================================");
        System.getProperties().forEach((k, v) -> System.out.println("Key -> " + k + " : Value ->" + v)); // get jvm properties

        System.out.println("=====================================");
        System.out.println("=====================================");
        System.out.println("=====================================");
        System.out.println("=====================================");
        System.out.println("=====================================");
        System.out.println("=====================================");

        Properties properties = System.getProperties(); // get jvm properties
        for (Object key : properties.keySet()) {
            System.out.println("Key -> " + key + " : Value ->" + properties.get(key));
        }
    }
}
