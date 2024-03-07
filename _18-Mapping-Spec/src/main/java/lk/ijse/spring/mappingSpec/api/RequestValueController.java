package lk.ijse.spring.mappingSpec.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author : savindaJ
 * @date : 2024-03-07
 * @since : 0.1.0
 **/
@RestController
@RequestMapping("/value")
public class RequestValueController {

    @GetMapping
    public String getValue(@RequestParam("id") String id){
        return String.format("Request value is %s", id);
    }

    //http://localhost:8080/app/value?name=savinda jayasekara
    @GetMapping(params = "name")
    public String getPathVariable(@RequestParam("name") String id){
        return String.format("Name Request value is %s", id);
    }

    //http://localhost:8080/app/value?name=savinda jayasekara&id=C001&address=matara&salary=125000
    @GetMapping(params = {"name", "id","address","salary"})
    public String getPathValue(@RequestParam("id") String id, @RequestParam("name") String name, @RequestParam("address") String address, @RequestParam("salary") String salary){
        return String.format("All Request value is %s, id is %s, address is %s, salary is %s", name, id, address, salary);
    }

    @GetMapping("/header")
    public String getHeader(@RequestHeader("User-Agent") String userAgent){
        return String.format("User-Agent is %s", userAgent);
    }

    @PostMapping
    public String getRequestBody(@RequestBody String body){
        return String.format("Request body is %s", body);
    }
}
