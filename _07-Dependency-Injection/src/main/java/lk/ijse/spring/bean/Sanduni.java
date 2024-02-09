package lk.ijse.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author : savindaJ
 * @date : 2024-02-09
 * @since : 0.1.0
 **/
@Component
public class Sanduni implements GirlFriend, BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public Sanduni() {
        System.out.println("sanduni init !");
    }

    @Override
    public void loveOnlyMe() {
        System.out.println("Love Him !");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("sanduni set bean factory !");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("sanduni set bean name !");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("sanduni destroyed !");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("sanduni after property set !");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("sanduni set context !");
    }
}
