package lk.ijse.spring.bean;

import org.springframework.stereotype.Component;

/**
 * @author : savindaJ
 * @date : 2024-02-16
 * @since : 0.1.0
 **/
@Component
public class SpringBean {

    public SpringBean(String name) {
        System.out.println("init spring bean !");
    }

}
