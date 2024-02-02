package lk.ijse.spring;

import lk.ijse.spring.bean.BeanOne;
import lk.ijse.spring.bean.BeanTwo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : savindaJ
 * @date : 2024-02-02
 * @since : 0.1.0
 **/
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext act = new AnnotationConfigApplicationContext();
        act.register(Config.class);
        act.refresh();

        BeanOne beanOne = (BeanOne) act.getBean("beanOne");  // get bean by id !
        System.out.println(beanOne);

        BeanTwo beanTwo = (BeanTwo) act.getBean("myBean"); // get components annotation value !
        System.out.println(beanTwo);

//        BeanThree bean = act.getBean(BeanThree.class);  // bean three in spring directory is not gone context
//        System.out.println(bean);
    }
}
