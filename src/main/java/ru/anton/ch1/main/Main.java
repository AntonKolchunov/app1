package ru.anton.ch1.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.anton.ch1.config.ProjectConfig;

import java.util.function.Supplier;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(ProjectConfig.class);
        //С помощью аннотации @Bean (фабричный метод)
        Parrot p = applicationContext.getBean("Lypa", Parrot.class);
        System.out.println(p.getName());

        //С помощью @Component и @ComponentScan("ru.anton.main")
        Cat cat = applicationContext.getBean(Cat.class);
        System.out.println(cat.getName());

        //Программный способ
        //Cat cat2 = new Cat();
        Supplier<Parrot> parrotSupplier = () -> new Parrot();
        //регистрируем бин
        applicationContext.registerBean("ParrotNew",
                Parrot.class,
                parrotSupplier,
                parrot -> parrot.setPrimary(true));

        Parrot p2 = applicationContext.getBean("ParrotNew", Parrot.class);
        System.out.println(p2.getName());

    }
}