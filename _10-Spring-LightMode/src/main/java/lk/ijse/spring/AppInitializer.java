package lk.ijse.spring;

import lk.ijse.spring.config.LightModeConfig;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : savindaJ
 * @date : 2024-02-22
 * @since : 0.1.0
 **/
public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(LightModeConfig.class);
        ctx.refresh();

        BasicDataSource dataSource = (BasicDataSource) ctx.getBean("dataSource");
        System.out.println(dataSource);
    }
}
