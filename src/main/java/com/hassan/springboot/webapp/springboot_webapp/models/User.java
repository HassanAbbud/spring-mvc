package com.hassan.springboot.webapp.springboot_webapp.models;

public class User {

    //Attributes
    private String name;
    private String lastname;
    private String email;
    
    public User(String name, String lastname, String email) {
        this(name, lastname);
        this.email = email;
    }

    //Constructor
    public User(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }
    //Getters / Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
}
