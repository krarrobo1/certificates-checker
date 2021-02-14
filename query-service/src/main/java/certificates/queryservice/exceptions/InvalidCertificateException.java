package certificates.queryservice.exceptions;

public class InvalidCertificateException extends RuntimeException {
    public InvalidCertificateException(String message) {
        super(message);
    }

    public InvalidCertificateException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
