package lk.ijse.spring;

import lk.ijse.spring.bean.BeanOne;
import lk.ijse.spring.bean.BeanTwo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : savindaJ
 * @date : 2024-02-02
 * @since : 0.1.0
 **/
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext act = new AnnotationConfigApplicationContext();
        act.register(BeanOne.class);
        act.refresh();

        BeanOne beanOne = (BeanOne) act.getBean("beanOne");  // get bean by id !
        System.out.println(beanOne);

        BeanTwo beanTwo = (BeanTwo) act.getBean("myBean"); // get components annotation value !
        System.out.println(beanTwo);
    }
}
