package com.codeup.blogpractice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Index {

    @GetMapping("/")
    @ResponseBody
    public String indexView(){
        return "This is the landing page.";
    }
}
