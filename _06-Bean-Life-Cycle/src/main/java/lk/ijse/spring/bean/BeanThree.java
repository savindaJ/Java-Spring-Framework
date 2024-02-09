package lk.ijse.spring.bean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author : savindaJ
 * @date : 2024-02-09
 * @since : 0.1.0
 **/
@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BeanThree {
    public BeanThree() {
        System.out.println("Bean Three > initialize !");
    }

    @PostConstruct // override after property set !
    public void init(){
        System.out.println("Bean three > after property set !");
    }

    @PreDestroy // override destroy !
    public void destroy(){
        System.out.println("Bean Three > destroy");
    }
}
