package com.core.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.core.model.Employee;

@RestController
public class TestController {

	@RequestMapping("/")
    public String home() 
	{
        return "Hello duniya!!";
    }
	
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public Employee firstPage() 
	{

		Employee emp = new Employee();
		emp.setName("Tom");
		emp.setDesignation("manager");
		emp.setEmpId("1");
		emp.setSalary(5000);

		return emp;
	}

}
