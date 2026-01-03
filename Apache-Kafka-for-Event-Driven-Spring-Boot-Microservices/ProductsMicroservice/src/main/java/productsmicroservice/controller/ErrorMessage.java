package productsmicroservice.controller;

import java.util.Date;

/**
 * STANDARD ERROR RESPONSE MODEL
 * @author Emmanuel Taylor
 * 
 * Responsibilities:
 *  - Provides a consistent payload for API error responses.
 *  - Captures when the error occured, provides a user-friendly message, and requuest/context details.
 * 
 * Notes:
 *  - Typically used by exception handlers (e.g., @ControllerAdvice) to serializer errors as JSON.
 */
public class ErrorMessage {

    private Date timestamp;
    private String message;
    private String details;

    /**
     * Creates an ErrorMessage instance for returning structured errors to clients.
     * 
     * @param timestamp - The time that the error occurred.
     * @param message   - Client-facing message describing the error.
     * @param details   - Additional context to help diagnose the issue.
     */
    public ErrorMessage(Date timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    /** @return The timestamp for when the error occurred. */
    public Date getTimestamp() {
        return this.timestamp;
    }

    /** @param timestamp - The timestamp for when the error occurred. */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /** @return The client-facing error message. */
    public String getMessage() {
        return this.message;
    }

    /** @param message - The client-facing error message. */
    public void setMessage(String message) {
        this.message = message;
    }

    /** @return Additional details about the error for diagnostics. */
    public String getDetails() {
        return this.details;
    }

    /** @param details - Additional details about the error for diagnostics. */
    public void setDetails(String details) {
        this.details = details;
    }
}
