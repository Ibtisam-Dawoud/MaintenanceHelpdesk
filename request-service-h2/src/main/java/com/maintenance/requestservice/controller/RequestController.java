package com.maintenance.requestservice.controller;

import com.maintenance.requestservice.model.Request;
import com.maintenance.requestservice.repository.RequestRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Marks this class as a REST controller that handles HTTP requests
@RequestMapping("/requests") // Base URL path for all endpoints in this controller
public class RequestController {

    private final RequestRepository repository;
    // Constructor-based dependency injection of the repository
    public RequestController(RequestRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    // Returns a list of all requests
    public List<Request> getAll() {
        return repository.findAll();
    }
    //Creates a new request record
    @PostMapping
    public Request create(@RequestBody Request request) {
        return repository.save(request);
    }
    // Retrieves a request by its ID
    @GetMapping("/{id}")
    public Request getById(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }
    //Deletes a request by its ID
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
