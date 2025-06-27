package com.maintenance.assignmentservice.repository;

import com.maintenance.assignmentservice.model.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// Marks this interface as a Spring-managed repository (for dependency injection)
// interface inherits basic CRUD operations (Create, Read, Update, Delete)
public interface AssignmentRepository extends JpaRepository<Assignment, Long> {
}
