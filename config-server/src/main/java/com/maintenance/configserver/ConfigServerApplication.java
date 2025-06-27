/**
 *
 This file is the main entry point for the Spring Cloud Config Server.
 Its role is to provide centralized configuration management for all microservices
 */
package com.maintenance.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication // delcares this as a Spring Boot application
@EnableConfigServer // Enables Config Server functionality
public class ConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
