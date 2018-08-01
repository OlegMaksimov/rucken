package com.spring.rucken.controller;

import com.google.gson.Gson;
import com.spring.rucken.RuckenApplication;
import com.spring.rucken.entity.User;
import org.junit.Before;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.mockito.Mockito.mock;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@SpringBootTest(classes = RuckenApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class UserControllerTest {

    private MockMvc mockMvc;
    private User user;

    @Autowired
    private UserController userController;


    @Before
    public void setUp() throws Exception {

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