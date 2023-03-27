package org.hposadas.dependencyinjection.controllers;

import org.hposadas.dependencyinjection.services.GreetingService;

/**
 *Controller who is going to inject a dependency by setter
 */

public class MyController4 {

    //atributos
    private GreetingService greetingService;

    //métodos
    public String sayHello(){

        return greetingService.sayGreetings();
    }

    //setters
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }


}
