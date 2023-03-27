package org.hposadas.dependencyinjection.controllers;

import org.hposadas.dependencyinjection.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyController5Test {

    //atributos
    MyController5 controller5;

    @BeforeEach
    void setUp() {
        controller5 = new MyController5(new GreetingServiceImpl());
    }

    @Test
    void sayHello() {
        System.out.println(controller5.sayHello());
    }
}