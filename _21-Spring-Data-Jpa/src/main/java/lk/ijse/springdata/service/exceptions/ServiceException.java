package lk.ijse.springdata.service.exceptions;

/**
 * @author : savindaJ
 * @date : 2024-03-28
 * @since : 0.1.0
 **/
public class ServiceException extends RuntimeException {
    public ServiceException(String message) {
        super(message);
    }
}
