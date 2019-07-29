package com.example.demo.pos.controller;

import com.example.demo.pos.dao.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @RequestMapping("/userList")
    public String list(ModelMap map) {
        map.addAttribute("users", getUserList());
        return "userList";
    }


    private List<User> getUserList() {
        List<User> list = new ArrayList<User>();
        User user1 = new User("sophia", "123456");
        User user2 = new User("sophia2", "123563");
        list.add(user1);
        list.add(user2);
        return list;
    }


}
