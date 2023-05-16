package com.example.demo;

public class Footballer {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    Footballer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
