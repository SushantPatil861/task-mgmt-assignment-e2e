package com.assignment.task_mgmt.model;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TASKS")
@Getter
@Setter
@NoArgsConstructor
public class Task {

    @Id
	@Column(name = "ID", unique = true, nullable = false)
    @GeneratedValue
    private UUID id;

    @NotBlank
	@Column(name = "TITLE", nullable = false)
    @Size(min = 1, max = 100)
    private String title;

	@Column(name = "DESCRIPTION")
    private String description;

    @FutureOrPresent
	@Column(name = "DUE_DATE")
    private LocalDate dueDate;

    @Enumerated(EnumType.STRING)
	@Column(name = "PRIORITY")
    private Priority priority;

	@Column(name = "COMPLETED")
    private boolean completed = false;

    public enum Priority {
        LOW, MEDIUM, HIGH
    }
}
