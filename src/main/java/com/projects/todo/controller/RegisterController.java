package com.projects.todo.controller;

import com.projects.todo.model.User;
import com.projects.todo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sstoica on 5/18/2018.
 */
@Controller
@RequestMapping(value = "/register")
public class RegisterController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String showRegisterPage(){
        return "register";
    }

    @PostMapping
    public String registerUser(@ModelAttribute User user){
        userService.registerUser(user);
        return "redirect:/login";
    }
}
