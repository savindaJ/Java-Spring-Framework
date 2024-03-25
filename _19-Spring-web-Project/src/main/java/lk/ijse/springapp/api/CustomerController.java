package lk.ijse.springapp.api;

import lk.ijse.springapp.dto.CustomerDTO;
import lk.ijse.springapp.service.CustomerService;
import lk.ijse.springapp.util.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    private final CustomerService customerService;

    @Autowired
    public CustomerController(ResponseMessage responseMessage, CustomerService customerService) {
        this.responseMessage = responseMessage;
        this.customerService = customerService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(code = HttpStatus.OK)
    public ResponseMessage getAllCustomers() {
        List<CustomerDTO> allCustomers = customerService.getAllCustomers();
        responseMessage.setData(allCustomers);
        return responseMessage;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(code = HttpStatus.CREATED)
    public ResponseMessage saveCustomer(@RequestBody CustomerDTO customerDTO) {
        boolean b = customerService.saveCustomer(customerDTO);
        if (b)
            responseMessage.setCode(201);
        responseMessage.setData(null);
        responseMessage.setMessage("Customer is successfully saved");
        return responseMessage;
    }

    @PutMapping
    @ResponseStatus(code = HttpStatus.OK)
    public ResponseMessage updateCustomer(@RequestBody CustomerDTO customerDTO) {
        boolean b = customerService.updateCustomer(customerDTO);
        if (b)
            responseMessage.setCode(400);
        responseMessage.setMessage("Customer is not found");
        return responseMessage;
    }

    @DeleteMapping
    @ResponseStatus(code = HttpStatus.OK)
    public ResponseMessage deleteCustomer(@RequestParam("id") String id) {
        boolean b = customerService.deleteCustomer(id);
        if (b)
            responseMessage.setCode(400);
        responseMessage.setMessage("Customer is not found");
        return responseMessage;
    }
}
