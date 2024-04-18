package lk.ijse.springsecurity.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : savindaJ
 * @date : 2024-04-18
 * @since : 0.1.0
 **/
@RestController
@RequestMapping("/customer")
public class CustomerController {

    @PostMapping
    public String saveCustomer(){
        return "Customer Saved";
    }

    @GetMapping
    public String getCustomer(){
        return "Customer Details";
    }
}
