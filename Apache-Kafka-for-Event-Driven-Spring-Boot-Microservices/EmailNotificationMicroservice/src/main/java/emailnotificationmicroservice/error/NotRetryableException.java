package emailnotificationmicroservice.error;

/**
 * NOT RETRYABLE EXCEPTION
 * @author Emmanuel Taylor
 * 
 * Responsibilities:
 *  - Represents an error condition that should NOT be retried by the Kafka consumer.
 *  - Used to signal the DefaultErrorHandler to skip retries and route the record to the DLQ.
 */
public class NotRetryableException extends RuntimeException {

    /**
     * Creates a NotRetryableException with a description message.
     * 
     * @param message - String error message describing the exception.
     */
    public NotRetryableException(String message) {
        super(message);
    }

    /**
     * Creates NotRetryableException wrapping an underlying cause.
     * 
     * @param cause - Original exception that triggered the NotRetryableException.
     */
    public NotRetryableException(Throwable cause) {
        super(cause);
    }
}
