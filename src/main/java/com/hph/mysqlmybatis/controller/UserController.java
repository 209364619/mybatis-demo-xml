package com.hph.mysqlmybatis.controller;

import com.hph.mysqlmybatis.entity.User;
import com.hph.mysqlmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping(value = "/user")
    public List<User> findAll(){
        return userService.findAll();
    }

    @PostMapping("/user")
    public User insertOne(@RequestBody User user){
        userService.insertUser(user);
        return user;
    }
    @PutMapping("/user")
    public User updateUser(@RequestBody User user){
        userService.updateUser(user);
        return user;
    }
    @DeleteMapping("/user")
    public boolean deleteById(@RequestParam Integer id){
        userService.deleteById(id);
        return true;
    }
}
