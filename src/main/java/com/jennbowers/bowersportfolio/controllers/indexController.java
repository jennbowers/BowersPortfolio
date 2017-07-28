package com.jennbowers.bowersportfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {
    @RequestMapping("/")
    public String index (){
        System.out.println("Working!");
        return "index";
    }
}
