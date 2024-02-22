package lk.ijse.spring.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author : savindaJ
 * @date : 2024-02-22
 * @since : 0.1.0
 **/
/*Light Mode !*/
@Component
public class BeanTwo {
    public BeanTwo() {
        System.out.println("BeanTwo Instantiated");
    }

    @Bean
    public BeanOne getBeanOne() {
        return new BeanOne();
    }
}
