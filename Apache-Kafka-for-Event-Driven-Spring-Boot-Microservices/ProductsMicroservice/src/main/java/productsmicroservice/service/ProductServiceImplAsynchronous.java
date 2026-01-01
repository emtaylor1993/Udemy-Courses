package productsmicroservice.service;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import productsmicroservice.entity.ProductModel;

@Service
public class ProductServiceImplAsynchronous implements ProductServiceAsynchronous {

    KafkaTemplate<String, ProductCreatedEvent> kafkaTemplate;
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    public ProductServiceImplAsynchronous(KafkaTemplate<String, ProductCreatedEvent> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    
    @Override
    public String createProduct(ProductModel product) {
        String productId = UUID.randomUUID().toString();

        // TODO: Persist Product details into DB table before publishing an event.createTopic

        ProductCreatedEvent productCreatedEvent = new ProductCreatedEvent(
            productId,
            product.getTitle(),
            product.getPrice(),
            product.getQuantity()
        );

        CompletableFuture<SendResult<String, ProductCreatedEvent>> future = 
            kafkaTemplate.send("product-created-events-topic", productId, productCreatedEvent);

        future.whenComplete((result, exception) -> {
            if (exception != null) {
                LOGGER.error("Failed to send message: " + exception.getMessage());
            } else {
                LOGGER.info("Message send successfully: " + result.getRecordMetadata());
            }
        });

        LOGGER.info("***** Returning Product ID *****");

        return productId;
    }
}
