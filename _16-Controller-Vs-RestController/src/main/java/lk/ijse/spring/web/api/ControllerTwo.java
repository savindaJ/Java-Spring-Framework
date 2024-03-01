package lk.ijse.spring.web.api;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;


/**
 * @author : savindaJ
 * @date : 2024-03-01
 * @since : 0.1.0
 **/
@Controller
@RequestMapping("/two")
public class ControllerTwo {
    public ControllerTwo() {
        System.out.println("ControllerTwo Created");
    }

    @GetMapping
    public View getMethod() {
        return (model, request, response) -> {
            String s = "<h1>my controller two</h1>";
            response.getWriter().write(s);
        };
    }

    @GetMapping("/index")
    public String postMethod() {
        return "index";
    }

}
