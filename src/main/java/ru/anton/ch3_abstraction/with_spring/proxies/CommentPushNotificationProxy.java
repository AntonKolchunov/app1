package ru.anton.ch3_abstraction.with_spring.proxies;

import jdk.jfr.Name;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import ru.anton.ch3_abstraction.with_spring.model.Comment;

@Component
@Primary
@Qualifier(" ")
public class CommentPushNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending push notification for comment: " + comment.getText());
    }
}
