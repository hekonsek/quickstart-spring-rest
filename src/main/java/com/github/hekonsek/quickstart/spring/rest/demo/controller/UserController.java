package com.github.hekonsek.quickstart.spring.rest.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserController {

    @GetMapping("/users")
    public Map<String, ?> usersGet() {
        return Map.of("name", "henryk");
    }

}
