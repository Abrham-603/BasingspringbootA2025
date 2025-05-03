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
        model.addAttribute("b", b);
        model.addAttribute("result", result);
        return "testparameter";
    }

/*
week3 assignment #1
Create a page controller that accesses the address url=> `/Assignment1`.
 configure it so that a normal page is returned.
 **/

    @RequestMapping("/assignment1")
   public String assignment1(){
       return "assignment1";
   }

   @RequestMapping("/assignment2")
   public String assignment2(){
        return "assignment2";
   }

  /*
  Create a page controller and a rest controller that passes three parameters and calculate their sum.
  You can create the url freely.
  **/
    @RequestMapping("/assignment3")
    public String assignment3(@RequestParam int num1, @RequestParam int num2, @RequestParam int num3
    , Model model) {
        int sum = 0;
        sum = num1 + num2 + num3;
        model.addAttribute("result", sum);
        return "assignment3";
   }


}
