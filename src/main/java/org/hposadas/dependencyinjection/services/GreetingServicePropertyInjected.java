package org.hposadas.dependencyinjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 *
 */

@Service("propertyGreetingService")
public class GreetingServicePropertyInjected implements GreetingService2 {

    @Override
    public String sayGreeting() {
        return "Friends don't let friends do injection!!!";
    }
}
