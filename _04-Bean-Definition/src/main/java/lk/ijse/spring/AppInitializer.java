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
        AnnotationConfigApplicationContext act = new AnnotationConfigApplicationContext();
        act.register(AppConfig.class);
        act.refresh();


        boolean beanOne = act.containsBeanDefinition("getBean"); // true by using bean id is method name
        // can get allowed bean definition status in this method ! by using bean id
        boolean beanFour = act.containsBeanDefinition("beanTwo");

        System.out.println("bean create definition in hear beanOne :: "+ beanOne); // false
        System.out.println("bean create definition in hear beanFour :: "+ beanFour); //true

        BeanOne bean = act.getBean(BeanOne.class);
        bean.seyHi();


    }
}
