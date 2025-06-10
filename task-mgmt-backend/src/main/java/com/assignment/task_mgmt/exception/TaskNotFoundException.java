package com.assignment.task_mgmt.exception;

public class TaskNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = -6719286791533140415L;

	public TaskNotFoundException(String message) {
        super(message);
    }
}