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
        System.out.println("BeanOne no args Instantiated");
    }

    @Autowired(required = false)
    public BeanOne(@Value("kamal") String name,@Value("matara") String address){
        System.out.println("BeanOne all args Instantiated");
    }

    public BeanOne(@Value("kamal") String name){
        System.out.println("BeanOne single args Instantiated");
    }

}
