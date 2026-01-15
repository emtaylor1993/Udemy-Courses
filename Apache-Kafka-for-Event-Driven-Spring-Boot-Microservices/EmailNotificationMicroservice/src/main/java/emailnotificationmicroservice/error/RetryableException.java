package emailnotificationmicroservice.error;

/**
 * RETRYABLE EXCEPTION
 * @author Emmanuel Taylor
 * 
 * Responsibilities:
 *  - Represents an error condition that SHOULD be retried by the Kafka Consumer.
 *  - Used to signal the DefaultErrorHandler to apply the configured retry logic.
 */
public class RetryableException extends RuntimeException{
    
    /**
     * Creates a RetryableException with a description message.
     * 
     * @param message - String error message describing the exception.
     */
    public RetryableException(String message) {
        super(message);
    }

    /**
     * Creates RetryableException wrapping an underlying cause.
     * 
     * @param cause - Original exception that triggered the RetryableException.
     */
    public RetryableException(Throwable cause) {
        super(cause);
    }
}
