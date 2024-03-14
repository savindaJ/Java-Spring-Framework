package lk.ijse.springapp.api;

import lk.ijse.springapp.dto.CustomerDTO;
import lk.ijse.springapp.util.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * @author : savindaJ
 * @date : 2024-03-14
 * @since : 0.1.0
 **/
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/customer")
public class CustomerController {
    private final ResponseMessage responseMessage;

    @Autowired
    public CustomerController(ResponseMessage responseMessage) {
        this.responseMessage = responseMessage;
    }

    private ArrayList<CustomerDTO> customerList = new ArrayList<>();

    {
        customerList.add(new CustomerDTO("C001","Savinda","Galle","100000"));
        customerList.add(new CustomerDTO("C002","Kasun","Matara","200000"));
        customerList.add(new CustomerDTO("C003","Nimal","Colombo","300000"));
        customerList.add(new CustomerDTO("C004","Sunil","Kandy","400000"));
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage getAllCustomers(){
        responseMessage.setCode(200);
        responseMessage.setMessage("All Customers are successfully retrieved");
        responseMessage.setData(customerList);
        return responseMessage;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage saveCustomer(@RequestBody CustomerDTO customerDTO){
        for (CustomerDTO customer : customerList) {
            if (customer.getId().equals(customerDTO.getId())){
                customer.setName(customerDTO.getName());
                customer.setAddress(customerDTO.getAddress());
                customer.setSalary(customerDTO.getSalary());
                responseMessage.setCode(200);
                responseMessage.setData(null);
                responseMessage.setMessage("Customer is Already Exits in the System !");
                return responseMessage;
            }
        }
        customerList.add(customerDTO);
        responseMessage.setCode(201);
        responseMessage.setData(null);
        responseMessage.setMessage("Customer is successfully saved");
        return responseMessage;
    }

    @PutMapping
    public ResponseMessage updateCustomer(@RequestBody CustomerDTO customerDTO){
        for (CustomerDTO customer : customerList) {
            if (customer.getId().equals(customerDTO.getId())){
                customer.setName(customerDTO.getName());
                customer.setAddress(customerDTO.getAddress());
                customer.setSalary(customerDTO.getSalary());
                responseMessage.setCode(200);
                responseMessage.setData(null);
                responseMessage.setMessage("Customer is successfully updated");
                return responseMessage;
            }
        }
        responseMessage.setCode(400);
        responseMessage.setMessage("Customer is not found");
        return responseMessage;
    }

    @DeleteMapping
    public ResponseMessage deleteCustomer(@RequestParam("id") String id){
        for (CustomerDTO customerDTO : customerList) {
            if (customerDTO.getId().equals(id)){
                customerList.remove(customerDTO);
                responseMessage.setCode(200);
                responseMessage.setData(null);
                responseMessage.setMessage("Customer is successfully deleted");
                return responseMessage;
            }
        }
        responseMessage.setCode(400);
        responseMessage.setMessage("Customer is not found");
        return responseMessage;
    }
}
