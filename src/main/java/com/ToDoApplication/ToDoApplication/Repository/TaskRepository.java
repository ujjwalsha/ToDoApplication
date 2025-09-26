package com.ToDoApplication.ToDoApplication.Repository;


import com.ToDoApplication.ToDoApplication.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
