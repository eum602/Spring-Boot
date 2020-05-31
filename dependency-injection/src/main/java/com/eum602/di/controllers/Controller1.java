package com.eum602.di.controllers;

import com.eum602.di.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class Controller1 {
    private final GreetingService greetingService;

    public Controller1(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return  greetingService.sayGreeting();
    }
}
