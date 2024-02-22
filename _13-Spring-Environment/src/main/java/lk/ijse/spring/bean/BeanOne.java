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
public class BeanOne {

    String url;

    String user;

    String password;

    public BeanOne(
            @Value("${db.url}") String url,
            @Value("${db.user}") String user,
            @Value("${db.password}") String password,
            @Value("${os.name}") String osName
    ) {
        this.url = url;
        this.user = user;
        this.password = password;
        System.out.println("BeanOne Instantiated");
        System.out.println("URL : " + url);
        System.out.println("User : " + user);
        System.out.println("Password : " + password);
        System.out.println("OS Name : " + osName); // get os env variable
    }

    @Autowired
    public void getResourceBundle(
            @Value("${spring.baseurl}") String baseUrl,
            @Value("${spring.datasource.url}") String datasourceUrl,
            @Value("${spring.datasource.username}") String username,
            @Value("${spring.datasource.password}") String password
    ) {
        System.out.println("=====================================");
        System.out.println("resource file base url : " + baseUrl);
        System.out.println("resource file data source url : " + datasourceUrl);
        System.out.println("resource file user name : " + username);
        System.out.println("resource file user password : " + password);
    }

}
