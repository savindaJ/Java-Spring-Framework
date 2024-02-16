package lk.ijse.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author : savindaJ
 * @date : 2024-02-16
 * @since : 0.1.0
 **/
@Component
public class Bean {
    @Autowired
    // inject using constructor
    public Bean(String[] name) {
        System.out.println("Bean Created");
        for(String s : name) {
            System.out.println("array : "+s);
        }
    }

    @Autowired
    public void setStringMap(Map<String, String> stringMap){
        System.out.println("String Map: " + stringMap);
        /*for (String key : stringMap.keySet()) {
            System.out.println("Key: " + key + " Value: " + stringMap.get(key));
        }*/

    }
    @Autowired
    public void setList(List<String> list) {
        System.out.println("List: " + list);
    }

    @Autowired
    public void setMapping(Set<String> mapping) {
        System.out.println("Mapping: " + mapping);
    }

    @Autowired
    public void getFullName(@Qualifier("fullName") String name) {
        System.out.println("Full Name: " + name);
    }

    @Autowired
    public void setRubTime(@Value("10000") Integer number){
        System.out.println("Run Time: " + number);
    }
}
