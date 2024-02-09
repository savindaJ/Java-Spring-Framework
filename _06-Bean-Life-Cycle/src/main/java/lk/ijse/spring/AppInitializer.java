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
        BeanOne bean = ctx.getBean(BeanOne.class);
        System.out.println("get bean two : "+bean.getBeanTwo());
        System.out.println("get bean three :"+bean.getThree());

        BeanOne bean2 = ctx.getBean(BeanOne.class);
        System.out.println("get bean two : "+bean2.getBeanTwo());
        System.out.println("get bean three :"+bean2.getThree());

        ctx.registerShutdownHook(); // help to destroy beans



//                app init !
//                Bean one > Instantiate !
//                Bean one > set Bean name Aware : beanOne
//                Bean one > set Bean factory : org.springframework.beans.factory.support.DefaultListableBeanFactory
//                Bean one > set application context !
//                Bean one > after Property set !
//                Bean Two > instantiate !
//                Bean Two > set Bean name Aware : beanTwo
//                Bean Two > set Bean factory : org.springframework.beans.factory.support.DefaultListableBeanFactory
//                Bean Two > set application context !
//                Bean Two > after Property set !
//                Bean Two > destroy !
//                Bean one > destroy !
    }
}
