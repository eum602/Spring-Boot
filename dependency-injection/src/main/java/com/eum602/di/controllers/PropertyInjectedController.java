package com.eum602.di.controllers;

import com.eum602.di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller //Telling Sprin this is a Spring managed class
public class PropertyInjectedController {
    @Autowired //telling Spring to make dependency injection for us
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
