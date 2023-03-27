package org.hposadas.dependencyinjection.controllers;

import org.hposadas.dependencyinjection.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Controller who's going to be instanced from a test class by Class properties
 */
@Controller
public class MyController3 {

    //atributos
    GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreetings();
    }

}
