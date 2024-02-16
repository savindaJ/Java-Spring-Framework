package lk.ijse.spring.bean;

import lk.ijse.spring.util.Injector;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author : savindaJ
 * @date : 2024-02-09
 * @since : 0.1.0
 **/
@Component
public class Kamal implements Injector, BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    // kamal has two girl friends but he is not sure which one to choose
    // so he is using @Qualifier to choose
    // @Qualifier is used to resolve the ambiguity when there are multiple beans of the same type.
    // @Qualifier is used on the field or parameter level.
    // @Qualifier is declared on the dependency and not on the bean itself.

    /*Property injection*/
//    @Autowired
    private GirlFriend girl;
    private GirlFriend girlTwo;

    /*interface through injection*/
//    @Autowired
    @Override
    public void injectGirl(GirlFriend girlFriend) {
        this.girl = girlFriend;
    }

    /*Constructor injection !*/
    @Autowired
    public Kamal(@Qualifier("sanduni")GirlFriend girlFriend) {

        System.out.println("kmal init !");
        this.girl = girlFriend;
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


    public void showAfterGirlsSet(){
        System.out.println("show method girl sanduni = "+girl);
        System.out.println("show method girl pyumi = "+girlTwo);
    }

    @Autowired
    public void setGirlTwo(@Qualifier("piyumi")GirlFriend girlFriend){
        this.girlTwo = girlFriend;
    }

}
