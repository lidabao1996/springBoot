package com.example.demo.pos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExampleController {
    @RequestMapping("/string")
    public String index(ModelMap map) {
        map.addAttribute("userName", "sophia");
        return "string";
    }
}
