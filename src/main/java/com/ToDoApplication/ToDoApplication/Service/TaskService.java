package com.ToDoApplication.ToDoApplication.Service;

import com.ToDoApplication.ToDoApplication.Model.Task;
import com.ToDoApplication.ToDoApplication.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    TaskRepository taskRepository;

    public List<Task> getAllTasks() {
    }
}
