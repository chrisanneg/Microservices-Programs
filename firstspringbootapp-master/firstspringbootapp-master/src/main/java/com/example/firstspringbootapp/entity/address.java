package com.example.firstspringbootapp.entity;

import org.springframework.stereotype.Component;

@Component
public class address {
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

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    //@Value("${city}")
    String city;
    //@Value("${state}")
    String state;
    //@Value("${pin}")
    String pin;

    @Override
    public String toString() {
        return "address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pin=" + pin +
                '}';
    }


}
