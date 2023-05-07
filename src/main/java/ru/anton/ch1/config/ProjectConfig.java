package ru.anton.ch1.config;

import org.springframework.context.annotation.*;
import ru.anton.ch1.main.Parrot;

@Configuration
@ComponentScan("ru.anton.ch1.main")
@PropertySource("classpath:external.properties")
public class ProjectConfig {

    @Bean(name = "Lypa")
    public Parrot parrot1() {
        Parrot p = new Parrot();
        p.setName("Lypa");
        return p;
    }

    @Bean("Kola")
    public Parrot parrot2() {
        Parrot p = new Parrot();
        p.setName("Kola");
        return p;
    }

    @Bean
    @Primary
    public Parrot parrot3() {
        Parrot p = new Parrot();
        p.setName("Water");
        return p;
    }

    @Bean
    String hello() {
        return "Hello";
    }

    @Bean
    Integer ten(){
        return 10;
    }
}
