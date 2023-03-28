package org.hposadas.dependencyinjection.controllers;

import org.hposadas.dependencyinjection.services.GreetingService;
import org.hposadas.dependencyinjection.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

/**
 * Controller who's going to use a GreetingsSevice instance
 * without using Dependency Injection.
 * in this case we are using private properties
 */

@Controller
public class MyControllerForLyfeCycleBean {

    //atributos
    private final GreetingService greetingService;

    public MyControllerForLyfeCycleBean() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello(){
        System.out.println("I'm in MyControllerForLyfeCycleBean");
        return greetingService.sayGreetings();
    }

    public void beforeInit(){
        System.out.println("## - BeforeInit - Called by Bean Post Processor");
    }

    public void afterInit(){
        System.out.println("## - After init called by Bean Post Processor");
    }
}
