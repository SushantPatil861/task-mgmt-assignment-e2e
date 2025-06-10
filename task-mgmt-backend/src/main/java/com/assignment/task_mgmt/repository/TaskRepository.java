package com.assignment.task_mgmt.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.task_mgmt.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, UUID> {
}

