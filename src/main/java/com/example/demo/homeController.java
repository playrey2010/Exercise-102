package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {

    @RequestMapping("/")
    public String homePage(Model model){
        model.addAttribute ( "myvar", "Say hello to the people." );
        model.addAttribute ( "var2", "Say goodbye to the people." );
        return "hometemplate";
    }
}