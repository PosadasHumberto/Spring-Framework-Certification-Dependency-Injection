package org.hposadas.dependencyinjection.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SetterIngectedControllerWithSpringDITest {

    //atributos
    @Autowired
    SetterIngectedControllerWithSpringDI sicws;

    @Test
    void sayHello() {
        System.out.println(sicws.sayHello());
    }
}