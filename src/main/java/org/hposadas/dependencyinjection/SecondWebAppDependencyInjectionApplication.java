package org.hposadas.dependencyinjection;

import org.hposadas.dependencyinjection.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SecondWebAppDependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SecondWebAppDependencyInjectionApplication.class, args);
        MyController controller = context.getBean(MyController.class);
        System.out.println("I'm in Main method");
        System.out.println(controller.sayHello());
    }

}
