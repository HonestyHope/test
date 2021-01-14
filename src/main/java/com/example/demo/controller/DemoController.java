package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    @RequestMapping("test")
    @ResponseBody
    public String test(){
        return "hello,test!-----------:1";
    }
    
    @RequestMapping(value = "hello",method = RequestMethod.GET )
    @ResponseBody
    public String hello(String name){
        return "hello:"+name;
    }

}
