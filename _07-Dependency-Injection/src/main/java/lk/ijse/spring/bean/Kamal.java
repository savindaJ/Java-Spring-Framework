package lk.ijse.spring.bean;

import lk.ijse.spring.util.Injector;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author : savindaJ
 * @date : 2024-02-09
 * @since : 0.1.0
 **/
@Component
public class Kamal implements Injector, BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    /*Property injection*/
//    @Autowired
    private GirlFriend girl;

    /*interface through injection*/
    @Autowired
    @Override
    public void injectGirl(GirlFriend girlFriend) {
        this.girl = girlFriend;
    }

    /*Constructor injection !*/
//    @Autowired
    public Kamal() {
        System.out.println("kmal init !");
        System.out.println("Have i got a girl friend : " + girl);
    }

//    @PostConstruct // initializing bean after
//    public void init(){
//        System.out.println("Have i got a girl friend : " + girl);
//    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("kamal set bean factory !");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("kamal set bean !");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("kamal destroy !");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("populate property !");
        System.out.println("Got a girl fiend : " + girl);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("kamal set context !");
    }

    /*setter method injection !*/
//    @Autowired
    public void setGirl(Sanduni sanduni) {
        this.girl = sanduni;
    }

}
