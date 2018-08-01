package com.spring.rucken.controller;

import com.google.gson.Gson;
import com.spring.rucken.entity.User;
import jdk.nashorn.internal.parser.JSONParser;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

public class UserControllerTest {

    private MockMvc mockMvc;
    User user;
    @Before
    public void setUp() throws Exception {
        UserController userController =  new UserController();
        this.mockMvc = MockMvcBuilders.standaloneSetup(userController)
                .build();

        user =  new User();
        user.setActive(true);
        user.setId(123L);
    }


    @Test
    public void createUser() throws Exception {
       mockMvc.perform(post("/api/users")
       .contentType(MediaType.APPLICATION_JSON)
       .content(new Gson().toJson(user))
              );
    }
}