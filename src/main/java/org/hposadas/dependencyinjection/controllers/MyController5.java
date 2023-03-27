package org.hposadas.dependencyinjection.controllers;

import org.hposadas.dependencyinjection.services.GreetingService;

/**
 * Controller who's going to inject a GreetingService using controller injection
 */

public class MyController5 {

    //atributos
    private final GreetingService greetingService;

    //constructor
    public MyController5(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreetings();
    }
}
