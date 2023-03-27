package org.hposadas.dependencyinjection.controllers;

import org.hposadas.dependencyinjection.services.GreetingService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Controller who injects a service as class properties using Spring DI
 */

@Controller
public class PropertyInjectedControllerWithSpringDI {

    //atributos
    @Autowired
    GreetingService2 greetingService2;

    public String sayHello(){
        return greetingService2.sayGreeting();
    }
}
