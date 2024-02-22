package lk.ijse.spring.bean;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author : savindaJ
 * @date : 2024-02-22
 * @since : 0.1.0
 **/
/*Light Mode !*/
@Component
public class BeanTwo {
    public BeanTwo() {
        System.out.println("BeanTwo Instantiated");
    }

    @Bean
    public BeanOne getBeanOne() {
        // not support inter bean dependency
        BeanOne beanOne = new BeanOne();
        dataSource(); // return new data source and new memory location org.apache.commons.dbcp2.BasicDataSource@4145bad8
        dataSource(); // return new data source and new memory location org.apache.commons.dbcp2.BasicDataSource@d86a6f
        dataSource(); // return new data source and new memory location org.apache.commons.dbcp2.BasicDataSource@2892d68
        dataSource(); // return new data source and new memory location org.apache.commons.dbcp2.BasicDataSource@750e2b97
        beanOne.setBasicDataSource(dataSource()); // org.apache.commons.dbcp2.BasicDataSource@3c77d488
        return beanOne;
    }

    @Bean
    public BasicDataSource dataSource() {
        System.out.println("Basic Datasource Instantiated");
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/web_test");
        dataSource.setUsername("root");
        dataSource.setPassword("80221474");
        System.out.println("created data source :"+dataSource);
        return dataSource; // org.apache.commons.dbcp2.BasicDataSource@750e2b97
    }
}
