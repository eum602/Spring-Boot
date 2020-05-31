package com.eum602.di.controllers;

import com.eum602.di.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new ConstructorGreetingService());//SETTING the class to work for a controller
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());;
    }
}