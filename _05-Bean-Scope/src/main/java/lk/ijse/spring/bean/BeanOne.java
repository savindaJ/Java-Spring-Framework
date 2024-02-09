package lk.ijse.spring.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * @author : savindaJ
 * @date : 2024-02-09
 * @since : 0.1.0
 **/
//@Scope(scopeName = "prototype") // remove singleton behavior // default singleton
//@Scope(scopeName = "singleton") // default singleton
//@Component // goto config class seen this bean method
public class BeanOne {
    public BeanOne() {
        System.out.println("ben One initialize !");
    }

    public void seyHi(){
        System.out.println("Hi spring Scope !");
    }
}
