package lk.ijse.spring.crud.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author : savindaJ
 * @date : 2024-03-06
 * @since : 0.1.0
 **/
@RestController
@RequestMapping("/customer")
public class CustomerController {
    public CustomerController() {
        System.out.println("Customer Controller");
    }
    @Value("${spring.web.user}")
    private String user;

    @Value("${spring.web.password}")
    private String password;

    @Value("${spring.web.url}")
    private String url;

    @Value("${spring.web.driver}")
    private String driver;

    @GetMapping
    public String getAllCustomers(){

        try {
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url, user, password);
            ResultSet set = connection.prepareStatement("SELECT * FROM customer").executeQuery();
            while (set.next()){
                System.out.println("cus id :"+set.getString(1)+" cus name :"+set.getString(2)+" cus address :"+set.getString(3)+" cus salary :"+set.getString(4));
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return "Customer Controller";
    }

    @PostMapping
    public String saveCustomer(HttpServletRequest request){
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        Double salary = Double.valueOf(request.getParameter("salary"));

try {
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url, user, password);
            int i = connection.prepareStatement("INSERT INTO customer VALUES ('"+id+"','"+name+"','"+address+"','"+salary+"')").executeUpdate();
            if (i>0){
                System.out.println("Customer Saved");
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return "Customer Controller";
    }
}
