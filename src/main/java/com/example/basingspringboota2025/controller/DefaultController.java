package com.example.basingspringboota2025.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;


@Controller
public class DefaultController {

    @ResponseBody
    @RequestMapping("/test")
    public String test() {
        return "test";
    }

    @ResponseBody // return JSON type!! not a view!!!
    @RequestMapping("test111")
    public Map<String, Object> test2(){
        Map<String, Object> map = new HashMap<> ();
        map.put("key", "value");
        return map;
    }
    @RequestMapping("/page1")
    public String page1() {
        return "page1";
    }

}
