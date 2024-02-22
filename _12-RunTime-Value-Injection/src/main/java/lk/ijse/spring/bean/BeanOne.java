package lk.ijse.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author : savindaJ
 * @date : 2024-02-22
 * @since : 0.1.0
 **/
@Component
public class BeanOne implements InjectNic{

    @Value("Colombo, Sri Lanka")
    String address;

    public BeanOne(@Value("Jayasekara") String name, @Value("20") int age) {
        System.out.println("BeanOne Constructor !");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Address : " + address);
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
