package com.projects.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by sstoica on 5/18/2018.
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController {

    @GetMapping
    public String login(){
        return "login";
    }
}
