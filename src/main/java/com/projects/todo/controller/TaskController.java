package com.projects.todo.controller;

import com.projects.todo.model.Task;
import com.projects.todo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by sstoica on 5/14/2018.
 */

@Controller
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public String list(Model model){
        List <Task> tasks = taskService.findAll();
        model.addAttribute("tasks", tasks);
        return "tasks-list";
    }

    @GetMapping
    public String showNewTaskPage(){
        return "create-task";
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public String create(@ModelAttribute Task task) {
        taskService.save(task);
        return "tasks-list";
    }

    @GetMapping("/{id}")
    public String get(@PathVariable("id") long id) {
        taskService.getOne(id);
        return "task";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") long id){
        taskService.delete(id);
        return "tasks-list";
    }
}
