package lk.ijse.spring;

import lk.ijse.spring.bean.SpringBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : savindaJ
 * @date : 2024-02-02
 * @since : 0.1.0
 **/
public class XMLConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext act = new AnnotationConfigApplicationContext("context.xml");
        act.register(SpringBean.class);
        SpringBean bean = act.getBean(SpringBean.class);
        System.out.println(bean);

    }
}
