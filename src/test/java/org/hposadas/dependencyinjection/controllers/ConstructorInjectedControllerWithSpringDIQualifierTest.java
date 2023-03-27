package org.hposadas.dependencyinjection.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ConstructorInjectedControllerWithSpringDIQualifierTest {

    //atributos
    @Autowired
    ConstructorInjectedControllerWithSpringDIQualifier cicwsq;

    @Test
    void sayHello() {
        System.out.println(cicwsq.sayHello());
    }
}