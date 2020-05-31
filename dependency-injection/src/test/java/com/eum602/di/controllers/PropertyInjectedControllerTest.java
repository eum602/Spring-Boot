package com.eum602.di.controllers;

import com.eum602.di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {
    PropertyInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingService = new GreetingServiceImpl();//assigning the Greeting service implementation to our greeting service PROPERTY
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}