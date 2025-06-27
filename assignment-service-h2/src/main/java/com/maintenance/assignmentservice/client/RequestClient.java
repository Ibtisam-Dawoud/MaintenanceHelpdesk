package com.maintenance.assignmentservice.client;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

@Component
// This class acts as a client to communicate with the Request Service using REST.
public class RequestClient {

    @Autowired
    private RestTemplate restTemplate; // Used to send HTTP requests.
    // Retrieves a Request object from the Request Service based on its ID.
    public RequestDTO getRequestById(Long id) {
        String url = "http://localhost:8083/requests/" + id; // The URL of the request endpoint
        return restTemplate.getForObject(url, RequestDTO.class); //Sends GET request and maps the response
    }
}
