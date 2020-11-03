package com.gas.station.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSay {

    @RequestMapping("/say")
    public String say(){
        return "Hello Say";
    }

}
