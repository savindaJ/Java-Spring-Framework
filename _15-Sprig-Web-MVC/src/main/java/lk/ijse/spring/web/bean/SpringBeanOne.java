package lk.ijse.spring.web.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author : savindaJ
 * @date : 2024-03-01
 * @since : 0.1.0
 **/
//@Component
public class SpringBeanOne implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public SpringBeanOne() {
        System.out.println("SpringBeanOne Instantiated");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryAware.setBeanFactory");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("BeanNameAware.setBeanName");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean.destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean.afterPropertiesSet");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContextAware.setApplicationContext");
    }
}
