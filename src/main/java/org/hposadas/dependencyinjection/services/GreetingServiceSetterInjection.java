package org.hposadas.dependencyinjection.services;

import org.springframework.stereotype.Service;

/**
 * Bean that is going to be named so we use this name in the
 * @Qualifier annotation to specify which bean Spring have to Inject
 */

@Service("setterGreetingBean")
public class GreetingServiceSetterInjection implements GreetingService2 {

    @Override
    public String sayGreeting() {
        return "Hey, I'm setting a Greeting!!!";
    }
}
