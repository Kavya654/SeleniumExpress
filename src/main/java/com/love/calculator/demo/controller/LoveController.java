package com.love.calculator.demo.controller;

import com.love.calculator.demo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class LoveController {

    @RequestMapping("/")
    public String greet(@ModelAttribute("user") User user) {
        return "homePage";
    }

    @RequestMapping("/process")
    public String process(@Valid @ModelAttribute("user") User user,BindingResult result) {

        if(result.hasErrors()){
            return "homePage";
        }

        return "processed";

    }

}
