package com.maintenance.assignmentservice.controller;

import com.maintenance.assignmentservice.model.Assignment;
import com.maintenance.assignmentservice.repository.AssignmentRepository;
import com.maintenance.assignmentservice.client.RequestClient;
import com.maintenance.assignmentservice.client.RequestDTO;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController // Marks this class as a REST controller
@RequestMapping("/assignments") //Base URL for all endpoints in this controller
public class AssignmentController {

    private final AssignmentRepository repository;//Repository to handle DB operations
    private final RequestClient requestClient; //Client to fetch request details from another microservice
     // Constructor to inject repository and clien
    public AssignmentController(AssignmentRepository repository, RequestClient requestClient) {
        this.repository = repository;
        this.requestClient = requestClient;
    }

    @GetMapping
    //Retrieve and return all assignments
    public List<Assignment> getAll() {
        return repository.findAll();
    }
     // Save a new assignment
    @PostMapping
    public Assignment create(@RequestBody Assignment assignment) {
        return repository.save(assignment);
    }
    // Get an assignment by ID
    @GetMapping("/{id}")
    public Assignment getById(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }

    // This method returns assignment along with the request details fetched from another microservice (request-service)
    @GetMapping("/{id}/with-request")
    public Map<String, Object> getAssignmentWithRequest(@PathVariable Long id) {
        Map<String, Object> response = new HashMap<>();
        // Retrieve the assignment from DB
        Assignment assignment = repository.findById(id).orElse(null);
        if (assignment == null) {
            response.put("error", "Assignment not found"); // Error if not found
            return response;
        }

        //Fetch request details from request-service using REST client
        RequestDTO requestDTO = requestClient.getRequestById(assignment.getRequestId());

        response.put("assignment", assignment); // Add assignment info
        response.put("request", requestDTO); // Add request info

        return response;
    }
}
