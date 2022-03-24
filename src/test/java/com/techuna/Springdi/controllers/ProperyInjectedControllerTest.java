package com.techuna.Springdi.controllers;

import com.techuna.Springdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProperyInjectedControllerTest {

    ProperyInjectedController controller;

    @BeforeEach
    void setUp(){
        controller = new ProperyInjectedController();

        controller.greetingService = new GreetingServiceImpl();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}