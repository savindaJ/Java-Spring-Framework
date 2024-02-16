package lk.ijse.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author : savindaJ
 * @date : 2024-02-16
 * @since : 0.1.0
 **/
@Component
public class BeanTwo {
    @Autowired
    public BeanTwo(String[] name) {
        System.out.println("BeanTwo Instantiated");
    }
}
