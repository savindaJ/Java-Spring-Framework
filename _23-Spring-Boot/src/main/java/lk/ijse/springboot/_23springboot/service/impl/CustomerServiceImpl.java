package lk.ijse.springboot._23springboot.service.impl;

import lk.ijse.springboot._23springboot.dto.CustomerDTO;
import lk.ijse.springboot._23springboot.entity.Customer;
import lk.ijse.springboot._23springboot.repo.CustomerRepo;
import lk.ijse.springboot._23springboot.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : savindaJ
 * @date : 2024-04-04
 * @since : 0.1.0
 **/
@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepo customerRepo;

    private final ModelMapper mapper;

    public CustomerServiceImpl(CustomerRepo customerRepo, ModelMapper mapper) {
        this.customerRepo = customerRepo;
        this.mapper = mapper;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepo.findAll();
    }

    @Override
    public void saveCustomer(CustomerDTO customer) {
        customerRepo.save(mapper.map(customer, Customer.class));
    }

    @Override
    public void deleteCustomer(String id) {
        customerRepo.deleteById(id);
    }

    @Override
    public void updateCustomer(CustomerDTO customer) {
        customerRepo.save(mapper.map(customer, Customer.class));
    }
}
