package com.spring.rucken.controller;

import com.google.gson.Gson;
import com.spring.rucken.RuckenApplication;
import com.spring.rucken.entity.User;
import org.apache.catalina.connector.Response;
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
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.mockito.Mockito.mock;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

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
       ResultActions result = mockMvc.perform(post("/api/users")
       .contentType(MediaType.APPLICATION_JSON)
       .content(new Gson().toJson(user))
              );
//        result.andExpect(status().isCreated());
    }

    @Test
    public void updateUser() throws Exception {
        ResultActions result = mockMvc.perform(put("/api/users")
                .contentType(MediaType.APPLICATION_JSON)
                .content(new Gson().toJson(user))
        );
    }

    @Test
    public void load() throws Exception {
        ResultActions result = mockMvc.perform(get("/api/users/{id}",user.getId())
                .contentType(MediaType.APPLICATION_JSON)
        );
    }

    @Test
    public void delete() throws Exception {
        ResultActions result = mockMvc.perform(MockMvcRequestBuilders.delete("/api/users/{id}",user.getId())
                .contentType(MediaType.APPLICATION_JSON)
        );
    }
}