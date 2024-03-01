package lk.ijse.spring.web.bean;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;

/**
 * @author : savindaJ
 * @date : 2024-03-01
 * @since : 0.1.0
 **/
@org.springframework.web.bind.annotation.RequestMapping("/hello")
@RestController
public class RequestMapping {
    @GetMapping
    public String Get(HttpServletRequest request){
        System.out.println("get mapping called !");
        return "<h1>Hello Spring using Request Mapping Get : URI +</h1>"+request.getRequestURI();
    }

    @PostMapping
    public String Post(){
        System.out.println("post mapping called !");
        return "<h1>Hello Spring using Post</h1>";
    }

    @PostMapping("/two")
    public String PostMappingTwo(){
        System.out.println("post mapping called !");
        return "<h1>Hello Spring using Post Mapping Two !</h1>";
    }

    @PutMapping
    public String Put(){
        System.out.println("put mapping called !");
        return "<h1>Hello Spring using Put</h1>";
    }

    @DeleteMapping
    public String Delete(){
        System.out.println("delete mapping called !");
        return "<h1>Hello Spring using Delete</h1>";
    }
}
