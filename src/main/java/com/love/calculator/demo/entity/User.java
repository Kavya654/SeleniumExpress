package com.love.calculator.demo.entity;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User {

    @NotBlank(message = "*Please Enter username")
    @Size(min = 3, max = 15, message = "*The name must be between 3-15 characters")
    private String username;

    @NotBlank(message = "*Please Enter your crushname")
    @Size(min = 3, max = 15, message = "*The name must be between 3-15 characters")
    private String crushname;

    @AssertTrue(message = "you must agree to our terms and conditions")
    private boolean termsAndConditions;

    public boolean isTermsAndConditions() {
        return termsAndConditions;
    }
    public void setTermsAndConditions(boolean termsAndConditions) {
        this.termsAndConditions = termsAndConditions;
    }
    public User() {

    }

    public User(String username, String crushname) {
        this.username = username;
        this.crushname = crushname;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getCrushname() {
        return crushname;
    }
    public void setCrushname(String crushname) {
        this.crushname = crushname;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", crushname='" + crushname + '\'' +
                '}';
    }
}
