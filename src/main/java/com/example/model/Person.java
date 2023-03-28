package com.example.model;


import org.springframework.stereotype.Component;

@Component
public class Person {
    private String username = "natali" ;
    private String password = "pass";

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
