package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Value("${sm://projects/moro-1-373510/secrets/MYSQL_PASSWORD}")
    private String name;

    @GetMapping("/hello")
    public String hello(){
        return "hello!" + name;
    }
}
