package certificates.queryservice.exceptions;
import javax.persistence.EntityNotFoundException;


import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class ErrorHandler {
    @ExceptionHandler(value = InvalidCertificateException.class)
    public ResponseEntity<Object> globalHandling(InvalidCertificateException e){
        ApiException apiException = new ApiException(e.getMessage(), HttpStatus.OK);
        return new ResponseEntity<>(apiException, HttpStatus.OK);
    }

}
