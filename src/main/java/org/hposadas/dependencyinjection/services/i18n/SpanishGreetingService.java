package org.hposadas.dependencyinjection.services.i18n;

import org.hposadas.dependencyinjection.services.GreetingService2;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18NService")
public class SpanishGreetingService implements GreetingService2 {

    @Override
    public String sayGreeting() {
        return "Hola Mundo!! - ES";
    }
}
