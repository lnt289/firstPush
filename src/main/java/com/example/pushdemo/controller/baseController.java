package com.example.pushdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class baseController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
