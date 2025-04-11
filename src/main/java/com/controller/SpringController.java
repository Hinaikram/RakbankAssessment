package com.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")  // Base path: http://localhost:8080/api
public class SpringController {

    @GetMapping("/hello")
    public String sayHello() {
        return "👋 Hello from Spring Boot!";
    }

    @GetMapping("/greet")
    public String greetUser(@RequestParam(defaultValue = "Guest") String name) {
        return "Hello, " + name + "!";
    }

    @PostMapping("/echo")
    public String echoMessage(@RequestBody String message) {
        return "You said: " + message;
    }

    @GetMapping("/status")
    public String checkStatus() {
        return "✅ Application is running!";
    }
}
