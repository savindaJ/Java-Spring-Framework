package lk.ijse.spring;

import lk.ijse.spring.bean.BeanOne;
import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.utilize.Spring;
import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author : savindaJ
 * @date : 2024-02-09
 * @since : 0.1.0
 **/
public class AppInitializer {
    public static void main(String[] args) throws SQLException {
        Spring act = new Spring();
        act.register(AppConfig.class);
        act.refresh();

        boolean beanOne = act.containsBeanDefinition("getBean"); // true by using bean id is method name
        // can get allowed bean definition status in this method ! by using bean id
        boolean beanTwo = act.containsBeanDefinition("beanTwo");

        System.out.println("bean create definition in hear , beanOne :: "+ beanOne); // true
        System.out.println("bean create definition in hear , beanTwo :: "+ beanTwo); //true

        BasicDataSource bean = (BasicDataSource) act.getBean("myBeanConnection"); // get bean
        Connection connection = bean.getConnection();
        System.out.println(connection);

        PreparedStatement pstm = connection.prepareStatement("select*from customer");
        ResultSet set = pstm.executeQuery();
        while (set.next()){
            System.out.println(
                            set.getString(1)
                            +" ,"+set.getString(2)
                            +" ,"+set.getString(3)
                            +" ,"+set.getDouble(4));
        }
    }
}
