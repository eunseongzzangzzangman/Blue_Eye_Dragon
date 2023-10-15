package com.example.bigdata_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/main")
    public String showMainPage(){
        return "main";
    }

    @GetMapping("/main2")
    public String showMainPage2(){
        return "main2";
    }

    @GetMapping("/page1")
    public String showPage1(){
        return "page1";
    }
}
