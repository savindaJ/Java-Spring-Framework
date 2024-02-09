package lk.ijse.spring;

import lk.ijse.spring.bean.BeanOne;
import lk.ijse.spring.bean.BeanTwo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author : savindaJ
 * @date : 2024-02-02
 * @since : 0.1.0
 **/
@Configuration
@ComponentScan(/*basePackages = "lk.ijse.spring.bean" ,*/ basePackageClasses = BeanTwo.class) // search components in root but lk.ijse.spring.bean -> this path scan one this path
// can set many classes by using = {BeanOne.class,BeanTwo.class}
public class Config {
    public Config() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        System.out.println("config");
        Class<?> test = Class.forName("lk.ijse.spring.Test");

        Constructor<?> constructor = test.getConstructor();

        Test o = (Test) constructor.newInstance();

        System.out.println("test class class name ::>"+o.get());

    }
}
