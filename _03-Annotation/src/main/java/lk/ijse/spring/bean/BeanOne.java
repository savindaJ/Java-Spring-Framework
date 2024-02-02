package lk.ijse.spring.bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author : savindaJ
 * @date : 2024-02-02
 * @since : 0.1.0
 **/
@Component
//@ComponentScan(basePackages = "lk.ijse.spring")
public class BeanOne {
    public BeanOne() {
        System.out.println("bean 1 !");
    }
}
