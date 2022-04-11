package com.example.form.controller;

import com.example.form.dto.AppUserDto;
import com.example.form.service.AppUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/registration")
public class RegistrationController {

    private final AppUserService appUserService;

    public RegistrationController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }

    @ModelAttribute("userInfo")
    public AppUserDto createUserDto(){
        return new AppUserDto();
    }

    @RequestMapping
    public String registrationPage(){
        return  "registration";
    }

    @RequestMapping(value = "/save" , method = RequestMethod.POST)
    public String saveUser(@ModelAttribute("userInfo") AppUserDto appUserDto){

        appUserService.saveUser(appUserDto);
        return "redirect:/registration?success";
    }
}
