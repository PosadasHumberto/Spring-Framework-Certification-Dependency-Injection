package org.hposadas.dependencyinjection.controllers;

import org.hposadas.dependencyinjection.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyController4Test {

    //atributos
    MyController4 controller4;

    @BeforeEach
    void setUp() {
        controller4 = new MyController4();
        controller4.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void sayHello() {
        System.out.println(controller4.sayHello());
    }
}