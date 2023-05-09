package ru.anton.ch5_aop.change_params_and_return_type;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(ProjectConfig.class);
    }
}
