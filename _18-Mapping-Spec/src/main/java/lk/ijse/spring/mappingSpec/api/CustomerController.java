package lk.ijse.spring.mappingSpec.api;

import org.springframework.web.bind.annotation.*;

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

    //http://localhost:8080/app/customer/
    @GetMapping
    public String getCustomer(){
        return "Get Customer";
    }

    // http://localhost:8080/app/customer/one/
    @GetMapping(path = "/one") // this is path mapping
    public String getCustomerOne(){
        return "Get Customer one";
    }

    //http://localhost:8080/app/customer/one/two
    @GetMapping(path = "/one/two") // this is not a good practice to use this kind of path mapping in the real world
    public String getCustomerTwo(){
        return "Get Customer one two";
    }



    /*character mapping !*/
    //http://localhost:8080/app/customer/one is not working not found
    //http://localhost:8080/app/customer/one1
    // is working always use the first character after the path a b c d 1 2 # $ % & * ( ) etc
//    @PostMapping("/one???")
    @PostMapping("/o?ne")
    public String saveCustomer(){
        return "Save Customer";
    }

    /*Wild card mapping !*/
    //http://localhost:8080/app/customer/one/sasaa
    // http://localhost:8080/app/customer/one/sasaa
    //http://localhost:8080/app/customer/wild/one/// working spring 6lo low version
//    @GetMapping("/wild/one/**")

//    @GetMapping("/wild/*/one")
    //http://localhost:8080/app/customer/wild/xsxs/one
//    @GetMapping("/wild/*/*/one")
    //http://localhost:8080/app/customer/wild/ssas/xsxs/one
    @GetMapping("/wild*")
    //http://localhost:8080/app/customer/wildsasa
    public String updateCustomer(){
        return "Wild card mapping Customer";
    }

    /*Extension mapping*/

//    @DeleteMapping("/delete/.php")
    // http://localhost:8080/app/customer/delete/.php
    @DeleteMapping("/*.php")
    //http://localhost:8080/app/customer/delete.php
    public String deleteCustomer(){
        return "Delete Customer";
    }

    /*Empty String mapping*/
    @GetMapping("s")
    public String getCustomerEmpty(){
        return "Get Customer Empty";
    }
}
