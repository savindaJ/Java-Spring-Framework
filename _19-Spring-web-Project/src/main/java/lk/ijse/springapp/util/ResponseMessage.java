package lk.ijse.springapp.util;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author : savindaJ
 * @date : 2024-03-14
 * @since : 0.1.0
 **/
@Data
@Component
public class ResponseMessage {
    private String message;
    private int code;
    private List<?> data;
}
