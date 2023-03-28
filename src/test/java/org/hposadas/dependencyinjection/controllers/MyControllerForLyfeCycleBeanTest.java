package org.hposadas.dependencyinjection.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MyControllerForLyfeCycleBeanTest {

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    MyControllerForLyfeCycleBean controller;

    @Test
    void testAutowireOfController(){
        System.out.println(controller.sayHello());
    }

    @Test
    void testGetControllerFromCtx(){
        MyControllerForLyfeCycleBean myController = applicationContext.getBean(MyControllerForLyfeCycleBean.class);
        System.out.println(myController.sayHello());
    }

    @Test
    void contextLoads(){

    }
}