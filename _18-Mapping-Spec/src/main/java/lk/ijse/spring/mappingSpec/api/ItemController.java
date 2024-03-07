package lk.ijse.spring.mappingSpec.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
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

    @PostMapping(path = "/json" ,consumes = MediaType.APPLICATION_JSON_VALUE)
    public String getJsonRequestBody() {
        return "Request value is Json";
    }

    @PostMapping(path = "/xml",consumes = MediaType.APPLICATION_XML_VALUE)
    public String getXmlRequestBody() {
        return "Request value is XML";
    }

    @PostMapping(path = "/unlencode",consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String getFormUrlEncodedRequestBody() {
        return "Request value is FormUrlEncoded";
    }

    @PostMapping(path = "/form",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String getMultipartFormDataRequestBody() {
        return "Request value is MultipartFormData";
    }
}
