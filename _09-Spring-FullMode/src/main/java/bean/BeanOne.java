package bean;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author : savindaJ
 * @date : 2024-02-22
 * @since : 0.1.0
 **/
//@Component
public class BeanOne implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    private BasicDataSource basicDataSource;

    public void setBasicDataSource(BasicDataSource basicDataSource) {
        this.basicDataSource = basicDataSource;
    }

    public BeanOne() {
        System.out.println("BeanOne Instantiated");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory Aware");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean Name Aware");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("BeanOne Destroyed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("BeanOne Properties Set");
        System.out.println(basicDataSource.getUrl());
        System.out.println(basicDataSource.getUsername());
        System.out.println(basicDataSource.getPassword());
        System.out.println(basicDataSource.getDriverClassName());
        System.out.println(basicDataSource.getInitialSize());
        System.out.println(basicDataSource.getMaxTotal());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
