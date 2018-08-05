package com.spring.rucken.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@RestController
//@RequestMapping("/")
public class defaultController {

    @GetMapping("/")
    public ModelAndView index() {
        Map<String,String> model = new HashMap<>();
        return new ModelAndView("index",model);
    }
}
