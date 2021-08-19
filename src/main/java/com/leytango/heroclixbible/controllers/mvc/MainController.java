package com.leytango.heroclixbible.controllers.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/developers")
    public String indexPage(){
        return "index";
    }

    @RequestMapping("/")
    public String indexPageFromHomePath(){
        return "index";
    }

    @RequestMapping("/home")
    public String indexPageFromHome(){
       return "redirect:/";
    }

    @RequestMapping("/docs")
    public String docPage(){
       return "doc";
    }

    @RequestMapping("/credits")
    public String creditsPage(){
       return "credits";
    }


}
