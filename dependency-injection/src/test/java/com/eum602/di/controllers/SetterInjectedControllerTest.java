package com.eum602.di.controllers;

import com.eum602.di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceImpl());//SETTING the class to work for a controller
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());;
    }
}