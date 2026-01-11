package emailnotificationmicroservice.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import core.ProductCreatedEvent;

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

    /**
     * Handles ProductCreatedEvent messages consumed from kafka.2.13/
     * 
     * @param productCreatedEvent - The event payload deserialized from the Kafka message value.
     */
    @KafkaHandler
    public void handle(ProductCreatedEvent productCreatedEvent) {
        LOGGER.info("Received a new event: " + productCreatedEvent.getTitle());
    }
}
