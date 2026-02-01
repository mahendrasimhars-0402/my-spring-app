package com.demo.my_spring_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MySpringAppApplication {

    @GetMapping("/")
    public String home() {
        return "Hello Kubernetes 🚀 Spring Boot App is Live!";
    }

    public static void main(String[] args) {
        SpringApplication.run(MySpringAppApplication.class, args);
    }
}

