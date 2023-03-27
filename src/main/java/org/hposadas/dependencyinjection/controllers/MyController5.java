package org.hposadas.dependencyinjection.controllers;

import org.hposadas.dependencyinjection.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Controller who's going to inject a GreetingService using controller injection
 */

@Controller
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
