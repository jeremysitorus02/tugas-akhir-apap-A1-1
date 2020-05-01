package com.apap.kel1.koperasi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class RootController {

    @RequestMapping("/")
    private String home() {
        return "home";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }
}