package com.example.firstspringbootapp.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class employee {

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

    public address getAddress() {
        return address;
    }

    public void setAddress(address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    int id;
    //@Value("${name}")
    private String name;
    @Autowired
    address address;

}
