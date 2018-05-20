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

    @GetMapping("/new")
    public String showNewTaskPage(Model model){
        model.addAttribute("task",new Task());
        return "new-task";
    }

    @PostMapping
    public String create(@ModelAttribute("task") Task task) {
        taskService.save(task);
        return "redirect:/tasks";
    }


    @GetMapping("/get/{id}")
    public String get(@PathVariable("id") long id) {
        taskService.getOne(id);
        return "view-task";
    }

    @PostMapping("/update/{id}")
    public String update(@PathVariable("id") long id, @ModelAttribute("task") Task task){
        Task taskFromDB = taskService.getOne(id);
        taskFromDB.setName(task.getName());
        taskFromDB.setDeadline(task.getDeadline());
        taskFromDB.setPriority(task.getPriority());
        taskFromDB.setStatus(task.getStatus());
        taskService.save(taskFromDB);
        return "redirect:/tasks";
    }

    @GetMapping("/edit/{id}")
    public String edit(Model model, @ModelAttribute("task") Task task, @PathVariable("id") long id) {
        model.addAttribute("task",taskService.getOne(id));
        return "edit-task";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") long id){
        taskService.delete(id);
        return "redirect:/tasks";
    }
}
