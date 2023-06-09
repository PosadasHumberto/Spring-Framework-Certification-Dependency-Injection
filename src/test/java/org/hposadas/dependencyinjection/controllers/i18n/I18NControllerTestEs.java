package org.hposadas.dependencyinjection.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

//@ActiveProfiles("ES")
@SpringBootTest
class I18NControllerTestEs {

    //atributos
    @Autowired
    I18NController i18NController;

    @Test
    void sayHello() {
        System.out.println(i18NController.sayHello());
    }
}