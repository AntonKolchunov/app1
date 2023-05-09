package ru.anton.ch5_aop.change_params_and_return_type.service;

import org.springframework.stereotype.Service;
import ru.anton.ch5_aop.change_params_and_return_type.Comment;

import java.util.logging.Logger;

@Service
public class CommentService {
    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public String publishComment(Comment comment) {
        logger.info("Publishing comment: " + comment.getText());
        return "SUCCESS";
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
