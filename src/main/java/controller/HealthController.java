package com.example.itemapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/")
    public String home() {
        return "Spring Boot Item API is running!";
    }

    @GetMapping("/health")
    public String healthCheck() {
        return "OK";
    }
}
