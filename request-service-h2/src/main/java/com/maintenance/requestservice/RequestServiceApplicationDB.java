/**
 * this is entry opint of request Service microservice
 * it ,enable service discovery via @EnableDiscoveryClient allowing this service to register with the Eureka server
 */
package com.maintenance.requestservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RequestServiceApplicationDB {
    public static void main(String[] args) {
        SpringApplication.run(RequestServiceApplicationDB.class, args);
    }
}
