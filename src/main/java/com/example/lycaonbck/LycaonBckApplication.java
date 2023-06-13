package com.example.lycaonbck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
 @RestController
public class LycaonBckApplication {

    public static void main(String[] args) {
        SpringApplication.run(LycaonBckApplication.class, args);


    }
    @GetMapping("/")
    public String home() {
        return "ciao!";
    }
}
