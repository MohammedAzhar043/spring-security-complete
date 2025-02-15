package com.example.securitydemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GrettingController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World";
    }
}
