package com.example.demo.pos.controller;

import com.example.demo.pos.dao.model.UrlPathModel;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * @RestController 注解的意思是，Controller里面的方法都以json的格式输出
 */


@RestController
public class UrlPathController {
    @RequestMapping("/list")
    public String index() {
        return "我是一个还未进化成真正list的list,嘿嘿嘿！";
    }


    @RequestMapping("/saveUrl")
    public void saveUser(@Valid UrlPathModel urlPathModel, BindingResult result){
        System.out.println("保存");
        if (result.hasErrors()){
            List<ObjectError> allErrors = result.getAllErrors();
            for (ObjectError error : allErrors) {
                System.out.println(error.getCode()+ "-" + error.getDefaultMessage());
            }
        }

    }

}
