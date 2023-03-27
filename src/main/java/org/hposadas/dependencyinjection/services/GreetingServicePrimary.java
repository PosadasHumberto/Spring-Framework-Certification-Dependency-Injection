package org.hposadas.dependencyinjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Clase Service que será definida como Pirmary Bean, ya que
 * al haber varias clases de implementacion de la interfaz GreetingService2
 * tenemos que especififcar cuál es la que se debe usar en prioridad.
 */

@Service
@Primary
public class GreetingServicePrimary implements GreetingService2 {

    @Override
    public String sayGreeting() {
        return "Hello From the Primary Bean!!";
    }
}
