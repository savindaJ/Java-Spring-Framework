package lk.ijse.springdata.service.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author : savindaJ
 * @date : 2024-03-28
 * @since : 0.1.0
 **/
//@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NotFoundException extends ServiceException {
    /**
     * @param message
     */
    public NotFoundException(String message) {
        super(message);
    }
}
