package com.example.CrudPractice.service;

import java.util.ArrayList;
import java.util.List;

import com.example.CrudPractice.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.CrudPractice.repository.EmployeeRepository;

@Service
public class EmployeeService{
    @Autowired
    EmployeeRepository employeeRepo;


    public List getAllEmployee()

    {
        List employees = new ArrayList();
                employeeRepo.findAll().forEach(employee -> employees.add (employee));
        return employees;
    }

    public Employee getEmployeeById(int id) {
        return employeeRepo.findById(id).get();
    }

    public void saveOrUpdate(Employee employee) {
        employeeRepo.save(employee);
    }

    public void delete(int id) {
        employeeRepo.deleteById(id);
    }
}




