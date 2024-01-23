package com.example.CrudPractice.entity;


import jakarta.persistence.*;

@Entity
@Table(name="employee")
public class Employee{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    Double salary;
}