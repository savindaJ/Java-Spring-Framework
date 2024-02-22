package lk.ijse.spring;

import lk.ijse.spring.bean.BeanOne;
import lk.ijse.spring.config.AppRootConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : savindaJ
 * @date : 2024-02-22
 * @since : 0.1.0
 **/
public class AppInitializer {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppRootConfig.class);
        ctx.registerShutdownHook();
        ctx.refresh();

        BeanOne bean = ctx.getBean(BeanOne.class);
        System.out.println("Address : get by After property set : "+bean.getAddress());
    }
}
