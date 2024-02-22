package lk.ijse.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @author : savindaJ
 * @date : 2024-02-22
 * @since : 0.1.0
 **/
@Component
public class BeanOne {

    @Autowired
    Environment environment;

    public BeanOne(
            @Value("${db.url}") String url,
            @Value("${db.user}") String user,
            @Value("${db.password}") String password,
            @Value("${os.name}") String osName
    ) {
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
            @Value("${spring.datasource.password}") String password,
            @Value("${spring.datasource.main}") String mainDatasource
    ) {
        System.out.println("=====================================");
        System.out.println("resource file base url : " + baseUrl);
        System.out.println("resource file data source url : " + datasourceUrl);
        System.out.println("resource file user name : " + username);
        System.out.println("resource file user password : " + password);
        System.out.println("resource file main data source : " + mainDatasource); // return basic value String !
    }

    public void getEnvironmentVariable() {
        // creat get method to get environment variable , Why after property set to get this environment variable
        System.out.println("=====================================");
        System.out.println("get environment variable from environment object");
        System.out.println("Environment Variable : " + environment.getProperty("spring.datasource.password"));
        System.out.println("Environment Variable : " + environment.getProperty("spring.datasource.url"));
        System.out.println("Environment Variable : " + environment.getProperty("spring.datasource.username"));
        System.out.println("Environment Variable : " + environment.getProperty("spring.baseurl"));
        System.out.println("Environment Variable : " + environment.getProperty("os.name"));
        System.out.println("Environment Variable : " + environment.getProperty("os.kamal")); // return null

        try {
            System.out.println("Environment Variable : " + environment.getRequiredProperty("os.kamal")); // throw exception
        }catch (Exception e) {
            System.out.println("Throw Exception - get wrong key value "+e.getLocalizedMessage()); // thrown exception handle
        }
    }

    @Autowired
    public void getAllObject(Object[] all) {
        System.out.println("=====================================");
        System.out.println("get all object from context");
        for (Object o : all) {
            System.out.println("context obj -> " + o.toString());
        }
    }

}
