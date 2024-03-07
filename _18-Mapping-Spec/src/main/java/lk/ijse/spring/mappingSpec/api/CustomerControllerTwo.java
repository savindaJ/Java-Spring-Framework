package lk.ijse.spring.mappingSpec.api;

import org.springframework.web.bind.annotation.*;

/**
 * @author : savindaJ
 * @date : 2024-03-07
 * @since : 0.1.0
 **/
@RequestMapping("/customers")
@RestController
public class CustomerControllerTwo {

    @GetMapping(value = "/{city}/{name}")
    public String getCustomerByCity(
            @PathVariable("city") String city,
                                    @PathVariable("name") String name
    ) {
        // path variable name and handler parameter name difference then use @PathVariable("city") String city
        return city + "-" + name;
        // return String.format("Get CustomerTwo Controller by city %s",city);
    }

    @PostMapping("/{id:C\\d{3}}")
    public String getCustomerById(@PathVariable("id") String parameter){
        return String.format("Get CustomerTwo Controller by id %s",parameter);
    }
}
