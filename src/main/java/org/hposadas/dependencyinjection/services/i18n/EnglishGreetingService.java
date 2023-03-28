package org.hposadas.dependencyinjection.services.i18n;

import org.hposadas.dependencyinjection.services.GreetingService2;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service("i18NService")
public class EnglishGreetingService implements GreetingService2 {

    @Override
    public String sayGreeting() {
        return "Hello World!!! - EN";
    }
}
