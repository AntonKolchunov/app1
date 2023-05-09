package ru.anton.ch4_scope_and_lifecycle_of_beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(ProjectConfig.class);
        CommentService commentService1 = applicationContext.getBean(CommentService.class);
        CommentService commentService2 = applicationContext.getBean(CommentService.class);

        System.out.println(commentService1 == commentService2);
    }
}
