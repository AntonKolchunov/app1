package ru.anton.ch3_abstraction.with_spring.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.anton.ch3_abstraction.with_spring.config.ProjectConfig;
import ru.anton.ch3_abstraction.with_spring.model.Comment;
import ru.anton.ch3_abstraction.with_spring.services.CommentService;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(ProjectConfig.class);


        CommentService commentService = applicationContext.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setAuthor("Anton");
        comment.setText("Demo comment");

        commentService.publicComment(comment);
    }
}
