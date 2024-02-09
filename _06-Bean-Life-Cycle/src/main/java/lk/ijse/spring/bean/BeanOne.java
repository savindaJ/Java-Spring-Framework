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
public class BeanOne implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public BeanOne() {
        System.out.println("Bean one > Instantiate !");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean one > set Bean name Aware : "+s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean one > set Bean factory : "+beanFactory.getClass().getName());
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean one > destroy !");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean one > after Property set !");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Bean one > set application context !");
    }
}
