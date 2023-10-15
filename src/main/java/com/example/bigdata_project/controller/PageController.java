package com.example.bigdata_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/main")
    public String showMainPage(){
        return "main";
    }

    @GetMapping("/url_code(경찰관수대비).html")
    public String tester(){
        System.out.println("Asdfasdfasdf");
        return "url_code(경찰관수대비)";
    }
    @GetMapping("/url_code(메인대시보드).html")
    public String tester2(){
        System.out.println("Asdfasdfasdf");
        return "url_code(메인대시보드)";
    }
    @GetMapping("/url_code(유동인구필터링).html")
    public String teste3r(){
        System.out.println("Asdfasdfasdf");
        return "url_code(유동인구필터링)";
    }
    @GetMapping("/url_code(인프라수).html")
    public String tester4(){
        System.out.println("Asdfasdfasdf");
        return "url_code(인프라수)";
    }
    @GetMapping("/url_code(주점업장수).html")
    public String tester5(){
        System.out.println("Asdfasdfasdf");
        return "url_code(주점업장수)";
    }
    @GetMapping("/url_code(퇴근시간유입인구).html")
    public String tester6(){
        System.out.println("Asdfasdfasdf");
        return "url_code(퇴근시간유입인구)";
    }

    @GetMapping("/url_code(7).html")
    public String tester7(){
        System.out.println("Asdfasdfasdf");
        return "url_code(7)";
    }


    @GetMapping("/main2")
    public String showMainPage2(){
        return "main2";
    }

    @GetMapping("/main4")
    public String showMainPage4(){
        return "main4";
    }

    @GetMapping("/main5")
    public String showMainPage5(){
        return "main5";
    }

    @GetMapping("/page1")
    public String showPage1(){
        return "page1";
    }
}
