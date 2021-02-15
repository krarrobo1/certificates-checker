package certificates.queryservice.exceptions;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiException {
    private final String message;
    private final HttpStatus httpStatus;

    public ApiException(String message, HttpStatus httpStatus) {
        this.message = message;
        this.httpStatus = httpStatus;
    }
    
}