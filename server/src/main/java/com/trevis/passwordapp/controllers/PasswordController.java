package com.trevis.passwordapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/password")
public class PasswordController {
    
    @GetMapping
    public String generate()
    {
        return "senha complexa";
    }

}