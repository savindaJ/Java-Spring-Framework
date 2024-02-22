package lk.ijse.spring;

import lk.ijse.spring.bean.BeanOne;
import lk.ijse.spring.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;
import java.util.Properties;

/**
 * @author : savindaJ
 * @date : 2024-02-22
 * @since : 0.1.0
 **/
public class AppInitializerEnv {
    public static void main(String[] args) {

        Properties properties = System.getProperties();
        properties.setProperty("db.url", "jdbc:mysql://localhost:3306/web_test");
        properties.setProperty("db.user", "root");
        properties.setProperty("db.password", "80221474");

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();
        BeanOne bean = ctx.getBean(BeanOne.class);
        bean.getEnvironmentVariable();
    }
}
