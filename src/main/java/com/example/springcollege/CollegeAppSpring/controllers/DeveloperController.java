package com.example.springcollege.CollegeAppSpring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class DeveloperController {

    @GetMapping("/developer/info")
    public String getDeveloperInfo() {
        return "developer.html";
    }
}
