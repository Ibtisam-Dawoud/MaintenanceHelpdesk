/**
 * Through the API Gateway, it acts as a single entry point that forwards client requests to other microservices (like the assignment or request services), using automatic service discovery through Eureka
 */
package com.maintenance.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication // mark the class as main entry point of Spring Boot application and enables auto configuration and component scanning
@EnableDiscoveryClient // enables service registration and discovery using Eureka, so gateway can locate other microservies dynamically
public class ApiGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }
}
