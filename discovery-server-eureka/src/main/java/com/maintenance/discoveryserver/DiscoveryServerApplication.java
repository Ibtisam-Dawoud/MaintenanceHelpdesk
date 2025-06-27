/**
 * this server allows other microservices to register themselves and discover each other
 */
package com.maintenance.discoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication // delcares this as a Spring Boot application
@EnableEurekaServer // Enables Eureka Server functionality
public class DiscoveryServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DiscoveryServerApplication.class, args);
    }
}
