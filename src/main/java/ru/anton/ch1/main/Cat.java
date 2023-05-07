package ru.anton.ch1.main;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Cat {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void init() {
        this.name = "Mega cat";
    }
}
