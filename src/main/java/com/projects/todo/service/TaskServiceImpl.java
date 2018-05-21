package com.projects.todo.service;

import com.projects.todo.model.Task;
import com.projects.todo.repository.TaskRepository;
import com.projects.todo.security.ToDoUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private UserService userService;

    @Override
    public Task save(Task task){
        ToDoUserDetails currentUser = (ToDoUserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        task.setUser(userService.getOne(currentUser.getId()));

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

    @Override
    public List<Task> findAllByUser() {
        ToDoUserDetails currentUser = (ToDoUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return taskRepository.findAllByUserId(currentUser.getId());
    }

    @Override
    public Task update(Task task) {
        Task taskFromDB = taskRepository.getOne(task.getId());
        taskFromDB.setName(task.getName());
        taskFromDB.setDeadline(task.getDeadline());
        taskFromDB.setPriority(task.getPriority());
        taskFromDB.setStatus(task.getStatus());
        return taskFromDB;
    }
}
