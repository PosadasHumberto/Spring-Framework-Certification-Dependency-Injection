package org.hposadas.dependencyinjection.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Hello Everyone from Base Services!!";
    }
}
