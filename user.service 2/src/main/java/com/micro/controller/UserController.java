package com.micro.controller;

import com.micro.VO.RestTemplate;
import com.micro.entity.User;

import com.micro.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/departments")
@RestController
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){

        log.info("Inisde saveDepartment method of department Controller");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public User findUserById(@PathVariable("id") Long userId){

        log.info("Inisde saveDepartment method of department Controller");

        return userService.findUserById(userId);
    }

    @GetMapping
    public RestTemplate getUserWithDepartment(@PathVariable("id") Long userId){
        return userService.getUserWithDepartment(userId);
    }



}
