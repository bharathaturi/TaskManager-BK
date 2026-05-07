package com.taskmanager.dto;

import lombok.Data;
import jakarta.validation.constraints.NotBlank;
import java.util.List;

@Data
public class ProjectDto {
    private Long id;
    @NotBlank
    private String name;
    private String description;
    private List<Long> memberIds;
}
