package com.maintenance.requestservice.repository;

import com.maintenance.requestservice.model.Request;
import org.springframework.data.jpa.repository.JpaRepository;
//This interface extends JpaRepository to provide CRUD operations for Request entity
public interface RequestRepository extends JpaRepository<Request, Long> {
}
