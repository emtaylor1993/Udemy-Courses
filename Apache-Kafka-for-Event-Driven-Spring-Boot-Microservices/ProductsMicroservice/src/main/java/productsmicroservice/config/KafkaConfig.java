package productsmicroservice.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import productsmicroservice.service.ProductCreatedEvent;

/**
 * KAFKA PRODUCER CONFIGURATION
 * @author Emmanuel Taylor
 * 
 * Responsibilities:
 *  - Builds a ProducerFactory and KafkaTemplate for publishing ProductCreatedEvent messages.
 *  - Centralizes producer configuration (bootstrap servers, serializers, acks, timeouts, batching).
 *  - Optionally declares the topic (product-created-events-topic) on application startup.
 * 
 * Notes:
 *  - Topic auto-creation depends on broker configuration and Spring Kafka Admin settings.
 *  - If KafkaAdmin is enabled and the application has permissions, Spring can create this topic.
 */
@Configuration
public class KafkaConfig {
    
    /**
     * Kafka Broker bootstrap servers used by the Producer. 
     * This is the primary connection string the producer uses to discover the Kafka cluster.
     */
    @Value("${spring.kafka.bootstrap-servers}")
    private String bootstrapServers;

    /**
     * Serializer class for the message key.
     */
    @Value("${spring.kafka.producer.key-serializer}")
    private String keySerializer;

    /**
     * Serializer class for the message value or event payload.
     */
    @Value("${spring.kafka.producer.value-serializer}")
    private String valueSerializer;

    /**
     * Acknowledgement level for writes.
     */
    @Value("${spring.kafka.producer.acks}")
    private String acks;

    /**
     * Upper bound on the time to wait for a record to be acknowledged, including retries.
     * Helps prevent the producer from waiting indefinitely on delivery.
     */
    @Value("${spring.kafka.producer.properties.delivery.timeout.ms}")
    private String deliveryTimeout;

    /**
     * Linger time controls to control batching. Producer waits up to this long to group records
     * into batches. Higher values can improve throughput but add slight latency.
     */
    @Value("${spring.kafka.producer.properties.linger.ms}")
    private String linger;

    /**
     * Request timeout for broker communication. If the broker doesn't respond within this window,
     * the request is considered failed.
     */
    @Value("${spring.kafka.producer.properties.request.timeout.ms}")
    private String requestTimeout;

    /**
     * Enables idempotent producer to ensure exactly-once delivery semantics.
     */
    @Value("${spring.kafka.producer.properties.enable.idempotence}")
    private boolean enableIdempotence;

    /**
     * Maximum number of unacknowledged requests the client will send on a single connection
     * before blocking. Setting this to 1 ensures message ordering when retries occur.
     */
    @Value("${spring.kafka.producer.properties.max.in.flight.requests.per.connection}")
    private Integer inflightRequests;

    /**
     * Builds the producer configuration map used by the ProducerFactory.
     * 
     * @return Map of producer configuration properties
     */
    Map<String, Object> producerConfigs() {
        Map<String, Object> config = new HashMap<>();
        config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, keySerializer);
        config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, valueSerializer);
        config.put(ProducerConfig.ACKS_CONFIG, acks);
        config.put(ProducerConfig.DELIVERY_TIMEOUT_MS_CONFIG, deliveryTimeout);
        config.put(ProducerConfig.LINGER_MS_CONFIG, linger);
        config.put(ProducerConfig.REQUEST_TIMEOUT_MS_CONFIG, requestTimeout);
        config.put(ProducerConfig.ENABLE_IDEMPOTENCE_CONFIG, enableIdempotence);
        config.put(ProducerConfig.MAX_IN_FLIGHT_REQUESTS_PER_CONNECTION, inflightRequests);
        // config.put(ProducerConfig.RETRIES_CONFIG, Integer.MAX_VALUE);
        return config;
    }

    /**
     * ProducerFactory creates Kafka Producer instances based on the provided configuration.
     * Spring Kafka uses this factory behind the scenes when KafkaTemplate sends messages.
     * 
     * @return DefaultKafkaProducerFactory instance
     */
    @Bean
    ProducerFactory<String, ProductCreatedEvent> producerFactory() {
        return new DefaultKafkaProducerFactory<>(producerConfigs());
    }

    /**
     * KafkaTemplate is the primary Spring abstraction for producing Kafka messages.
     * This template will publish ProductCreatedEvent payloads keyed by the String product ID.
     * 
     * @return KafkaTemplate instance
     */
    @Bean
    KafkaTemplate<String, ProductCreatedEvent> kafkaTemplate() {
        return new KafkaTemplate<>(producerFactory());
    }

    /**
     * Declares the Kafka topic used for product creation events. It specifies 3 partitions and
     * 3 replicas with a minimum in-sync replica count of 2 for durability.
     * 
     * @return NewTopic instance representing the topic configuration
     */
    @Bean
    NewTopic createTopic() {
        return TopicBuilder.name("product-created-events-topic")
            .partitions(3)
            .replicas(3)
            .configs(Map.of("min.insync.replicas", "2"))
            .build();
    }
}
