package org.hposadas.dependencyinjection.controllers;

import org.hposadas.dependencyinjection.services.GreetingService;

/**
 * Controller who's going inject a dependency and to be instanced
 * from a test class using Class properties
 */

public class MyController3 {

    //atributos
    GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreetings();
    }

}
