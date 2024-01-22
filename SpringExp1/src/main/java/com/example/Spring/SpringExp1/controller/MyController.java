package com.example.Spring.SpringExp1.controller;

import com.example.Spring.SpringExp1.entity.Address;
import com.example.Spring.SpringExp1.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MyController {
    @RequestMapping("/display")
String display(){

        return "hello there";
}
    @Autowired
    Employee ob;

    @RequestMapping("/employee")
    String Employee(){

        return "employee details: "+ob;
    }
}
