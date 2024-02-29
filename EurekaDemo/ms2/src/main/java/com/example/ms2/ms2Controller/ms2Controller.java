package com.example.ms2.ms2Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ms2Controller {
    @GetMapping("/ms2")
    public String Microservice2Response(){
        return "microservice 2";
    }
}

//localhost:8082/ms2