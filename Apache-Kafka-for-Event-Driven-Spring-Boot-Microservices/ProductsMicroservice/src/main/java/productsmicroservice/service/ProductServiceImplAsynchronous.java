package productsmicroservice.service;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import productsmicroservice.entity.ProductModel;

/**
 * ASYNCHRONOUS PRODUCT SERVICE IMPLEMENTATION
 * @author Emmanuel Taylor
 * 
 * Responsibilties:
 *  - Generates a productId and builds a ProductCreatedEvent from the incoming ProductModel.
 *  - Publishes the ProductCreatedEvent to Kafka for downstream processing.
 *  - Logs publish success/failure without blocking the API response.
 */
@Service
public class ProductServiceImplAsynchronous implements ProductServiceAsynchronous {

    /** KafkaTempate used to publish ProductCreatedEvent messages to the configured topic. */
    KafkaTemplate<String, ProductCreatedEvent> kafkaTemplate;

    /** Logged used for tracing and publish success/failure reporting. */
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    /**
     * Constructor-based injection for testability and explicit dependencies.
     * 
     * @param kafkaTemplate - KafkaTemplate used to publish product-created events.
     */
    public ProductServiceImplAsynchronous(KafkaTemplate<String, ProductCreatedEvent> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    
    /**
     * Creates a product using an asynchronous/event-driven approach.
     * Generates an ID, builds an event, and publishes to Kafka.
     * 
     * @param product - Product details provided by the client.
     * @return Generated productId (returned immediately).
     */
    @Override
    public String createProduct(ProductModel product) {
        String productId = UUID.randomUUID().toString();

        // TODO: Persist Product details into DB table before publishing an event.createTopic

        // Builds the event payload that downstream services will consume.
        ProductCreatedEvent productCreatedEvent = new ProductCreatedEvent(
            productId,
            product.getTitle(),
            product.getPrice(),
            product.getQuantity()
        );

        // Publish to Kafka asynchronously and returns a CompletableFuture that completes later.
        CompletableFuture<SendResult<String, ProductCreatedEvent>> future = 
            kafkaTemplate.send("product-created-events-topic", productId, productCreatedEvent);

        // Log the outcome when the broker acknowledges (or failes) the send.
        future.whenComplete((result, exception) -> {
            if (exception != null) {
                LOGGER.error("Failed to send message: " + exception.getMessage());
            } else {
                LOGGER.info("Message send successfully: " + result.getRecordMetadata());
            }
        });

        // API returns immediately with downstream processing happening asynchronously.
        LOGGER.info("***** Returning Product ID *****");

        return productId;
    }
}
