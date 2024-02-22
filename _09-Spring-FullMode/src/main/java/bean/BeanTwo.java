package bean;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * @author : savindaJ
 * @date : 2024-02-22
 * @since : 0.1.0
 **/
@Component
public class BeanTwo {
    public BeanTwo() {
        System.out.println("BeanTwo Instantiated");
    }

}
