package ru.anton.ch3_abstraction.without_spring.main;

import ru.anton.ch3_abstraction.without_spring.model.Comment;
import ru.anton.ch3_abstraction.without_spring.proxies.CommentNotificationProxy;
import ru.anton.ch3_abstraction.without_spring.proxies.EmailCommentNotificationProxy;
import ru.anton.ch3_abstraction.without_spring.repositories.CommentRepository;
import ru.anton.ch3_abstraction.without_spring.repositories.DBCommentRepository;
import ru.anton.ch3_abstraction.without_spring.services.CommentService;

public class Main {
    public static void main(String[] args) {
        CommentRepository commentRepository = new DBCommentRepository();
        CommentNotificationProxy commentNotificationProxy = new EmailCommentNotificationProxy();

        CommentService commentService = new CommentService(commentRepository, commentNotificationProxy);

        Comment comment = new Comment();
        comment.setAuthor("Anton");
        comment.setText("Demo comment");

        commentService.publicComment(comment);
    }
}
