package com.example.introspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecondaryController {
    @RequestMapping("/resume.html")
    public String start() {

        return "resume";
    }

}