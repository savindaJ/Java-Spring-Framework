package config;

import bean.BeanOne;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author : savindaJ
 * @date : 2024-02-22
 * @since : 0.1.0
 **/
/*Full mode*/
@Configuration
//@ComponentScan("bean")
public class FullModeConfig {

    public FullModeConfig() {
        System.out.println("FullModeConfig Instantiated");
    }

    @Bean
//    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public BeanOne beanOne() {
        BeanOne beanOne = new BeanOne();
        //  usage of inter bean dependency
        getDataSource(); // return single instance of data source
        getDataSource(); // return single instance of data source
        getDataSource(); // return single instance of data source
        getDataSource(); // return single instance of data source
        getDataSource(); // return single instance of data source
        getDataSource(); // return single instance of data source
        getDataSource(); // return single instance of data source
        // call only one time and return the same instance of data source for all the calls in the same bean
        // usage of inter bean dependency
        beanOne.setBasicDataSource(getDataSource());
        return beanOne;
    }


    @Bean
//    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public BasicDataSource getDataSource() {
        System.out.println("Basic Datasource Instantiated");

        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/web_test");
        dataSource.setUsername("root");
        dataSource.setPassword("80221474");
        System.out.println("created data source :"+dataSource);
        return dataSource;
    }
}
