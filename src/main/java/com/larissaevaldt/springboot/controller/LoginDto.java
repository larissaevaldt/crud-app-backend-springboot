package com.larissaevaldt.springboot.controller;

import org.springframework.lang.NonNull;

public class LoginDto {
    @NonNull
    private String username;

    @NonNull
    private String password;

    private String firstName;

    private String lastName;

    /**
     * Default constructor
     */
    protected LoginDto() {
    }

    /**
     * Partial constructor
     * @param username
     * @param password
     */
    public LoginDto(String username, String password) {
        this.username = username;
        this.password = password;
    }
    /**
     * Full constructor
     * @param username
     * @param password
     */
    public LoginDto(String firstName, String lastName, String username, String password) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.username = username;
       this.password = password;
    }

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

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

