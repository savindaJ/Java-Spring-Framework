package lk.ijse.springapp.service;

import lk.ijse.springapp.dto.CustomerDTO;

import java.util.List;

/**
 * @author : savindaJ
 * @date : 2024-03-25
 * @since : 0.1.0
 **/
public interface CustomerService {
    boolean saveCustomer(CustomerDTO customerDTO);
    boolean updateCustomer(CustomerDTO customerDTO);
    boolean deleteCustomer(String id);
    List<CustomerDTO> getAllCustomers();
}
