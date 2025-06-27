package com.maintenance.assignmentservice.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
// Marks this class as a JPA entity to be stored in the database
public class Assignment {
    @Id // Marks this field as the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate the primary key (ID) using identity strategy
    private Long assignmentId;

    private Long requestId; // Reference to the ID of the request (foreign key relation logic)
    private Long technicianId;
    private LocalDateTime assignedAt;

    // Getters and Setters
    public Long getAssignmentId() { return assignmentId; }
    public void setAssignmentId(Long assignmentId) { this.assignmentId = assignmentId; }

    public Long getRequestId() { return requestId; }
    public void setRequestId(Long requestId) { this.requestId = requestId; }

    public Long getTechnicianId() { return technicianId; }
    public void setTechnicianId(Long technicianId) { this.technicianId = technicianId; }

    public LocalDateTime getAssignedAt() { return assignedAt; }
    public void setAssignedAt(LocalDateTime assignedAt) { this.assignedAt = assignedAt; }
}
