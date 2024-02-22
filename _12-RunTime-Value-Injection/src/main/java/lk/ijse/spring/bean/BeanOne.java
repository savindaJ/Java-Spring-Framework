package lk.ijse.spring.bean;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * @author : savindaJ
 * @date : 2024-02-22
 * @since : 0.1.0
 **/
@Component
public class BeanOne implements InjectNic {

    @Value("Colombo, Sri Lanka")
    String address;

    public BeanOne(
            @Value("Jayasekara") String name,
            @Value("20") int age,
            @Value("25000.90") double salary,
            @Value("true") boolean isEmployed,
            @Value("10,20,30,40") int[] marks,
            @Value("A") char x,
            @Value("1,2,3,4,5") List<String> list,
            @Value("1,2,3,4,2,") Set<String> set
    ) {
        System.out.println("BeanOne Constructor !");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Salary : " + salary);
        System.out.println("Employed : " + isEmployed);
        System.out.println("Marks : " + Arrays.toString(marks));
        System.out.println("X : " + x);
        System.out.println("List : " + list);
        System.out.println("Set : " + set);
        int y = x;
        System.out.println("Y : " + y);
        System.out.println("Address : " + address); // prints null , because the address is not after the property set
    }

    @Autowired
    public void setNameAndAge(@Value("Savinda") String name, @Value("22") int age) {
        System.out.println("BeanOne setName and age !");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }

    @Autowired
    @Override
    public void injectNic(@Value("123456789V") String nic) {
        System.out.println("NIC : " + nic);
    }

    public String getAddress() {
        return address;
    }
}
