package org.hposadas.dependencyinjection.controllers.i18n;


import org.hposadas.dependencyinjection.services.GreetingService2;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18NController {

    //atributos

    private final GreetingService2 greetingService2;

    public I18NController(
            @Qualifier("i18NService") GreetingService2 greetingService2
    ) {
        this.greetingService2 = greetingService2;
    }

    public String sayHello(){
        return greetingService2.sayGreeting();
    }
}
