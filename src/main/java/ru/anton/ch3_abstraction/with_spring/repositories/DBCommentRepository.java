package ru.anton.ch3_abstraction.with_spring.repositories;

import org.springframework.stereotype.Repository;
import ru.anton.ch3_abstraction.with_spring.model.Comment;

@Repository
public class DBCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}
