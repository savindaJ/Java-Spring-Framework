package lk.ijse.spring.bean;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.stereotype.Component;

/**
 * @author : savindaJ
 * @date : 2024-02-22
 * @since : 0.1.0
 **/
//@Component
public class BeanOne {

    private BasicDataSource basicDataSource;

    public BasicDataSource getBasicDataSource() {
        return basicDataSource;
    }

    public void setBasicDataSource(BasicDataSource basicDataSource) {
        this.basicDataSource = basicDataSource;
    }

    public BeanOne() {
        System.out.println("BeanOne Instantiated");
    }
}
