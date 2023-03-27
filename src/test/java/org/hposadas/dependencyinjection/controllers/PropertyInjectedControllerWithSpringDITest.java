package org.hposadas.dependencyinjection.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PropertyInjectedControllerWithSpringDITest {

    //atributos
    @Autowired
    PropertyInjectedControllerWithSpringDI picws;

    @Test
    void sayHello() {
        System.out.println(picws.sayHello());
    }
}