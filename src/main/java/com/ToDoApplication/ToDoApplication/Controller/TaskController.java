package com.ToDoApplication.ToDoApplication.Controller;


import com.ToDoApplication.ToDoApplication.Model.Task;
import com.ToDoApplication.ToDoApplication.Repository.TaskRepository;
import com.ToDoApplication.ToDoApplication.Service.TaskService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    public String GetTasks()
    {
        List<Task> taskList = taskService.getAllTasks();
    }

}
