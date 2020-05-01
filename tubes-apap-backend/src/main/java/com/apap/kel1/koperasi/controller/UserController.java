package com.apap.kel1.koperasi.controller;

import com.apap.kel1.koperasi.model.UserModel;
import com.apap.kel1.koperasi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    private String addUserSubmit(@ModelAttribute UserModel user){

        userService.addUser(user);
        return "home";
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    private List<UserModel> getAll(){
        return userService.getAllUser();
    }

}