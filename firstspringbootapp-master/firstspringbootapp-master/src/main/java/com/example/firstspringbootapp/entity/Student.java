package com.example.firstspringbootapp.entity;

public class Student {
    public Student(int studentid, String firstname, String lastname) {
        this.id=studentid;
        this.firstname=firstname;
        this.lastname=lastname;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    int id;
    String firstname;
    String lastname;
}
