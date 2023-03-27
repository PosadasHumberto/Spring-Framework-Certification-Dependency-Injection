package org.hposadas.dependencyinjection.controllers;

import org.springframework.stereotype.Controller;

/**
 * Controller that is going to be injected manually in Main method and test method
 */
@Controller
public class MyController {

    public String sayHello(){
        System.out.println("I'm in the controller");
        return "Hello Everyone!!!";
    }
}
