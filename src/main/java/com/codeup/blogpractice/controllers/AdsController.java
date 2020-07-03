package com.codeup.blogpractice.controllers;


import com.codeup.blogpractice.dao.AdRepository;
import org.springframework.stereotype.Controller;

@Controller
public class AdsController {
    private final AdRepository adDao;
    public AdsController(AdRepository adDao){
        this.adDao = adDao;
    }


}
