package com.codeup.blogpractice.controllers;


import com.codeup.blogpractice.dao.AdRepository;
import com.codeup.blogpractice.model.Ad;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AdsController {
    private final AdRepository adDao;
    public AdsController(AdRepository adDao){
        this.adDao = adDao;
    }

    @GetMapping("/ads")
    public String viewAllAds(Model model){
        List<Ad> currentAd = adDao.findAll();
        model.addAttribute("ads", currentAd);
        return "/ad/viewAll";
    }

}
