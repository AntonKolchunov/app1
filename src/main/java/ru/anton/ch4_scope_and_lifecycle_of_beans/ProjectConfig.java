package ru.anton.ch4_scope_and_lifecycle_of_beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "ru.anton.ch4_scope_and_lifecycle_of_beans")
public class ProjectConfig {

    @Bean
    @Scope("prototype")
    public CommentService commentService() {
        return new CommentService();
    }
}
