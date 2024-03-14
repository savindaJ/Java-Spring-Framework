package lk.ijse.spring.mappingSpec.api;

import lk.ijse.spring.mappingSpec.dto.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * @author : savindaJ
 * @date : 2024-03-07
 * @since : 0.1.0
 **/
@RestController
@RequestMapping("/value")
public class RequestValueController {

    @GetMapping
    public String getValue(@RequestParam("id") String id) {
        return String.format("Request value is %s", id);
    }

    //http://localhost:8080/app/value?name=savinda jayasekara
    @GetMapping(params = "name")
    public String getPathVariable(@RequestParam("name") String id) {
        return String.format("Name Request value is %s", id);
    }

    //http://localhost:8080/app/value?name=savinda jayasekara&id=C001&address=matara&salary=125000
    @GetMapping(params = {"name", "id", "address", "salary"})
    public String getPathValue(
            @RequestParam("id") String id,
            @RequestParam("name") String name,
            @RequestParam("address") String address,
            @RequestParam("salary") String salary
    ) {
        return String.format("All Request value is %s, id is %s, address is %s, salary is %s", name, id, address, salary);
    }

    @GetMapping("/header")
    public String getHeader(@RequestHeader("User-Agent") String userAgent) {
        return String.format("User-Agent is %s", userAgent);
    }

    @PostMapping()
    public String getRequestBody(@RequestBody String id) {
        return String.format("Request value is %s", id);
    }

    @PostMapping(value = "/xww") //http://localhost:8080/app/value/xww
    // Request Body : {"id":"C001","name":"savinda jayasekara","address":"matara","salary":"125000"}
    // type x-www-form-urlencoded
    public String getJsonRequestBody(@ModelAttribute Customer customer) {
        return String.format("Request xww-urlEncoded value is %s", customer.toString());
    }

    @PostMapping(value = "/json",produces = MediaType.APPLICATION_JSON_VALUE) //set content type as application/json using produces
    public Customer getJsonRequestBodyJson(@RequestBody Customer customer) {
        return customer;
    }

    @PostMapping(value = "/json2", produces = "application/json") // using string mime type set content type as application/json
    public ArrayList<Customer> getJsonRequestBodyJson2(Customer customer) {
        System.out.println(customer.toString());
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("C001", "savinda jayasekara", "matara", "125000"));
        customers.add(new Customer("C002", "saman jayasekara", "galle", "150000"));
        customers.add(new Customer("C003", "kamal jayasekara", "colombo", "175000"));
        customers.add(new Customer("C004", "nimal jayasekara", "kandy", "200000"));
        return customers;
//        return "{\"id\":\"" + customer.getId() + "\",\"name\":\"" + customer.getName() + "\",\"address\":\"" + customer.getAddress() + "\",\"salary\":\"" + customer.getSalary() + "\"}";
    }
}
