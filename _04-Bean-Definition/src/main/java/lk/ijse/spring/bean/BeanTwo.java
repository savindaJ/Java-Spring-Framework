package lk.ijse.spring.bean;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author : savindaJ
 * @date : 2024-02-09
 * @since : 0.1.0
 **/
@Component
public class BeanTwo {
    public BeanTwo() {
        System.out.println("bean Tow !");
    }

    @Bean(name = "myBeanConnection") // this is bean definition ! // light mode
    public BasicDataSource getConnection(){
        BasicDataSource dbpc = new BasicDataSource();
        dbpc.setUsername("root");
        dbpc.setUrl("jdbc:mysql://localhost:3306/web_test");
        dbpc.setPassword("80221474");
        dbpc.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dbpc.setInitialSize(2);
        dbpc.setMaxTotal(5);
        return dbpc;
    }
}
