package com.example.CrudPractice.controller;

import com.example.CrudPractice.entity.Employee;
import com.example.CrudPractice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController{
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employee")

        private List<Employee> getAllEmployees(){
        return employeeService.getAllEmployee();

    }

    @GetMapping("/employee/{id}")

private Employee getEmployeeById(@PathVariable("id") int id)
    {
        return employeeService.getEmployeeById(id);
    }

    @PostMapping("/create")
    private ResponseEntity createEmployee(@RequestBody Employee employee) {
        try {
            employeeService.saveOrUpdate(employee);
        } catch (Exception exception) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity("New employee created with id: " + employee.getId(), HttpStatus.CREATED);
    }
//delete
        @DeleteMapping("/delete/{id}")
        private ResponseEntity deleteById(@PathVariable("id") int id)
        {
            try{
                employeeService.delete(id);
            } catch (Exception exception)
            {
                return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
            }
            return new ResponseEntity("Employee deleted with id: "+id, HttpStatus.OK);
        }
}

