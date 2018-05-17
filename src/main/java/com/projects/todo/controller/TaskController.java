package com.projects.todo.controller;

import com.projects.todo.model.Task;
import com.projects.todo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by sstoica on 5/14/2018.
 */

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<Task> list(){
        return taskService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Task task) {
        taskService.save(task);
    }

    @GetMapping("/{id}")
    public Task get(@PathVariable("id") long id) {
        return taskService.getOne(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id){
        taskService.delete(id);
    }
}
