package com.taskmanager.dto;

import com.taskmanager.entity.TaskStatus;
import lombok.Data;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
public class TaskDto {
    private Long id;
    @NotBlank
    private String title;
    private String description;
    private TaskStatus status;
    private LocalDate dueDate;
    @NotNull
    private Long projectId;
    private Long assignedToId;
}
