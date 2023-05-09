package ru.anton.ch2_beans.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.anton.ch2_beans.beans.Parrot;

@Configuration
@ComponentScan("ru.anton.ch2_beans")
public class ProjectConfig {

    @Bean
    public Parrot parrot1() {
        Parrot parrot = new Parrot();
        parrot.setName("Koko");
        return parrot;
    }

    @Bean
    public Parrot parrot2() {
        Parrot parrot = new Parrot();
        parrot.setName("Miki");
        return parrot;
    }

    @Bean
    public Parrot parrot3() {
        Parrot parrot = new Parrot();
        parrot.setName("Riki");
        return parrot;
    }


//    @Bean
//    public Person person(@Qualifier("parrot3") Parrot parrot) {
//        Person person = new Person();
//        person.setName("Ella");
//        person.setParrot(parrot);
//        return person;
//    }
}
