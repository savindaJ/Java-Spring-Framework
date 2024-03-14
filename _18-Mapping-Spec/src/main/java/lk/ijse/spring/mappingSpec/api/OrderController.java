package lk.ijse.spring.mappingSpec.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : savindaJ
 * @date : 2024-03-14
 * @since : 0.1.0
 **/
@RestController
@RequestMapping("/order")
public class OrderController {

    @PostMapping
    public String postOrder(@RequestHeader("X-tocken") String tocken){
        return tocken;
    }

    @PostMapping("/two")
    public String postOrderRequiredFalse(@RequestHeader(value = "X-tockenTwo",required = false) String tocken){
        return tocken;
    }

    @PostMapping(value = "/three")
    public String postOrderRequired(@RequestHeader("X-tocken") String tocken){
        return tocken;
    }
}