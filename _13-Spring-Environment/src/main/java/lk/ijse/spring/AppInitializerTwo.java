package lk.ijse.spring;

import java.util.Properties;

/**
 * @author : savindaJ
 * @date : 2024-02-22
 * @since : 0.1.0
 **/
public class AppInitializerTwo {
    public static void main(String[] args) {
        Properties properties = System.getProperties();
        properties.put("spring.profiles.active", "backend-dev"); // set jvm properties
        // life time of jvm properties is until the jvm is running
        // destroy jvm -> destroy jvm properties
        System.out.println("=====================================");

        properties.forEach((k, v) -> System.out.println("Key -> " + k + " : Value ->" + v));
    }
}
