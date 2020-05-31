package com.eum602.di.services;

import org.springframework.stereotype.Service;

@Service //Telling Spring this is a class that can be used to make dependency injection
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World -- Constructor!!";
    }
}
