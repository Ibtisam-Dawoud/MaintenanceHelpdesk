# Maintenance Helpdesk Project

This is a **Microservices-based Maintenance Helpdesk** system built with **Spring Boot, Spring Cloud, and Eureka**. The project demonstrates how to build a distributed architecture where each microservice has a clear responsibility, and communication happens via RESTful APIs and service discovery.



##  Overview

The Maintenance Helpdesk project consists of multiple microservices:

- **Discovery Server (Eureka):** Central registry for service discovery.
- **Config Server:** Centralized configuration management.
- **API Gateway:** Single entry point to route requests to microservices.
- **Request Service:** Manages maintenance requests.
- **Assignment Service:** Manages assignments and retrieves request details via REST.



##  Technologies Used

✅ Java 17  
✅ Spring Boot 3  
✅ Spring Cloud (Eureka, Config, OpenFeign, Gateway)  
✅ H2 In-Memory Database  
✅ Maven  
✅ RESTful APIs  



##  Microservices

### 📌 Discovery Server
- Runs on **port 8761**.
- Provides service registry and discovery using Eureka.

### 📌 Config Server
- Runs on **port 8888**.
- Serves centralized configuration files.

### 📌 API Gateway
- Runs on **port 8080**.
- Forwards client requests to appropriate microservices.

### 📌 Request Service
- Runs on **port 8083**.
- CRUD operations for maintenance requests.

### 📌 Assignment Service
- Runs on **port 8084**.
- CRUD operations for assignments.
- Retrieves request data from Request Service via RESTTemplate.



##  How to Run

1. **Start Eureka Server**
   - `DiscoveryServerApplication.java`
2. **Start Config Server**
   - `ConfigServerApplication.java`
3. **Start Request Service**
   - `RequestServiceApplicationDB.java`
4. **Start Assignment Service**
   - `AssignmentServiceApplicationDB.java`
5. **Start API Gateway**
   - `ApiGatewayApplication.java`

Make sure ports are available and no conflicts exist.



##  Example Endpoints

- **API Gateway:**
  - `http://localhost:8080/request-service/requests`
  - `http://localhost:8080/assignment-service/assignments`
  - `http://localhost:8080/assignment-service/assignments/{id}/with-request`

- **Request Service:**
  - `http://localhost:8083/requests`

- **Assignment Service:**
  - `http://localhost:8084/assignments`


##  Features

- Centralized configuration with Spring Cloud Config.
- Service registration and discovery with Eureka.
- REST communication between services.
- In-memory H2 databases for demonstration.
- API Gateway routing.
- Modular design for scalability and separation of concerns.


## 📂 Project Structure


MaintenanceHelpdesk
├── api-gateway
│ └── (Spring Boot Gateway Application)
├── assignment-service
│ └── (Assignment microservice)
├── config-server
│ └── (Centralized Config Server)
├── discovery-server
│ └── (Eureka Service Registry)
├── request-service
│ └── (Request microservice)
└── README.md


Each module is an independent Spring Boot microservice that can be built and run separately.


##  Example API Flow

1. **Client** sends a request to **API Gateway** (`localhost:8080`).
2. API Gateway forwards the request to the appropriate microservice (Request Service or Assignment Service).
3. Microservices fetch data:
   - Assignment Service retrieves its own data from the H2 database.
   - Assignment Service calls Request Service via REST to fetch request details.
4. Aggregated response is returned to the client.




##  Author

Created with ❤️ by **Ibtisam Dawoud**  
Feel free to the repository and contribute!


