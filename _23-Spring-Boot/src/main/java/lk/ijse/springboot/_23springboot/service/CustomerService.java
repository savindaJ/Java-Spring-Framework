package lk.ijse.springboot._23springboot.service;

import lk.ijse.springboot._23springboot.dto.CustomerDTO;
import lk.ijse.springboot._23springboot.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : savindaJ
 * @date : 2024-04-04
 * @since : 0.1.0
 **/
@Service
public interface CustomerService {
    List<Customer> getAllCustomers();

    void saveCustomer(CustomerDTO customer);

    void deleteCustomer(String id);

    void updateCustomer(CustomerDTO customer);
}