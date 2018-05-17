package com.projects.todo.service;

import com.projects.todo.model.Task;

import java.util.List;

/**
 * Created by sstoica on 5/17/2018.
 */
public interface TaskService {
    Task save(Task task);

    List<Task> findAll();

    Task getOne(Long id);

    void delete(long id);
}
