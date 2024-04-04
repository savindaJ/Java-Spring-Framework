package lk.ijse.springdata.service.exceptions;

/**
 * @author : savindaJ
 * @date : 2024-03-28
 * @since : 0.1.0
 **/
//@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NotFoundException extends ServiceException {
    /**
     * @param message message
     */
    public NotFoundException(String message) {
        super(message);
    }
}
