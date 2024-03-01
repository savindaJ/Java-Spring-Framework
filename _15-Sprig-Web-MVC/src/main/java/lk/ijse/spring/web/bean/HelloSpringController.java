package lk.ijse.spring.web.bean;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : savindaJ
 * @date : 2024-03-01
 * @since : 0.1.0
 **/
//@org.springframework.stereotype.Controller
@RestController
public class HelloSpringController {
    @GetMapping("/")
    public String Get(){
        return "<h1>Hello Spring</h1>";
    }
}
