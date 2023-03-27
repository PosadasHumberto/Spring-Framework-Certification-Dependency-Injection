package org.hposadas.dependencyinjection.services;

import org.springframework.stereotype.Service;

/**
 * Register this service class as a spring component using the  @Service annotation
 */

@Service
public class GreetingService2Impl implements GreetingService2 {

    @Override
    public String sayGreeting() {
        return "Hello from an Annotated Service";
    }
}
