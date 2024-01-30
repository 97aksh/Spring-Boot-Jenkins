package com.springDemo2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/welcome")
    public String getMeaasge() {
        return "Welcome to the Jenkins Demo!";
    }
}
