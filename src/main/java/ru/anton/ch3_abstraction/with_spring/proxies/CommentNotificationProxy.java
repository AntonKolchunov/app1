package ru.anton.ch3_abstraction.with_spring.proxies;

import ru.anton.ch3_abstraction.with_spring.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
