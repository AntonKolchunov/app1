package ru.anton.ch2_beans.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.anton.ch2_beans.beans.Person;
import ru.anton.ch2_beans.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = applicationContext.getBean(Person.class);

        System.out.println("Person name " + person.getName());
        System.out.println("Person parrot name " + person.getParrot().getName());

    }
}
