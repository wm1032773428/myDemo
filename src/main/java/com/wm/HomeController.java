package com.wm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HomeController {
    @RequestMapping("home")
    public @ResponseBody
    String homePage(){
        return "This  is home page";
    }
    public String indexPage(){
        return "login";
    }

}