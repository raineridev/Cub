package com.cub.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CubApplication {

    public static void main(String[] args) {
        SpringApplication.run(CubApplication.class, args);
    }

    @GetMapping("/")
    public String index() {
        return "Hello World!";
    }
}
