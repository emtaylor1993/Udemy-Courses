package emailnotificationmicroservice.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import core.ProductCreatedEvent;
import emailnotificationmicroservice.error.NotRetryableException;
import emailnotificationmicroservice.error.RetryableException;;

/**
 * PRODUCT CREATED EVENT HANDLER
 * @author Emmanuel Taylor
 * 
 * Responsibilities:
 *  - Subscribes to the "product-created-events-topic" Kafka topic.
 *  - Handles ProductCreatedEvent messages produced by the Products microservice.
 *  - Acts as the entry point for email notification logic triggered by product creation events.
 */
@Component
@KafkaListener(topics="product-created-events-topic")
public class ProductCreatedEventHandler {

    /** Logger used for tracing and error reporting within this handler. */
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    /** RestTemplate used for outbound HTTP calls to dependent services. */
    private final RestTemplate restTemplate;

    /**
     * Constructor-based injection for testability and explicit dependencies.
     * 
     * @param restTemplate - RestTemplate bean configured in the application context.
     */
    public ProductCreatedEventHandler(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /**
     * Handles ProductCreatedEvent messages consumed from kafka. Explicitly defines messages that
     * should be retried and those that are not retryable.
     * 
     * @param productCreatedEvent - The event payload deserialized from the Kafka message value.
     */
    @KafkaHandler
    public void handle(ProductCreatedEvent productCreatedEvent) {
        LOGGER.info("Received a new event: " + productCreatedEvent.getTitle());
        String requestUrl = "http://localhost:8082/response/200";
        
        try {
            ResponseEntity<String> response = restTemplate.exchange(requestUrl, HttpMethod.GET, null, String.class);

            if (response.getStatusCode().value() == HttpStatus.OK.value()) {
                LOGGER.info("Received response from a remote service: " + response.getBody());
            }
        } catch (ResourceAccessException ex) {
            LOGGER.error(ex.getMessage());
            throw new RetryableException(ex);
        } catch (HttpServerErrorException ex) {
            LOGGER.error(ex.getMessage());
            throw new NotRetryableException(ex);
        } catch (RestClientException ex) {
            LOGGER.error(ex.getMessage());
            throw new NotRetryableException(ex);
        }
    }
}