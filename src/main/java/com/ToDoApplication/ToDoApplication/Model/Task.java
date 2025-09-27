package com.ToDoApplication.ToDoApplication.Model;

import ch.qos.logback.core.status.Status;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.annotation.Priority;
import jakarta.persistence.*;
import jdk.jshell.Snippet;
import lombok.Data;

import javax.management.relation.Role;
import java.time.LocalDateTime;

@Entity
@Data
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String status;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-mm-dd HH:mm:ss")
    private LocalDateTime createdAt;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-mm-dd HH:mm:ss")
    private LocalDateTime updatedAt;

    private String priority;

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }


}
