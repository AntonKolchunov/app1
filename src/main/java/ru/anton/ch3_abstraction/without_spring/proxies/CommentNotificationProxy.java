package ru.anton.ch3_abstraction.without_spring.proxies;

import ru.anton.ch3_abstraction.without_spring.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
