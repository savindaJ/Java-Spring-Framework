package lk.ijse.spring;

import lk.ijse.spring.bean.BeanOne;
import lk.ijse.spring.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : savindaJ
 * @date : 2024-02-09
 * @since : 0.1.0
 **/
public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

//        BeanOne bean = (BeanOne) ctx.getBean("getBean");
//        System.out.println(bean);
//        bean.seyHi();
//
//        BeanOne bean2 = (BeanOne) ctx.getBean("getBean");
//        System.out.println(bean2);
//        bean.seyHi();
        boolean getBean = ctx.containsBeanDefinition("getBean");
        System.out.println(getBean); // not get BEAN but BEAN definition in hear !
    }
}
