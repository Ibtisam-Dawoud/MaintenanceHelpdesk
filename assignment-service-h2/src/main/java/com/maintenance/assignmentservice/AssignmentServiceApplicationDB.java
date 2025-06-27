package com.maintenance.assignmentservice;

// class serves as the entry point for the assignment-service application.
import com.maintenance.assignmentservice.client.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication // Marks this class as the main Spring Boot application
@EnableDiscoveryClient // Allows this service to register with the Eureka Discovery Server
@EnableFeignClients(basePackages = "com.maintenance.assignmentservice.client") // Enables the use of Feign clients to call other microservices (e.g., request-service)
public class AssignmentServiceApplicationDB {
    public static void main(String[] args) {
        SpringApplication.run(AssignmentServiceApplicationDB.class, args);
    }

    @Bean
    // Registers a RestTemplate bean for HTTP communication with other services
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }







}
