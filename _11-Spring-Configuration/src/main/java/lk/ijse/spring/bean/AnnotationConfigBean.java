package lk.ijse.spring.bean;

import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

/**
 * @author : savindaJ
 * @date : 2024-02-22
 * @since : 0.1.0
 **/

@Component
public class AnnotationConfigBean {
    public AnnotationConfigBean() {
        System.out.println("BeanOne Instantiated");
    }
}
