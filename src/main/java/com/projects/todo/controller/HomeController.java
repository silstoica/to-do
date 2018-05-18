package com.projects.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sstoica on 5/18/2018.
 */
@Controller
@RequestMapping(value = {"/","/home"})
public class HomeController {

    @GetMapping
    public String home(){
        return "home";
    }
}
