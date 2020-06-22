package com.love.calculator.demo.entity;

import com.love.calculator.demo.validator.AgeValidator;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Arrays;

public class RegisterUser {

    @NotBlank(message = "*Please Enter user")
    @Size(min = 3, max = 15, message = "*The name must be between 3-15 characters")
    private String name;

    @NotBlank(message = "*Please Enter username")
    @Size(min = 3, max = 15, message = "*The name must be between 3-15 characters")
    private String username;

    @NotNull
    @Size(min=3, max=25,message = "password size must be between 8 and 25")
    private char[] password;

    private String countryName;

    private String[] hobbies;

    @NotNull(message = "*Select a gender")
    private String gender;

    //@AgeValidator(lower=30,upper=50,message="age should be between 30 and 50")
    @AgeValidator
    private Integer age; //wrapper class

    private CommunicationDto comDto;

    public CommunicationDto getComDto() {
        return comDto;
    }
    public void setComDto(CommunicationDto comDto) {
        this.comDto = comDto;
    }
    public RegisterUser(){
    }

    public RegisterUser(String name, String username, char[] password, String countryName, String[] hobbies, String gender, Integer age) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.countryName = countryName;
        this.hobbies = hobbies;
        this.gender = gender;
        this.age = age;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public char[] getPassword() {
        return password;
    }
    public void setPassword(char[] password) {
        this.password = password;
    }
    public String getCountryName() {
        return countryName;
    }
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
    public String[] getHobbies() {
        return hobbies;
    }
    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "RegisterUser{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password=" + Arrays.toString(password) +
                ", countryName='" + countryName + '\'' +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
