package com.love.calculator.demo.controller;

import com.love.calculator.demo.entity.RegisterUser;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class RegistrationController {

    @RequestMapping("/register")
    public String register(@ModelAttribute("user") RegisterUser user){
        return "registrationPage";
    }

    @RequestMapping("/registerProcess")
    public String registerProcess(@Valid @ModelAttribute("user") RegisterUser user, BindingResult result){

        System.out.println("inside registration page");

        if(result.hasErrors()){

          List<ObjectError> allerrors =   result.getAllErrors();
          for(ObjectError temp : allerrors){
              System.out.println(temp);
          }

            return "registrationPage";
        }

        return "registrationSuccess";
    }

}
