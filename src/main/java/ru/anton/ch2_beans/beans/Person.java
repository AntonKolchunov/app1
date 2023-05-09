package ru.anton.ch2_beans.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = "Ella";

    //@Autowired
    private  Parrot parrot;

   //@Autowired //(можно опустить, если конструктор только один)
    public Person(@Qualifier("parrot2") Parrot parrot) {
        this.parrot = parrot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }

    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }
}
