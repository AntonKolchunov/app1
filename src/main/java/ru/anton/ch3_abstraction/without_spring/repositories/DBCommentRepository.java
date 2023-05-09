package ru.anton.ch3_abstraction.without_spring.repositories;

import ru.anton.ch3_abstraction.without_spring.model.Comment;

public class DBCommentRepository implements CommentRepository{
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}
