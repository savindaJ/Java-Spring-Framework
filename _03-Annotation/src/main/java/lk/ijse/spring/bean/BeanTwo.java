package lk.ijse.spring.bean;

import org.springframework.stereotype.Component;

/**
 * @author : savindaJ
 * @date : 2024-02-02
 * @since : 0.1.0
 **/
//@Component(value = "myBean")
@Component("myBean") // set value
public class BeanTwo {
    public BeanTwo() {
        System.out.println("bean 2 !");
    }
}
