package org.hposadas.dependencyinjection.controllers;

import org.hposadas.dependencyinjection.services.GreetingService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Controller who injects a service as setter using Spring DI
 */

@Controller
public class SetterIngectedControllerWithSpringDI {

    //atributos
    private GreetingService2 greetingService2;

    //setters
    @Autowired
    @Qualifier("setterGreetingBean")
    public void setGreetingService2(GreetingService2 greetingService2) {
        this.greetingService2 = greetingService2;
    }

    //métodos
    public String sayHello(){
        return greetingService2.sayGreeting();
    }
}
