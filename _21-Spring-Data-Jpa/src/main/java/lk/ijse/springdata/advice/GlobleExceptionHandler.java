package lk.ijse.springdata.advice;

import lk.ijse.springdata.service.exceptions.DuplicateRecordException;
import lk.ijse.springdata.service.exceptions.NotFoundException;
import lk.ijse.springdata.service.exceptions.ServiceException;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author : savindaJ
 * @date : 2024-03-28
 * @since : 0.1.0
 **/
@RestControllerAdvice
public class GlobleExceptionHandler {
    /**
     * @param exception Exception
     * @return ResponseEntity<Map < String, Object>>
     */
    @ExceptionHandler(ServiceException.class) // our custom exception
    public ResponseEntity<Map<String, Object>> handleServiceException(ServiceException exception) {

        Map<String, Object> commonErrorAttribute = null;

        if (exception instanceof DuplicateRecordException) {
            commonErrorAttribute = getCommonErrorAttribute(HttpStatus.CONFLICT,exception.getMessage());
            commonErrorAttribute.put("message", exception.getMessage());
        } else if (exception instanceof NotFoundException) {

            System.out.println("exception = " + exception.getMessage());

            return new ResponseEntity<>(getCommonErrorAttribute(HttpStatus.NOT_FOUND,exception.getMessage()), HttpStatus.NOT_FOUND);
        } else {
            commonErrorAttribute = getCommonErrorAttribute(HttpStatus.INTERNAL_SERVER_ERROR,exception.getMessage());
            commonErrorAttribute.put("message", exception.getMessage());
        }
        return new ResponseEntity<>(commonErrorAttribute, (HttpStatusCode) commonErrorAttribute.get("code"));
    }

    /**
     * @param http HttpStatus
     * @return Map<String, Object>
     */
    public Map<String, Object> getCommonErrorAttribute(HttpStatus http,String message) {
        LinkedHashMap<String, Object> errAttributes = new LinkedHashMap<>();
        errAttributes.put("code", http.value());
        errAttributes.put("error", http.getReasonPhrase());
        errAttributes.put("status", http);
        errAttributes.put("message", message);
        return errAttributes;
    }
}
