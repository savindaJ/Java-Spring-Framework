package lk.ijse.springapp.service.impl;

import lk.ijse.springapp.dto.CustomerDTO;
import lk.ijse.springapp.service.CustomerService;
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

    private ArrayList<CustomerDTO> customerList = new ArrayList<>();

    {
        customerList.add(new CustomerDTO("C001","Savinda","Galle","100000"));
        customerList.add(new CustomerDTO("C002","Kasun","Matara","200000"));
        customerList.add(new CustomerDTO("C003","Nimal","Colombo","300000"));
        customerList.add(new CustomerDTO("C004","Sunil","Kandy","400000"));
    }

    @Override
    public boolean saveCustomer(CustomerDTO customerDTO) {
        for (CustomerDTO customer : customerList) {
            if (customer.getId().equals(customerDTO.getId())){
                customer.setName(customerDTO.getName());
                customer.setAddress(customerDTO.getAddress());
                customer.setSalary(customerDTO.getSalary());
                customerList.add(customerDTO);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updateCustomer(CustomerDTO customerDTO) {
        for (CustomerDTO customer : customerList) {
            if (customer.getId().equals(customerDTO.getId())){
                customer.setName(customerDTO.getName());
                customer.setAddress(customerDTO.getAddress());
                customer.setSalary(customerDTO.getSalary());
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteCustomer(String id) {
        for (CustomerDTO customerDTO : customerList) {
            if (customerDTO.getId().equals(id)){
                customerList.remove(customerDTO);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return customerList;
    }
}
