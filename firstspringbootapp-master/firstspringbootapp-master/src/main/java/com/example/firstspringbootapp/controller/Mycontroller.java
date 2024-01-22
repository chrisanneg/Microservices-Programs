package com.example.firstspringbootapp.controller;

import com.example.firstspringbootapp.entity.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {
    @RequestMapping("/display")
    String display(){
        return "hello there";
    }
    @Autowired
    employee ob;

    @RequestMapping("/employee")
    String employee(){
//        ob.setName("Aadil");
//        ob.setId(101);
//        ob.setAddress("mars");
        return "employee details: "+ob;
    }
}
