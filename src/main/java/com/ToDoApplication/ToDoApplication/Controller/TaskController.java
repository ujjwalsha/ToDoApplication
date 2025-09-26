package com.ToDoApplication.ToDoApplication.Controller;


import com.ToDoApplication.ToDoApplication.Model.Task;
import com.ToDoApplication.ToDoApplication.Repository.TaskRepository;
import com.ToDoApplication.ToDoApplication.Service.TaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/tasks")
    public ResponseEntity<List<Task>> GetTasks()
    {
        return taskService.getAllTasks();
    }

    @PostMapping("/Add")
    public ResponseEntity<?> AddTasks(@RequestBody Task task){
        return taskService.AddTasks(task);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateTask(@PathVariable Long id, @RequestBody Task task)
    {
        return taskService.updateTaskById(id, task);
    }

}
