package com.teach.early.core;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test {

    @RequestMapping("/index")
    public String index() {
        return "home";
    }
}
