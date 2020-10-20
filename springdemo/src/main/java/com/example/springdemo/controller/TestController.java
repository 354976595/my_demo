package com.example.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("test")
@Controller
public class TestController extends BaseLoggerController {
    public TestController() {
        super();
    }

    @RequestMapping("testLog")
    @ResponseBody
    public String test(){
        System.out.println(this.getLogger().getName());
        return null;
    }
}
