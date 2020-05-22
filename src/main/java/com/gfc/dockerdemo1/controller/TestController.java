package com.gfc.dockerdemo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/dockerTest")
    public String dockerTest(){
        return "dockerTest";
    }

}
