package com.example.bok.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

    @RequestMapping("/hello")
    public String getHello(Model model) {

        System.out.println("::: TEST ::: ");
        model.addAttribute("name", "ohhyonchul");

        return "index";
    }
    
}
