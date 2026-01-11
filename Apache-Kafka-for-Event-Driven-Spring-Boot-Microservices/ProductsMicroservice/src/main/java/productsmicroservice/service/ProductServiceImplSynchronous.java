package productsmicroservice.service;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import core.ProductCreatedEvent;
import productsmicroservice.entity.ProductModel;

/**
 * SYNCHRONOUS PRODUCT SERVICE IMPLEMENTATION
 * @author Emmanuel Taylor
 * 
 * Responsibilities:
 *  - Generates a productId and builds a ProductCreatedEvent from the incoming ProductModel.
 *  - Publishes the ProductCreatedEvent to Kafka and waits for broker acknowledgement.
 *  - Logs Kafka metadata for traceability.
 * 
 * Notes:
 *  - This implementation blocks on the Kafka send, meaning the API call will wait until the
 *    broker acknowledges or fails the publish.
 */
@Service
public class ProductServiceImplSynchronous implements ProductServiceSynchronous {

    /** KafkaTemplate used to publish ProductCreatedEvent messages to the configured topic. */
    KafkaTemplate<String, ProductCreatedEvent> kafkaTemplate;

    /** Logger used for traceability and publish reporting. */
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    /**
     * Constructor-based injection for testability and explicit dependencies.
     * 
     * @param kafkaTemplate - KafkaTemplate used to publish ProductCreatedEvent messages.
     */
    public ProductServiceImplSynchronous(KafkaTemplate<String, ProductCreatedEvent> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    
    /**
     * Creates a Product using synchronous publishing approach.
     * Generates an ID, builds an event, publishes to Kafka, and waits for acknowledgement.
     * 
     * @param product - The ProductModel containing product details.
     * @return The generated product ID.
     * @throws Exception - If publishing to Kafka fails.
     */
    @Override
    public String createProduct(ProductModel product) throws Exception {
        String productId = UUID.randomUUID().toString();

        // TODO: Persist Product details into DB table before publishing an event.createTopic

        // Builds the event payload that downstream services will consume.
        ProductCreatedEvent productCreatedEvent = new ProductCreatedEvent(
            productId,
            product.getTitle(),
            product.getPrice(),
            product.getQuantity()
        );

        LOGGER.info("Before publishing a ProductCreatedEvent");

        // Blocks until the broker acknowledges the send.
        SendResult<String, ProductCreatedEvent> result = 
            kafkaTemplate.send("product-created-events-topic", productId, productCreatedEvent).get();

        // Log broker metadata to help with debugging and traceability.
        LOGGER.info("Partition: " + result.getRecordMetadata().partition());
        LOGGER.info("Topic: " + result.getRecordMetadata().topic());
        LOGGER.info("Offset: " + result.getRecordMetadata().offset());

        LOGGER.info("***** Returning Product ID *****");

        return productId;
    }
}
