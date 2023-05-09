package ru.anton.ch3_abstraction.without_spring.repositories;

import ru.anton.ch3_abstraction.without_spring.model.Comment;

public interface CommentRepository {
    public void storeComment(Comment comment);
}
