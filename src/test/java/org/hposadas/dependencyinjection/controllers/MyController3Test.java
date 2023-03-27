package org.hposadas.dependencyinjection.controllers;

import org.hposadas.dependencyinjection.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyController3Test {

    //atributos
    MyController3 myController3;

    @BeforeEach
    void setUp(){
        myController3 = new MyController3();
        myController3.greetingService = new GreetingServiceImpl();
    }

    @Test
    void sayHello() {
        System.out.println(myController3.sayHello());
    }
}