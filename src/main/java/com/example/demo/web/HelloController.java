package com.example.demo.web;


import com.example.demo.properties.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Resource
    private   Book booK;

    @RequestMapping("/hello")
    public String index(){
        return booK.getDesc();
    }
}
