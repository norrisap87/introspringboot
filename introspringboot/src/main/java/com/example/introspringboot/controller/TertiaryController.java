package com.example.introspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TertiaryController {
    @RequestMapping("/survey.html")
    public String start() {

        return "survey";
    }

}