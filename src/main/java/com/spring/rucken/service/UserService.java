package com.spring.rucken.service;

import com.spring.rucken.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User createUser(User user){
        return user;
    }
}
