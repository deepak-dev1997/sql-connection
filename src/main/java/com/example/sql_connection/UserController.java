package com.example.sql_connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public String addUser(@RequestBody User user){
        String s= userService.addUser(user);
        return s;

    }

    @GetMapping("/get")
    public User getUser(@RequestParam("q") int id){
        return userService.getUser(id);
    }

    @GetMapping("/find")
    public List<User> allUser(){
        return userService.allUser();
    }
}
