package com.spring.rucken.controller;

import com.spring.rucken.entity.User;
import com.spring.rucken.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class UserController {

    private final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @PostMapping("/users")
    public User createUser(@RequestBody User user){
        log.debug("create user {}",user);
        User result = userService.createUser(user);
        return result;
    }

    @PutMapping("/users")
    public User updateUser(@RequestBody User user){
        log.debug("update user {}",user);
        User result = userService.createUser(user);
        return result;
    }

    @GetMapping("/users/{id}")
    public User load(@RequestBody Long id){
        log.debug("load user {}",id);
        User result = userService.loadUser(id);
        return result;
    }

    @DeleteMapping("/users/{id}")
    public void delete(@RequestBody Long id){
        log.debug("delete user {}",id);
        userService.deleteUser(id);
    }

}
