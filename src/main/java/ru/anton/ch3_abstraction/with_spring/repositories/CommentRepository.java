package ru.anton.ch3_abstraction.with_spring.repositories;

import ru.anton.ch3_abstraction.with_spring.model.Comment;

public interface CommentRepository {
    public void storeComment(Comment comment);
}
