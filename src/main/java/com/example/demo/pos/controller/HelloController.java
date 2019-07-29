package com.example.demo.pos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String index(ModelMap map) {
        map.addAttribute("message", "https://www.google.com");
        return "hello";
    }
}
