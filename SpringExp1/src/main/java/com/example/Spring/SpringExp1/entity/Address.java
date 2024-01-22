package com.example.Spring.SpringExp1.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
    // Q3
    @Value("${address.pin}")
    long pin;
    @Value("${address.city}")
    String city;
    @Value("${address.state}")
    String state;


    @Override
    public String toString() {
        return "Address{" +
                "pin=" + pin +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
    public long getPin() {
        return pin;
    }

    public void setPin(long pin) {
        this.pin = pin;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
