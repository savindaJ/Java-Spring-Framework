package lk.ijse.spring.mappingSpec.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : savindaJ
 * @date : 2024-03-07
 * @since : 0.1.0
 **/
@RestController
@RequestMapping("/customer")
public class CustomerController {
    public CustomerController() {
        System.out.println("CustomerController Instantiated");
    }
}
