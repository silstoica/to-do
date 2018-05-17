package com.projects.todo.repository;

import com.projects.todo.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sstoica on 5/15/2018.
 */
public interface TaskRepository extends JpaRepository<Task, Long> {
}
