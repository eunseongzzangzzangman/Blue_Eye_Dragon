package com.example.bigdata_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/main")
    public String showMainPage(){
        return "main";
    }



    @GetMapping("/url_code(메인대시보드).html")
    public String tester(){
        System.out.println("Asdfasdfasdf");
        return "url_code(메인대시보드)";
    }

    // 영등포// 영등포// 영등포// 영등포// 영등포// 영등포// 영등포// 영등포// 영등포// 영등포// 영등포// 영등포
    @GetMapping("/url_code(영등포_주점업장수).html")
    public String tester2(){
        System.out.println("Asdfasdfasdf");
        return "url_code(영등포_주점업장수)";
    }

    @GetMapping("/url_code(영등포_인프라수).html")
    public String tester3(){
        System.out.println("Asdfasdfasdf");
        return "url_code(영등포_인프라수)";
    }

    @GetMapping("/url_code(영등포_유동인구필터링).html")
    public String tester4(){
        System.out.println("Asdfasdfasdf");
        return "url_code(영등포_유동인구필터링)";
    }


    @GetMapping("/url_code(영등포_퇴근시간유입인구).html")
    public String tester5(){
        System.out.println("Asdfasdfasdf");
        return "url_code(영등포_퇴근시간유입인구)";

    }

    @GetMapping("/url_code(영등포_경찰관수대비).html")
    public String tester6(){
        System.out.println("Asdfasdfasdf");
        return "url_code(영등포_경찰관수대비)";
    }



    //강서 //강서//강서//강서//강서//강서//강서//강서//강서//강서//강서//강서//강서//강서//강서//강서//강서//강서//강서//강서
    @GetMapping("/url_code(강서_주점업장수).html")
    public String tester7(){
        System.out.println("Asdfasdfasdf");
        return "url_code(강서_주점업장수)";
    }

    @GetMapping("/url_code(강서_인프라수).html")
    public String tester8(){
        System.out.println("Asdfasdfasdf");
        return "url_code(강서_인프라수)";
    }
    @GetMapping("/url_code(강서_유동인구필터링).html")
    public String tester9(){
        System.out.println("Asdfasdfasdf");
        return "url_code(강서_유동인구필터링)";
    }
    @GetMapping("/url_code(강서_퇴근시간유입인구).html")
    public String tester10(){
        System.out.println("Asdfasdfasdf");
        return "url_code(강서_퇴근시간유입인구)";
    }
    @GetMapping("/url_code(강서_경찰관수대비).html")
    public String tester11(){
        System.out.println("Asdfasdfasdf");
        return "url_code(강서_경찰관수대비)";
    }

    //강남//강남//강남//강남//강남//강남//강남//강남//강남//강남//강남//강남//강남//강남//강남//강남//강남//강남//강남//강남//강남//강남//강남//강남//강남//강남

    @GetMapping("/url_code(강남_주점업장수).html")
    public String tester12(){
        System.out.println("Asdfasdfasdf");
        return "url_code(강남_주점업장수)";
    }

    @GetMapping("/url_code(강남_인프라수).html")
    public String tester13(){
        System.out.println("Asdfasdfasdf");
        return "url_code(강남_인프라수)";
    }
    @GetMapping("/url_code(강남_유동인구필터링).html")
    public String tester14(){
        System.out.println("Asdfasdfasdf");
        return "url_code(강남_유동인구필터링)";
    }
    @GetMapping("/url_code(강남_퇴근시간유입인구).html")
    public String tester15(){
        System.out.println("Asdfasdfasdf");
        return "url_code(강남_퇴근시간유입인구)";
    }
    @GetMapping("/url_code(강남_경찰관수대비).html")
    public String tester16(){
        System.out.println("Asdfasdfasdf");
        return "url_code(강남_경찰관수대비)";
    }



    //강동 //강동 //강동 //강동 //강동//강동//강동 ㅍ //강동 //강동 //강동//강동 //강동
    @GetMapping("/url_code(강동_주점업장수).html")
    public String tester17(){
        System.out.println("Asdfasdfasdf");
        return "url_code(강동_주점업장수)";
    }

    @GetMapping("/url_code(강동_인프라수).html")
    public String tester18(){
        System.out.println("Asdfasdfasdf");
        return "url_code(강동_인프라수)";
    }
    @GetMapping("/url_code(강동_유동인구필터링).html")
    public String tester19(){
        System.out.println("Asdfasdfasdf");
        return "url_code(강동_유동인구필터링)";
    }
    @GetMapping("/url_code(강동_퇴근시간유입인구).html")
    public String tester20(){
        System.out.println("Asdfasdfasdf");
        return "url_code(강동_퇴근시간유입인구)";
    }
    @GetMapping("/url_code(강동_경찰관수대비).html")
    public String tester21(){
        System.out.println("Asdfasdfasdf");
        return "url_code(강동_경찰관수대비)";
    }


    //예측 지도 //예측 지도 //예측 지도 //예측 지도 //예측 지도 //예측 지도 //예측 지도 //예측 지도
    @GetMapping("/url_code(지도_서울전체).html")
    public String tester22(){
        System.out.println("Asdfasdfasdf");
        return "url_code(지도_서울전체)";
    }


    @GetMapping("/url_code(지도_영등포).html")
    public String tester23(){
        System.out.println("Asdfasdfasdf");
        return "url_code(지도_영등포)";
    }

    @GetMapping("/url_code(지도_강서).html")
    public String tester24(){
        System.out.println("Asdfasdfasdf");
        return "url_code(지도_강서)";
    }

    @GetMapping("/url_code(지도_강남).html")
    public String tester25(){
        System.out.println("Asdfasdfasdf");
        return "url_code(지도_강남)";
    }

    @GetMapping("/url_code(지도_강동).html")
    public String tester26(){
        System.out.println("Asdfasdfasdf");
        return "url_code(지도_강동)";
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
