package org.hposadas.dependencyinjection;

import org.hposadas.dependencyinjection.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SecondWebAppDependencyInjectionApplicationTests {

    //atributos
    @Autowired
    ApplicationContext context;

    @Autowired
    MyController myControllerAutowired;


    //métodos
    @Test
    void testManuallyInjectedMyControllerBean(){
        System.out.println("From a manually dependency injection");
        System.out.println(context.getBean(MyController.class).sayHello());
    }

    @Test
    void testAutowiredInjectedMyControllerBean(){
        System.out.println("From an Autowired Dependency Injection");
        System.out.println(myControllerAutowired.sayHello());
    }


    @Test
    void contextLoads() {

    }

}
