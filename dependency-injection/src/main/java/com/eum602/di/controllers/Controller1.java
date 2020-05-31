package com.eum602.di.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class Controller1 {
    public String sayHello(){
        System.out.println("Hello world!");
        return "Hi everyone";
    }
}
