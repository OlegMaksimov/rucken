package com.spring.rucken.controller;

import com.google.gson.Gson;
import com.spring.rucken.RuckenApplication;
import com.spring.rucken.entity.ContentType;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;

@SpringBootTest(classes = RuckenApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class ContentTypeControllerTest {

    private MockMvc mockMvc;
    private ContentType mock;

    @Autowired
    private ContentTypeController mockController;

    @Before
    public void setUp() throws Exception {
        this.mockMvc = MockMvcBuilders.standaloneSetup(mockController)
                .build();

        mock = new ContentType();
        mock.setId(123L);
    }

    @Test
    public void createUser() throws Exception {
        ResultActions result = mockMvc.perform(post("/api/content_types")
                .contentType(MediaType.APPLICATION_JSON)
                .content(new Gson().toJson(mock))
        );
    }

    @Test
    public void updateUser() throws Exception {
        ResultActions result = mockMvc.perform(put("/api/content_types")
                .contentType(MediaType.APPLICATION_JSON)
                .content(new Gson().toJson(mock))
        );
    }

    @Test
    public void load() throws Exception {
        ResultActions result = mockMvc.perform(get("/api/content_types/{id}",mock.getId())
                .contentType(MediaType.APPLICATION_JSON)
        );
    }

    @Test
    public void delete() throws Exception {
        ResultActions result = mockMvc.perform(MockMvcRequestBuilders.delete("/api/content_types/{id}",mock.getId())
                .contentType(MediaType.APPLICATION_JSON)
        );
    }
}