package com.projects.todo.repository;

import com.projects.todo.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by sstoica on 5/15/2018.
 */
public interface TaskRepository extends JpaRepository<Task, Long> {
    // aici t este o isntanta de Task, are un camp "user" care are un camp "id"
    @Query("SELECT t FROM Task t where t.user.id = :userId")
    List<Task> findAllByUserId(@Param("userId") Long userId);
}
