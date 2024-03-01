package lk.ijse.spring.web.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : savindaJ
 * @date : 2024-03-01
 * @since : 0.1.0
 **/
@RequestMapping("/one")
@org.springframework.web.bind.annotation.RestController
public class RestController {
    public RestController() {
        System.out.println("RestController Created");
    }

    @GetMapping
    public String getMethod(){
        return "<h1>my controller one</h1>";
    }
}
