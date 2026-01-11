package emailnotificationmicroservice.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

/**
 * KAFKA CONSUMER CONFIGURATION
 * @author Emmanuel Taylor
 * 
 * Responsibilities:
 *  - Builds a ConsumerFactory for creating Kafka Consumer instances used by @KafkaListener methods.
 *  - Centralizes consumer configuration (bootstrap servers, deserializers, group ID).
 *  - Applies JSON Deserializer security controls via trusted packages to prevent unsafe deserialization.
 *  - Creates a ConcurrentKafkaListenerContainerFactory to manage listener containers.
 */
@Configuration
public class KafkaConsumerConfiguration {
    
    /**
     * Spring Environment for accessing application properties in the configuration file.
     */
    @Autowired
    Environment environment;

    /**
     * Builds the ConsumerFactory used by Spring Kafka to create Kafka Consumer instances.
     * 
     * @return ConsumerFactory Map for String keys and Object payloads.
     */
    @Bean
    public ConsumerFactory<String, Object> consumerFactory() {
        Map<String, Object> config = new HashMap<>();
        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, environment.getProperty("spring.kafka.consumer.bootstrap-servers"));
        config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        config.put(JsonDeserializer.TRUSTED_PACKAGES, environment.getProperty("spring.kafka.consumer.properties.spring.json.trusted.packages"));
        config.put(ConsumerConfig.GROUP_ID_CONFIG, environment.getProperty("spring.kafka.consumer.group-id"));
        
        return new DefaultKafkaConsumerFactory<>(config);
    }

    /**
     * Creates the listener container factory used by the @KafkaListener annotation.
     * 
     * @param consumerFactory - The ConsumerFactory to set on the listener container factory.
     * @return ConcurrentKafkaListenerContainerFactory for String keys and Object payloads.
     */
    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, Object> kafkaLisenerContainerFactory(ConsumerFactory<String, Object> consumerFactory) {
        ConcurrentKafkaListenerContainerFactory<String, Object> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerFactory);
        
        return factory;
    }
}
