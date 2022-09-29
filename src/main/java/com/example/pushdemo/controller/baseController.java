package com.example.pushdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class baseController {
    @RequestMapping("hello")
    public String index(){
        return "index";
    }
    @RequestMapping("/")
    public String home(){
        return "home";
    }
    @RequestMapping("login")
    public String login(){
        return "login";
    }
}
