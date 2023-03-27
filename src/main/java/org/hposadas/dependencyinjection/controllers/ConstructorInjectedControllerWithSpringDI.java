package org.hposadas.dependencyinjection.controllers;

import org.hposadas.dependencyinjection.services.GreetingService2;
import org.springframework.stereotype.Controller;

/**
 * Controller who injects a service as controller using Spring DI
 */

@Controller
public class ConstructorInjectedControllerWithSpringDI {
    //atributos
    private final GreetingService2 greetingService2;

    //constructor
    //we dont need to use an annotation because spring will detect which
    //implementation of GreetingService2 is going to be injected
    public ConstructorInjectedControllerWithSpringDI(GreetingService2 greetingService2) {
        this.greetingService2 = greetingService2;
    }

    //métodos
    public String sayHello(){
        return greetingService2.sayGreeting();
    }
}
