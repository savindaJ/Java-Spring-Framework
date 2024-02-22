package lk.ijse.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author : savindaJ
 * @date : 2024-02-22
 * @since : 0.1.0
 **/
@Component
public class BeanOne {
    public BeanOne() {
        System.out.println("BeanOne Instantiated");
    }

    @Autowired
    public void setName(@Value("Savinda") String name , @Value("10") Integer age) {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}
