package lk.ijse.spring.bean;

import org.springframework.stereotype.Component;

/**
 * @author : savindaJ
 * @date : 2024-02-02
 * @since : 0.1.0
 **/
@Component
public class SpringBean {
    public SpringBean() {
        System.out.println("Spring Bean instance initialized !");
    }

    public void myFunction(){
        System.out.println("my-Function !");
    }
}
