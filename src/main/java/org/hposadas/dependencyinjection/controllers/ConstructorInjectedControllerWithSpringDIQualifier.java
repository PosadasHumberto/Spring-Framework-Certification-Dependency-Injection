package org.hposadas.dependencyinjection.controllers;

import org.hposadas.dependencyinjection.services.GreetingService2;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Controller who injects a service as controller using Spring DI
 */

@Controller
public class ConstructorInjectedControllerWithSpringDIQualifier {
    //atributos
    private final GreetingService2 greetingService2;

    //constructor
    //we use @Qualifier() annotation to indicate Spring which implementation
    //is going to be used.
    public ConstructorInjectedControllerWithSpringDIQualifier(
            @Qualifier("setterGreetingBean") GreetingService2 greetingService2) {
        this.greetingService2 = greetingService2;
    }

    //métodos
    public String sayHello(){
        return greetingService2.sayGreeting();
    }
}
