package com.flybear.blog.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerLoginPage {
    @RequestMapping("/tologin")
    public String go(){
        return "login";
    }
}
