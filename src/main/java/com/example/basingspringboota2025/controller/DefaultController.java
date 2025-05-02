package com.example.basingspringboota2025.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller//This means this is Controller!!!
public class DefaultController {
    //This is page Controller

    @RequestMapping("/index") //when client call `/index` page please execute this method!!
    public String index() {
        return "index"; //find index.html in resources/templates/~~~
    }

    @RequestMapping("/test001")
    public String test001() {
        return "test001";
    }

    @RequestMapping("/testmodel")
    public String testmodel(Model model) {
        model.addAttribute("msg", "we are testing!!");
        model.addAttribute("sum", 123);
        return "testmodel";
    }

    @RequestMapping("/testparameter")
    public String testparameter(int a, //parameter
                                int b, //parameter
                                @RequestParam String c, //parameter (reqired)
                                Model model //you can use MVC pattern model!!
    ) {
        int result = 0;
        result = a + b ;
        model.addAttribute("a", a);
        model.addAttribute("result", result);
        return "testparameter";
    }
}
