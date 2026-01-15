package emailnotificationmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * SPRING BOOT APPLICATION ENTRY POINT
 * @author Emmanuel Taylor
 * 
 * Responsibilities:
 *  - Bootstraps the Email Notification Microservice Spring Boot application.
 *  - Enables component scanning and auto-configuration via @SpringBootApplication.
 *  - Exposes shared infrastructure beans needed by the application via RestTemplate.
 */
@SpringBootApplication
public class EmailNotificationMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailNotificationMicroserviceApplication.class, args);
	}

	/**
	 * RestTemplate bean for making outbound HTTP requests from this service.
	 * 
	 * @return RestTemplate instance.
	 */
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
