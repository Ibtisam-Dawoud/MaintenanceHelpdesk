/**
 *
 This class defines the structure of a Request entity which represents a maintenance request. It includes fields like title, status, and description, and maps directly to a table in the database.
 */
package com.maintenance.requestservice.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity // Indicates that this class is a JPA entity mapped to a database table
public class Request {
    @Id // Marks this field as the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generates the ID (incremental)
    private Long requestId;

    private Long userId;
    private String title;
    private String status;// Current status of the request (e.g., "open", "in progress", "closed")
    private String description;
    private LocalDateTime createdAt;

    // Getters and setters allow access and modification of private fields
    public Long getRequestId() { return requestId; }
    public void setRequestId(Long requestId) { this.requestId = requestId; }

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}
