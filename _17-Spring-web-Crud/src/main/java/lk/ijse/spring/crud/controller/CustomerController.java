package lk.ijse.spring.crud.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

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
    private Connection connection;

    @GetMapping
    public String getAllCustomers() {

        try {
            ResultSet set = connection.prepareStatement("SELECT * FROM customer").executeQuery();
            while (set.next()) {
                System.out.println("cus id :" + set.getString(1) + " cus name :" + set.getString(2) + " cus address :" + set.getString(3) + " cus salary :" + set.getString(4));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return "Customer get";
    }

    @PostMapping
    public String saveCustomer(HttpServletRequest request) {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        Double salary = Double.valueOf(request.getParameter("salary"));

        try {

            int i = connection.prepareStatement("INSERT INTO customer VALUES ('" + id + "','" + name + "','" + address + "','" + salary + "')").executeUpdate();
            if (i > 0) {
                System.out.println("Customer Saved");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return "Customer saved";
    }

    @PutMapping
    public String updateCustomer(HttpServletRequest request) {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        Double salary = Double.valueOf(request.getParameter("salary"));

        try {

            int i = connection.prepareStatement("UPDATE customer SET name = '" + name + "', address = '" + address + "', salary = '" + salary + "' WHERE cus_id = '" + id + "'").executeUpdate();
            if (i > 0) {
                System.out.println("Customer Updated");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return "Customer updated";
    }

    @DeleteMapping
    public String deleteCustomer(HttpServletRequest request) {
        String id = request.getParameter("id");

        try {

            int i = connection.prepareStatement("DELETE FROM customer WHERE cus_id = '" + id + "'").executeUpdate();
            if (i > 0) {
                System.out.println("Customer Deleted");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return "Customer deleted";
    }

    @Autowired
    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
