package com.ToDoApplication.ToDoApplication.Service;

import com.ToDoApplication.ToDoApplication.Model.Task;
import com.ToDoApplication.ToDoApplication.Repository.TaskRepository;
import org.hibernate.dialect.unique.CreateTableUniqueDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }


    public ResponseEntity<List<Task>> getAllTasks() {

        return new ResponseEntity<>(taskRepository.findAll(), HttpStatus.OK);
    }

    public ResponseEntity<?> AddTasks(Task task) {
        Task task1 = new Task();
        task1.setTitle(task.getTitle());
        task1.setCompleted(task.isCompleted());

        taskRepository.save(task1);

        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }


    public ResponseEntity<?> updateTaskById(Long id, Task task) {

        Task data = taskRepository.findById(id).get();

        data.setTitle(task.getTitle());
        data.setCompleted(task.isCompleted());

        Task updated = taskRepository.save(data);

        return new ResponseEntity<>(updated, HttpStatus.OK);

    }

    public ResponseEntity<?> deleteTaskById(Long id) {

        if(!taskRepository.existsById(id))
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        taskRepository.deleteById(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
