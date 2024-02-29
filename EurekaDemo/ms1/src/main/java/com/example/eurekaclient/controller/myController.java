package com.example.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class myController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/ms1")
    public String meth(){
String microserviceResponse=restTemplate.getForObject("http://microservice2:8082/ms2", String.class);
return "Microservice 1 calling: "+microserviceResponse;
    }
}
//http://localhost:8081/ms1