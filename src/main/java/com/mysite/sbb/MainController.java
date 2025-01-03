package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
//    @GetMapping("/")
//    @ResponseBody
//    public int home() {
//        System.out.println("Home page requested");
//        return 22;
//    }

    @GetMapping("/about")
    @ResponseBody
    public String about() {
        System.out.println("about");
        return "안녕하세요";
    }

    public void contact() {
        System.out.println("contact");
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/question/list";
    }
}
