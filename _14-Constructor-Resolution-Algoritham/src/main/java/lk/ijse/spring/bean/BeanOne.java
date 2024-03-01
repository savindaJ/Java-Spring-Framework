package lk.ijse.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

/**
 * @author : savindaJ
 * @date : 2024-02-22
 * @since : 0.1.0
 **/
@Component
public class BeanOne {

    private String name;
    private String address;
    private int myNumber;
    private double myDouble;

    public BeanOne() {
        System.out.println("BeanOne no args Instantiated");
    }

    @Autowired(required = false)
    public BeanOne(String name) {
        this.name = name;
        System.out.println("BeanOne single args Instantiated");
    }

    @Autowired(required = false)
    public BeanOne(
            String name,
            String address,
            int myNumber,
            @Qualifier("myDouble") double myDouble,
            @Nullable float myFloat,
            @Nullable boolean myBoolean
    ) {
        this.name = name;
        this.address = address;
        this.myNumber = myNumber;
        this.myDouble = myDouble;
        System.out.println("myFloat : " + myFloat); // 0.0
        System.out.println("myBoolean : " + myBoolean); // false
        System.out.println("BeanOne all args Instantiated");
        print();
    }

    @Autowired(required = false)
    public BeanOne(String name, String address) {
        System.out.println("BeanOne double args Instantiated");
        this.name = name;
        this.address = address;
    }

    public void print() {
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
        System.out.println("My Number : " + myNumber);
        System.out.println("My Double : " + myDouble);
    }

}
