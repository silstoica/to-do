package com.projects.todo.service;

import com.projects.todo.model.Task;
import com.projects.todo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by sstoica on 5/17/2018.
 */
@Service
@Transactional
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskRepository taskRepository;

    @Override
    public Task save(Task task){
        return taskRepository.save(task);
    }

    @Override
    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    @Override
    public Task getOne(Long id) {
        return taskRepository.getOne(id);
    }

    @Override
    public void delete(long id) {
        taskRepository.deleteById(id);
    }
}
