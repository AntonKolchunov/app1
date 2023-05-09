package ru.anton.ch3_abstraction.without_spring.proxies;

import ru.anton.ch3_abstraction.without_spring.model.Comment;

public class EmailCommentNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: " + comment.getText());
    }
}
