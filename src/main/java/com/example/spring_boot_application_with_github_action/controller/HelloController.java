package com.example.spring_boot_application_with_github_action.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludos")
public class HelloController {
    
    @GetMapping(value = "/salutacion")
    public String chat(){
        return "Salutación amigo!";
    }
}
