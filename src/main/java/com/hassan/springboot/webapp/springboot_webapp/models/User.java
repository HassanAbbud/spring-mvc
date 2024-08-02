package com.hassan.springboot.webapp.springboot_webapp.models;

public class User {

    //Attributes
    private String name;
    private String lastname;
    
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
}
