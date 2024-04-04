package lk.ijse.springboot._23springboot.api;

import lk.ijse.springboot._23springboot.dto.CustomerDTO;
import lk.ijse.springboot._23springboot.entity.Customer;
import lk.ijse.springboot._23springboot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

/**
 * @author : savindaJ
 * @date : 2024-04-04
 * @since : 0.1.0
 **/
@RestController
@RequestMapping("/customers")
public class CustomerController {


    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @GetMapping
    public List<Customer> getCustomers(){
        return customerService.getAllCustomers();
    }

    @PostMapping
    public ResponseEntity<?> saveCustomer(@RequestBody CustomerDTO customer) throws URISyntaxException {
        customerService.saveCustomer(customer);
        return ResponseEntity.created(new URI("/customer")).build();
    }

    @DeleteMapping
    public ResponseEntity<?> deleteCustomer(@RequestParam String id){
        customerService.deleteCustomer(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping
    public ResponseEntity<?> updateCustomer(@RequestBody CustomerDTO customer){
        customerService.updateCustomer(customer);
        return ResponseEntity.noContent().build();
    }
}