package emailnotificationmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SPRING BOOT APPLICATION ENTRY POINT
 * @author Emmanuel Taylor
 * 
 * Responsibilities:
 *  - Bootstraps the Email Notification Microservice Spring Boot application.
 *  - Enables component scanning and auto-configuration via @SpringBootApplication.
 */
@SpringBootApplication
public class EmailNotificationMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailNotificationMicroserviceApplication.class, args);
	}
}
