package org.hposadas.dependencyinjection.controllers;

import org.junit.jupiter.api.Test;


class MyController2Test {

    @Test
    void sayHello(){
        MyController2 myController2 = new MyController2();
        System.out.println(myController2.sayHello());
    }
}