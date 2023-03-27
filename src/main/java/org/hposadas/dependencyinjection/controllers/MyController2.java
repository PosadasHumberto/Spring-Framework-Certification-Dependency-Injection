package org.hposadas.dependencyinjection.controllers;

import org.hposadas.dependencyinjection.services.GreetingService;
import org.hposadas.dependencyinjection.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

/**
 * Controller who's going to use a GreetingsSevice instance
 * without using Dependency Injection.
 */
@Controller
public class MyController2 {

    //atributos
    private final GreetingService greetingService;

    //constructores
    public MyController2() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello(){
        System.out.println("I'm in MyController2");
        return greetingService.sayGreetings();
    }
}
