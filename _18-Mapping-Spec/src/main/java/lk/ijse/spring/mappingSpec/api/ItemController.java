package lk.ijse.spring.mappingSpec.api;

import lk.ijse.spring.mappingSpec.dto.Customer;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : savindaJ
 * @date : 2024-03-07
 * @since : 0.1.0
 **/
@RestController
@RequestMapping("/item")
public class ItemController {

    @PostMapping(path = "/type" ,consumes = MediaType.APPLICATION_JSON_VALUE)
    public Customer getJsonRequestBody() {
        return new Customer("C001","Savinda","Colombo","0771234567");
    }

    @PostMapping(path = "/type",consumes = MediaType.APPLICATION_XML_VALUE)
    public String getXmlRequestBody() {
        return "Request value is XML";
    }

    @PostMapping(path = "/type",consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String getFormUrlEncodedRequestBody() {
        return "Request value is FormUrlEncoded";
    }

    @PostMapping(
            path = "/type",
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE , // consume type request type
            produces = MediaType.APPLICATION_JSON_VALUE // produce type response type
    )
    public String getMultipartFormDataRequestBody() {
        return "Request value is MultipartFormData";
    }

    @PostMapping(headers = "Content-Type=application/json",path = "/header",produces = MediaType.APPLICATION_JSON_VALUE)
    public String getHeader(@RequestHeader("Accept-Encoding") String Content_Type) {
        return "Request value is Header"+Content_Type;
    }
}
