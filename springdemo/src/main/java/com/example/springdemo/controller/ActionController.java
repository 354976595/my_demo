package com.example.springdemo.controller;

import com.example.springdemo.service.IActionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import sun.rmi.runtime.Log;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/action")
public class ActionController extends BaseLoggerController {
    @Autowired
    private IActionService actionServicel;

    public ActionController() {
        super();
    }

    @RequestMapping("index/{indexvalue}")
    @ResponseBody
    public String index(@PathVariable( "indexvalue")String indexvalue,String age){
        return "dadada"+indexvalue;
    }

    @RequestMapping("getAction")
    @ResponseBody
    public String getAction(){
        return "ddadadsada";
    }

    @RequestMapping("testaop")
    @ResponseBody
    public String testaop(HttpServletRequest request){
        System.out.println(this.getLogger().getName());
        actionServicel.aopMethod("1",2,null);
        return "success";
    }


}
