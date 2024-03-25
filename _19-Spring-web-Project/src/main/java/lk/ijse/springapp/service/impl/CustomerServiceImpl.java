package lk.ijse.springapp.service.impl;

import lk.ijse.springapp.dto.CustomerDTO;
import lk.ijse.springapp.entity.Customer;
import lk.ijse.springapp.persistence.CustomerRepo;
import lk.ijse.springapp.service.CustomerService;
import lk.ijse.springapp.util.ObjTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : savindaJ
 * @date : 2024-03-25
 * @since : 0.1.0
 **/
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    ObjTransformer transform;

    private ArrayList<CustomerDTO> customerList = new ArrayList<>();

    {
        System.out.println(customerRepo);
        customerList.add(new CustomerDTO("C001","Savinda","Galle","100000"));
        customerList.add(new CustomerDTO("C002","Kasun","Matara","200000"));
        customerList.add(new CustomerDTO("C003","Nimal","Colombo","300000"));
        customerList.add(new CustomerDTO("C004","Sunil","Kandy","400000"));
    }

    @Override
    public boolean saveCustomer(CustomerDTO customerDTO) {
       customerRepo.save(transform.getEntity(customerDTO, Customer.class));
        return true;
    }

    @Override
    public boolean updateCustomer(CustomerDTO customerDTO) {
        customerRepo.save(transform.getEntity(customerDTO, Customer.class));
        return true;
    }

    @Override
    public boolean deleteCustomer(String id) {
        customerRepo.deleteById(id);
        return true;
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        List<lk.ijse.springapp.entity.Customer> all = customerRepo.findAll();
        List<CustomerDTO> customerDTOS = new ArrayList<>();
        for (lk.ijse.springapp.entity.Customer customer : all) {
            customerDTOS.add(transform.getDTO(customer, CustomerDTO.class));
        }
        return customerDTOS;
    }
}
