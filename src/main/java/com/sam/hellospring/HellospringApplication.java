package com.sam.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HellospringApplication {

    @RequestMapping("/")
    String home() {
        return "Hello Sam!";
    }

    public static void main(String[] args) {
        SpringApplication.run(HellospringApplication.class, args);
    }

}