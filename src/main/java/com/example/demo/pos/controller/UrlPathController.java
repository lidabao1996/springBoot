package com.example.demo.pos.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController 注解的意思是，Controller里面的方法都以json的格式输出
 */


@RestController
public class UrlPathController {
    @RequestMapping("/list")
    public String index() {
        return "我是一个还未进化成真正list的list,嘿嘿嘿！";
    }


}
