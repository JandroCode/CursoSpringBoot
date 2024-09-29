package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    //

    @GetMapping("/uno")
    public String home(){
        return "home";
    }

    @GetMapping("/dos")
    public String homeDos(){
        return "homeDos";
    }

    @GetMapping("/tres")
    public String homeTres(){
        return "homeTres";
    }
}
